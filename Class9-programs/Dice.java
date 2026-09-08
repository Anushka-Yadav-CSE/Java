// A program to display all the possible combinations of the numbers.
public class Dice {
    public static void main(String[] args) {
        System.out.println("The three digit numbers(randomly) are: ");
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6; j++) {
                for (int k = 1; k <= 6; k++) {
                    System.out.print(i + "" + j + "" + k + " ");
                }
                System.out.println();
            }
        }
    }
}