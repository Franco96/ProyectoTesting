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
    }
	
	
	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void SaludoTest() {
		
		
		assertEquals("Lautaro", persona.getNombre());
	}

}
