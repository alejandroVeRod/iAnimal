package Persistencia;

import java.sql.*;
 
public class AgenteBD {
 
    private Connection conexion=null;
	private String servidor="localhost:3306";
	private String database="animusic";
	private String usuario="root";
	private String password="1234";
    private String url="";
    private Statement st;
 
    public void Clase_Conexion(String servidor, String database, String usuario, String password){
        try {
        	Class.forName("com.mysql.jdbc.Driver").newInstance();
        	System.out.println("Registro completo");
            this.servidor = servidor;
            this.database = database;
            Connection con=null;
            
            Class.forName("com.mysql.jdbc.Driver");
            url="jdbc:mysql://localhost:3306/AniMusic";
            conexion=DriverManager.getConnection(url, usuario, password);
            System.out.println("Conexión Correcta con la Base de Datos " + url);
 
        }
        catch (SQLException ex) {
            System.out.println(ex);
        }
        catch (ClassNotFoundException ex) {
            System.out.println(ex);
        } catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
 
    public void conexion() {
    	try {
    		Class.forName("com.mysql.jdbc.Driver").newInstance();
    		System.out.println("Registro completo");
    		
    	}catch(Exception e) {
    		System.out.println(e.getMessage());
    	}
    	
    	Connection con=null;
    	try {
    		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/AniMusic","root","");
    		con.close();
    	}catch(SQLException ex) {
    		System.out.println("SQLException: "+ex.getMessage());
    	}
    }
    
    public Connection getConexion(){
        if(conexion == null) {
    	return conexion;
        }
        return null;
    }
    public ResultSet leer(String sql) throws SQLException {
    	return st.executeQuery(sql);
    }
    public int modificar(String sql) throws SQLException{
    	return st.executeUpdate(sql);
    }
}