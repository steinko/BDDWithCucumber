package org.steinko.bddwithcucumber;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class AutomaticTellerController {
	
	  @PutMapping("/withdraw/{amount}")
	  public void withdraw( @PathVariable String amount) {
	       
	    }
	  
	  @PutMapping("/deposit/{amount}")
	  public void deposit( @PathVariable String amount) {
	       
	    }
	  
	  
}
