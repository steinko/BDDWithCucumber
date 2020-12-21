package gradle.cucumber;

public class Account{

	private Integer balance = 0;
	
	public Account() {}

	public void deposit(Integer amount) {
		balance = amount;
		
	}

	public Integer balance() {
		return balance;
	}

	public void withdraw(Integer amount) {
		balance = balance - amount;
		
	}

}
