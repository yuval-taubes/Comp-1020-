import java.util.Random;
public class Lab2Ex1 {

    // Constant SEED
    private static final int SEED = 333334;

    // Method 1: No arguments, no return
    public static void method1() {
        System.out.println("You are standing at the end of a road before a small brick building.");
    }

    // Method 2: Takes an integer n, returns negative n/2
    public static int method2(int n) {
        System.out.println("You are in a maze of " + n + " twisty little passages, all alike.");
        return -n / 2;
    }

    // Method 3: Takes a boolean argument, returns 3 or -3
    public static int method3(boolean isOdd) {
        if (isOdd) {
            System.out.println("You are on the edge of a breath-taking view.");
            return 3;
        } else {
            System.out.println("It is pitch black. You are likely to be eaten by a grue.");
            return -3;
        }
    }

    // Method 4: Takes two integers, returns width * depth / 100
    public static int method4(int width, int depth) {
        System.out.println("You are in a north/south canyon about " + width + " feet across and " + depth + " feet deep.");
        return (width * depth) / 100;
    }

    public static void main(String[] args) {
        int score = 0;
        String seedStr = String.valueOf(SEED);
        Random random = new Random();

        // Loop through each digit of SEED
        for (int i = 0; i < seedStr.length(); i++) {
            int digit = Character.getNumericValue(seedStr.charAt(i));
            int remainingDigits = seedStr.length() - i - 1; // Digits left to process

            // Process digit
            switch (digit) {
                case 0:
                    // Do nothing for 0
                    break;
                case 1:
                    method1();
                    break;
                case 2:
                    score += method2(remainingDigits);
                    break;
                case 3:
                    boolean isOdd = (i == 0) ? false : Character.getNumericValue(seedStr.charAt(i - 1)) % 2 != 0;
                    score += method3(isOdd);
                    break;
                case 4:
                    int width = 10 + random.nextInt(41); // Random between 10 and 50
                    int depth = 10 + random.nextInt(41); // Random between 10 and 50
                    score += method4(width, depth);
                    break;
                default:
                    System.out.println("Unknown location " + digit);
                    break;
            }
        }

        // Print the final score and the result
        System.out.println("Final score: " + score);
        if (score > 0) {
            System.out.println("You win!");
        } else if (score < 0) {
            System.out.println("You lose!");
        } else {
            System.out.println("It's a draw!");
        }
    }
}
