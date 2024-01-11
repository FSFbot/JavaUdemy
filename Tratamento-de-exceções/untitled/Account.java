 class Account {
    private Integer number;
    private String holder;
    private double balance;
    private double withdrawLimite;

     public Account(Integer number, String holder, double balance, double withdrawLimite) {
         this.number = number;
         this.holder = holder;
         this.balance = balance;
         this.withdrawLimite = withdrawLimite;
     }

     public Integer getNumber() {
         return number;
     }

     public String getHolder() {
         return holder;
     }

     public double getBalance() {
         return balance;
     }

     public double getWithdrawLimite() {
         return withdrawLimite;
     }
     public void withdraw (double amount) throws WithdrawlExpetion{
         if(amount > withdrawLimite){
             throw  new WithdrawlExpetion("Error: the amount exceeds withdrawn limits");
         }
         if(amount > balance){
             throw new WithdrawlExpetion("Erro: Not enought balance");
         }
     }

 }
