package Persistencia;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import Dominio.Usuario;

public class GestorUsuarios {

	private Usuario[] lista_usuario;
	AgenteBD bd = new AgenteBD();
	public Usuario[] getLista_usuario() {
		return lista_usuario;
	}

	public void setLista_usuario(Usuario[] lista_usuario) {
		this.lista_usuario = lista_usuario;
	}
	public void verUsuario(Usuario user) throws SQLException {
		
		//AgenteBD bd = new AgenteBD();

		ResultSet rs = bd.leer("'SELECT * FROM Usuario WHERE dni="+ user.getDNI() +";'");
		while(rs.next()) {
			user.setNombre((String) rs.getObject("nombre"));
			user.setApellidos((String) rs.getObject("apellidos"));
			user.setEmail((String) rs.getObject("email"));
		}
	}
	public boolean anadirUsuario(Usuario user) {
		return true;
	}
	public void modificarUsuario(Usuario user) {
		
	}
	public boolean eliminarUsuario(Usuario user) {
		return true;
	}
	public boolean autenticarUsuario(Usuario user) {
		/*	
		java.sql.Connection con=null;
			java.sql.PreparedStatement consulta;
			ResultSet resultado;
			String connectionString = "jdbc:mysql://localhost:3306/AniMusic.mwb?user=root&password=Pass&useUnicode=true&characterEncoding=UTF-8";
			try {
				
				con=DriverManager.getConnection(connectionString);;
				consulta=con.prepareStatement("SELECT contrasena FROM Usuario WHERE email="+user.getEmail());
				resultado=consulta.executeQuery();
				if(user.getPassword().equals(resultado.next())) {
				*/
					return true;
					/*
				}else {
					return false;
				}
				*/
				/*
			}catch(SQLException ex) {
				System.out.println("SQLException"+ex.getMessage());
			}
			return false;
		*/
	}
	public void conectarBD() {
		AgenteBD agente=new AgenteBD();
		agente.conexion();
	}
	
}
