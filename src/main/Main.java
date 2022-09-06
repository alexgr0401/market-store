package main;

import cardholders.CardHolder;
import cards.BronzeCard;
import cards.Card;
import cards.GoldCard;
import cards.SilverCard;
import paydesk.PayDesk;

public class Main {

	public static void main(String[] args) {

		try {
			CardHolder cardHolder = new CardHolder("Larry", "Ellison");
			Card card = new BronzeCard(cardHolder);
			printInfo(150, card);

			cardHolder = new CardHolder("Bill", "Gates");
			card = new SilverCard(cardHolder);
			card.setTurnover(600);
			printInfo(850, card);

			cardHolder = new CardHolder("Elon", "Musk");
			card = new GoldCard(cardHolder);
			card.setTurnover(1500);
			printInfo(1300, card);
		} catch (Exception e) {
			System.out.println("Exception occurred!");
		}
	}

	private static void printInfo(int valueOfPurchase, Card card) {

		System.out.println(card.getCardType() + ":");
		System.out.println("Purchase value: $" + valueOfPurchase);
		System.out.println("Discount rate: " + PayDesk.discountRate(card) + "%");
		System.out.println("Discount: $" + PayDesk.discount(valueOfPurchase, card));
		System.out.println("Total: $" + PayDesk.total(valueOfPurchase, card));
		System.out.println();

	}
}
