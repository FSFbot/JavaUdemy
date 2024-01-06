package Exercicios_fixação_03;

import java.util.Scanner;

public class shape {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        rectangle rectangle = new rectangle();

        System.out.print("Enter the width: ");
        rectangle.width = sc.nextDouble();
        System.out.print("Enter the height: ");
        rectangle.height = sc.nextDouble();

        System.out.println("Area =  \n"+ rectangle.area());
        System.out.println("Perimeter = \n" + rectangle.perimeter());
        System.out.println("Diagonal = \n" + String.format("%.2f",rectangle.diagonal()));
        sc.close();
    }
}
