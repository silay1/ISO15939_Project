package model;


public class AppState {
    private String   username;
    private String   school;
    private String   sessionName;
    private String   qualityType;
    private String   mode;
    private Scenario selectedScenario;

    public String   getUsername()      { return username; }
    public void     setUsername(String v)      { this.username = v; }
    public String   getSchool()        { return school; }
    public void     setSchool(String v)        { this.school = v; }
    public String   getSessionName()   { return sessionName; }
    public void     setSessionName(String v)   { this.sessionName = v; }
    public String   getQualityType()   { return qualityType; }
    public void     setQualityType(String v)   { this.qualityType = v; }
    public String   getMode()          { return mode; }
    public void     setMode(String v)           { this.mode = v; }
    public Scenario getSelectedScenario()       { return selectedScenario; }
    public void     setSelectedScenario(Scenario s) { this.selectedScenario = s; }
}
