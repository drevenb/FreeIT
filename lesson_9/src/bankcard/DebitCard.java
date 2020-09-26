package bankcard;

public interface DebitCard extends Card {
    void checkBalance();
    String getSerialNumber();
    void withdraw(double value);
    void addToCard(double value);
    void transferFunds(Card card, double value);
    void pay(double value);
}
