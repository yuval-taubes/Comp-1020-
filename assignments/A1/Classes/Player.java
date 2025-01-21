package assignments.A1.Classes;

public class Player {
    // Attributes
    private String name;
    private int health;
    private Artifact[] inventory;
    private int numArtifacts;

    // Constructor
    public Player(String name, int health) {
        boolean invalidName = false;
        boolean invalidHealth = false;

        // Validate name
        if (name == null || name.trim().isEmpty()) {
            System.out.println("Error: Player name cannot be null or empty");
            this.name = "Unknown";
            invalidName = true;
        } else {
            this.name = name;
        }

        // Validate health
        if (health < 0 || health > 100) {
            System.out.println("Error: Health must be between 0 and 100");
            this.health = 100;
            invalidHealth = true;
        } else {
            this.health = health;
        }

        // Initialize inventory
        this.inventory = new Artifact[10];
        this.numArtifacts = 0;

        // Warning for invalid inputs
        if (invalidName || invalidHealth) {
            System.out.println("Warning: Default values assigned for invalid inputs.");
        }
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getNumArtifacts() {
        return numArtifacts;
    }

    // Collect artifact
    public boolean collectArtifact(Artifact artifact) {
        if (numArtifacts >= 10) {
            System.out.println("Error: Inventory is full, cannot add more artifacts.");
            return false;
        }
        inventory[numArtifacts] = artifact;
        numArtifacts++;
        return true;
    }

    // Take damage
    public void takeDamage(int amount) {
        if (amount < 0) {
            System.out.println("Error: Damage amount cannot be negative.");
            return;
        }
        health -= amount;
        if (health < 0) {
            health = 0;
        }
    }

    // String representation of the player
    @Override
    public String toString() {
        return "Player{name='" + name + "', health=" + health + ", numArtifacts=" + numArtifacts + "}";
    }

    // Main method for testing
    public static void main(String[] args) {
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

