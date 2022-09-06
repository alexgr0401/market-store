package cards;

import cardholders.CardHolder;

public class SilverCard extends Card {
    public SilverCard(CardHolder cardHolder) {
        super(CardType.SILVER, cardHolder, 2);
    }

    @Override
    public double currentRate() {

        if (getTurnover() <= 300) {
            return getInitialRate();
        } else {
            return 3.5;

        }
    }
}
