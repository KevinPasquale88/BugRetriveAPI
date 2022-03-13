package it.software.engineer.bugs.apirestbug.clients;

import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@Slf4j
public class CallThread implements Runnable {
    private String response;

    private HttpRequest request;

    public CallThread(HttpRequest request){
        this.request = request;
        this.response = null;
    }

    @Override
    public void run() {
        try {
            HttpResponse<String> httpResponse =
                    HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
            this.response = httpResponse.body();
        } catch (IOException | InterruptedException e ) {
            log.error("Error on call Api for request {} - error : {}", this.request.toString(), e);
        }
    }

    public String getResponse(){
        return this.response;
    }
}
