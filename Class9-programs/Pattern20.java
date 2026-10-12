// A program to print the pattern
// The Pattern is:
// 9
// 7 9
// 5 7 9
// 3 5 7 9
// 1 3 5 7 9
public class Pattern20 {
    public static void main(String[] args) {
        int k = 9;
        System.out.println("The Pattern is: ");
        // for loop to iterate through the rows.
        for (int i = 0; i < 5; i++) {
            // for loop to iterate through the columns.
            for (int j = k; j <= 9; j += 2) {
                System.out.print(j + " ");
            }
            k -= 2;
            System.out.println();
        }
    }
}