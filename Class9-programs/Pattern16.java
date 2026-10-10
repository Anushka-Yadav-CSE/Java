// A program to print the pattern:
// The Pattern is:
// 1 3 5 7 9
// 1 3 5 7
// 1 3 5
// 1 3
// 1
public class Pattern16 {
    public static void main(String[] args) {
        int k = 9;
        // for loop to iterate through the rows.
        for (int i = 1; i <= 5; i++) {
            // for loop to iterate through the columns.
            for(int j = 1; j <= k; j += 2) {
                System.out.print(j + " ");
            }
            k -= 2;
            System.out.println();
        }
    }
}