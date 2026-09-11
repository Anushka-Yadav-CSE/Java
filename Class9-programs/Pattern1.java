// A program to print a pattern like staircase using asterisk sign.
// The Pattern is:
// *
// * * *
// * * * * *
// * * * * * * *
// * * * * * * * * *

public class Pattern1 {
    public static void main(String[] args) {
        int k = 1;
        System.out.println("The Pattern is:");
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < k; j++) {
                System.out.print("* "); 
            }
            k = k + 2;
            System.out.println();        
        }
    }
}