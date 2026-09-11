// A program to print the pattern.
// The Pattern is:
// 5 4 3 2 1
// 4 3 2 1
// 3 2 1
// 2 1
// 1

public class Pattern4 {
    public static void main(String[] args) {
        System.out.println("The pattern is");
        // for loop to iterate through the rows.
        for (int i = 1; i <= 5; i++) {
            // for loop to iterate through the columns.
            for (int j = 6 - i; j >= 1; j--) {
                // Printing the value of j in each column.
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }
}