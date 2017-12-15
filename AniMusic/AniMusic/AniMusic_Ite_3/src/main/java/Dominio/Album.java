package Dominio;

import Persistencia.GestorAlbum;

public class Album {
	
	private String idAlbum;
	private String nombre;
	private String artista;
	private String fecha;

	public Album(String idAlbum, String nombre, String artista, String fecha) {
		this.idAlbum = idAlbum;
		this.nombre = nombre;
		this.artista = artista;
		this.fecha = fecha;
	}

	public String getIdAlbum() {
		return idAlbum;
	}

	public void setIdAlbum(String idAlbum) {
		this.idAlbum = idAlbum;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	/*********************** METODOS DE GESTIÓN DE ALBUMES ****************************/
	public void leerAlbumes() {
		GestorAlbum gAlb = new GestorAlbum();
		gAlb.verTodosAlbumes();
	}
	public void leerAlbun(Album alb) {
		GestorAlbum gAlb = new GestorAlbum();
		gAlb.verAlbum(alb);
	}
	public void crearAlbum(Album alb) {
		GestorAlbum gAlb = new GestorAlbum();
		gAlb.anadirAlbum(alb);
	}
	public void borrarAlbum(Album alb) {
		GestorAlbum gAlb = new GestorAlbum();
		gAlb.eliminarAlbum(alb);
	}
	public void cambiarAlbum(Album alb) {
		GestorAlbum gAlb = new GestorAlbum();
		gAlb.modificarAlbum(alb);	
	}
	
}
