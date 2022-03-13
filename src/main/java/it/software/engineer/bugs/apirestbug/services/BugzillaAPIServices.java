package it.software.engineer.bugs.apirestbug.services;

import it.software.engineer.bugs.apirestbug.clients.BugzillaClient;
import it.software.engineer.bugs.apirestbug.clients.MantisBTClient;
import lombok.extern.slf4j.Slf4j;
import org.json.JSONArray;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class BugzillaAPIServices extends Thread {

    @Value("${rest.api.bugzilla}")
    private String hostbugzilla;

    private JSONArray bugs = new JSONArray();

    public void run(){
        bugs = getAllBugsBugzilla();
    }

    public JSONArray getBugs(){
        return this.bugs;
    }

    private JSONArray getAllBugsBugzilla(){
        log.info("Call API Bugzilla . . .");
        BugzillaClient client = new BugzillaClient(hostbugzilla);
        return client.retriveBugs();
    }

}
