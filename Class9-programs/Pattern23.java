// A program to print the pattern
// The Pattern is:
// *
// * *
// * * *
// * * * *
// * * * * *
// * * * *
// * * *
// * *
// *
public class Pattern23 {
    public static void main(String[] args) {
        System.out.println("The Pattern is: ");
        // Upper half: increase the number of stars in each row.
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        // Lower half: decrease the number of stars in each row.
        for (int i = 1; i <= 4; i++) {
            for (int j = 4 ; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}