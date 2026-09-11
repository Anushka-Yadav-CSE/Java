// A program to display the pattern.
// The Pattern is:
// 1
// 2 2
// 3 3 3
// 4 4 4 4
// 5 5 5 5 5
public class Pattern2 {
    public static void main(String[] args) {
        System.out.println("The Pattern is:");
        // outer loop controls the rows
        for (int i = 1; i <= 5; i++) {
            // inner loop prints numbers from 1 upto the current row number.
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}