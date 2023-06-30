package com.aula.pb.com.aula.pb.inicio;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Calculadora {
	
	@BeforeAll
	public static void setUp() {
		System.out.println("Estou rodando apenas uma vez antes de todos os testes");
		
	}
	@BeforeEach
	public void rodaVariasVezes() {
		System.out.println("Estou rodando uma vez antes de cada teste");
	}
	
	@AfterAll
	public static void tearDown() {
		System.out.println("Estou rodando uma vez depois de todos os testes");
	}
	
	@AfterEach
	public void rodaVariasVezesDepois () {
		System.out.println("Estou rodando varias vezes depois de todos os testes");
		
	}
	
	
	
	
	@Test
	public void deveSomar() {
		int soma = 2+2;
		assertEquals(4, soma); // testa se 4 é == 2+2
	}
	@Test
	public void deveSubtrair() {
		int sub = 5-4;
		assertEquals(1, sub);
		
	}
	
	@Test
	public void deveSomarTresNumeros() {
		int soma = 5+4+5;
		assertEquals(14, soma);
	}
}

