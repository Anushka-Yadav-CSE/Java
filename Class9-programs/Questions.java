// A program to calculate and display the correct answers each candidate got.
import java.util.*;
public class Questions {
    public static void main(String[] args) {
        try(Scanner in=new Scanner(System.in)) {
            System.out.print("Enter the total no. of questions: ");
            int totalquestion=in.nextInt();
            System.out.print("Enter the % of correct questions by Candidate 1: ");
            double candid1=in.nextDouble();
            System.out.print("Enter the % of correct questions by Candidate 2: ");
            double candid2=in.nextDouble();
            double candidate1=totalquestion*candid1/100.0;
            double candidate2=totalquestion*candid2/100.0;
            System.out.println("Correct answers of candidate 1: " + candidate1);
            System.out.println("Correct answers of candidate 2: " + candidate2);
        }
    }
}