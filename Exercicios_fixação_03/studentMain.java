package Exercicios_fixação_03;

import java.util.Scanner;

public class studentMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student student = new Student();


        System.out.println("Enter student name:");
        student.name = sc.nextLine();
        System.out.println("First term grade ");
        student.firstTermGrade = sc.nextDouble();
        System.out.println("Second term grade: ");
        student.secondTermGrade = sc.nextDouble();
        System.out.println("Third term grade: ");
        student.secondTermGrade = sc.nextDouble();

        System.out.println("Final Grade =>"+ String.format("%.2f", student.finalGrade()));

        String status = student.isPassed();
        System.out.println(status);
        if(status.equals("FAILED")){
            System.out.printf("Missing: " + String.format("%.2f",student.pointsNeeded()));
        }
        sc.close();
    }
}
