// A program to print the pattern:
// The Pattern is:
// 1 2 3 4 5
// 2 3 4 5
// 3 4 5
// 4 5 
// 5
public class Pattern18 {
    public static void main(String[] args) {
        System.out.println("The Pattern is: ");
        // Outer loop to iterate through the rows.
        for (int i = 1; i <= 5; i++) {
            // Inner loop to print numbers from the current row number to 5.
            for (int j = i; j <= 5; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}