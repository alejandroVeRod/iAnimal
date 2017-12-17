package Persistencia;

import Dominio.Album;

public class GestorAlbum {
	
	private Album[] lista_album;

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
	public void anadirAlbum(Album alb) {
	/*	No es funcional ya que usaremos sentencias sql y una base de datos MySQL
	 * try {
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
	*/	
	}
	public void modificarAlbum(Album alb) {
		
	}
	public void eliminarAlbum(Album alb) {
		
	}
}
