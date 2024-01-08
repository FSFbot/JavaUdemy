package Encapsulamento;

import java.util.InputMismatchException;
import java.util.Scanner;

public class mainAccount {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        BankAccount account  = null;

        try{
            System.out.println("Enter account number: ");
            int accountNumber = scanner.nextInt();
            System.out.println("Enter account holder: ");
            scanner.nextLine();
            String holder = scanner.nextLine();
            System.out.println("Is there an initial deposit (y/n)?");
            char initialDepositExist = scanner.next().charAt(0);
            double initialDeposit = 0.0;
            if(initialDepositExist == 'y' || initialDepositExist == 'Y'){
                System.out.println("Enter initial deposit value:");
                initialDeposit = scanner.nextDouble();
            }
            account = new BankAccount(accountNumber,holder,initialDeposit);


        }catch (InputMismatchException e){
            System.out.println("Invalid input. Please enter the correct format");
            System.exit(0);
        }

        try{
            System.out.println("Account data:");
            System.out.println(account);
            System.out.println("Enter a deposit value:");
            double deposit = scanner.nextDouble();
            account.deposit(deposit);
            System.out.println("Updated account data:");
            System.out.println(account);
            System.out.println("Enter a withdraw value:");
            double withdraw = scanner.nextDouble();
            account.withdraw(withdraw);
            System.out.println("Updated account data:");
            System.out.println(account);
        }catch (InputMismatchException e){
            System.out.println("Invalid input. Please enter a number");
        }
    }
}
