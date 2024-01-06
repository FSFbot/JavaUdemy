package Exercicios_fixação_03;

import java.util.Scanner;

public class currencyConvertMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CurrencyConverter cc = new CurrencyConverter();

        System.out.println("What is the dollar price? ");
        cc.dollarPrice  = sc.nextDouble();

        System.out.println("How many dollars will be bought?");
        cc.amountDollars = sc.nextDouble();

        System.out.printf("Amount to be paid in reais: %.2f ", cc.amountReais() );
        sc.close();
    }
}
