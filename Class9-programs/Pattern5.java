// A program to print the pattern.
// The Pattern is:
// 9 7 5 3 1
// 9 7 5 3
// 9 7 5
// 9 7
// 9

public class Pattern5 {
    public static void main(String[] args) {
        System.out.println("The pattern is:");
        // for loop to iterate through the rows.
        for (int i = 1; i <= 9; i += 2) {
            // for loop to iterate through the columns.
            for (int j = 9; j >= i; j -= 2) {
                // Printing the value of j in each column.
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }
}