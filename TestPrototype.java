package teste;



import static org.junit.Assert.*;

import org.junit.Test;

import clase.Persoana;
import clase.Spectator;

public class TestPrototype {

	@Test
	public void test()
	{
		Persoana persoana = new Persoana("Ella Fitzgerald","2200405380903");
		Persoana persoana2= persoana;
		assertSame(persoana2,persoana);
		
		Persoana persoana3 = new Persoana("Ella Fitzgerald","2200405380903");
		assertNotSame(persoana3,persoana);
		
		assertEquals(persoana,persoana.cloneaza());
		
		Spectator spectator = new Spectator("Samuel Eto","1890705783698");
		Spectator spectator2 = spectator;
		assertSame(spectator, spectator2);
		
		Spectator spectator3=new Spectator("Samuel Eto","1890705783698");
		assertNotSame(spectator, spectator3);
		
		assertEquals(spectator,spectator.cloneaza());
	}

}
