// A program to print the pattern.
// The Pattern is:
// 1 1
// 1 1
// 1 1
// 1 1
// 1 1

public class Pattern7 {
    public static void main(String[] args) {
        System.out.println("The Pattern is:");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 2; j++) {
                System.out.print("1 ");                
            }
            System.out.println();
        }
    }
}