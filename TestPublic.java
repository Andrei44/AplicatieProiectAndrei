package teste;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import clase.Persoana;
import clase.Public;

public class TestPublic {

	@Test
	public void test()
	{
		
		Public persoane = new Public(3,250);
		Public persoane2 = new Public(3,250);
		assertNotSame(persoane, persoane2);
		Public persoane3 ;
		persoane3= persoane;
		assertSame(persoane, persoane3);
		
		ArrayList <Persoana> listaPersoane = new ArrayList<Persoana>();
		Persoana p1 = new Persoana("Andra");
		Persoana p2 = new Persoana("Cosmin");
		Persoana p3 = new Persoana("Steve");
		
		listaPersoane.add(p1);
		listaPersoane.add(p2);
		listaPersoane.add(p3);
		
		assertNotNull(listaPersoane);
		
		double rezultat = persoane.CalculareSumaBilete();
		assertEquals(750,rezultat,0);
		
	}

}
