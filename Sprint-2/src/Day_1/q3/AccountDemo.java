package Day_1.q3;

import java.util.Scanner;

public class AccountDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account ac = new Account();

        System.out.println("Enter your Account Number:");
        ac.accountNumber = sc.nextLine();

        System.out.println("Enter the Amount to deposit");
        double amount = sc.nextDouble();
        ac.deposit(amount);

        try {
            System.out.println("Enter the Amount to Withdraw");
            double amt = sc.nextDouble();
            ac.withdraw(amt);
        }catch(InsufficientFundsException e){
            System.out.println(e.getMessage());
        }
    }
}

class Account{
    String accountNumber;
    double balance;

    void deposit(double amount){
        this.balance = amount;
    }

    double withdraw(double amount) throws InsufficientFundsException {
        //double amt = Double.parseDouble(amount);
        if(amount<balance) {
            this.balance = balance-amount;
            System.out.println("Remaining balance in Account Number "+accountNumber+" after withdrawl is "+balance);
        }else {
            InsufficientFundsException ife = new InsufficientFundsException("Insufficient balance in the account");
            throw ife;
        }
        return balance;

    }
}


@SuppressWarnings("serial")
class InsufficientFundsException extends Exception{
    InsufficientFundsException(String error){
        super(error);
    }

}
