package org.steinko.bddwithcucumber;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static io.restassured.module.mockmvc.RestAssuredMockMvc.given;
import static org.springframework.http.HttpStatus.OK;
import static org.springframework.http.HttpStatus.CREATED;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.boot.web.server.LocalServerPort;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.junit.jupiter.SpringExtension;


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
	public void shouldStoreMessage() {
		
   	   
   	   given()
   	      .standaloneSetup(controller)
       .when()
          .put("http://localhost:" + localServerPort + "/withdraw/1000")
       .then()
         .statusCode(OK.value()); 
	}
}
