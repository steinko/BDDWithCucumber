package org.steinko.bddwithcucumber;


import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;

import gradle.cucumber.KnowsAccount;

import static org.springframework.http.HttpStatus.OK;
import static io.restassured.module.mockmvc.RestAssuredMockMvc.given;

import org.mockito.Mock;
import org.mockito.InjectMocks;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;


@ExtendWith(MockitoExtension.class)
public class AutomaticTellerControllerTest {
	
	
	@Mock
	KnowsAccount helper;
	
	@InjectMocks
	AutomaticTellerController controller;
	
	
	@Test
	public void shouldExist() {
		assertNotNull(new AutomaticTellerController());
	}
	@Disabled
	@Test
	public void shouldWithdraw() {
		 
   	   given()
   	      .standaloneSetup(controller)
       .when()
          .put("/withdraw/1000")
       .then()
         .statusCode(OK.value()); 
	}
	
	@Disabled
	@Test
	public void shouldDeposit() {
		
   	   given()
   	      .standaloneSetup(controller)
       .when()
          .put("/deposit/1000")
       .then()
         .statusCode(OK.value()); 
	}
	
	@Disabled
	@Test
	public void shouldDispence() {
			
		 when(helper.getCashSlot().contents()).thenReturn(100);
   	   given()
   	      .standaloneSetup(controller)
       .when()
          .get("/dispence")
       .then()
         .statusCode(OK.value()); 
	}
	
	@Disabled
	@Test
	public void shouldknowBalance() {
			
		 when(helper.getAccount().balance()).thenReturn(100);
   	   given()
   	      .standaloneSetup(controller)
       .when()
          .get("/balance")
       .then()
         .statusCode(OK.value()); 
	}
}
