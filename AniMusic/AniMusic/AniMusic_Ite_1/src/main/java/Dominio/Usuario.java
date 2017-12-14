package Dominio;

import Persistencia.GestorUsuarios;

public class Usuario {

	private String nombre;
	private String apellidos;
	private String email;
	private String password;
	private String fechaNacimiento;
	private String DNI;
	private GestorUsuarios gestor;
	public Usuario(String email,String password) {
		this.email=email;
		this.password=password;
		this.gestor=new GestorUsuarios();
	}

	public Usuario(String nombre, String apellidos, String email,String password) {
		
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.email = email;
		this.password=password;

	}
	
	public GestorUsuarios getGestor() {
		return gestor;
	}
	public void setGestor(GestorUsuarios gestor) {
		this.gestor = gestor;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Usuario() {
		this.gestor=new GestorUsuarios();
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getDNI() {
		return DNI;
	}
	public void setDNI(String dNI) {
		DNI = dNI;
	}
	
}
