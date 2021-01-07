package org.steinko.bddwithcucumber;


import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;
import static org.springframework.http.HttpStatus.OK;
import static io.restassured.module.mockmvc.RestAssuredMockMvc.given;

public class AutomaticTellerControllerTest {
	
	
	@Test
	public void shouldExist() {
		assertNotNull(new AutomaticTellerController());
	}
	
	@Test
	public void shouldWithdraw() {
		
	   AutomaticTellerController controller = new AutomaticTellerController();
   	  
   	   
   	   given()
   	      .standaloneSetup(controller)
       .when()
          .put("/withdraw/1000")
       .then()
         .statusCode(OK.value()); 
	}
	
	@Test
	public void shouldDeposit() {
		
	   AutomaticTellerController controller = new AutomaticTellerController();
   	  
   	   
   	   given()
   	      .standaloneSetup(controller)
       .when()
          .put("/deposit/1000")
       .then()
         .statusCode(OK.value()); 
	}
}
