package bankcard;

public class MTBank implements DebitCard, CreditCard {
    private final int COMISSION = 1;
    private double interestRate = 12;
    private String serialNumber;
    private double balance;
    private double loan;

    public MTBank(String serialNumber, double balance) {
        this.serialNumber = serialNumber;
        this.balance = balance;
    }

    @Override
    public void transferFunds(Card card, double value) {
        System.out.println("You transfer " + value + " USD\n" +
                        "from: " + this.getSerialNumber() + "\n" +
                        "to: " + card.getSerialNumber());
        this.withdraw(value);
        card.addToCard(value);
    }

    @Override
    public void getLoan(double value) {
        loan = value;
        balance += value;
    }

    @Override
    public void payLoan() {
        double payment = (loan + loan * (interestRate / 100)) / 12;
        System.out.printf("Your payment in this month for card %s: %.2f\n", getSerialNumber(), payment);
        withdraw(payment);
    }

    @Override
    public void pay(double value) {
        balance -= value;
    }

    @Override
    public void checkBalance() {
        System.out.println("Your Card: " + getSerialNumber());
        System.out.printf("Balance: %.2f\n", balance);
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    @Override
    public void withdraw(double value) {
        balance -= value;
        System.out.printf("%.2f USD were withdrawn from %s card\n", value, getSerialNumber());
    }

    @Override
    public void addToCard(double value) {
        balance += value;
        System.out.printf("%.2f USD were added to %s card\n", value, getSerialNumber());
    }
}
