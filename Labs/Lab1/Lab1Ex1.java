import java.util.Scanner;

public class Lab1Ex1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input;
        boolean keepGoing = true;
        double width, height;
        double areaRect, areaEllipse, diagonal, ratio;

        while (keepGoing) {
            System.out.print("Enter a width (positive nmber): ");
            width = in.nextDouble();
            //can't be 0
            while (width <= 0) {
                System.out.print("Width must be greater than 0. Enter again: ");
                width = in.nextDouble();
            }

            System.out.print("Enter a height (positive number): ");
            height = in.nextDouble();
            //can't be 0
            while (height <= 0) {
                System.out.print("Height must be greater than 0. Enter again: ");
                height = in.nextDouble();
            }

            System.out.printf("You entered width=%.2f, height=%.2f.\n", width, height);

            // Calculations
            areaRect = width * height;
            // Correct ellipse area formula
            areaEllipse = (Math.PI * width * height) / 4; 
            // Correct diagonal formula
            diagonal = Math.sqrt(width * width + height * height); 
            ratio = width / height;

            // Output results
            System.out.printf("\nArea of a %.2f x %.2f rectangle = %.2f\n", width, height, areaRect);
            System.out.printf("Area of a %.2f x %.2f ellipse = %.2f\n", width, height, areaEllipse);
            System.out.printf("Diagonal of a %.2f x %.2f rectangle = %.2f\n", width, height, diagonal);
            System.out.printf("Ratio of %.2f over %.2f = %.2f\n", width, height, ratio);

            // Check if the user wants to continue
            in.nextLine(); // Consume leftover newline
            System.out.print("\nDo you want to process another (Y/N)? ");
            input = in.nextLine();
            System.out.printf("You entered '%s'.\n", input);

            if (!input.toUpperCase().startsWith("Y")) {
                keepGoing = false;
            }
        }

        System.out.println("\n*** End of program. ***");
    }
}
