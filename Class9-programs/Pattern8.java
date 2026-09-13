// A program to print the pattern.
// The Pattern is:
// 1 2 3 4 5 6 7
// 1 2 3 4 5
// 1 2 3
// 1
public class Pattern8 {
    public static void main(String[] args) {
        int k = 7;
        System.out.println("The Pattern is:");
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= k; j++) {
                System.out.print(j + " ");
            }
            k = k - 2;
            System.out.println();
        }
    }
}