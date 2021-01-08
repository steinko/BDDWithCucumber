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
		Integer amount = 200;
		account.deposit(amount);
		assertEquals(account.balance(),amount );
	}
	
	@Test
	public void shouldContainDepositAmount1000() {
		Account account = new Account();
		Integer amount = 1000;	
		account.deposit(amount);
		assertEquals(account.balance(),amount );
	}
	
	@Test
	public void shouldContainDepositAmount500() {
		Account account = new Account();
		Integer amount = 1000;	
		account.deposit(amount);
		account.withdraw(500);
		assertEquals(account.balance(),500 );
	}
	
	@Test
	public void shouldContainBalance300() {
		Account account = new Account();
		Integer amount = 800;	
		account.deposit(amount);
		account.withdraw(500);
		assertEquals(account.balance(),300 );
	}

}
