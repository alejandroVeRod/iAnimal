import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Dominio.Usuario;
import Persistencia.GestorUsuarios;

public class TestRegistrar {
	
	private GestorUsuarios registrar;
	private Usuario user;
	@Before
	public void setUp() throws Exception{
		registrar=new GestorUsuarios();
		user=new Usuario();
	}
	@Test
	public void testRegistrarExisteBBDD() {
		user.setEmail("alejandro@gmail.com");
		user.setPassword("pass123");
		user.setNombre("Fernando");
		user.setApellidos("Ruiz");
		assertTrue(user.getGestor().anadirUsuario(user));
	}
	@Test
	public void testRegistrarNoExisteBBDDD() {
		user.setEmail("fernando@gmail.com");
		user.setPassword("pass123");
		user.setNombre("Fernando");
		user.setApellidos("Ruiz");
		assertTrue(user.getGestor().anadirUsuario(user));
	}
	@Test
	public void testRegistrarCampoVacio() {
		user.setEmail(null);
		user.setPassword(null);
		user.setNombre(null);
		user.setApellidos(null);
		assertTrue(user.getGestor().anadirUsuario(user));
	}
	
	
/*
	@Test
	public void testRegistrar
*/
}
