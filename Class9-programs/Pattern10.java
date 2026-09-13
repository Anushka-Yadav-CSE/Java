// A program to print the pattern.
// The Pattern is:
// *
// * *
// * * *
// * * * *
// * * * * *

public class Pattern10 {
    public static void main(String[] args) {
        System.out.println("The Pattern is:");
        // for loop to iterate through the rows.
        for (int i = 1; i <= 5; i++) {
            // for loop to iterate through the columns.
            for (int j = 1; j <= i; j++) {
                // Print the result.
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}