package org.steinko.bddwithcucumber;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static io.restassured.module.mockmvc.RestAssuredMockMvc.given;
import static org.springframework.http.HttpStatus.OK;
import org.springframework.web.context.WebApplicationContext;

import org.springframework.boot.web.server.LocalServerPort;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.junit.jupiter.api.Disabled;

@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class AutomaticTellerControlerIT {
	
	@Autowired
	AutomaticTellerController controller;
	
	@Autowired
	  private WebApplicationContext webApplicationContext;
	
	@LocalServerPort
	 private  int localServerPort;
	 
	@Test
	public void shouldExist() {
		assertNotNull(controller);
	}
	
	@Test
	public void shouldHaveWitdraw() {
		
   	   given()
   	     .webAppContextSetup(webApplicationContext)
       .when()
          .put("http://localhost:" + localServerPort + "/withdraw/1000")
       .then()
         .statusCode(OK.value()); 
   	   
	}
	
	
	@Test
	public void shouldHaveDeposited() {
		
   	   given()
   	      . webAppContextSetup(webApplicationContext)
       .when()
          .put("http://localhost:" + localServerPort + "/deposit/1000")
       .then()
         .statusCode(OK.value()); 
   	   
	}
	
	@Disabled
	@Test
	public void shouldHaveDispenced() {
		
   	   given()
   	     .webAppContextSetup(webApplicationContext)
       .when()
          .get("http://localhost:" + localServerPort + "/dispence")
       .then()
         .statusCode(OK.value()); 
	}
	
	
	@Test
	public void shouldknowBalance() {
			
   	   given()
   	      .standaloneSetup(controller)
       .when()
          .get("http://localhost:" + localServerPort + "/balance")
       .then()
         .statusCode(OK.value()); 
	}
}
