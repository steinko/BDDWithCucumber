package gradle.cucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.ParameterType;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ChashWithdrawal {
	class KnowsAccont {
		private Account account;
		private CashSlot cashSlot;
		public Account getAccount() {
			if (account == null) {
				account = new Account();
			}
		  return account;
		}
		public CashSlot getCashSlot() {
			if (cashSlot == null) {
				cashSlot = new CashSlot();
			}
		  return cashSlot;
		}
	}
	
	private KnowsAccont helper = new KnowsAccont();
	
	@ParameterType("([0-9]{4})")
    public Money money(String nok) {
    	return new Money(Integer.parseInt(nok));
    }	
	

@Given("I have deposit {money} NOK in my account")
public void i_hve_deposit_nok_in_my_account(Money amount) {
	
    helper.getAccount().deposit(amount);
    assertEquals( helper.getAccount().balance(),amount );
}

@When("I withdraw {int} NOK")
public void i_withdraw_nok(Integer amount) {
	    Teller teller = new Teller();
	    teller.withdrawFrom(helper.getAccount(), amount);
}


@Then("{int} NOK shoul be dispensed")
public void nok_shoul_be_dispensed(Integer nok) {
    assertEquals(nok, ( helper.getCashSlot()).contents());
}

}
