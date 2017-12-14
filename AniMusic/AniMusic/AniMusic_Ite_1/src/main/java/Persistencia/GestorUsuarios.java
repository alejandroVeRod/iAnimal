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
	
	public void AñadirUsuario(Usuario user) {
		
	}
	public void ModificarUsuario(Usuario user) {
		
	}
	public void EliminarUsuario(Usuario user) {
	
	}
	public boolean AutenticarUsuario(Usuario user)  {
		String pass = null,email = null;
		try {
			File f=new File("/AniMusic_Ite_1/src/main/java/Persistencia/BBDD.txt");
			Scanner read = new Scanner(f);
			while(read.hasNextLine()) {
				email=read.next();
				pass=read.nextLine();
			}
			
		}catch(FileNotFoundException e) {
			System.out.println("El archivo no existe...");
		}
		
		if((user.getEmail()==email && (user.getPassword()==pass))){
			return true;
		}else {
			return false;
		}
	}
	
}
