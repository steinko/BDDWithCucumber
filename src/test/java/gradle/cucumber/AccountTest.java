package gradle.cucumber;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {
	
	@Test
	public void shouldExist() {
		assertNotNull(new Account());
	}
	
	@Test
	public void shouldContainDepositAmount200() {
		Account account = new Account();
		Integer nok = 200;
		Money amount = new Money(nok);
		account.deposit(amount);
		assertEquals(account.balance(),amount );
	}
	
	@Test
	public void shouldContainDepositAmount1000() {
		Account account = new Account();
		Integer nok = 1000;
		Money amount = new Money(nok);
		account.deposit(amount);
		assertEquals(account.balance(),amount );
	}

}
