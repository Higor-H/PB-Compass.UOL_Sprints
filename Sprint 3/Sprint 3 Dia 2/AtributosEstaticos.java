package cursou;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.hamcrest.Matcher;
//import org.hamcrest.Matchers;
import org.junit.Test;
import org.junit.Assert;
import org.junit.BeforeClass;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class AtributosEstaticos {
	
	public static RequestSpecification reqSpec;
	public static ResponseSpecification resSpec;
	
	@BeforeClass
	public static void setup() {
		RestAssured.baseURI = "https://restapi.wcaquino.me";
		//RestAssured.port = 433;
		//RestAssured.basePath = "/v2";
		
		
		RequestSpecBuilder reqBuilder = new RequestSpecBuilder();
		reqBuilder.log(LogDetail.ALL);
		reqSpec = reqBuilder.build();
		
		ResponseSpecBuilder resBuilder = new ResponseSpecBuilder();
		resBuilder.expectStatusCode(200); // ve se o status code é 200
		resSpec = resBuilder.build();
		
		RestAssured.requestSpecification = reqSpec;
		RestAssured.responseSpecification = resSpec;
	}
	
	
	@Test
	public void deveVerificarPrimeiroNivela1() {
		
		given()
			.log().all()
		.when()
			.get("/users")
		.then()
			.statusCode(200)
			//.body("id", is(1))
			//.body("name", containsString("Silva"))
			//.body("age", greaterThan(18))
		;
	}
	@Test
	public void builderG() {
		//RequestSpecBuilder reqBuilder = new RequestSpecBuilder();
		//reqBuilder.log(LogDetail.ALL);
		//RequestSpecification requestSpecification = reqBuilder.build();
		
		//ResponseSpecBuilder resBuilder = new ResponseSpecBuilder();
		//resBuilder.expectStatusCode(200); // ve se o status code é 200
		//ResponseSpecification responseSpecification = resBuilder.build();
		
		given()
			.spec(reqSpec)
		.when()
			.get("/users")
		.then()
			.spec(resSpec)
			//.statusCode(200)
			//.body("id", is(1))
			//.body("name", containsString("Silva"))
			//.body("age", greaterThan(18))
		;
	}
	@Test
	public void variavelGlobalRQ() {
		
		given()
		.when()
			.get("/users")
		.then()
		;
	}
}

