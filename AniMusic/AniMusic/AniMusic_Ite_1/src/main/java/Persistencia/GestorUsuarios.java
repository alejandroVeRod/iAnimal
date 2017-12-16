package Persistencia;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
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
	public boolean anadirUsuario(Usuario user) {
		//No es funcional, ya que implementaremos más adelante una bbdd
		try {
			FileWriter fw=new FileWriter("BBDD.txt",true);
			PrintWriter pw=new PrintWriter(fw);
			pw.println(user.getEmail());
			pw.println(user.getPassword());
			pw.println(user.getNombre());
			pw.println(user.getApellidos());
			return true;
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		return false;
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
