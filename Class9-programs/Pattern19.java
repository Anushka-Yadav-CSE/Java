// A program to print the pattern:
// The pattern is: 
// 9 9 9 9 9 
// 7 7 7 7 7
// 5 5 5 5 5
// 3 3 3 3 3
// 1 1 1 1 1
public class Pattern19 {
    public static void main(String[] args) {
        System.out.println("The Pattern is: ");
        // Outer loop for the rows
        for (int i = 9; i >= 1; i -= 2) {
            // Inner loop for the columns
            for (int j = 1; j <= 5; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}