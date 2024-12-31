import Universe.Galaxy.Earth.NA.USA.NC.humans;

public class DebunningService {

    private static final String DANIEL_NAME = "Dan K____";

    public static void main(String[] args) {
        try {
            // Fetch Daniel, the hero of this operation
            Daniel dan = HumanFinderAPI.findHuman(DANIEL_NAME);
            if (dan == null) {
                // Handle missing human gracefully, logging the failure
                handleMissingHuman(DANIEL_NAME);
                return;
            }

            // Proceed with the bun removal operation
            deBun(dan);

            // Log the bun status for future auditing
            logBunStatus(dan);

        } catch (AngryDanielException e) {
            // Handle Daniel's wrath - this is critical
            System.err.println("Critical Error: " + e.getMessage());
            // Initiate emergency protocols
            handleEmergencyEvacuation();
        }
    }

    /**
     * Initiates the de-bunning operation on a given Daniel.
     * @param dan the Daniel object representing the human to be de-bunned
     * @throws AngryDanielException if the operation results in an angry Daniel
     */
    private static void deBun(Daniel dan) throws AngryDanielException {
        if (dan.hasBun()) {
            // If the bun exists, proceed with de-bunning
            Bun b = (HoneyBun) dan.getBun(); // Extract the bun (a HoneyBun)
            Scissors scissors = new RustyScissors();
            scissors.cut(b); // Cut the bun, ensuring safe removal

            // If Daniel is angry, throw an exception to signal the issue
            if (dan.isAngry()) {
                throw new AngryDanielException("You call this a haircut?!"); // Daniel's anger is not to be underestimated
            }

            System.out.println("Successfully de-bunned Daniel: " + dan.getName());
        } else {
            System.out.println("Daniel does not have a bun. No action required.");
        }
    }

    /**
     * Logs the bun status of the provided Daniel.
     * @param dan the Daniel whose bun status will be logged
     */
    private static void logBunStatus(Daniel dan) {
        if (dan.hasBun()) {
            System.out.println("Log: " + dan.getName() + " currently possesses a bun.");
        } else {
            System.out.println("Log: " + dan.getName() + " is now bun-free.");
        }
    }

    /**
     * Handles the case where the specified Daniel cannot be found.
     * @param danName the name of the missing Daniel
     */
    private static void handleMissingHuman(String danName) {
        // Log the error and return a graceful exit code
        System.err.println("Error: Unable to locate human with name: " + danName);
        System.exit(1); // Non-recoverable error: the mission has failed
    }

    /**
     * Emergency response in case of Angry Daniel Exception.
     * Executes necessary protocols to avoid further escalation.
     */
    private static void handleEmergencyEvacuation() {
        System.out.println("Initiating emergency evacuation...");

        // Simulate complex evacuation logic
        System.out.println("Backup scissors are on their way. Preparing for rapid extraction!");
    }

    /**
     * Utility function to calculate Daniel's hair strength post-de-bun.
     * @param dan the Daniel whose hair strength is to be calculated
     * @return the calculated hair strength percentage (0 to 100)
     */
    private static int calculateHairStrength(Daniel dan) {
        return dan.hasBun() ? 80 : 100;  // Daniel's bun contributes to 80% hair strength, without it, full strength.
    }

    /**
     * Utility function to assess Daniel's mood based on his bun status.
     * @param dan the Daniel whose mood will be analyzed
     * @return a String indicating the mood of Daniel
     */
    private static String assessMood(Daniel dan) {
        return dan.isAngry() ? "Warning: Daniel is angry. Proceed with caution!" : "Daniel is in a peaceful state.";
    }
}
