package bankcard;

public interface CreditCard extends Card {
    void checkBalance();
    String getSerialNumber();
    void withdraw(double value);
    void addToCard(double value);
    void transferFunds(Card card, double value);
    void getLoan(double value);
    void payLoan();
}
