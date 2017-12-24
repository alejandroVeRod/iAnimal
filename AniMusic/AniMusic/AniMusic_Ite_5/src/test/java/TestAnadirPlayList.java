import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Persistencia.GestorCancion;

public class TestAnadirPlayList {
	private String lista;
	private int id_cancion;
	private int nlinea;
	private GestorCancion gestor;
	@Before
	public void SetUp() {
		lista="";
		id_cancion=0;
		nlinea=0;
		gestor=new GestorCancion();
	}
	@Test
	public void testAñadirPlayListExisteYestaEnLista() {
		lista="Heavy Metal";
		id_cancion=4;
		nlinea=3;
		assertTrue(gestor.anadirLista(lista));
		assertTrue(gestor.anadirCancionLista(lista, id_cancion));
		assertTrue(gestor.leerLista(lista, id_cancion));
	}
	public void testAñadirPlayListNOExisteYNOestaEnLista() {
		lista="Reggaeton";
		id_cancion=101;
		nlinea=2037;
		assertTrue(gestor.anadirLista(lista));
		assertTrue(gestor.anadirCancionLista(lista, id_cancion));
		assertTrue(gestor.leerLista(lista, id_cancion));
	}
	public void testAñadirPlayListFormatoCorrecto() {
		lista="Indie Pop";
		id_cancion=7;
		nlinea=7;
		assertTrue(gestor.anadirLista(lista));
		assertTrue(gestor.anadirCancionLista(lista, id_cancion));
		assertTrue(gestor.leerLista(lista, id_cancion));
	}
	public void testAñadirPlayListFormatoIncorrecto() {
		lista="101";
		id_cancion='a';
		nlinea='a';
		assertTrue(gestor.anadirLista(lista));
		assertTrue(gestor.anadirCancionLista(lista, id_cancion));
		assertTrue(gestor.leerLista(lista, id_cancion));
	}

}
