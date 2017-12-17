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
 
            this.servidor = servidor;
            this.database = database;
 
            Class.forName("com.mysql.jdbc.Driver");
            url="jdbc:mysql://"+servidor+"/"+database;
            conexion=DriverManager.getConnection(url, usuario, password);
            System.out.println("Conexión Correcta con la Base de Datos " + url);
 
        }
        catch (SQLException ex) {
            System.out.println(ex);
        }
        catch (ClassNotFoundException ex) {
            System.out.println(ex);
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