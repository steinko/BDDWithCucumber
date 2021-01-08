package gradle.cucumber;

public class Teller {
	
	private CashSlot cashSlot;
	
	public Teller(CashSlot cashSlot) {
		this.cashSlot = cashSlot;
	}

	public void withdrawFrom(Account account, Integer amount) {
		cashSlot.dispens(amount);
		account.withdraw(amount);
		
	}

}
