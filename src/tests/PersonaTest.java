package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Codigo.Persona;


public class PersonaTest {
	
	Persona persona = new Persona();

	
	@Before
    public void init() {
        
       persona.setNombre("Lautaro");
       persona.setEdad(25);
    }
	

	
	@Test
	public void SaludoTest() {
		
		assertEquals("Hola soy "+persona.getNombre(), persona.saludar());
	}

	
	@Test
	public void EsMayorQueConPersonaMenorTest() {
		
		Persona personaMenor = new Persona();
		personaMenor.setNombre("juan");
		personaMenor.setEdad(20);
		
		assertEquals(true, persona.esMayorQue(personaMenor));
	}
	
	@Test
	public void EsMayorQueConPersonaMayorTest() {
		
		Persona personaMayor = new Persona();
		personaMayor.setNombre("juan");
		personaMayor.setEdad(30);
		
		assertEquals(false, persona.esMayorQue(personaMayor));
	}
	@Test
	public void cumpleañosTest() {
		
		int edadCumple = persona.getEdad() +1 ;
		
		assertEquals(edadCumple , persona.cumpleaños());
	}
	
	
}
