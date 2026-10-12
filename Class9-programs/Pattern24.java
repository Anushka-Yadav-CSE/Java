// A program to print the pattern
// The Pattern is:
// 1 2 3 4 5
// 1 2 3 4
// 1 2 3 
// 1 2 
// 1 
// 1 2
// 1 2 3
// 1 2 3 4
// 1 2 3 4 5
public class Pattern24 {
    public static void main(String[] args) {
        int k = 5;
        System.out.println("The Pattern is: ");
        // Upper half: decrease the number of numbers in each row.
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= k; j++) {
                System.out.print(j + " ");
            }
            k--;
            System.out.println();
        }
        // Lower half: increase the number of numbers in each row.
        for (int i = 2; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}