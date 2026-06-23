class Account {
    String accountNumber;
    String holderName;
    double balance;

    void showDetails() {
        System.out.println("Account " + accountNumber +
                " | Holder: " + holderName +
                " | Balance: " + balance);
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + ". New balance: " + balance);
    }
}

class SavingsAccount extends Account {
    double interestRate;

    void applyInterest() {
        balance += (balance * interestRate / 100);
        System.out.println("Interest applied. New balance: " + balance);
    }
}

class LoanAccount extends Account {
    double loanAmount;

    void repayLoan(double amount) {
        loanAmount -= amount;
        System.out.println("Loan repaid: " + amount + ". Remaining: " + loanAmount);
    }
}

class FixedDepositAccount extends Account {
    String maturityDate;

    void showMaturity() {
        System.out.println("Fixed deposit matures on: " + maturityDate);
    }
}

public class Main5 {
    public static void main(String[] args) {

        SavingsAccount sa = new SavingsAccount();
        sa.accountNumber = "S-100";
        sa.holderName = "Alice";
        sa.balance = 1000;
        sa.interestRate = 5;
        sa.showDetails();
        sa.applyInterest();

        LoanAccount la = new LoanAccount();
        la.accountNumber = "L-200";
        la.holderName = "Bob";
        la.balance = 5000;
        la.loanAmount = 2000;
        la.showDetails();
        la.repayLoan(500);

        FixedDepositAccount fd = new FixedDepositAccount();
        fd.accountNumber = "F-300";
        fd.holderName = "Charlie";
        fd.balance = 8000;
        fd.maturityDate = "2027-01-01";
        fd.showDetails();
        fd.showMaturity();
    }
}