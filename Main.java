public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.Setname("smylie");
        System.out.println("Name :  "+e1.getName());
        e1.Setsalary(25000);
        System.out.println("Salary:  "+e1.getSalary());

        BankAccount b1 = new BankAccount();
        b1.Setaccnumber(1234567890);
        System.out.println("Account Number :  "+b1.getAccnumber());
        b1.Setbalance(25000);
        System.out.println("Balance:  "+b1.getBalance());

    }
}