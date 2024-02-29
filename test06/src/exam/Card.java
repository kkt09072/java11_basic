package exam;

public class Card {
	private int cardNumber;
	private static int serialNumber = 1000;
	Card() {
		serialNumber++;
		cardNumber = serialNumber;
	}
	public int getCardNumber() {
		return cardNumber;
	}
	public static void setSerialNumber(int serialNumber) {
		Card.serialNumber = serialNumber;
	}
}
