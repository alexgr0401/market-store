package paydesk;

import cards.Card;

public class PayDesk {
	public static double discountRate(Card card) {

		if (card == null) {
			return 0;
		} else {
			return card.currentRate();
		}
	}

	public static double discount(double valueOfPurchase, Card card) {
		return discountRate(card) / 100 * valueOfPurchase;
	}

	public static double total(double valueOfPurchase, Card card) {
		return valueOfPurchase - discount(valueOfPurchase, card);
	}
}
