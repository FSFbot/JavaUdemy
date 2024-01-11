import java.util.Scanner;

public class accountBank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account data");
        System.out.print("Number: ");
        int number = sc.nextInt();
        System.out.print("Holder: ");
        String holder = sc.nextLine();
        System.out.print("Initial Balance: ");
        double balance = sc.nextDouble();
        System.out.print("Withdrawn limit: ");
        double withdrawLimit = sc.nextDouble();


        Account account = new Account(number,holder,balance,withdrawLimit);
        try{
            System.out.println("\nEnter amount for withdraw: ");
            double amount = sc.nextDouble();
            account.withdraw(amount);
            System.out.println("New balance: "+ String.format("%.2f",account.getBalance()));
        }catch (WithdrawlExpetion e){
            System.out.println(e.getMessage());
        }finally {
            sc.close();
        }
    }
}
