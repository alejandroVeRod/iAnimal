package Persistencia;

import Dominio.Album;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class GestorAlbum {
	
	private Album[] lista_album;
	
	AgenteBD agente;

	public Album[] getLista_album() {
		return lista_album;
	}

	public void setLista_album(Album[] lista_album) {
		this.lista_album = lista_album;
	}
	
	public void verTodosAlbumes() {
		
	}
	public void verAlbum(Album alb) {
		
	}
	public void anadirAlbum(Album alb) {
		agente.mandarModificar("INSERT INTO Album VALUES ('"+ alb.getIdAlbum()+"'"+alb.getNombre()+"'"+alb.getArtista()+"'"+alb.getFecha()+"'");
	}
	public void modificarAlbum(Album alb) {
		
	}
	public void eliminarAlbum(Album alb) {
		agente.mandarModificar("DELETE FROM Album WHERE idAlbum = "+alb.getIdAlbum());
	}
}
