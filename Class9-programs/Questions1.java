// A program to accept N Boolean answers and display the frequency of true and false answers.
import java.util.*;
public class Questions1 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner (System.in)) {
            int f1 = 0, f2 = 0;
            System.out.println("Enter the number of questions(N): ");
            int n = in.nextInt();
            System.out.println("Enter the answers in boolean (true or false).");
            for (int i = 1; i <= n; i++) {
                System.out.print("Answers are : ");
                boolean a = in.nextBoolean();
                if (a == true) {
                    f1 = f1 + 1;
                }
                else {
                    f2 = f2 + 1;
                }
            }
            System.out.println("Frequency of 'TRUE' answers = " + f1);
            System.out.println("Frequency of 'FALSE' answers = " + f2);
        }
    }
}
