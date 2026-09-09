// A program to display the pattern.
public class Pattern2 {
    public static void main(String[] args) {
        // outer loop controls the rows
        for (int i = 1; i <= 5; i++) {
            // inner loop prints numbers from 1 upto the current row number.
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}