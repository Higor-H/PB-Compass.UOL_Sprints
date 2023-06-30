package cursou;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

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

public class OlaMundoTeste {
	@Test
	public void testOlaMundo(){
		Response response = request(Method.GET, "https://restapi.wcaquino.me/ola");
		Assert.assertTrue(response.getBody().asString().equals("Ola Mundo!"));
		Assert.assertTrue(response.statusCode()== 200);
		Assert.assertTrue("O status code deveria ser 200", response.statusCode()== 200);
		Assert.assertEquals(200, response.statusCode());
		
		ValidatableResponse validacao =  response.then();
		validacao.statusCode(200);
	}
	@Test
	public void devoConhecerOutrasFormasRestAssured() {
		Response response = request(Method.GET, "https://restapi.wcaquino.me/ola");
		
		ValidatableResponse validacao =  response.then();
		validacao.statusCode(200);
		
		get("https://restapi.wcaquino.me/ola").then().statusCode(200);
		
		
		given()
		//Pré condiçoes
		.when()
		//açoes
			.get("https://restapi.wcaquino.me/ola")
		.then()
		// pode usar .assertThat() por estetica
		//verificaçoes
			.statusCode(200);
	}
	@Test
	public void devoConhecerMatchersHamcrest() {
		Assert.assertThat("Maria", Matchers.is("Maria")); // compara se um é igual ao outro
		Assert.assertThat(128, Matchers.is(128));
		Assert.assertThat(128, Matchers.isA(Integer.class)); // ve  se 128 é um numero do tipo inteiro
		Assert.assertThat(128d, Matchers.isA(Double.class)); // ve  se 128.0 é um numero do tipo double
		Assert.assertThat(128d, Matchers.greaterThan(120d)); // ve se 128.0 é maior que 120.0
		Assert.assertThat(128d, Matchers.lessThan(130d)); // ve se 128.0 é menor que 130.0
		
		List<Integer> impares = Arrays.asList(1,3,5,7,9); //declara a lista
		assertThat(impares, hasSize(5)); // ve se o tamanho da lista é de 5 elementos
		assertThat(impares, contains(1,3,5,7,9)); // ve se a lista contem esses elementos (tem que estar na ardem declarada
		assertThat(impares, containsInAnyOrder(1,3,5,9,7)); // ve se a lista contem esses elementos (sem importar a ordem)
		assertThat(impares, hasItem(1)); // ve se a lista tem esse elementos nela
		assertThat(impares, hasItems(1, 7)); // ve se a lista tem esses elementos nela ( ou 1)
		
		assertThat("Maria", is(not("João"))); // testa se maria não é igual a joão
		assertThat("Maria", not("João"));
		assertThat("Maria", anyOf(is("Maria"), is("Joaquina"))); // testa que maria pode ser maria ou joaquina
		assertThat("Joaquina", allOf(startsWith("Joa"), endsWith("ina"), containsString("qui"))); // ve se Joaquina começa com joa, se termina co ina e se tem qui na palavra
	}
	@Test
	public void devoValidarBody() {
		given()
		//Pré condiçoes
		.when()
		//açoes
			.get("https://restapi.wcaquino.me/ola")
		.then()
		// pode usar .assertThat() por estetica
		//verificaçoes
			.statusCode(200)
			.body(is("Ola Mundo!"))
			.body(containsString("Mundo"))
			.body(is(not(nullValue())));
		
	}
}
