package assignments.A1;

import assignments.A1.Classes.Artifact;
import assignments.A1.Classes.Player;

public class Main {
    // Main method for testing
    public static void main(String[] args) {
        // Valid artifact
        Artifact artifact1 = new Artifact("Excalibur", 5, false);
        System.out.println(artifact1);
        System.out.println(artifact1.useArtifact());

        // Invalid artifact name
        Artifact artifact2 = new Artifact("", 3, true);
        System.out.println(artifact2);

        // Invalid rarity
        Artifact artifact3 = new Artifact("Pandora's Box", 0, true);
        System.out.println(artifact3);

        // Both invalid
        Artifact artifact4 = new Artifact("", 6, false);
        System.out.println(artifact4);

        // Static method usage
        System.out.println("Total artifacts created: " + Artifact.getTotalArtifacts());

        // Reset totalArtifacts
        Artifact.resetTotalArtifacts();
        System.out.println("Total artifacts after reset: " + Artifact.getTotalArtifacts());

        // Valid player
        Player player1 = new Player("Arthur", 100);
        System.out.println(player1);

        // Invalid name
        Player player2 = new Player("", 50);
        System.out.println(player2);

        // Invalid health
        Player player3 = new Player("Lancelot", -10);
        System.out.println(player3);

        // Collect artifacts
        Artifact artifact = new Artifact("Excalibur", 5, false);
        player1.collectArtifact(artifact);
        System.out.println(player1);

        // Take damage
        player1.takeDamage(30);
        System.out.println(player1);
        player1.takeDamage(100);
        System.out.println(player1);

        // Invalid damage
        player1.takeDamage(-20);
    }
}
