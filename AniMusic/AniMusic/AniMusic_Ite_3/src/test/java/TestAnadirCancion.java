import static org.junit.Assert.*;


import org.junit.Before;
import org.junit.Test;

import Dominio.Album;
import Dominio.Cancion;
import Persistencia.GestorAlbum;
import Persistencia.GestorCancion;

public class TestAnadirCancion {
	
	private GestorCancion gSong;
	private GestorAlbum gAlb;
	private Cancion song;
	private Album alb;
	
	@Before
	public void setUp() throws Exception {
		gAlb = new GestorAlbum();
		alb=new Album("nombre", "artista", "fecha");
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
	public void testExisteAlbBBDD() {
		alb.setNombre("Appetite for Destruction");
		alb.setArtista("Guns N' Roses");
		alb.setFecha("21/07/1987");
		assertFalse(gAlb.anadirAlbum(alb));
	}
	@Test
	public void testNoExisteCancionBBDD() {
		song.setNombre("Another Day");
		song.setArtista("Paul McCartney");
		song.setFecha("01/02/1971");
		assertTrue(gSong.anadirCancion(song));
	}
	@Test
	public void testNoExisteAlbBBDD() {
		alb.setNombre("Alguna basura mas");
		alb.setArtista("Kiko Rivera");
		alb.setFecha("10/09/2016");
		assertTrue(gAlb.anadirAlbum(alb));
	}
	
}
