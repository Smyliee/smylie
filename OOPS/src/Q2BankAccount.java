public class Q2BankAccount {
   private String accountNumber;
    private double balance;
     private String ownerName;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
    double deposit(double amount){
        balance= balance+amount;
        System.out.println("Amount deposited to your account ");
        return balance;

    }
    double withDraw(double amount){
        balance = balance-amount;
        System.out.println("Amount Withdrawn");
        return balance;
    }

    @Override
    public String toString() {
        return "Q2BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                ", ownerName='" + ownerName + '\'' +
                '}';
    }
}
class SavingBankAccount  extends Q2BankAccount{
    private  double interestRate;

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
    void addInterest(){
        double interest = ((interestRate *getBalance())/100)+getBalance();
        setBalance(interest);
    }
}
   class CheckingAccount extends Q2BankAccount{
       private  int checks;

       public int getChecks() {
           return checks;
       }

       public void setChecks(int checks) {
           this.checks = checks;
       }
       void writeCheck(double amount) {
           double afterAmount = getBalance() - amount;
           int y = getChecks();
           y=y+1;
           setChecks(y);
           setBalance(afterAmount);
       }

       @Override
       public String toString() {
           return "CheckingAccount{" +
                   "checks=" + checks +
                   '}';
       }

       public static void main(String[] args){
           SavingBankAccount sa1 = new SavingBankAccount();
           Q2BankAccount cha1 = new CheckingAccount();
           sa1.setBalance(20000d);
           sa1.setAccountNumber("12345965432");
           sa1.setOwnerName(" RATI PANDAY ");

    }
   }
