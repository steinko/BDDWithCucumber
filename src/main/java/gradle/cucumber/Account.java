package gradle.cucumber;

public class Account {

	private Money balance = new Money();

	public void deposit(Money amount) {
		balance = amount;
		
	}

	public Money balance() {
		return balance;
	}

}
