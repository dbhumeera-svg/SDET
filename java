class Account {

    protected double balance;
    protected double interestRate;

    public Account(double balance, double interestRate) {
        this.balance = balance;
        this.interestRate = interestRate;
    }

    public void calculateInterest() {
        double interest = balance * interestRate / 100;
        balance += interest;
        System.out.println("Interest added: " + interest);
    }

    public void displayBalance() {
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {

        SavingsAccount savings = new SavingsAccount(10000, 5);
        savings.calculateInterest();
        savings.displayBalance();

        CurrentAccount current = new CurrentAccount(15000, 2);
        current.calculateInterest();
        current.displayBalance();
    }
}

class SavingsAccount extends Account {

    public SavingsAccount(double balance, double interestRate) {
        super(balance, interestRate);
    }

    @Override
    public void calculateInterest() {
        double interest = balance * interestRate / 100;
        balance += interest;
        System.out.println("Savings Account Interest added: " + interest);
    }
}

class CurrentAccount extends Account {

    public CurrentAccount(double balance, double interestRate) {
        super(balance, interestRate);
    }

    @Override
    public void calculateInterest() {
        double interest = balance * interestRate / 100;
        balance += interest;
        System.out.println("Current Account Interest added: " + interest);
    }
}
