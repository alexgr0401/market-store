package cards;

import cardholders.CardHolder;;

public class GoldCard extends Card {
	public GoldCard(CardHolder cardHolder) {
		super(CardType.GOLD, cardHolder, 2);
	}

	@Override
	public double currentRate() {

		if (getTurnover() < 100) {
			return getInitialRate();
		}

		double rateOfGrowth = 1;
		double amountOfGrowth = 100;
		int maxRate = 10;

		double additionalRate = rateOfGrowth * (int) (getTurnover() / amountOfGrowth);
		double currentRate = getInitialRate() + additionalRate;

		if (currentRate > maxRate) {
			return maxRate;
		} else {
			return currentRate;

		}
	}
}
