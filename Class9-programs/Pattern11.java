// A program to dislay the following output:
// The Pattern is: 
// 1 1 1 1 1
// 2 2 2 2 2 
// 3 3 3 3 3
// 4 4 4 4 4
// 5 5 5 5 5

public class Pattern11 {
    public static void main(String[] args) {
        System.out.println("The Pattern is: ");
        for (int i = 1; i <= 5; i ++) {
            for(int j = 1; j <= 5; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}