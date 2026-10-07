// A program to print all the composite numbers from 1 to 100.
public class Composite {
    public static void main(String[] args) {
        int k;
        System.out.println("All composite numbers from 1 to 100 are ");
        // Loops to calculate and display the composite numbers from 1 to 100
        for (int b = 1; b <= 100; b++) {            
            k = 0;
            for(int i = 1; i <= b; i++) {
                if(b % i == 0) {
                    k++;
                }
            }
            if (k > 2) {
                System.out.println(b);
            }
        }
    }
}