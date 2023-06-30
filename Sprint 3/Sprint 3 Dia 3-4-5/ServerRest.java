package com.aula.pb.com.aula.pb.inicio;

import java.util.Date;

import org.junit.jupiter.api.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class SeverRest {
	
		
	@Test
	public void deveRetornarListaDeUsuarios() {
		when().
			get("http://localhost:3000/usuarios").
		then().
			assertThat().
			statusCode(200).
		and().
			body("quantidade", equalTo(76))
		;
	}
	@Test
	public void deveRetornarUsuarioExistente() {
		when().
		get("http://localhost:3000/usuarios/{id}", "0uxuPY0cbmQhpEz1").
	then().
		assertThat().
		statusCode(200).
	and().
		body("nome", equalTo("Fulano da Silva")).
	and().
		body("email", equalTo("fulano@qa.com"))
		;
	}
	@Test
	public void deveCriarNovoUsuario() {
		
		Date date = new Date();
		String email = date.getTime() + "@qa.com.br";
		
		String payload = "{\r\n"
				+ "    \"nome\": \"Teste PB via RestAssured\",\r\n"
				+ "    \"email\":\"" + email + "\",\r\n"
				+ "    \"password\": \"teste\",\r\n"
				+ "    \"administrador\": \"true\"\r\n"
				+ "}";
		given().
			body(payload).
			contentType(ContentType.JSON).
		when().
			post("http://localhost:3000/usuarios").
		then().
			log().all().
			assertThat().
			statusCode(201).
		and().
			body("message", equalTo("Cadastro realizado com sucesso"))
			;
	}
	
	@Test
	public void deveAtualizarUsuario() {
		String payload = "{\r\n"
				+ "    \"nome\": \"Teste PB alterado via RestAssured\",\r\n"
				+ "    \"email\": \"pbrestassured2s@qa.com\",\r\n"
				+ "    \"password\": \"teste\",\r\n"
				+ "    \"administrador\": \"true\"\r\n"
				+ "}";
		given().
			body(payload).
			contentType(ContentType.JSON).
		when().
			put("http://localhost:3000/usuarios/{id}","JqGsbwdH5o5xuBaD").
		then().
			log().all().
			assertThat().
			statusCode(200).
		and().
			body("message", equalTo("Registro alterado com sucesso"))
			
			;
	}
	
	
	@Test
	public void deveExcluirUsuario() {
		
		Date date = new Date();
		String email = date.getTime() + "@qa.com.br";
		
		String payload = "{\r\n"
				+ "    \"nome\": \"Teste PB via RestAssured\",\r\n"
				+ "    \"email\":\"" + email + "\",\r\n"
				+ "    \"password\": \"teste\",\r\n"
				+ "    \"administrador\": \"true\"\r\n"
				+ "}";
		String id_para_excluir =
		
		given().
			body(payload).
			contentType(ContentType.JSON).
		when().
			post("http://localhost:3000/usuarios").
		then().
			log().all().
		and().
			assertThat().
			statusCode(201).
		and().
			body("message", equalTo("Cadastro realizado com sucesso")).
		and().
			extract().
			path("_id")	
			;
		
		when().
			delete("http://localhost:3000/usuarios/{id}",id_para_excluir).
		then().
			log().all().
			assertThat().
			statusCode(200).
		and().
			body("message", equalTo("Registro excluído com sucesso"))
			;
	}
}


