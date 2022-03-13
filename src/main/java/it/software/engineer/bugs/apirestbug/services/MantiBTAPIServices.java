package it.software.engineer.bugs.apirestbug.services;

import it.software.engineer.bugs.apirestbug.clients.MantisBTClient;
import lombok.extern.slf4j.Slf4j;
import org.json.JSONArray;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class MantiBTAPIServices extends Thread{

    @Value("${rest.api.mantis}")
    private String hostmantis;

    private JSONArray bugs = new JSONArray();

    public void run(){
        bugs = getAllBugsMantis();
    }

    public JSONArray getBugs(){
        return this.bugs;
    }

    private JSONArray getAllBugsMantis(){
        log.info("Call API MantiBT . . .");
        MantisBTClient client = new MantisBTClient(hostmantis);
        JSONArray responseMantiClient = client.retriveBugs();
        log.info("Response Size MantiBT - response = {}", responseMantiClient.length());
        return responseMantiClient;
    }
}
