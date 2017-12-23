import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Dominio.Cancion;
import Persistencia.GestorCancion;


public class TestReproducirCancion {

	private GestorCancion gescan;
	private Cancion can;
	
	@Before
	public void setUp() throws Exception {
		gescan=new GestorCancion();
		can=new Cancion("nombre","artista");
	}
	@Test
	public void testReproCanExisteBBDD() {
		can.setNombre("Smell like teen Spirit");
		/* ¿
		assertEquals(can.getNombre(),gescan.reproducirCancion(can));
		*/
		assertTrue(gescan.reproducirCancion(can));
		assertNotNull(gescan.reproducirCancion(can));
	}
	@Test
	public void testReproCanNoExisteBBDD() {
		can.setNombre("Smell like teen Spirit");
		assertFalse(gescan.reproducirCancion(can));
		assertNotNull(gescan.reproducirCancion(can));
	}
	@Test
	public void testCampoVacio() {
		can.setNombre(null);
		assertFalse(gescan.reproducirCancion(can));
	}	
	@After
	public void tearDown() throws Exception {
		
	}

}
