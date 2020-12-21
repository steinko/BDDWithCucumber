package gradle.cucumber;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TellerTest {
	
	@Test
	public void shouldExsist() {
		assertNotNull(new Teller(new CashSlot()));
	}

	@Test
	public void testWithdrawFrom100() {
		Account account = new Account(); 
		account.deposit(300);
		CashSlot cashSlot = new CashSlot();
		cashSlot.dispens(100);
		Teller teller = new Teller(cashSlot);
		teller.withdrawFrom(account,100);
		assertEquals(cashSlot.contents(),100);
		assertEquals(account.balance(),200);
	}
	
	@Test
	public void testWithdrawFrom200() {
		Account account = new Account();
		account.deposit(400);
		CashSlot cashSlot = new CashSlot();
		cashSlot.dispens(200);
		Teller teller = new Teller(cashSlot);
		teller.withdrawFrom(account,200);
		assertEquals(cashSlot.contents(),200);
		assertEquals(account.balance(),200);
	}

}
