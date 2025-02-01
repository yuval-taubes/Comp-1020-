package assignments.A1.Classes;

import java.util.Random;

public class GameWorld {
    private static GameWorld instance;
    private Player[] players;
    private int numPlayers;
    private Artifact[] artifacts;
    private int numArtifacts;
    private Quest[] quests;
    private int numQuests;
    
    private static final int MAX_PLAYERS = 100;
    private static final int MAX_ARTIFACTS = 50;
    private static final int MAX_QUESTS = 20;
    
    private GameWorld() {
        players = new Player[MAX_PLAYERS];
        numPlayers = 0;
        artifacts = new Artifact[MAX_ARTIFACTS];
        numArtifacts = 0;
        quests = new Quest[MAX_QUESTS];
        numQuests = 0;
    }
    
    public static GameWorld getInstance() {
        if (instance == null) {
            instance = new GameWorld();
        }
        return instance;
    }
    
    public static GameWorld resetWorld() {
        instance = new GameWorld();
        return instance;
    }
    
    public boolean addPlayer(Player player) {
        if (numPlayers >= MAX_PLAYERS) {
            System.out.println("Error: Cannot add more players to the GameWorld.");
            return false;
        }
        players[numPlayers++] = player;
        return true;
    }
    
    public boolean addArtifact(Artifact artifact) {
        if (numArtifacts >= MAX_ARTIFACTS) {
            System.out.println("Error: Cannot add more artifacts to the GameWorld.");
            return false;
        }
        artifacts[numArtifacts++] = artifact;
        return true;
    }
    
    public boolean addQuest(Quest quest) {
        if (numQuests >= MAX_QUESTS) {
            System.out.println("Error: Cannot ad more quests to the GameWorld.");
            return false;
        }
        quests[numQuests++] = quest;
        return true;
    }
    
    public Artifact getRandomArtifact() {
        if (numArtifacts == 0) {
            System.out.println("Error: No artifacts available in the GameWorld.");
            return null;
        }
        Random rand = new Random();
        return artifacts[rand.nextInt(numArtifacts)];
    }
    
    public Player[] getPlayers() {
        Player[] activePlayers = new Player[numPlayers];
        System.arraycopy(players, 0, activePlayers, 0, numPlayers);
        return activePlayers;
    }
    
    public Quest[] getQuests() {
        Quest[] activeQuests = new Quest[numQuests];
        System.arraycopy(quests, 0, activeQuests, 0, numQuests);
        return activeQuests;
    }
}
