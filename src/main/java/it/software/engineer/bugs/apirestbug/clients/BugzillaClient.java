package it.software.engineer.bugs.apirestbug.clients;

import lombok.extern.slf4j.Slf4j;
import org.json.JSONArray;
import org.json.JSONObject;

import java.net.URI;
import java.net.http.HttpRequest;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

@Slf4j
public class BugzillaClient extends APIClient {

    private static final String URL = "/rest/bug";


    public BugzillaClient(String host) {
        super(host);
    }

    @Override
    public JSONArray retriveBugs() {
        log.info("Call client Bugzilla");
        JSONArray issues = new JSONArray();

        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(10);

        int limit = 100;
        boolean end = false;
        for (int offset = 0; !end; offset += 100) {
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(createURI(limit, offset)))
                    .GET()
                    .build();

                CallThread callThread = new CallThread(request);
                executor.execute(callThread);

                try {
                    while (callThread.getResponse() == null) {
                        Thread.sleep(1000);
                    }
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    log.error("Thread interrupted", e);
                }
                JSONObject obj = new JSONObject(callThread.getResponse());

                JSONArray issuesJSON = obj.getJSONArray("bugs");
                issues.putAll(issuesJSON);
                log.info("SizeResponse=" + issuesJSON.length() + " - request= " + request.toString());
                if (issuesJSON.length() < 100) end = true;
        }
        executor.shutdown();
        return issues;
    }

    private String createURI(int limit, int offset) {
        return new StringBuilder(host).append(URL)
                .append("?")
                .append("limit=").append(limit)
                .append("&")
                .append("offset=").append(offset)
                .append("&")
                .append("status=").append("RESOLVED")
                .toString();
    }
}