import java.util.ArrayList;

public class BankAccount {
    private String owner;
    private double balance;

    private ArrayList<Transaction> transactions = new ArrayList<>();

    public BankAccount(String owner, double balance) {
        this.balance = balance;
        this.owner = owner;
    }

    public void deposit(double amount) {
        this.balance += amount;
        transactions.add(new Transaction("deposit", amount));
    }

    public void withdraw(double amount) {
        this.balance -= amount;
        transactions.add(new Transaction("withdraw", amount));
    }

    public void printTransactionHistory() {
        System.out.println("=== TRANSACTION HISTORY ===");
        for (Transaction transaction : transactions) {
            System.out.println(transaction);
        }
    }

    public double getBalance() {
        return this.balance;
    }

    public Transaction getLargestTransaction() {
        Transaction largestTransaction = transactions.getFirst();

        for(Transaction transaction : transactions) {
            if (transaction.getAmount() > largestTransaction.getAmount()) {
                largestTransaction = transaction;
            }
        }
        return largestTransaction;
    }
}
