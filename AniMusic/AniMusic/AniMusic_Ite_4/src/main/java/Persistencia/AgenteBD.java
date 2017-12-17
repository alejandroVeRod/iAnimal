package Persistencia;

import java.sql.*;
 
public class AgenteBD {
 
    private Connection conexion=null;
	@SuppressWarnings("unused")
	private String servidor="localhost:3306";
    @SuppressWarnings("unused")
	private String database="animusic";
    @SuppressWarnings("unused")
	private String usuario="root";
    @SuppressWarnings("unused")
	private String password="1234";
    private String url="";
 
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
        return conexion;
    }
 
    public Connection cerrarConexion(){
        try {
            conexion.close();
             System.out.println("Conexión Cerrada con "+url);
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        conexion=null;
        return conexion;
    }

}