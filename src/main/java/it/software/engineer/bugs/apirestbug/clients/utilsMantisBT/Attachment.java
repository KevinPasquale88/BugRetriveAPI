package it.software.engineer.bugs.apirestbug.clients.utilsMantisBT;

import it.software.engineer.bugs.apirestbug.clients.MantisBTClient;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
public class Attachment {
    private int id;
    private Reporter reporter;
    private Date created_at;
    private String filename;
    private int size;
    private String content_type;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Reporter getReporter() {
        return reporter;
    }

    public void setReporter(Reporter reporter) {
        this.reporter = reporter;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getContent_type() {
        return content_type;
    }

    public void setContent_type(String content_type) {
        this.content_type = content_type;
    }
}