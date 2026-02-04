package activity3;

import java.time.LocalDateTime;

public class secretAgent {
    // privatefields
    private String agentId = "013";
    private String codeName;
    private int clearanceLevel;
    private boolean onMission;
    private LocalDateTime lastMissionCompletionTime;

    // a public constructor
    public secretAgent(String agentId, String codeName, int clearanceLevel) {
        onMission = false;
        lastMissionCompletionTime = null;
    }

    public String getAgentId() {
        return agentId;
    }

    public String getCodeName() {
        return codeName;
    }

    public int getClearanceLevel() {
        return clearanceLevel;
    }

    public boolean isOnMission() {
        return onMission;
    }

    public LocalDateTime getLastMissionCompletionTime() {
        return lastMissionCompletionTime;
    }

    // setters==================================================================
    public void setCodeName(String codeName) {
        this.codeName = codeName;
    }

    public void setClearanceLevel(int clearanceLevel) {
        if (clearanceLevel >= 1 && clearanceLevel <= 5) {
            this.clearanceLevel = clearanceLevel;
        } else {
            System.out.println("Clearance level must be between 1 and 5.");
        }
    }

    // behaviours===============================================================
    public void startMission() {
        if (!onMission) {
            onMission = true;
            System.out.println("Agent " + codeName + " has started a mission. Yippeee!");
        }
    }

    public void completeMission() {
        if (onMission) {
            onMission = false;
            lastMissionCompletionTime = LocalDateTime.now();
            System.out.println("Agent " + codeName + " has completed the mission. Yeheeey!"); // tama ba tong mga
                                                                                              // pinaggagawa ko ser
        }
    }
}
