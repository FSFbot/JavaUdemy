import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> uniqueStudents = new HashSet<>();

        System.out.println("Instructor Alex's courses");

        System.out.println("How many students for course A?");
        int studentsCourseA = sc.nextInt();
        System.out.println("Enter student code for course A:");
        for (int i = 0; i < studentsCourseA; i++) {
            int studentCode = sc.nextInt();
            uniqueStudents.add(studentCode);
        }
        System.out.println("How many students for course B?");
        int studentsCourseB = sc.nextInt();
        System.out.println("Enter student code for course B:");
        for (int i = 0; i < studentsCourseB; i++) {
            int studentCode = sc.nextInt();
            uniqueStudents.add(studentCode);
        }
        System.out.println("How many students for course C?");
        int studentsCourseC = sc.nextInt();
        System.out.println("Enter student code for course C:");
        for (int i = 0; i < studentsCourseA; i++) {
            int studentCode = sc.nextInt();
            uniqueStudents.add(studentCode);
        }
    }
}
