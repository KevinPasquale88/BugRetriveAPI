package it.software.engineer.bugs.apirestbug.clients;

import lombok.extern.slf4j.Slf4j;
import org.json.JSONArray;
import org.json.JSONObject;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

@Slf4j
public class MantisBTClient extends APIClient {

    private static final String URL = "/api/rest/issues";

    private static final String page_size = "page_size";

    private static final String page = "page";

    private static final String size = "100";

    public MantisBTClient(String host) {
        super(host);
    }

    @Override
    public JSONArray retriveBugs() {
        log.info("Call client MantisBT");
        HttpClient client = HttpClient.newHttpClient();
        JSONArray issues = new JSONArray();

        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(10);

        int size_pag = 100;
        for (int numPag = 1; size_pag == 100; numPag++) {
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(createURI(size, numPag)))
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
            JSONArray issuesJSON = obj.getJSONArray("issues");
            size_pag = issuesJSON.length();
            log.info("SizeResponse=" + size_pag + " - request= " + request.toString());
            issues.putAll(issuesJSON);
        }
        executor.shutdown();
        return issues;
    }

    private String createURI(String size, int numPag) {
        return new StringBuilder(host).append(URL)
                .append("?")
                .append(page_size).append("=").append(size)
                .append("&")
                .append(page).append("=").append(numPag)
                .toString();
    }
}
