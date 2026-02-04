package activity3;

import java.time.LocalDate;
import java.util.random.RandomGenerator;

public class Mission {
    // private fields
    private String missionTarget;
    private LocalDate missionDeadline;
    private int difficulty;

    public Mission() {
        RandomGenerator random = RandomGenerator.getDefault();
        String[] missionTargets = { "Steal Jaydenn's big black tumbler", "Mix everyones activity folders",
                "Add soy sauce to the coffee machine",
                "Hide geoff's Ipad", "Entertain the guard for 1 hour", "hide the HDMI cable",
                "Mix up Steph's, Geoff's, Ahron's and Jaydenn's bags",
                "Install a virus on the main server", "Add sand to the keyboard", "Change all passwords to secret",
                "Buy all the uniforms from the Business Office",
                "Cut the internet cable of CCSE", "Scratch the projector lens", "Throw a computer monitor on the beach",
                "Add bleach to the dean's shampoo",
                "Email the entire school a meme", "Add soap to the water tank",
                "Change all the clocks to 5 hours ahead", "Steal all the air conditioners",
                "Spend the school funds on Mcdo", "Kiss the school goat", "Make the fire alarm go off during class",
                "Swap the class schedules",
                "Put super glue on the librarians chair", "Hide all the chairs in the library" };

        // randomly selects a mission target fom the array
        missionTarget = missionTargets[random.nextInt(missionTargets.length)];

        // generate random difficulty level
        difficulty = random.nextInt(1, 6);

        // calculate mission deadline by add random number oof days (7-30) and the
        // current date
        int daysToAdd = random.nextInt(7, 31);
        missionDeadline = LocalDate.now().plusDays(daysToAdd);
    }

    // getters
    public String getMissionTarget() {
        return missionTarget;
    }

    public LocalDate getMissionDeadline() {
        return missionDeadline;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public displayMissionBriefing(){
        //Use a DateTimeFormatter to display the deadline in a readable format (e.g., "MMMM dd, yyyy").
        // di a tapos
    }
}