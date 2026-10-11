// A program to display the pattern:
// The Pattern is:
// 5
// 5 4 
// 5 4 3
// 5 4 3 2
// 5 4 3 2 1
public class Pattern17 {
    public static void main(String[] args) {
        int k = 5;
        //  Outer loop to iterate through the rows.
        for (int i = 1; i <= 5; i++) {
            // Inner loop to print numbers in descending order.
            for (int j = 5; j >= k; j--) {
                System.out.print(j + " ");
            }
            k--;
            System.out.println();
        }
    }
}