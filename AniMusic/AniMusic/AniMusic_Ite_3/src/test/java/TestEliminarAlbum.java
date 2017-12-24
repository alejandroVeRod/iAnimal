import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Dominio.Album;
import Persistencia.GestorAlbum;


public class TestEliminarAlbum {
	private GestorAlbum gesalb;
	private Album alb;
	@Before
	public void setUp() throws Exception {
		 gesalb=new GestorAlbum();
		 alb=new Album("nombre","artista");
	}

	@Test
	 public void testComprarCanExisteBBDD() {
		alb.setNombre("Smell like teen Spirit");

		assertTrue(gesalb.eliminarAlbum(alb));
		assertNotNull(gesalb.eliminarAlbum(alb));
	 }
	@Test
	 public void testComprarCanNoExisteBBDD() {
		alb.setNombre("Smell like teen Spirit");

		assertTrue(gesalb.eliminarAlbum(alb));
		assertNotNull(gesalb.eliminarAlbum(alb));
	 }
	@Test
	 public void testCampoVacio() {
		alb.setNombre(null);

		assertFalse(gesalb.eliminarAlbum(alb));
	 }
}


