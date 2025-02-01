package assignments.A1.Classes;

public class Quest {
    private String description;
    private int difficulty;
    private Companion[] companions;
    private int numCompanions;
    
    public Quest(String description, int difficulty) {
        if (description == null || description.isEmpty()) {
            System.out.println("Error: Quest description cannot be null or empty");
            this.description = "Unnamed Quest";
        } else {
            this.description = description;
        }
        
        if (difficulty < 1 || difficulty > 10) {
            System.out.println("Error: Difficulty must be between 1 and 10");
            this.difficulty = 1;
        } else {
            this.difficulty = difficulty;
        }
        
        this.companions = new Companion[5];
        this.numCompanions = 0;
    }
    
    public String getDescription() {
        return description;
    }
    
    public int getDifficulty() {
        return difficulty;
    }
    
    public int getNumCompanions() {
        return numCompanions;
    }
    
    public boolean addRequiredCompanion(Companion companion) {
        if (numCompanions >= 5) {
            System.out.println("Error: Cannot add more companions to this quest.");
            return false;
        }
        companions[numCompanions++] = companion;
        return true;
    }
    
    public boolean canComplete(Player player) {
        int requiredCompanions = difficulty / 2;
        int totalPower = 0;
        
        for (int i = 0; i < numCompanions; i++) {
            totalPower += companions[i].getPower();
        }
        
        return numCompanions >= requiredCompanions && totalPower >= (10 * difficulty) && player.getNumArtifacts() >= numCompanions;
    }
    
    public String attemptQuest(Player player) {
        if (canComplete(player)) {
            return "Quest completed successfully! " + description;
        } else {
            int damage = difficulty * 10;
            player.takeDamage(damage);
            return "Quest failed! The player has taken damage.";
        }
    }
    
    @Override
    public String toString() {
        return "Quest{description='" + description + "', difficulty=" + difficulty + ", numCompanions=" + numCompanions + "}";
    }
}

