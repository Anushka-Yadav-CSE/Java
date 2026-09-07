// A program to print a pattern of numbers in a stairs format.
public class Pattern {
    public static void main(String[] args) {
        // Loop through numbers from 1 to 5 to create the pattern.
        for (int i = 1; i <= 5; i++) {
            // Inner loop to print the current number 'i' for 'i' times.
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}