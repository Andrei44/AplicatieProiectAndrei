package teste;

import static org.junit.Assert.*;

import org.junit.Test;

import clase.SalaSpectacol;


public class TestSalaSpectacol {

	@Test
	public void test() 
	{
	
		SalaSpectacol.getInstance();
		assertNotNull(SalaSpectacol.getInstance());
		
		SalaSpectacol salaNoua = new SalaSpectacol("Sala Palatului");
		
		String buffer = salaNoua.getDenumireSala();
		assertEquals(buffer, "Sala Palatului");
		
		
		
		
	}

}
