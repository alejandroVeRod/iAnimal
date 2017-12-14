package Dominio;

public class album {
	private int idAlbum;
	private String titulo;
	private String autor;
	private double precio;
	
	public album(int idAlbum, String titulo, String autor, double precio) {
		this.idAlbum=idAlbum;
		this.titulo=titulo;
		this.precio=precio;
		this.autor=autor;
	}
}
