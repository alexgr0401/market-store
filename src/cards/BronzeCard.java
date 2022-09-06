package cards;

import cardholders.CardHolder;

public class BronzeCard extends Card {
	public BronzeCard(CardHolder cardholder) {
		super(CardType.BRONZE, cardholder, 0);
	}

	@Override
	public double currentRate() {

		if (getTurnover() < 100) {
			return getInitialRate();
		} else if (getTurnover() <= 300) {
			return 1;
		} else {
			return 2.5;

		}
	}
}
