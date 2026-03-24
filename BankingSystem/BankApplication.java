import java.util.*;
public class BankApplication {
    public static void main(String[] args) {

        ArrayList<Customer> customers = new ArrayList<>();

        Customer c1 = new Customer(1, "Rahul");
        SavingsAccount sa1 = new SavingsAccount(101, 5000);
        LoanAccount la1 = new LoanAccount(201, 20000);

        sa1.deposit(1000);
        sa1.withdraw(2000);
        la1.deposit(5000);

        c1.addAccount(sa1);
        c1.addAccount(la1);

        Customer c2 = new Customer(2, "Sneha");
        SavingsAccount sa2 = new SavingsAccount(102, 8000);

        sa2.withdraw(1000);
        sa2.deposit(2000);

        c2.addAccount(sa2);

        customers.add(c1);
        customers.add(c2);

        for (Customer c : customers) {
            c.displayAccounts();
        }
    }
}