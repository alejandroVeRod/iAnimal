import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Dominio.Cancion;
import Persistencia.GestorCancion;

public class TestBuscarCancion {
	
	private GestorCancion gescan;
	private Cancion can;

	@Before
	public void setUp() throws Exception {
		gescan=new GestorCancion();
		can=new Cancion("nombre","artista");
	}

	@Test
	public void testBuscarCanExisteBBDD() {
		can.setNombre("Rio abajo");
		can.setArtista("Paul McCartney");
		/* ¿
		assertEquals(can.getNombre(),gescan.buscarCancion(can));
		*/
		assertTrue(gescan.buscarCancion(can));
		assertNotNull(gescan.buscarCancion(can));
	}
	
	@Test
	public void testBuscarCanNoExisteBBDD() {
		can.setNombre("Honra nos daras");
		can.setArtista("Kiko Rivera");
		assertFalse(gescan.buscarCancion(can));
		assertNotNull(gescan.buscarCancion(can));
	}
	/*	Comprobar esto que no se como hacer la comprobación de que sean Strings
	@Test
	public void testComprobarString() {
		can.setNombre("Another Day");
		can.setArtista("ejemplo");
		assertTrue(can.getNombre()==);
	}
	
	@Test
	public void testComprobarNoString() {
		can.setNombre("3234");
		can.setArtista("123");
		assertTrue(can.getNombre()==);
	}*/
	
	@Test
	public void testCampoVacio() {
		can.setNombre(null);
		can.setArtista(null);
		assertFalse(gescan.buscarCancion(can));
	}	
	
	@After
	public void tearDown() throws Exception {
	}
}
