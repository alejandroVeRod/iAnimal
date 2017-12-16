package Persistencia;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import Dominio.Album;

public class GestorAlbum {
	
	private Album[] lista_album;
	private PrintWriter pw;

	public Album[] getLista_album() {
		return lista_album;
	}

	public void setLista_album(Album[] lista_album) {
		this.lista_album = lista_album;
	}
	
	public void verTodosAlbumes() {
		
	}
	public void verAlbum(Album alb) {
		
	}
	public boolean anadirAlbum(Album alb) {
		try {
			FileWriter fw = new FileWriter("BBDD.txt",true);
			pw = new PrintWriter (fw);
			pw.println(alb.getIdAlbum());
			pw.println(alb.getNombre());
			pw.println(alb.getArtista());
			pw.println(alb.getFecha());
			return true;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;
		
	}
	public void modificarAlbum(Album alb) {
		
	}
	public void eliminarAlbum(Album alb) {
		
	}
}
