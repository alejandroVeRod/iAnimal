import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Dominio.Album;
import Persistencia.GestorAlbum;

public class TestBuscarAlbum {
	
	private GestorAlbum gesalb;
	private Album alb;

	@Before
	public void setUp() throws Exception {
		gesalb=new GestorAlbum();
		alb=new Album("nombre","artista");
	}
	@Test
	public void testBuscarAlbExisteBBDD() {
		alb.setNombre("Rio abajo");
		alb.setArtista("Paul McCartney");
		/* ¿
		assertEquals(can.getNombre(),gescan.buscarCancion(can));
		*/
		assertTrue(gesalb.buscarAlbum(alb));
		assertNotNull(gesalb.buscarAlbum(alb));
	}
	
	@Test
	public void testBuscarAlbNoExisteBBDD() {
		alb.setNombre("Honra nos daras");
		alb.setArtista("Kiko Rivera");
		assertFalse(gesalb.buscarAlbum(alb));
		assertNotNull(gesalb.buscarAlbum(alb));
	}
	
	@Test
	public void testCampoVacio() {
		alb.setNombre(null);
		alb.setArtista(null);
		assertFalse(gesalb.buscarAlbum(alb));
	}	

	@After
	public void tearDown() throws Exception {
	}

}
