// A program to print the sum of the series:
// S = 1 / 2 + 1 / 3 + 1 / 5 + 1 / 7 + 1 / 11 + ... + 1 / 29
public class Series10 {
    public static void main(String[] args) {
        int k;
        double s = 0.0;
        // Loops to display the sum of the series.
        for (int i = 2; i < 30; i++) {
            k = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    k++;
                }
            }
            if (k == 2) {
                s = s + 1.0 / i;
            }
        }
        // Printing the result.
        System.out.println("Sum of the Series S = " + s);
    }
}