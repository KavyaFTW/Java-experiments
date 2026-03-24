class SavingsAccount extends Account {
    private static final double MIN_BALANCE = 500;

    public SavingsAccount(int accNo, double balance) {
        super(accNo, balance);
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance - amount >= MIN_BALANCE) {
            balance -= amount;
        } else {
            System.out.println("Minimum balance required");
        }
    }

    public String getAccountType() {
        return "Savings";
    }
}