package assignments.A1.Classes;

public class Companion {
    private String name;
    private String role;
    private String ability;
    private int power;
    private Player owner;

    public Companion(String name, String role, int power, Player owner) {
        if (name == null || name.isEmpty()) {
            System.out.println("Error: Companion name cannot be null or empty");
            this.name = "Unknown";
        } else {
            this.name = name;
        }

        if (role == null || role.isEmpty() || 
            (!role.equals("Mage") && !role.equals("Warrior") && !role.equals("Healer"))) {
            System.out.println("Error: Companon role should be a Mage, Warrior, or Healer");
            this.role = "Unknown Role Type";
            this.ability = this.name + " rolls around on the ground...";
        } else {
            this.role = role;
            switch (role) {
                case "Mage":
                    this.ability = "casts a fireball!";
                    break;
                case "Warrior":
                    this.ability = "swings a Mighty sword!";
                    break;
                case "Healer":
                    this.ability = "heals the party!";
                    break;
            }
        }

        if (power < 1 || power > 100) {
            System.out.println("Error: Power must be between 1 and 100");
            this.power = 1;
        } else {
            this.power = power;
        }

        if (owner == null) {
            System.out.println("Error: Companion must be assigned to a vald Player");
            this.owner = new Player("Default Player", 100);
        } else {
            this.owner = owner;
        }

        System.out.println("Warning: Default values assigned for invalid inputs.");
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public int getPower() {
        return power;
    }

    public Player getOwner() {
        return owner;
    }

    public String useAbility() {
        return ability;
    }

    @Override
    public String toString() {
        return "Companion{name='" + name + "', role='" + role + "', power=" + power + ", owner=" + owner.getName() + "}";
    }
}
