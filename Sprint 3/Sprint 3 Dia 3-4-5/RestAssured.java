package com.aula.pb.com.aula.pb.inicio;

import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.*;
public class RestAssured {
	String url = "http://localhost:3000/usuarios/";
	
	@Test
	public void restAssuredPontape() {
		when().
			get(url).
		
		then().
			log().all().
			statusCode(200);
		
	}
	
	@Test
	public void testeLotto() {
		when().
		get("http://localhost:3000/lotto/{id}",5).
	
	then().
		log().all().
		statusCode(200);
	}

}
