package Dominio;

public class Album {
	private int idAlbum;
	private String titulo;
	private String autor;
	private double precio;
	
	public Album(int idAlbum, String titulo, String autor, double precio) {
		this.idAlbum=idAlbum;
		this.titulo=titulo;
		this.precio=precio;
		this.autor=autor;
	}
	
	public int getIdAlbum() {
		return idAlbum;
	}
	public String getTitulo() {
		return titulo;
	}
	public String getAutor() {
		return autor;
	}
	public double getPrecio() {
		return precio;
	}

	public void setIdAlbum(int idAlbum) {
		this.idAlbum = idAlbum;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
}
