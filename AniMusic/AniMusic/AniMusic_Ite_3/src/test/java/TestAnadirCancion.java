import static org.junit.Assert.*;


import org.junit.Before;
import org.junit.Test;

import Dominio.Cancion;
import Persistencia.GestorCancion;

public class TestAnadirCancion {
	
	private GestorCancion gSong;
	private Cancion song;
	
	@Before
	public void setUp() throws Exception {
		gSong = new GestorCancion();
		song = new Cancion("nombre", "artista", "album", "fecha", "duracion");
	}
	@Test
	public void testExisteCancionBBDD() {
		song.setNombre("When the wild winds blows");
		song.setArtista("Iron Maiden");
		song.setFecha("10/04/2010");
		assertFalse(gSong.anadirCancion(song));
	}

	@Test
	public void testNoExisteCancionBBDD() {
		song.setNombre("Another Day");
		song.setArtista("Paul McCartney");
		song.setFecha("01/02/1971");
		assertTrue(gSong.anadirCancion(song));
	}
	
}
