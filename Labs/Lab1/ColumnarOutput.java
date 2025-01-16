public class ColumnarOutput {
    public static void main(String[] args) {
        // Constants
        final int START = 0;
        final int END = 4010;
        final int INCREMENT = 10;
        final int COLUMNS = 8;
        final boolean RIGHT_JUSTIFY = true;

        // Variables
        int count = 0;

        // Loop through the range from START to END (inclusive)
        for (int i = START; i <= END; i += INCREMENT) {
            //make the numbers appear on the right or left of the table space
            if (RIGHT_JUSTIFY) {
                System.out.printf("%6d", i);
            } else {
                System.out.printf("%-6d", i); 
            }
            // Keep track of the number of columns printed in the current row
            count++; 

            if (count % COLUMNS == 0) {
                System.out.println();
            }
        }

        if (count % COLUMNS != 0) {
            System.out.println();
        }
        System.out.println("\n*** End of program. ***");
    }
}
