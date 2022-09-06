package cards;

import cardholders.CardHolder;

public abstract class Card {

    private CardType cardType;
    private CardHolder cardHolder;
    private double initialRate;
    private double turnover;

    public Card(CardType cardType, CardHolder cardHolder, double initialRate) {
        this.cardType = cardType;
        this.cardHolder = cardHolder;
        this.initialRate = initialRate;
    }

    public abstract double currentRate();

    public double getTurnover() {
        return turnover;
    }

    public void setTurnover(double turnover) {
        this.turnover = turnover;
    }

    public CardType getCardType() {
        return cardType;
    }

    public CardHolder getCardholder() {
        return cardHolder;
    }

    public double getInitialRate() {
        return initialRate;
    }
}
