package Presentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.AbstractListModel;
import java.awt.Font;
import javax.swing.JScrollBar;
import javax.swing.ScrollPaneConstants;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class IU_VistaAdministrador extends JFrame {

	private JPanel contentPane;
	private JPanel pnl_contenido;
	private JButton btnAadirUsuario;
	private JButton btnModificarUsuario;
	private JButton btnNewButton;
	private JScrollPane scrollPane;
	private JList list;
	private JLabel lblTitulo;
	private JLabel lblArtista;
	private JLabel lblAlbum;
	private JTextField txt_Canciontitulo;
	private JTextField txt_CancionArtista;
	private JTextField txt_CancionAlbum;
	private JLabel lblFecha;
	private JTextField txt_CancionFecha;
	private JLabel lblDuracin;
	private JTextField txt_CancionDuracion;
	private JButton btnAnadirAlbum;
	private JButton btnModificarAlbum;
	private JButton btnEliminarAlbum;
	private JScrollPane scrollPane_1;
	private JLabel lblNombre;
	private JLabel label_1;
	private JTextField txt_AlbumNombre;
	private JTextField txt_AlbumArtista;
	private JLabel label_3;
	private JTextField txt_AlbumFecha;
	private JList list_1;
	private JLabel lblDuracin_1;
	private JTextField txt_AlbumDuracion;
	private JButton btn_CerrarSesion;

	/**
	 * Launch the application.
	 */
	/*
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IU_VistaAdministrador frame = new IU_VistaAdministrador();
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
	public IU_VistaAdministrador() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 720, 1280);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		pnl_contenido = new JPanel();
		contentPane.add(pnl_contenido, BorderLayout.CENTER);
		pnl_contenido.setLayout(null);
		
		btnAadirUsuario = new JButton("Añadir Cancion");
		btnAadirUsuario.setBounds(163, 224, 140, 29);
		pnl_contenido.add(btnAadirUsuario);
		
		btnModificarUsuario = new JButton("Modificar Cancion");
		btnModificarUsuario.setBounds(310, 224, 171, 29);
		pnl_contenido.add(btnModificarUsuario);
		
		btnNewButton = new JButton("Eliminar Cancion");
		btnNewButton.setBounds(34, 224, 117, 29);
		pnl_contenido.add(btnNewButton);
		
		scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(47, 37, 189, 119);
		pnl_contenido.add(scrollPane);
		
		list = new JList();
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"Starlight-Muse", "Baby Blue-Cage the Elephant", "Any Way You Want-Journey"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		scrollPane.setViewportView(list);
		
		lblTitulo = new JLabel("Titulo");
		lblTitulo.setBounds(252, 39, 61, 16);
		pnl_contenido.add(lblTitulo);
		
		lblArtista = new JLabel("Artista:");
		lblArtista.setBounds(252, 79, 61, 16);
		pnl_contenido.add(lblArtista);
		
		lblAlbum = new JLabel("Album:");
		lblAlbum.setBounds(252, 124, 61, 16);
		pnl_contenido.add(lblAlbum);
		
		txt_Canciontitulo = new JTextField();
		txt_Canciontitulo.setText("Starlight");
		txt_Canciontitulo.setBounds(325, 34, 130, 26);
		pnl_contenido.add(txt_Canciontitulo);
		txt_Canciontitulo.setColumns(10);
		
		txt_CancionArtista = new JTextField();
		txt_CancionArtista.setText("Muse");
		txt_CancionArtista.setBounds(325, 74, 130, 26);
		pnl_contenido.add(txt_CancionArtista);
		txt_CancionArtista.setColumns(10);
		
		txt_CancionAlbum = new JTextField();
		txt_CancionAlbum.setText("Black Holes and Revelations");
		txt_CancionAlbum.setBounds(325, 119, 130, 26);
		pnl_contenido.add(txt_CancionAlbum);
		txt_CancionAlbum.setColumns(10);
		
		lblFecha = new JLabel("Fecha:");
		lblFecha.setBounds(252, 162, 61, 16);
		pnl_contenido.add(lblFecha);
		
		txt_CancionFecha = new JTextField();
		txt_CancionFecha.setText(" 3 de julio de 2006");
		txt_CancionFecha.setBounds(325, 157, 130, 26);
		pnl_contenido.add(txt_CancionFecha);
		txt_CancionFecha.setColumns(10);
		
		lblDuracin = new JLabel("Duración:");
		lblDuracin.setBounds(242, 196, 61, 16);
		pnl_contenido.add(lblDuracin);
		
		txt_CancionDuracion = new JTextField();
		txt_CancionDuracion.setText("04:00 min");
		txt_CancionDuracion.setBounds(325, 195, 130, 26);
		pnl_contenido.add(txt_CancionDuracion);
		txt_CancionDuracion.setColumns(10);
		
		btnAnadirAlbum = new JButton("Añadir Album");
		btnAnadirAlbum.addActionListener(new BtnAnadirAlbumActionListener());
		btnAnadirAlbum.setBounds(163, 505, 140, 29);
		pnl_contenido.add(btnAnadirAlbum);
		
		btnModificarAlbum = new JButton("Modificar Album");
		btnModificarAlbum.setBounds(310, 505, 171, 29);
		pnl_contenido.add(btnModificarAlbum);
		
		btnEliminarAlbum = new JButton("Eliminar Album");
		btnEliminarAlbum.setBounds(34, 505, 117, 29);
		pnl_contenido.add(btnEliminarAlbum);
		
		scrollPane_1 = new JScrollPane();
		scrollPane_1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane_1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane_1.setBounds(47, 318, 189, 119);
		pnl_contenido.add(scrollPane_1);
		
		list_1 = new JList();
		list_1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list_1.setModel(new AbstractListModel() {
			String[] values = new String[] {"Abbey Road-The Beatles", "Songs of Innocence-U2", "Black Holes and Revelations-Muse"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		scrollPane_1.setViewportView(list_1);
		
		lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(252, 320, 61, 16);
		pnl_contenido.add(lblNombre);
		
		label_1 = new JLabel("Artista:");
		label_1.setBounds(252, 360, 61, 16);
		pnl_contenido.add(label_1);
		
		txt_AlbumNombre = new JTextField();
		txt_AlbumNombre.setText("Abbey Road");
		txt_AlbumNombre.setColumns(10);
		txt_AlbumNombre.setBounds(325, 315, 130, 26);
		pnl_contenido.add(txt_AlbumNombre);
		
		txt_AlbumArtista = new JTextField();
		txt_AlbumArtista.setText("The Beatles");
		txt_AlbumArtista.setColumns(10);
		txt_AlbumArtista.setBounds(325, 355, 130, 26);
		pnl_contenido.add(txt_AlbumArtista);
		
		label_3 = new JLabel("Fecha:");
		label_3.setBounds(252, 396, 61, 16);
		pnl_contenido.add(label_3);
		
		txt_AlbumFecha = new JTextField();
		txt_AlbumFecha.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		txt_AlbumFecha.setText("26 de septiembre de 1969");
		txt_AlbumFecha.setColumns(10);
		txt_AlbumFecha.setBounds(325, 393, 130, 26);
		pnl_contenido.add(txt_AlbumFecha);
		
		lblDuracin_1 = new JLabel("Duración:");
		lblDuracin_1.setBounds(252, 436, 61, 16);
		pnl_contenido.add(lblDuracin_1);
		
		txt_AlbumDuracion = new JTextField();
		txt_AlbumDuracion.setText("47 min");
		txt_AlbumDuracion.setBounds(325, 431, 130, 26);
		pnl_contenido.add(txt_AlbumDuracion);
		txt_AlbumDuracion.setColumns(10);
		
		btn_CerrarSesion = new JButton("Cerrar Sesión");
		btn_CerrarSesion.addActionListener(new Btn_CerrarSesionActionListener());
		btn_CerrarSesion.setBounds(176, 581, 117, 29);
		pnl_contenido.add(btn_CerrarSesion);
	}
	private class BtnAnadirAlbumActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			
			
		}
	}
	private class Btn_CerrarSesionActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			IU_Login iu=new IU_Login();
			iu.getFrame().setVisible(true);
			setVisible(false);
		}
	}
}
