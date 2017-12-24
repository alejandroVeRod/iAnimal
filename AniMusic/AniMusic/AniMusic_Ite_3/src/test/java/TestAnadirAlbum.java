import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import Dominio.Album;
import Persistencia.GestorAlbum;

public class TestAnadirAlbum {
	private GestorAlbum gAlb;
	private Album alb;
	
	@Before
	public void setUp() throws Exception {
		gAlb = new GestorAlbum();
		alb=new Album("nombre", "artista", "fecha");
	}
	@Test
	public void testExisteAlbBBDD() {
		alb.setNombre("Appetite for Destruction");
		alb.setArtista("Guns N' Roses");
		alb.setFecha("21/07/1987");
		assertFalse(gAlb.anadirAlbum(alb));
	}
	@Test
	public void testNoExisteAlbBBDD() {
		alb.setNombre("Alguna basura mas");
		alb.setArtista("Kiko Rivera");
		alb.setFecha("10/09/2016");
		assertTrue(gAlb.anadirAlbum(alb));
	}
}
