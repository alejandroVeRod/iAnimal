import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Dominio.Album;
import Persistencia.GestorAlbum;

public class TestReproducirAlbum {

	private GestorAlbum gesalb;
	private Album alb;
	
	@Before
	public void setUp() throws Exception {
		gesalb=new GestorAlbum();
		alb=new Album("nombre", "artista");
	}

	@Test
	public void testReproAlbExisteBBDD() {
		alb.setNombre("Nevermind");
		/* ¿
		assertEquals(alb.getNombre(),gesalb.reproducirAlbum(alb));
		*/
		assertTrue(gesalb.reproducirAlbum(alb));
		assertNotNull(gesalb.reproducirAlbum(alb));
	}
	@Test
	public void testReproCanNoExisteBBDD() {
		alb.setNombre("album");
		assertFalse(gesalb.reproducirAlbum(alb));
		assertNotNull(gesalb.reproducirAlbum(alb));
	}
	@Test
	public void testCampoVacio() {
		alb.setNombre(null);
		assertFalse(gesalb.reproducirAlbum(alb));
	}	
	
	@After
	public void tearDown() throws Exception {
	}
}
