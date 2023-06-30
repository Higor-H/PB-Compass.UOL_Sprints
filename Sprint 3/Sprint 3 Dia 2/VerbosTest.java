package cursou;

//import static io.restassured.RestAssured.*;
//import static org.hamcrest.Matchers.*;
//import static org.junit.Assert.assertThat;
//
//import java.util.HashMap;
//import java.util.Map;
//
//import org.junit.Test;
//
//import io.restassured.http.ContentType;
//import junit.framework.Assert;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;
import java.util.List;

import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

import io.restassured.http.ContentType;
//import junit.framework.Assert;

public class VerbosTest {

	@Test
	public void deveSalvarUsuario() {
		given()
			.contentType("application/json")
			.log().all()
			.body("{\"name\": \"Jose\", \"age\": 68}")
		.when()
			.post("https://restapi.wcaquino.me/users")
		.then()
			.log().all()
			.statusCode(201)
			.body("id", is(notNullValue()))
			.body("name", is("Jose"))
			.body("age", is(68))
		;
	}
	
	@Test
	public void deveSalvarUsuarioUsandoMap() {
		
		Map<String, Object> params = new HashMap<String, Object>();
		
		params.put("name", "Usuario via map");
		params.put("age", 25);
		
		given()
			.contentType("application/json")
			.log().all()
			.body(params)
		.when()
			.post("https://restapi.wcaquino.me/users")
		.then()
			.log().all()
			.statusCode(201)
			.body("id", is(notNullValue()))
			.body("name", is("Usuario via map"))
			.body("age", is(25))
		;
	}
	
	
	@Test
	public void deveSalvarUsuarioUsandoObjeto() {
		
		User user = new User("Usuario via Objeto", 35);
		
		given()
			.contentType("application/json")
			.log().all()
			.body(user)
		.when()
			.post("https://restapi.wcaquino.me/users")
		.then()
			.log().all()
			.statusCode(201)
			.body("id", is(notNullValue()))
			.body("name", is("Usuario via Objeto"))
			.body("age", is(35))
		;
	}
	
	
	
	@Test
	public void deveDeserializarObjetoAoSalvarUsuario() {
		
		User user = new User("Usuario deserializado", 35);
		
		User usuarioInserido = given()
			.contentType("application/json")
			.log().all()
			.body(user)
		.when()
			.post("https://restapi.wcaquino.me/users")
		.then()
			.log().all()
			.statusCode(201)
			.extract().body().as(User.class)
		;
		
		System.out.println(usuarioInserido);
		
		Assert.assertThat(usuarioInserido.getId(), notNullValue());
		
		Assert.assertEquals("Usuario deserializado", usuarioInserido.getName());
		Assert.assertThat(usuarioInserido.getAge(), is(35));
	}
	
	
	@Test
	public void naoDeveSalvarUsuarioSemNome() {
		given()
		.contentType("application/json") // ou .contentType(ContentType.JSON)
		.log().all()
		.body("{\"age\": 68}")
	.when()
		.post("https://restapi.wcaquino.me/users")
	.then()
		.log().all()
		.statusCode(400)
		.body("id", is(nullValue()))
		//.body("name", is(nullValue()))
		.body("error", is("Name é um atributo obrigatório"))
	;
	}
	
	@Test
	public void deveSalvarUsuarioXML() {
		given()
			.contentType(ContentType.XML)// ou .contentType("application/xml")
			.log().all()
			.body("<user><name>Jose</name><age>30</age></user>")
		.when()
			.post("https://restapi.wcaquino.me/usersXML")
		.then()
			.log().all()
			.statusCode(201)
			.body(".@id", is(notNullValue()))
			.body("user.name", is("Jose"))
			.body("user.age", is("30"))
		;
	}
	
	@Test
	public void deveAlterarUsuario() {
		given()
			.contentType("application/json")
			.log().all()
			.body("{\"name\": \"Usuario Alterado\", \"age\": 80}")
		.when()
			.put("https://restapi.wcaquino.me/users/1")
		.then()
			.log().all()
			.statusCode(200)
			.body("id", is(notNullValue()))
			.body("id", is(1))
			.body("name", is("Usuario Alterado"))
			.body("age", is(80))
			.body("salary", is(1234.5678f))
		;
	}
	
	@Test
	public void devCustumizarURL() {
		given()
			.contentType("application/json")
			.log().all()
			.body("{\"name\": \"Usuario Alterado\", \"age\": 80}")
		.when()
			.put("https://restapi.wcaquino.me/{entidade}/{userId}", "users", "1")
		.then()
			.log().all()
			.statusCode(200)
			.body("id", is(notNullValue()))
			.body("id", is(1))
			.body("name", is("Usuario Alterado"))
			.body("age", is(80))
			.body("salary", is(1234.5678f))
		;
	}
	
	@Test
	public void devoCustumizarURLParte2() {
		given()
		.log().all()
		.contentType("application/json")
		.body("{ \"name\": \"Usuario Alterado\", \"age\": 80} ")
		.pathParam("entidade", "users")
		.pathParam("userId", 1)
	.when()
		.put("https://restapi.wcaquino.me/{entidade}/{userId}")
	.then()
		.log().all()
		.statusCode(200)
		.body("id", is(1))
		.body("name", is("Usuario Alterado"))
		.body("age", is(80))
		.body("salary", is(1234.5678f));
	}
	
	@Test
	public void deveRemoverUsuario() {
		given()
			.log().all()
		.when()
			.delete("https://restapi.wcaquino.me/users/1")
		.then()
			.log().all()
			.statusCode(204)
			
		;
	}
	
	@Test
	public void naoDeveRemoverUsuarioInexistente() {
		given()
			.log().all()
		.when()
			.delete("https://restapi.wcaquino.me/users/1000")
		.then()
			.log().all()
			.statusCode(400)
			
		;
	}
	
	
}


	
