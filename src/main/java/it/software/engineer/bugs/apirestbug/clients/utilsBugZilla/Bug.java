package it.software.engineer.bugs.apirestbug.clients.utilsBugZilla;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
public class Bug{
    private String platform;
    private List<String> see_also;
    private String status;
    private String product;
    private String cf_crash_signature;
    private int id;
    private List<String> cc;
    private String whiteboard;
    private String cf_tracking_firefox98;
    private List<CcDetail> cc_detail;
    private String cf_qa_whiteboard;
    private Date cf_last_resolved;
    private String qa_contact;
    private String assigned_to;
    private String cf_status_firefox_esr91;
    private List<Object> regressed_by;
    private int dupe_of;
    private String cf_tracking_firefox_esr91;
    private String cf_fission_milestone;
    private List<Object> depends_on;
    private AssignedToDetail assigned_to_detail;
    private int votes;
    private String resolution;
    private CreatorDetail creator_detail;
    private String cf_fx_iteration;
    private String classification;
    private String creator;
    private List<Object> regressions;
    private String cf_status_firefox98;
    private String priority;
    private String cf_tracking_firefox100;
    private Date last_change_time;
    private String cf_tracking_firefox_sumo;
    private String cf_root_cause;
    private String url;
    private String op_sys;
    private String cf_has_str;
    private String cf_status_firefox100;
    private List<Object> groups;
    private boolean is_cc_accessible;
    private String cf_fx_points;
    private String component;
    private String summary;
    private boolean is_confirmed;
    private String severity;
    private Object alias;
    private List<Object> mentors;
    private String cf_tracking_firefox_relnote;
    private List<Object> blocks;
    private String cf_has_regression_range;
    private String cf_tracking_firefox99;
    private String cf_performance;
    private Date creation_time;
    private List<Object> duplicates;
    private String cf_status_firefox99;
    private List<Object> mentors_detail;
    private String cf_webcompat_priority;
    private String cf_cab_review;
    private List<String> keywords;
    private String cf_user_story;
    private int comment_count;
    private String cf_a11y_review_project_flag;
    private boolean is_open;
    private String type;
    private String target_milestone;
    private String version;
    private boolean is_creator_accessible;
    private List<Object> flags;
    private Object cf_rank;

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public List<String> getSee_also() {
        return see_also;
    }

