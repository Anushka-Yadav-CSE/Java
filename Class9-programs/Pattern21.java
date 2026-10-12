// A program to print the pattern
// The Pattern is:
// 9
// 9 7
// 9 7 5
// 9 7 5 3
// 9 7 5 3 1
public class Pattern21 {
    public static void main(String[] args) {
        int k = 9;
        System.out.println("The Pattern is: ");
        // Outer loop to iterate through the rows.
        for (int i = 1; i <= 5; i++) {
            // Inner loop to print descending odd numbers in each row..
            for (int j = 9; j >= k; j -= 2) {
                System.out.print(j + " ");
            }
            k -= 2;
            System.out.println();
        }
    }
}