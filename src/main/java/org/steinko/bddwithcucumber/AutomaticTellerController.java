package org.steinko.bddwithcucumber;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import gradle.cucumber.Account;
import gradle.cucumber.CashSlot;
import gradle.cucumber.KnowsAccount;
import gradle.cucumber.Teller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class AutomaticTellerController {
	
	private Account account;
	private CashSlot cashSlot;
	private Teller teller;
	
	  @PutMapping("/withdraw/{amount}")
	  public void withdraw( @PathVariable String amount) {
		  
		   Integer iAmount = Integer.valueOf(amount);
		   cashSlot = new CashSlot();
		   teller = new Teller(cashSlot);
	       cashSlot.dispens(iAmount);
		   teller.withdrawFrom(account, iAmount);
	       
	    }
	  
	  
	  @PutMapping("/deposit/{amount}")
	  public void deposit( @PathVariable String amount) {
		  
		  Integer iAmount = Integer.valueOf(amount);
		  account = new Account();
		  account.deposit(iAmount);

	    }
	  
	  
	  @GetMapping("/dispence")
	  public @ResponseBody Integer dispenece() {
		  
		  return cashSlot.contents(); 
		  
	    }
	  
	  @GetMapping("/balance")
	  public @ResponseBody Integer balance() {
		  
		  return account.balance();  
		  
	    }
	  
}