    public void setSee_also(List<String> see_also) {
        this.see_also = see_also;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getCf_crash_signature() {
        return cf_crash_signature;
    }

    public void setCf_crash_signature(String cf_crash_signature) {
        this.cf_crash_signature = cf_crash_signature;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<String> getCc() {
        return cc;
    }

    public void setCc(List<String> cc) {
        this.cc = cc;
    }

    public String getWhiteboard() {
        return whiteboard;
    }

    public void setWhiteboard(String whiteboard) {
        this.whiteboard = whiteboard;
    }

    public List<CcDetail> getCc_detail() {
        return cc_detail;
    }

    public void setCc_detail(List<CcDetail> cc_detail) {
        this.cc_detail = cc_detail;
    }

    public String getCf_qa_whiteboard() {
        return cf_qa_whiteboard;
    }

    public void setCf_qa_whiteboard(String cf_qa_whiteboard) {
        this.cf_qa_whiteboard = cf_qa_whiteboard;
    }

    public Date getCf_last_resolved() {
        return cf_last_resolved;
    }

    public void setCf_last_resolved(Date cf_last_resolved) {
        this.cf_last_resolved = cf_last_resolved;
    }

    public String getQa_contact() {
        return qa_contact;
    }

    public void setQa_contact(String qa_contact) {
        this.qa_contact = qa_contact;
    }

    public String getAssigned_to() {
        return assigned_to;
    }

    public void setAssigned_to(String assigned_to) {
        this.assigned_to = assigned_to;
    }

    public String getCf_status_firefox_esr91() {
        return cf_status_firefox_esr91;
    }

    public void setCf_status_firefox_esr91(String cf_status_firefox_esr91) {
        this.cf_status_firefox_esr91 = cf_status_firefox_esr91;
    }

    public List<Object> getRegressed_by() {
        return regressed_by;
    }

    public void setRegressed_by(List<Object> regressed_by) {
        this.regressed_by = regressed_by;
    }

    public int getDupe_of() {
        return dupe_of;
    }

    public void setDupe_of(int dupe_of) {
        this.dupe_of = dupe_of;
    }

    public String getCf_tracking_firefox_esr91() {
        return cf_tracking_firefox_esr91;
    }

    public void setCf_tracking_firefox_esr91(String cf_tracking_firefox_esr91) {
        this.cf_tracking_firefox_esr91 = cf_tracking_firefox_esr91;
    }

    public String getCf_fission_milestone() {
        return cf_fission_milestone;
    }

    public void setCf_fission_milestone(String cf_fission_milestone) {
        this.cf_fission_milestone = cf_fission_milestone;
    }

    public List<Object> getDepends_on() {
        return depends_on;
    }

    public void setDepends_on(List<Object> depends_on) {
        this.depends_on = depends_on;
    }

    public AssignedToDetail getAssigned_to_detail() {
        return assigned_to_detail;
    }

    public void setAssigned_to_detail(AssignedToDetail assigned_to_detail) {
        this.assigned_to_detail = assigned_to_detail;
    }

    public int getVotes() {
        return votes;
    }

    public void setVotes(int votes) {
        this.votes = votes;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public CreatorDetail getCreator_detail() {
        return creator_detail;
    }

    public void setCreator_detail(CreatorDetail creator_detail) {
        this.creator_detail = creator_detail;
    }

    public String getCf_fx_iteration() {
        return cf_fx_iteration;
    }

    public void setCf_fx_iteration(String cf_fx_iteration) {
        this.cf_fx_iteration = cf_fx_iteration;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public List<Object> getRegressions() {
        return regressions;
    }

    public void setRegressions(List<Object> regressions) {
        this.regressions = regressions;
    }

    public String getCf_status_firefox98() {
        return cf_status_firefox98;
    }

    public void setCf_status_firefox98(String cf_status_firefox98) {
        this.cf_status_firefox98 = cf_status_firefox98;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getCf_tracking_firefox100() {
        return cf_tracking_firefox100;
    }

    public void setCf_tracking_firefox100(String cf_tracking_firefox100) {
        this.cf_tracking_firefox100 = cf_tracking_firefox100;
    }

    public Date getLast_change_time() {
        return last_change_time;
    }

    public void setLast_change_time(Date last_change_time) {
        this.last_change_time = last_change_time;
    }

    public String getCf_tracking_firefox_sumo() {
        return cf_tracking_firefox_sumo;
    }

    public void setCf_tracking_firefox_sumo(String cf_tracking_firefox_sumo) {
        this.cf_tracking_firefox_sumo = cf_tracking_firefox_sumo;
    }

    public String getCf_root_cause() {
        return cf_root_cause;
    }

    public void setCf_root_cause(String cf_root_cause) {
        this.cf_root_cause = cf_root_cause;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getOp_sys() {
        return op_sys;
    }

    public void setOp_sys(String op_sys) {
        this.op_sys = op_sys;
    }

    public String getCf_has_str() {
        return cf_has_str;
    }

    public void setCf_has_str(String cf_has_str) {
        this.cf_has_str = cf_has_str;
    }

    public String getCf_status_firefox100() {
        return cf_status_firefox100;
    }

    public void setCf_status_firefox100(String cf_status_firefox100) {
        this.cf_status_firefox100 = cf_status_firefox100;
    }

    public List<Object> getGroups() {
        return groups;
    }

    public void setGroups(List<Object> groups) {
        this.groups = groups;
    }

    public boolean isIs_cc_accessible() {
        return is_cc_accessible;
    }

    public void setIs_cc_accessible(boolean is_cc_accessible) {
        this.is_cc_accessible = is_cc_accessible;
    }

    public String getCf_fx_points() {
        return cf_fx_points;
    }

    public void setCf_fx_points(String cf_fx_points) {
        this.cf_fx_points = cf_fx_points;
    }

    public String getComponent() {
        return component;
    }

    public void setComponent(String component) {
        this.component = component;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public boolean isIs_confirmed() {
        return is_confirmed;
    }

    public void setIs_confirmed(boolean is_confirmed) {
        this.is_confirmed = is_confirmed;
    }

    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public Object getAlias() {
        return alias;
    }

    public void setAlias(Object alias) {
        this.alias = alias;
    }

    public List<Object> getMentors() {
        return mentors;
    }

    public void setMentors(List<Object> mentors) {
        this.mentors = mentors;
    }

    public String getCf_tracking_firefox_relnote() {
        return cf_tracking_firefox_relnote;
    }

    public void setCf_tracking_firefox_relnote(String cf_tracking_firefox_relnote) {
        this.cf_tracking_firefox_relnote = cf_tracking_firefox_relnote;
    }

    public List<Object> getBlocks() {
        return blocks;
    }

    public void setBlocks(List<Object> blocks) {
        this.blocks = blocks;
    }

    public String getCf_has_regression_range() {
        return cf_has_regression_range;
    }

    public void setCf_has_regression_range(String cf_has_regression_range) {
        this.cf_has_regression_range = cf_has_regression_range;
    }

    public String getCf_tracking_firefox99() {
        return cf_tracking_firefox99;
    }

    public void setCf_tracking_firefox99(String cf_tracking_firefox99) {
        this.cf_tracking_firefox99 = cf_tracking_firefox99;
    }

    public String getCf_performance() {
        return cf_performance;
    }

    public void setCf_performance(String cf_performance) {
        this.cf_performance = cf_performance;
    }

    public Date getCreation_time() {
        return creation_time;
    }

    public void setCreation_time(Date creation_time) {
        this.creation_time = creation_time;
    }

    public List<Object> getDuplicates() {
        return duplicates;
    }

    public void setDuplicates(List<Object> duplicates) {
        this.duplicates = duplicates;
    }

    public String getCf_status_firefox99() {
        return cf_status_firefox99;
    }

    public void setCf_status_firefox99(String cf_status_firefox99) {
        this.cf_status_firefox99 = cf_status_firefox99;
    }

    public List<Object> getMentors_detail() {
        return mentors_detail;
    }

    public void setMentors_detail(List<Object> mentors_detail) {
        this.mentors_detail = mentors_detail;
    }

    public String getCf_webcompat_priority() {
        return cf_webcompat_priority;
    }

    public void setCf_webcompat_priority(String cf_webcompat_priority) {
        this.cf_webcompat_priority = cf_webcompat_priority;
    }

    public String getCf_cab_review() {
        return cf_cab_review;
    }

    public void setCf_cab_review(String cf_cab_review) {
        this.cf_cab_review = cf_cab_review;
    }

    public List<String> getKeywords() {
        return keywords;
    }

    public void setKeywords(List<String> keywords) {
        this.keywords = keywords;
    }

    public String getCf_user_story() {
        return cf_user_story;
    }

    public void setCf_user_story(String cf_user_story) {
        this.cf_user_story = cf_user_story;
    }

    public int getComment_count() {
        return comment_count;
    }

    public void setComment_count(int comment_count) {
        this.comment_count = comment_count;
    }

    public String getCf_a11y_review_project_flag() {
        return cf_a11y_review_project_flag;
    }

    public void setCf_a11y_review_project_flag(String cf_a11y_review_project_flag) {
        this.cf_a11y_review_project_flag = cf_a11y_review_project_flag;
    }

    public boolean isIs_open() {
        return is_open;
    }

    public void setIs_open(boolean is_open) {
        this.is_open = is_open;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTarget_milestone() {
        return target_milestone;
    }

    public void setTarget_milestone(String target_milestone) {
        this.target_milestone = target_milestone;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public boolean isIs_creator_accessible() {
        return is_creator_accessible;
    }

    public void setIs_creator_accessible(boolean is_creator_accessible) {
        this.is_creator_accessible = is_creator_accessible;
    }

    public List<Object> getFlags() {
        return flags;
    }

    public void setFlags(List<Object> flags) {
        this.flags = flags;
    }

    public Object getCf_rank() {
        return cf_rank;
    }

    public void setCf_rank(Object cf_rank) {
        this.cf_rank = cf_rank;
    }

    public String getCf_tracking_firefox98() {
        return cf_tracking_firefox98;
    }

    public void setCf_tracking_firefox98(String cf_tracking_firefox98) {
        this.cf_tracking_firefox98 = cf_tracking_firefox98;
    }
}

