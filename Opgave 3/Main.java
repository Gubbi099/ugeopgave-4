public class Main {

    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount("Rasmus", 50000);

        bankAccount1.deposit(5000000);
        bankAccount1.withdraw(1000000);

        bankAccount1.printTransactionHistory();
        System.out.println(bankAccount1.getBalance() );

        System.out.println(bankAccount1.getLargestTransaction());
    }
}
