package day31_Constructors;

public class BankAccount {


    public String accountHolder;
    public int accountNumber;
    public double Balance;

    public void setInfo(String accountHolder, int accountNumber) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;

    }

    public String toString() {
        return "AccountHolder{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", accountBalance= £" + Balance +
                '}';
    }

    public void checkBalance(){
        System.out.println("Your available balance is: " + Balance);
    }

    public void deposit(double amount){
        if(amount <0 ){
            System.out.println("Depositing amount can not be zero or negative");
            return;
        }
        Balance += amount;
    }

    public void withdraw(double amount){
        if(amount> Balance){
            System.out.println("Insufficiant balance");
            return;
        }
        if(amount <= 0){
            System.out.println("Withdrawing amount can not be zero.");
            return;
        }
        Balance-= amount;
    }
}
