class BankAccount {

  
    private String accountNumber;
    private double balance;

   
    BankAccount(String accNo, double bal) {
        accountNumber = accNo;
        setBalance(bal);
    }


    String getAccountNumber() {
        return accountNumber;
    }

    void setAccountNumber(String accNo) {
        accountNumber = accNo;
    }

    double getBalance() {
        return balance;
    }


    void setBalance(double bal) {

        if (bal >= 0) {
            balance = bal;
        } else {
            System.out.println("Invalid Balance");
        }
    }

 
    public static void main(String[] args) {

   
        BankAccount b1 = new BankAccount("ACC101", 5000);

        System.out.println("Account Number: " + b1.getAccountNumber());
        System.out.println("Balance: " + b1.getBalance());

        b1.setBalance(-1000);
    }
}