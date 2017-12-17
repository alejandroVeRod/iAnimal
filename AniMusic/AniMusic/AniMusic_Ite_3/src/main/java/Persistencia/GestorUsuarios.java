package Persistencia;

import java.sql.ResultSet;
import java.sql.SQLException;

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
	public void anadirUsuario(Usuario user) {
		
	}
	public void modificarUsuario(Usuario user) {
		
	}
	public void eliminarUsuario(Usuario user) {
	
	}
	public void autenticarUsuario(Usuario user) {

	}
	
}
