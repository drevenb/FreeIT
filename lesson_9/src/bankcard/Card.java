package bankcard;

public interface Card {
    void checkBalance();
    String getSerialNumber();
    void withdraw(double value);
    void addToCard(double value);
    void transferFunds(Card card, double value);
}
