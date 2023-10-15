// Base BankAccount class
class BankAccount {
    protected String accountNumber;
    protected double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }

    public double calculateInterest() {
        // Default interest calculation logic (can be overridden by subclasses)
        return 0;
    }
}

// SavingsAccount subclass
class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate / 100; // Convert percentage to decimal
    }

    @Override
    public double calculateInterest() {
        // Specific interest calculation logic for savings account
        return balance * interestRate;
    }
}

// CheckingAccount subclass
class CheckingAccount extends BankAccount {
    private double transactionFee;

    public CheckingAccount(String accountNumber, double balance, double transactionFee) {
        super(accountNumber, balance);
        this.transactionFee = transactionFee;
    }

    public void deductTransactionFee() {
        balance -= transactionFee;
    }

    @Override
    public double calculateInterest() {
        // Specific interest calculation logic for checking account
        return 0; // Checking accounts usually don't earn interest
    }
}

// Main class for testing
public class M_bank {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount("SA12345", 1000, 2);
        CheckingAccount checkingAccount = new CheckingAccount("CA67890", 1500, 1);

        System.out.println("Savings Account Balance: " + savingsAccount.balance);
        savingsAccount.deposit(500);
        System.out.println("Savings Account Balance after deposit: " + savingsAccount.balance);
        double savingsInterest = savingsAccount.calculateInterest();
        System.out.println("Interest earned on savings account: " + savingsInterest);

        System.out.println("\nChecking Account Balance: " + checkingAccount.balance);
        checkingAccount.withdraw(200);
        checkingAccount.deductTransactionFee();
        System.out.println("Checking Account Balance after withdrawal and transaction fee deduction: " + checkingAccount.balance);
        double checkingInterest = checkingAccount.calculateInterest();
        System.out.println("Interest earned on checking account: " + checkingInterest);
    }
}
