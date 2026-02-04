public class MissionControl {
    public static void main(String[] args) {
        System.out.println("Welcome to the Mission Control\n");

        SecretAgent agent = new SecretAgent("013", "Vee", 5);

        // System.out.println("Agent ID: " +  agent.getAgentId());
        // System.out.println("Code Name: " + agent.getCodeName());
        // System.out.println("Clearance Level: " + agent.getClearanceLevel());

        // Mission mission = new Mission();         tama pa ba to T8T
        // mission.missionDetails();
        // mission.displayMissionBriefing();

        // if(agent.getClearanceLevel() >= mission.getDifficulty()){
        //     agent.startMission();
        // } else {
        //     System.out.println("Agent " + agent.getAgentId() + "'s clearance is too low for this mission.");
        // }

        agent.completeMission();
    }
}
