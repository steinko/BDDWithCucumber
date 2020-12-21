package gradle.cucumber;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashSlotTest {
	

	@Test
	public void shoulExsist() {
		assertNotNull(new CashSlot());
	}
	
	@Test
	public void shoulcontain200() {
		CashSlot cashSlot = new CashSlot();
		Integer amount = 200;
		cashSlot.dispens(amount);
		assertEquals(cashSlot.contents(),amount);
	}
	
	@Test
	public void shoulcontain300() {
		CashSlot cashSlot = new CashSlot();
		Integer amount = 300;
		cashSlot.dispens(amount);
		assertEquals(cashSlot.contents(),amount);
	}


}
