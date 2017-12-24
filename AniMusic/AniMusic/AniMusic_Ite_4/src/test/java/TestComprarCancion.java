import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Dominio.Cancion;
import Dominio.Usuario;
import Persistencia.GestorCancion;

public class TestComprarCancion {
	private GestorCancion gescan;
	private Cancion song;
	private Usuario user;
	
	@Before
	 public void setUp() throws Exception {
	  gescan=new GestorCancion();
	  song=new Cancion("nombre","artista");
	  user=new Usuario();
	 }
	@Test
	 public void testComprarCanExisteBBDD() {
		song.setNombre("Smell like teen Spirit");
		user.setEmail("fernando.ruiz@gmail.com");

		assertTrue(gescan.comprarCancion(song, user));
		assertNotNull(gescan.comprarCancion(song, user));
	 }
	@Test
	 public void testComprarCanNoExisteBBDD() {
		song.setNombre("Smell like teen Spirit");
		user.setEmail("fernando.ruiz@gmail.com");

		assertTrue(gescan.comprarCancion(song, user));
	  	assertNotNull(gescan.comprarCancion(song, user));
	 }
	@Test
	 public void testCampoVacio() {
		song.setNombre(null);
		user.setEmail(null);
	  assertFalse(gescan.comprarCancion(song, user));
	 }
}
