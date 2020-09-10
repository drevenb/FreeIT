package bankcard;

        /* This is the task number 27
            from the study book.*/

public class Runner {
    public static void main(String[] args) {

        Card mtbCard = new MTBank("4589 0135 6589 0463", 37000);
        Card bibCard = new BelInvestBank("8435 0461 9802 1374", 1500);
        CreditCard belCard = new BelarusBank("8495 7403 3165 4890", 200);

        bibCard.transferFunds(mtbCard, 300);

        mtbCard.checkBalance();
        bibCard.checkBalance();

        belCard.addToCard(240.50);
        belCard.checkBalance();
        belCard.getLoan(3000);
        belCard.checkBalance();
        belCard.payLoan();
        belCard.checkBalance();
    }
}
