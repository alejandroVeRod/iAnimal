import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Dominio.Cancion;
import Persistencia.GestorCancion;

public class TestModificarCancion {

	private GestorCancion gSong;
	private Cancion song;
	
	@Before
	public void setUp() throws Exception {
		gSong = new GestorCancion();
		song = new Cancion("nombre", "artista", "album", "fecha", "duracion");
	}
	
	@Test
	public void testExisteAlbBBDD() {
		song.setNombre("Appetite for Destruction");
		song.setArtista("Guns N' Roses");
		song.setFecha("10/04/2010");
		assertTrue(gSong.modificarCancion(song));
	}
	@Test
	public void testNoExisteAlbBBDD() {
		song.setNombre("Alguna basura mas");
		song.setArtista("Kiko Rivera");
		song.setFecha("10/09/2016");
		assertFalse(gSong.modificarCancion(song));
	}
	@Test
	public void testCampoVacio() {
		song.setNombre(null);
		assertFalse(gSong.modificarCancion(song));
	}	

	@After
	public void tearDown() throws Exception {
	}


} 