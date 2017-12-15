package Persistencia;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import Dominio.Usuario;

public class GestorUsuarios {

	private Usuario[] lista_usuario;
	
	public Usuario[] getLista_usuario() {
		return lista_usuario;
	}

	public void setLista_usuario(Usuario[] lista_usuario) {
		this.lista_usuario = lista_usuario;
	}
	public void verUsuario(Usuario user) {
		
	}
	public void anadirUsuario(Usuario user) {
		
	}
	public void modificarUsuario(Usuario user) {
		
	}
	public void eliminarUsuario(Usuario user) {
	
	}
	public boolean autenticarUsuario(Usuario user)   {
		String pass = null,email = null;
		try {
			File f=new File("BBDD.txt");
			Scanner read = new Scanner(f);
			while(read.hasNextLine()) {
				email=read.next();
				
				pass=read.next();
			}
			read.close();
		}catch (Exception ex){
			System.out.print("POLLA");
		}
		
		if((user.getEmail().equals(email)) && (user.getPassword().equals(pass))){
			return true;
		}else {
			return false;
		}
	}
	
}
