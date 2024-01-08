package Encapsulamento;

public class BankAccount {
    private final int accountNumber;
    private String holder;
    private double balance;

    public BankAccount(int accountNumber, String holder, double balance) {
        this.accountNumber = accountNumber;
        this.holder = holder;
        this.balance = balance;
    }
    public void deposit(double amount) { balance += amount;}
    public void withdraw(double amount){balance -= amount +5.0;}
    public void setHolder(String Holder){this.holder = holder;}
    public  int getAccountNumber(){return accountNumber;}

    public String getHolder(){return  holder;}

    public double getBalance(){return balance;}

    @Override
    public String toString(){
        return "Account "+ accountNumber + ", Holder: " + holder + ", Balance: $"+ balance;
    }
}
