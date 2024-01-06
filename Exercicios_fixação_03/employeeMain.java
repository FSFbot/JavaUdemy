package Exercicios_fixação_03;

import java.util.Scanner;

public class employeeMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Employee employee = new Employee();

        System.out.println("Enter Emplyee data:  ");
        System.out.println("Name: ");
        employee.name = sc.nextLine();
        System.out.println("GrossSalary: ");
        employee.grossSalary = sc.nextDouble();
        System.out.println("Tax: ");
        employee.tax= sc.nextDouble();

        System.out.println("Emplyee: "+ employee);

        System.out.println("Which percentage to increase salary? ");

        double percentage = sc.nextDouble();
        employee.increaseSalary(percentage);
        System.out.println("Updated data: " + employee);
        sc.close();
    }
}
