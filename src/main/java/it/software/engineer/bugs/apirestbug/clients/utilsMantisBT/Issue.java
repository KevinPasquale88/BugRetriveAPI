package it.software.engineer.bugs.apirestbug.clients.utilsMantisBT;

import it.software.engineer.bugs.apirestbug.clients.MantisBTClient;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
public class Issue {
    private int id;
    private String summary;
    private String description;
    private String steps_to_reproduce;
    private Project project;
    private Category category;
    private Reporter reporter;
    private Status status;
    private Resolution resolution;
    private ViewState view_state;
    private Priority priority;
    private Severity severity;
    private Reproducibility reproducibility;
    private boolean sticky;
    private Date created_at;
    private Date updated_at;
    private List<Attachment> attachments;
    private List<History> history;
    private String additional_information;
    private Version version;
    private Handler handler;
    private String os;
    private String os_build;
    private List<Object> notes;
    private List<Object> relationships;
    private String platform;
    private FixedInVersion fixed_in_version;
    private TargetVersion target_version;
    private List<TargetVersion> tags;

    public List<TargetVersion> getTags() {
        return tags;
    }

    public void setTags(List<TargetVersion> tags) {
        this.tags = tags;
    }

    public List<Object> getRelationships() {
        return relationships;
    }

    public void setRelationships(List<Object> relationships) {
        this.relationships = relationships;
    }

    public TargetVersion getTarget_version() {
        return target_version;
    }

    public void setTarget_version(TargetVersion target_version) {
        this.target_version = target_version;
    }

    public FixedInVersion getFixed_in_version() {
        return fixed_in_version;
    }

    public void setFixed_in_version(FixedInVersion fixed_in_version) {
        this.fixed_in_version = fixed_in_version;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getOs_build() {
        return os_build;
    }

    public void setOs_build(String os_build) {
        this.os_build = os_build;
    }

    public List<Object> getNotes() {
        return notes;
    }

    public void setNotes(List<Object> notes) {
        this.notes = notes;
    }

    public Handler getHandler() {
        return handler;
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }

    public Version getVersion() {
        return version;
    }

    public void setVersion(Version version) {
        this.version = version;
    }

    public String getAdditional_information() {
        return additional_information;
    }

    public void setAdditional_information(String additional_information) {
        this.additional_information = additional_information;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSteps_to_reproduce() {
        return steps_to_reproduce;
    }

    public void setSteps_to_reproduce(String steps_to_reproduce) {
        this.steps_to_reproduce = steps_to_reproduce;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Reporter getReporter() {
        return reporter;
    }

    public void setReporter(Reporter reporter) {
        this.reporter = reporter;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Resolution getResolution() {
        return resolution;
    }

    public void setResolution(Resolution resolution) {
        this.resolution = resolution;
    }

    public ViewState getView_state() {
        return view_state;
    }

    public void setView_state(ViewState view_state) {
        this.view_state = view_state;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public Severity getSeverity() {
        return severity;
    }

    public void setSeverity(Severity severity) {
        this.severity = severity;
    }

    public Reproducibility getReproducibility() {
        return reproducibility;
    }

    public void setReproducibility(Reproducibility reproducibility) {
        this.reproducibility = reproducibility;
    }

    public boolean isSticky() {
        return sticky;
    }

    public void setSticky(boolean sticky) {
        this.sticky = sticky;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public Date getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Date updated_at) {
        this.updated_at = updated_at;
    }

    public List<Attachment> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<Attachment> attachments) {
        this.attachments = attachments;
    }

    public List<History> getHistory() {
        return history;
    }

    public void setHistory(List<History> history) {
        this.history = history;
    }
}