// A program to print a pattern of numbers in a stairs format.
// The Pattern is:
// 1
// 1 2
// 1 2 3
// 1 2 3 4
// 1 2 3 4 5

public class Pattern {
    public static void main(String[] args) {
        // Loop through numbers from 1 to 5 to create the pattern.
        for (int i = 1; i <= 5; i++) {
            // Inner loop to print the current number 'j' for 'i' times.
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    } 
}