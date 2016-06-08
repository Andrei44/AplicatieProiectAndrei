package teste;

import static org.junit.Assert.*;

import org.junit.Test;

import clase.Persoana;

public class TestPersoana {

	@Test
	public void test()
	{
		Persoana p1 = new Persoana("Andrei");
		Persoana p2 = p1;
		assertSame(p1,p2);
		
		Persoana p3 = new Persoana("Andrei");
		assertNotSame(p1,p3);
		
		
		Persoana p = new Persoana("Andra");
		String buffer = p.getNumePersoana();
		assertEquals(buffer, "Andra");
		
		Persoana a = null;
		assertNull("Test referinta null", a);
		
		Persoana b =new Persoana("Steve Jobs");
		assertNotNull("Test referinta NotNull", b);
		
	}

}
