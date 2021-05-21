package chapter8;

public class Homework8{
    public static void main(String[] args) {
        CheckingAccount checkingAccount = new CheckingAccount(1000);
        checkingAccount.deposit(10);
        checkingAccount.withdraw(9);
        System.out.println(checkingAccount.getBalance());
        System.out.println("\n\n\n");
        SavingsAccount savingsAccount = new SavingsAccount(1000);
        savingsAccount.deposit(10);
        savingsAccount.withdraw(10);
        savingsAccount.withdraw(9);
        savingsAccount.deposit(10);
        System.out.println(savingsAccount.getBalance());
        savingsAccount.earnMonthlyInterest();
        System.out.println(savingsAccount.getBalance());
    }
}
class BankAccount{
    private double balance;
    public BankAccount(double initialBalance){
        this.balance = initialBalance;
    }
    //存款
    public void deposit(double amount){
        balance += amount;
    }
    //取款
    public void withdraw(double amount){
        balance -= amount;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
}

class CheckingAccount extends BankAccount{
    public CheckingAccount(double initialBalance){
        super(initialBalance);
    }

    @Override
    public void deposit(double amount) {
        super.deposit(amount - 1);
    }

    @Override
    public void withdraw(double amount) {
        super.withdraw(amount + 1);
    }
}

class SavingsAccount extends BankAccount{
    private double monthlyInterest = 0.03;
    private int count = 3;
    public SavingsAccount(double initialBalance){
        super(initialBalance);
    }

    @Override
    public void deposit(double amount) {
        if (count > 0){
            super.deposit(amount);
        }
        else {
            super.deposit(amount - 1);
        }
        count--;
    }

    @Override
    public void withdraw(double amount) {
        if (count > 0){
            super.withdraw(amount);
        }
        else {
            super.withdraw(amount + 1);
        }
        count--;
    }

    public void earnMonthlyInterest(){
        count = 3;
        super.deposit(getBalance() * monthlyInterest);
    }

}