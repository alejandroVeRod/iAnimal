package Dominio;

import Persistencia.GestorCancion;

public class Cancion {
	
	private String idCancion;
	private String nombre;
	private String artista;
	private String album;
	private String fecha;
	private String duracion;
	private GestorCancion gestor;
	public Cancion(String idCancion, String nombre, String artista, String album, String fecha, String duracion){
		this.idCancion = idCancion;
		this.nombre = nombre;
		this.artista = artista;
		this.album = album;
		this.fecha = fecha;
		this.duracion = duracion;
	}
	/*Este constructor servirá para poder realizar la busqueda por nombre o por artista*/
	public Cancion(String nombre_artista) {
		this.nombre=nombre_artista;
		this.artista=nombre_artista;
		this.gestor=new GestorCancion();
	}
	public GestorCancion getGestor() {
		return this.gestor;
	}
	
	public String getIdCancion() {
		return idCancion;
	}

	public void setIdCancion(String idCancion) {
		this.idCancion = idCancion;
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

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getDuracion() {
		return duracion;
	}

	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}

	
}
