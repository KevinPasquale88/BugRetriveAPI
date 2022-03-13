package it.software.engineer.bugs.apirestbug.clients;

import org.json.JSONArray;

import java.util.List;

public abstract class APIClient {

    protected String host;

    public APIClient(String host){
        this.host = host;
    }

    public abstract JSONArray retriveBugs();
}
