package Persistencia;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Dominio.Cancion;

public class GestorCancion {
	private ArrayList<Cancion> lista_canciones;
	public GestorCancion() {
		lista_canciones=new ArrayList<Cancion>();
	}
	public ArrayList<Cancion> getLista_cancion() {
		return lista_canciones;
	}

	public void setLista_cancion(ArrayList<Cancion> lista_canciones) {
		this.lista_canciones = lista_canciones;
	}
	public void verTodasCanciones() {
		
	}
	public boolean buscarCancion(Cancion song) {
		
		java.sql.Connection con=null;
		java.sql.PreparedStatement consulta;
		ResultSet resultado;
		String connectionString = "jdbc:mysql://localhost:3306/AniMusic.mwb?user=root&password=Pass&useUnicode=true&characterEncoding=UTF-8";
		try {
			con = DriverManager.getConnection(connectionString);
			java.sql.PreparedStatement stmt = con.prepareStatement("SELECT * FROM Cancion WHERE nombre="+song.getNombre()+" OR artista="+song.getArtista());
	    	resultado = stmt.executeQuery();
	    	while(resultado.next()) {
	    		song.setNombre(resultado.getString(1));
	    		song.setArtista(resultado.getString(2));
	    		lista_canciones.add(song);
	    		return true;
	    	}
		}catch(SQLException ex) {
			ex.printStackTrace();
		}
		return false;
	}
	public void verCancion(Cancion song) {
		
	}
	public boolean anadirCancion(Cancion song) {
		
		java.sql.Connection con=null;
		java.sql.PreparedStatement consulta;
		ResultSet resultado;
		String connectionString = "jdbc:mysql://localhost:3306/AniMusic.mwb?user=root&password=Pass&useUnicode=true&characterEncoding=UTF-8";
		

		try {
			con = DriverManager.getConnection(connectionString);
			java.sql.PreparedStatement stmt = con.prepareStatement("INSERT INTO 'Cancion'(nombre,artista,album,fecha,duracion) VALUES"
					+ " ('"+song.getNombre()+
					"','"+song.getArtista()+
					"','"+song.getAlbum()+
					"','"+song.getFecha()+
					"','"+song.getDuracion()+"')");
	    	resultado = stmt.executeQuery();
	    	
	    	return true;
	    	
	    	
	} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return false;
		
	}
	public boolean modificarCancion(Cancion song) {
		/*
		java.sql.Connection con=null;
		java.sql.PreparedStatement consulta;
		ResultSet resultado;
		String connectionString = "jdbc:mysql://localhost:3306/AniMusic.mwb?user=root&password=Pass&useUnicode=true&characterEncoding=UTF-8";
		try {
			con = DriverManager.getConnection(connectionString);
			java.sql.PreparedStatement stmt = con.prepareStatement("UPDATE 'AniMusic'.'Album' SET nombre="+alb.getNombre()+",artista="+alb.getArtista()+",fecha="+alb.getFecha()+" WHERE nombre="+alb.getNombre());
	    	resultado = stmt.executeQuery();
	    	*/return true;/*
		}catch (SQLException e) {
			
			e.printStackTrace();
		}
		return false;
		*/
	}
	public boolean eliminarCancion(Cancion song) {
		/*
		java.sql.Connection con=null;
		java.sql.PreparedStatement consulta;
		ResultSet resultado;
		String connectionString = "jdbc:mysql://localhost:3306/AniMusic.mwb?user=root&password=Pass&useUnicode=true&characterEncoding=UTF-8";
		try {
			con = DriverManager.getConnection(connectionString);
			java.sql.PreparedStatement stmt = con.prepareStatement("DELETE * FROM Album WHERE nombre="+alb.getNombre());
	    	resultado = stmt.executeQuery();
	    	*/return true;/*
		}catch (SQLException e) {
			
			e.printStackTrace();
		}
		return false;
		*/
	}
}
