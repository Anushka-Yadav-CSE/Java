// A program to print the pattern:
// The Pattern is: 
// 1 2 3 4 5
// 1 2 3 4
// 1 2 3
// 1 2
// 1
public class Pattern14 {
    public static void main(String[] args) {
        int k = 5;
        System.out.println("The Pattern is: ");
        // for loop to iterate through the rows.
        for (int i = 1; i <= 5; i++) {
            // for loop to iterate through the columns.
            for (int j = 1; j <= k; j++) {
                System.out.print(j + " ");
            }
            k--;
            System.out.println();
        }
    }
}