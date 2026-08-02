// A program to take Name, Class, Subject, School and City of a student and print them.
import java.util.*;
public class BioData {
    public static void main(String[] args) {
        try(Scanner in=new Scanner(System.in)) {
            System.out.print("Enter the name of the student: ");
            String student=in.nextLine();
            System.out.print("Enter the class/course of the student: ");
            String course=in.nextLine();
            System.out.print("Enter the subject/branch of the student: ");
            String subject=in.nextLine();
            System.out.print("Enter the name of school/college of the student: ");
            String school=in.nextLine();
            System.out.print("Enter the city of the student: ");
            String city=in.nextLine();
            System.out.println("Name of the student: " + student);
            System.out.println("Class/Course of the student: " + course);
            System.out.println("Subject/Branch of the student: " + subject);
            System.out.println("Name of school/college: " + school);
            System.out.println("City: " + city);
        }
    }
}