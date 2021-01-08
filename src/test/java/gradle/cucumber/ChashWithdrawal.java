package gradle.cucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class ChashWithdrawal {
	
	private KnowsAccount helper = new KnowsAccount();
	
	@Given("I have deposit {int} NOK in my account")
	public void i_have_deposit_nok_in_my_account(Integer nok) {
		
		helper.getAccount().deposit(nok);
		assertEquals( helper.getAccount().balance(),nok );
	}


    @When("I withdraw {int} NOK")
    public void i_withdraw_nok(Integer amount) {
    	
    	CashSlot cashSlot = helper.getCashSlot();
    	cashSlot.dispens(amount);
    	Teller teller = new Teller(cashSlot);
	    teller.withdrawFrom(helper.getAccount(), amount);
    }


    @Then("{int} NOK should be dispensed")
    public void nok_should_be_dispensed(Integer nok) {
    	
	   assertEquals(nok, ( helper.getCashSlot()).contents());
    }

    @Then("balance of the account is {int} NOK")
    public void balance_of_the_account_is_nok(Integer balance) {
    	
        assertTrue(helper.getAccount().balance().equals(balance));
    }
}
