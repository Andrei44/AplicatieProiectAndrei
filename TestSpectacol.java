package teste;

import static org.junit.Assert.*;

import org.junit.Test;

import clase.Spectacol;
import clase.SpectacolFacade;

public class TestSpectacol {

	@Test
	public void test() 
	{
		Spectacol spectacol = new Spectacol();
		 spectacol.setDataSpectacol("07.03.2017");
		
		 String buffer = spectacol.getDataSpectacol();
		 assertEquals("07.03.2017",buffer);
		 
		 spectacol.setDenumireSpectacol("Concert Stefan Banica Junior ");
		 String buffer2 = spectacol.getDenumireSpectacol();
		 assertEquals("Concert Stefan Banica Junior ",buffer2);
		 
		 spectacol.setLocatie("Sala Palatului");
		 String buffer3 = spectacol.getLocatie();
		 assertEquals("Sala Palatului",buffer3);
		 
		 spectacol.setPretBilet(150);
		 double buffer4 = spectacol.getPretBilet();
		 assertEquals(150, buffer4, 0);
		 
		 Spectacol spectacolConstruct = new Spectacol("Concert Michael Jackson" , "03.04.2017","Sala Palatului", 730.8);
		 Spectacol spectacolCompare =spectacolConstruct;
		 assertSame(spectacolCompare, spectacolConstruct);
		 
		 Spectacol s3 = new Spectacol("Concert Michael Jackson" , "03.04.2017","Sala Palatului", 730.8);
		 assertNotSame(s3,spectacolConstruct);
		 
		SpectacolFacade spectacolFacade = null ;
		 assertNull(spectacolFacade);
		 
	
	}

}
