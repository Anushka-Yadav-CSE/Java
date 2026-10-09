// A program to print the pattern:
// The Pattern is:
// 1
// 2 1
// 3 2 1
// 4 3 2 1
// 5 4 3 2 1
public class Pattern13 {
    public static void main(String[] args) {
        // for loop to iterate through the rows.
        for (int i = 1; i <= 5; i++) {
            // for loop to iterate through the columns.
            for (int j = i; j >= 1; j--) {
                // Printing the result.
                System.out.print(j);
            }
            System.out.println();
        }
    }
}