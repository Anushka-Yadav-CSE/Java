// A program to display the pattern.
// The Pattern is:
// 1
// 3 5
// 5 7 9
// 7 9 11 13
// 9 11 13 15 17

public class Pattern3 {
    public static void main(String[] args) {
        System.out.println("The Pattern is:");
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