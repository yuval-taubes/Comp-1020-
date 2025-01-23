package assignments.A1.Classes;

public class Artifact {
    // Attributes
    private String name;
    private int rarity;
    private boolean isCursed;
    private static int totalArtifacts = 0;

    // Constructor
    public Artifact(String name, int rarity, boolean isCursed) {
        boolean invalidName = false;
        boolean invalidRarity = false;

        // Validate name
        if (name == null || name.trim().isEmpty()) {
            System.out.println("Error: Artifact name cannot be null or empty");
            this.name = "Unknown";
            invalidName = true;
        } else {
            this.name = name;
        }

        // Validate rarity
        if (rarity < 1 || rarity > 5) {
            System.out.println("Error: Rarity must be between 1 and 5");
            this.rarity = 1;
            invalidRarity = true;
        } else {
            this.rarity = rarity;
        }

        // Set isCursed
        this.isCursed = isCursed;

        // Increment totalArtifacts if no validation errors
        if (!invalidName || !invalidRarity) {
            totalArtifacts++;
        }
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getRarity() {
        return rarity;
    }

    public boolean isCursed() {
        return isCursed;
    }

    public static int getTotalArtifacts() {
        return totalArtifacts;
    }

    // Method to use the artifact
    public String useArtifact() {
        if (isCursed) {
            return "The artifact is cursed! Beware!";
        } else {
            return "You use the " + name + " artifact. It glows with magical power!";
        }
    }

    // String representation of the artifact
    @Override
    public String toString() {
        return "Artifact{name='" + name + "', rarity=" + rarity + ", isCursed=" + isCursed + "}";
    }

    // Reset totalArtifacts (for testing purposes)
    public static void resetTotalArtifacts() {
        totalArtifacts = 0;
    }
}


