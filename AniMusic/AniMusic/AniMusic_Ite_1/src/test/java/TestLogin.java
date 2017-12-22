import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Dominio.Usuario;
import Persistencia.GestorUsuarios;

public class TestLogin {
	private GestorUsuarios login;
	private Usuario user;
	@Before
	public void setUp() throws Exception{
		login=new GestorUsuarios();
		user=new Usuario();
	}
	@Test
	public void testAutenticarCoincideBBDD() {
		user.setEmail("alejandro@gmail.com");
		user.setPassword("1234");
		assertTrue(login.autenticarUsuario(user));
	}
	@Test
	public void testAutenticarrNoCoincideBBDD() {
		user.setEmail("1234@gmail.com");
		user.setPassword("4321");
		assertTrue(login.autenticarUsuario(user));
		
	}
	
}
