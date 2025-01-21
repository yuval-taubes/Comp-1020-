package assignments.A1;

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
        }
}
