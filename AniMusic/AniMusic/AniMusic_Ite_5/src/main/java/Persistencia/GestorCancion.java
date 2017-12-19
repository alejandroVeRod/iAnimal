package Persistencia;

import Dominio.Cancion;

public class GestorCancion {
	private Cancion[] lista_cancion;
	
	public Cancion[] getLista_cancion() {
		return lista_cancion;
	}

	public void setLista_cancion(Cancion[] lista_cancion) {
		this.lista_cancion = lista_cancion;
	}
	public void verTodasCanciones() {
		
	}
	public void verCancion(Cancion song) {
		
	}
	public boolean anadirCancion(Cancion song) {
		/*
		java.sql.Connection con=null;
		java.sql.PreparedStatement consulta;
		ResultSet resultado;
		String connectionString = "jdbc:mysql://localhost:3306/AniMusic.mwb?user=root&password=Pass&useUnicode=true&characterEncoding=UTF-8";
		

		try {
			con = DriverManager.getConnection(connectionString);
			java.sql.PreparedStatement stmt = con.prepareStatement("INSERT INTO 'Cancion'(nombre,artista,fecha) VALUES ('"+alb.getNombre()+"','"+alb.getArtista()+"','"+alb.getFecha()+"')");
	    	resultado = stmt.executeQuery();
	    	*/
	    	return true;
	    	/*
	    	
	} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return false;*/
		
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
