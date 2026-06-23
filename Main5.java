class BankAccount {

    String accountNumber;
    String holderName;
    double balance;

    void showDetails() {
        System.out.println("Account: " + accountNumber +
                " | Holder: " + holderName +
                " | Balance: " + balance);
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount +
                ". New balance: " + balance);
    }

    void deposit(double amount, String currency) {

        if (currency.equalsIgnoreCase("USD")) {

            double converted = amount * 300;
            balance += converted;

            System.out.println("Deposited " + amount + " " + currency +
                    " = LKR " + converted +
                    ". New balance: " + balance);
        }
    }
}

class SavingsAccount extends BankAccount {

    double interestRate;

    @Override
    void showDetails() {
        System.out.println("Account: " + accountNumber +
                " | Holder: " + holderName +
                " | Balance: " + balance +
                " | Type: Savings | Rate: " + interestRate + "%");
    }

    void applyInterest() {
        balance += balance * interestRate / 100;

        System.out.println("Interest applied. New balance: " + balance);
    }
}

class LoanAccount extends BankAccount {

    double loanAmount;

    @Override
    void showDetails() {
        System.out.println("Account: " + accountNumber +
                " | Holder: " + holderName +
                " | Balance: " + balance +
                " | Type: Loan | Loan: " + loanAmount);
    }

    void repayLoan(double amount) {

        loanAmount -= amount;

        System.out.println("Loan repaid: " + amount +
                ". Remaining: " + loanAmount);
    }
}

public class Main5 {

    public static void main(String[] args) {

  

        SavingsAccount s = new SavingsAccount();

        s.accountNumber = "SA-001";
        s.holderName = "Alice";
        s.balance = 5000;
        s.interestRate = 3.5;

        s.showDetails();
        s.deposit(1000);
        s.deposit(50, "USD");
        s.applyInterest();

        System.out.println();

    

        BankAccount b1 = new SavingsAccount();

        b1.accountNumber = "SA-001";
        b1.holderName = "Alice";
        b1.balance = 5000;

        b1.showDetails();

        BankAccount b2 = new LoanAccount();

        b2.accountNumber = "LA-002";
        b2.holderName = "Bob";

        b2.showDetails();
    }
}