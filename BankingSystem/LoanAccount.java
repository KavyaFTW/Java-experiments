class LoanAccount extends Account {
    public LoanAccount(int accNo, double loanAmount) {
        super(accNo, loanAmount);
    }

    public void deposit(double amount) {
        balance -= amount;
    }

    public void withdraw(double amount) {
        balance += amount;
    }

    public String getAccountType() {
        return "Loan";
    }
}