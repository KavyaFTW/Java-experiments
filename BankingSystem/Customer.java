import java.util.*;
class Customer {
    private int customerId;
    private String name;
    private List<Account> accounts;

    public Customer(int id, String name) {
        this.customerId = id;
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public void addAccount(Account acc) {
        accounts.add(acc);
    }

    public void displayAccounts() {
        System.out.println("\nCustomer ID: " + customerId);
        System.out.println("Name: " + name);
        for (Account acc : accounts) {
            System.out.println("Account No: " + acc.getAccountNumber()
                    + " Type: " + acc.getAccountType()
                    + " Balance: " + acc.getBalance());
        }
    }
}