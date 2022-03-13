package it.software.engineer.bugs.apirestbug.controllers;

import it.software.engineer.bugs.apirestbug.services.BugzillaAPIServices;
import it.software.engineer.bugs.apirestbug.services.MantiBTAPIServices;
import lombok.extern.slf4j.Slf4j;
import org.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

@Slf4j
@RestController
public class BugsController {

    @Autowired
    MantiBTAPIServices mantiBTAPIServices;

    @Autowired
    BugzillaAPIServices bugzillaAPIServices;

    @GetMapping(value = "/bugs",name = "All Bugs", produces = "application/json")
    public boolean getAllBugs() {
        JSONArray bugs = new JSONArray();
        mantiBTAPIServices.start();
        bugzillaAPIServices.start();

        try {
            while(bugzillaAPIServices.getBugs().isEmpty() || mantiBTAPIServices.getBugs().isEmpty()){
                Thread.sleep(10000);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            log.error("Thread interrupted", e);
            return false;
        }

        try {
            File myObj = new File("src/main/resources/jsonBugs.txt");
            if (myObj.createNewFile()) {
                bugs
                        .putAll(bugzillaAPIServices.getBugs())
                        .putAll(mantiBTAPIServices.getBugs());
                FileWriter myWriter = new FileWriter("src/main/resources/jsonBugs.txt");
                myWriter.write(bugs.toString());
                myWriter.close();
            }
        } catch (IOException ex) {
            log.error(ex.getMessage());
            return false;
        }

        return true;
    }

}
