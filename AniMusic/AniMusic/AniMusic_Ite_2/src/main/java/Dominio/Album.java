package Dominio;


public class Album {
	
	private String idAlbum;
	private String nombre;
	private String artista;
	private String fecha;
	private Cancion listaCanciones[];

	public Album(String idAlbum, String nombre, String artista, String fecha, Cancion listaCanciones[]) {
		this.idAlbum = idAlbum;
		this.nombre = nombre;
		this.artista = artista;
		this.fecha = fecha;
		this.listaCanciones = listaCanciones;
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

	public Cancion[] getListaCanciones() {
		return listaCanciones;
	}

	public void setListaCanciones(Cancion listaCanciones[]) {
		this.listaCanciones = listaCanciones;
	}
	
}
