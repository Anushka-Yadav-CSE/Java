// A program to display the pattern.
public class Pattern3 {
    public static void main(String[] args) {
        // for loop to iterate through the rows.
            for (int i = 1; i <= 5; i++) {
            int num = 2 * i - 1;
            // for loop to iterate through the columns.
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num = num + 2;
            }
            System.out.println();
        }
    }
}