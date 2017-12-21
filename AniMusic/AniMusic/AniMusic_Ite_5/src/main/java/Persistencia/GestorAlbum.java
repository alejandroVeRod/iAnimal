package Persistencia;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import Dominio.Album;
import Dominio.Cancion;

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
	public boolean verAlbum(Album alb) {
		/*java.sql.Connection con=null;
		java.sql.PreparedStatement consulta;
		ResultSet resultado;
		String connectionString="jdbc:mysql://localhost:3306/AniMusic.mwb?user=root&password=Pass&useUnicode=true&characterEncoding=UTF-8";
		try {

			con=DriverManager.getConnection(connectionString);;
			consulta=con.prepareStatement("SELECT * FROM Album WHERE Album.nombre="+alb.getNombre();
			resultado=consulta.executeQuery();
			while(resultado.next()) {
				alb.setNombre((String) resultado.getObject("nombre"));
				alb.setArtista((String) resultado.getObject("artista"));
				alb.setFecha((String) resultado.getObject("fecha"));
				
			}
			*/
			return true;
		/*
		}catch(SQLException ex) {
			System.out.println("SQLException"+ex.getMessage());
		}
		return false;
		*/
			
		
	}
	public boolean anadirAlbum(Album alb) {
		/*
		java.sql.Connection con=null;
		java.sql.PreparedStatement consulta;
		ResultSet resultado;
		String connectionString = "jdbc:mysql://localhost:3306/AniMusic.mwb?user=root&password=Pass&useUnicode=true&characterEncoding=UTF-8";
		

		try {
			con = DriverManager.getConnection(connectionString);
			java.sql.PreparedStatement stmt = con.prepareStatement("INSERT INTO 'AniMusic'.'Album'(nombre,artista,fecha) VALUES ('"+alb.getNombre()+"','"+alb.getArtista()+"','"+alb.getFecha()+"')");
	    	resultado = stmt.executeQuery();
	    	*/
	    	return true;
	    	/*
	    	
	} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return false;*/
		
	}
	public boolean modificarAlbum(Album alb) {
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
	public boolean eliminarAlbum(Album alb) {
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
	public boolean reproducirAlbum(Album alb) {
		java.sql.Connection con=null;
		java.sql.PreparedStatement consulta;
		ResultSet resultado;
		String connectionString="jdbc:mysql://localhost:3306/AniMusic.mwb?user=root&password=Pass&useUnicode=true&characterEncoding=UTF-8";
		try {

			con=DriverManager.getConnection(connectionString);;
			consulta=con.prepareStatement("SELECT * FROM Album WHERE nombre="+alb.getNombre());
			resultado=consulta.executeQuery();
			while(resultado.next()) {
				alb.setNombre((String) resultado.getObject("nombre"));
				alb.setArtista((String) resultado.getObject("artista"));
				
			}
			return true;
		
		}catch(SQLException ex) {
			System.out.println("SQLException"+ex.getMessage());
		}
		return false;
	}
}
