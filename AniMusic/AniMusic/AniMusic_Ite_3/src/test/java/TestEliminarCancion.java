import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Dominio.Cancion;
import Persistencia.GestorCancion;

public class TestEliminarCancion {
	private GestorCancion gescan;
	private Cancion song;
	@Before
	public void setUp() throws Exception {
		 gescan=new GestorCancion();
		 song=new Cancion("nombre","artista");
	}

	@Test
	 public void testComprarCanExisteBBDD() {
		song.setNombre("Smell like teen Spirit");

		assertTrue(gescan.eliminarCancion(song));
		assertNotNull(gescan.eliminarCancion(song));
	 }
	@Test
	 public void testComprarCanNoExisteBBDD() {
		song.setNombre(".....Lo que sea");

		assertTrue(gescan.eliminarCancion(song));
		assertNotNull(gescan.eliminarCancion(song));
	 }
	@Test
	 public void testCampoVacio() {
		song.setNombre(null);

		assertFalse(gescan.eliminarCancion(song));
	 }
}
