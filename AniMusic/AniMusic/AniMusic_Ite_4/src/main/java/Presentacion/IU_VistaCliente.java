package Presentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.CardLayout;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class IU_VistaCliente extends JFrame {

	private JPanel contentPane;
	private JPanel pnl_Contenido;
	private JScrollPane scrollPane;
	private JList list_Playlist;
	private JTextField txt_Buscador;
	private JScrollPane scrollPane_1;
	private JPanel pnl_Reproductor;
	private JButton btn_Reproducir;
	private JLabel lblNombre;
	private JLabel lblArtista;
	private JTextField txt_Nombre;
	private JTextField txt_Artista;
	private JButton btn_Pausar;
	private JButton btn_Buscar;

	/**
	 * Launch the application.
	 */
	/*
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IU_VistaCliente frame = new IU_VistaCliente();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public IU_VistaCliente() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 720, 1280);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		pnl_Contenido = new JPanel();
		contentPane.add(pnl_Contenido, BorderLayout.CENTER);
		pnl_Contenido.setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(83, 41, 188, 228);
		pnl_Contenido.add(scrollPane);
		
		list_Playlist = new JList();
		list_Playlist.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Lista de Reproducci\u00F3n", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		scrollPane.setViewportView(list_Playlist);
		
		txt_Buscador = new JTextField();
		txt_Buscador.setToolTipText("Aquí puedes buscar la cancion o Album que quieras");
		txt_Buscador.setBounds(83, 338, 130, 26);
		pnl_Contenido.add(txt_Buscador);
		txt_Buscador.setColumns(10);
		
		scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(83, 389, 130, 169);
		pnl_Contenido.add(scrollPane_1);
		
		pnl_Reproductor = new JPanel();
		
		pnl_Reproductor.setBounds(318, 39, 100, 100);
		pnl_Contenido.add(pnl_Reproductor);
		pnl_Reproductor.setLayout(new CardLayout(0, 0));
		
		btn_Reproducir = new JButton("");
		btn_Reproducir.addActionListener(new Btn_ReproducirActionListener());
		btn_Reproducir.setIcon(new ImageIcon(IU_VistaCliente.class.getResource("/Presentacion/play.png")));
	
		pnl_Reproductor.add(btn_Reproducir, "Reproducir");
		
		btn_Pausar = new JButton("");
		btn_Pausar.addActionListener(new Btn_PausarActionListener());
		btn_Pausar.setIcon(new ImageIcon(IU_VistaCliente.class.getResource("/Presentacion/pause.png")));
		pnl_Reproductor.add(btn_Pausar, "Pausar");
		
		lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(302, 185, 61, 16);
		pnl_Contenido.add(lblNombre);
		
		lblArtista = new JLabel("Artista");
		lblArtista.setBounds(302, 253, 61, 16);
		pnl_Contenido.add(lblArtista);
		
		txt_Nombre = new JTextField();
		txt_Nombre.setBounds(375, 180, 130, 26);
		pnl_Contenido.add(txt_Nombre);
		txt_Nombre.setColumns(10);
		
		txt_Artista = new JTextField();
		txt_Artista.setBounds(375, 243, 130, 26);
		pnl_Contenido.add(txt_Artista);
		txt_Artista.setColumns(10);
		
		btn_Buscar = new JButton("Buscar...");
		btn_Buscar.addActionListener(new Btn_BuscarActionListener());
		btn_Buscar.setBounds(225, 338, 117, 29);
		pnl_Contenido.add(btn_Buscar);
	}

	private class Btn_ReproducirActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			((CardLayout)pnl_Reproductor.getLayout()).show(pnl_Reproductor,"Pausar");
			//Cancion c1=new Cancion(txt_Nombre.getText(),txt_Artista.getText())
			/*IMPLEMENTACION EN IT5*/
		}
	}
	private class Btn_PausarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			((CardLayout)pnl_Reproductor.getLayout()).show(pnl_Reproductor,"Reproducir");
			/*IMPLEMENTACION EN IT5*/
		}
	}
	private class Btn_BuscarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			/*IMPLEMENTACION EN IT4*/
		}
	}
}
