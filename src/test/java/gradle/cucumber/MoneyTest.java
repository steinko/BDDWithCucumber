package gradle.cucumber;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoneyTest {
	
	@Test
	public void shouldExist() {
		assertNotNull(new Money(200));
	}

}
