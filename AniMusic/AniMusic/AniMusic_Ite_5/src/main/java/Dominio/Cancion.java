package Dominio;
public class Cancion {
	private int idCancion;
	private String nombre;
	private double donacion;
	private String album;
	private String colaboracion;
	private double precio;
	
	public Cancion(int idCancion, String nombre, double donacion, String album, String album, double precio) {
		this.idCancion=idCancion;
		this.nombre=nombre;
		this.donacion=donacion;
		this.album=album;
		this.colaboracion=colaboracion;
		this.precio=precio;
	}
	
	public int getIdancion() {
		return idCancion;
	}
	public String getNombre() {
		return nombre;
	}
	public double getDonacion() {
		return donacion;
	}
	public String getAlbum() {
		return album;
	}
	public String getColaboracion() {
		return colaboracion;
	}
	public double getPrecio() {
		return Nombre;
	}
	public void setIdCancion(int nuevaCancion) {
		idcancion=nuevaCancion;
	}
	public void setNombre(int nuevoNombre) {
		nombre=nuevoNombre;
	}
	public void setDonacion(int nuevaDonacion) {
		donacion=nuevaDonacion;
	}
	public void setAlbum(int nuevoAlbum) {
		album=nuevoAlbum;
	}
	public void setColaboracion(int nuevaColaboracion) {
		colaboracion=nuevaColaboracion;
	}
	public void setPrecio(int nuevoPrecio) {
		precio=nuevoPrecio;
	}
}
