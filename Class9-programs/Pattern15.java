// A program to print the pattern: 
// The Pattern is:
// 5 4 3 2 1
// 5 4 3 2
// 5 4 3
// 5 4
// 5
public class Pattern15 {
    public static void main(String[] args) {
        // for loop to iterate through the rows.
        for (int i = 1; i <= 5; i++) {
            // for loop to iterate through the columns.
            for (int j = 5; j >= i; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}