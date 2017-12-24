package Presentacion;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import Dominio.Usuario;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class IU_Login {

	private JFrame frame;
	private JPanel panel_inicioSesion;
	private JLabel lblAnimusic;
	private JTextField txt_email;
	private JLabel lblemail;
	private JLabel lblNewLabel;
	private JTextField txt_contrasena;
	private JButton btnNewButton;
	private JLabel lblnoTienesUna;
	private JLabel lblNuevoEmail;
	private JLabel lblNuevaContrasea;
	private JLabel lblNombre;
	private JLabel lblApellidos;
	private JTextField txt_NuevoEmail;
	private JTextField txt_Nuevocontrasena;
	private JTextField txt_NuevoNombre;
	private JTextField txt_Nuevoapellidos;
	private JButton btnRegistrase;
	private JButton btnRegistrarseConFacebook;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IU_Login window = new IU_Login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public IU_Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 410, 596);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel_inicioSesion = new JPanel();
		frame.getContentPane().add(panel_inicioSesion, BorderLayout.CENTER);
		panel_inicioSesion.setLayout(null);
		
		lblAnimusic = new JLabel("AniMusic");
		lblAnimusic.setFont(new Font("Calibri", Font.PLAIN, 31));
		lblAnimusic.setBounds(29, 45, 178, 75);
		panel_inicioSesion.add(lblAnimusic);
		
		txt_email = new JTextField();
		txt_email.setBounds(102, 203, 86, 20);
		panel_inicioSesion.add(txt_email);
		txt_email.setColumns(10);
		
		lblemail = new JLabel("email");
		lblemail.setHorizontalAlignment(SwingConstants.RIGHT);
		lblemail.setBounds(46, 206, 46, 14);
		panel_inicioSesion.add(lblemail);
		
		lblNewLabel = new JLabel("Contrase\u00F1a");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setBounds(6, 253, 86, 14);
		panel_inicioSesion.add(lblNewLabel);
		
		txt_contrasena = new JTextField();
		txt_contrasena.setBounds(102, 250, 86, 20);
		panel_inicioSesion.add(txt_contrasena);
		txt_contrasena.setColumns(10);
		
		btnNewButton = new JButton("Iniciar Sesion");
		btnNewButton.addActionListener(new BtnNewButtonActionListener());
		btnNewButton.setBounds(241, 223, 119, 23);
		panel_inicioSesion.add(btnNewButton);
		
		lblnoTienesUna = new JLabel("¿No tienes una cuenta?");
		lblnoTienesUna.setBounds(29, 313, 151, 16);
		panel_inicioSesion.add(lblnoTienesUna);
		
		lblNuevoEmail = new JLabel("Nuevo email:");
		lblNuevoEmail.setBounds(51, 341, 97, 16);
		panel_inicioSesion.add(lblNuevoEmail);
		
		lblNuevaContrasea = new JLabel("Nueva contraseña:");
		lblNuevaContrasea.setBounds(29, 369, 119, 16);
		panel_inicioSesion.add(lblNuevaContrasea);
		
		lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(87, 397, 61, 16);
		panel_inicioSesion.add(lblNombre);
		
		lblApellidos = new JLabel("Apellidos:");
		lblApellidos.setBounds(77, 425, 71, 16);
		panel_inicioSesion.add(lblApellidos);
		
		txt_NuevoEmail = new JTextField();
		txt_NuevoEmail.setBounds(241, 336, 130, 26);
		panel_inicioSesion.add(txt_NuevoEmail);
		txt_NuevoEmail.setColumns(10);
		
		txt_Nuevocontrasena = new JTextField();
		txt_Nuevocontrasena.setBounds(241, 364, 130, 26);
		panel_inicioSesion.add(txt_Nuevocontrasena);
		txt_Nuevocontrasena.setColumns(10);
		
		txt_NuevoNombre = new JTextField();
		txt_NuevoNombre.setBounds(241, 392, 130, 26);
		panel_inicioSesion.add(txt_NuevoNombre);
		txt_NuevoNombre.setColumns(10);
		
		txt_Nuevoapellidos = new JTextField();
		txt_Nuevoapellidos.setBounds(241, 420, 130, 26);
		panel_inicioSesion.add(txt_Nuevoapellidos);
		txt_Nuevoapellidos.setColumns(10);
		
		btnRegistrase = new JButton("Registrase");
		btnRegistrase.addActionListener(new BtnRegistraseActionListener());
		btnRegistrase.setBounds(243, 468, 117, 29);
		panel_inicioSesion.add(btnRegistrase);
		
		btnRegistrarseConFacebook = new JButton("Registrarse con Facebook");
		btnRegistrarseConFacebook.addActionListener(new BtnRegistrarseConFacebookActionListener());
		btnRegistrarseConFacebook.setBounds(18, 468, 200, 29);
		panel_inicioSesion.add(btnRegistrarseConFacebook);
	}
	private class BtnNewButtonActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			Usuario u1=new Usuario(txt_email.getText(),txt_contrasena.getText());
			if(u1.getGestor().autenticarUsuario(u1)) {
				JOptionPane.showMessageDialog(null, "¡Bienvenido!");
				
			}
			
		}
	}
	private class BtnRegistrarseConFacebookActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			Usuario u1=new Usuario(txt_NuevoNombre.getText(),txt_Nuevoapellidos.getText(),txt_NuevoEmail.getText(),txt_Nuevocontrasena.getText());
			
			if((u1.getGestor().anadirUsuario(u1)==true)) {
				
				JOptionPane.showMessageDialog(null, "Se ha registrado correctamente con Facebook :)");
			}
				
			
		}
	}
	private class BtnRegistraseActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
Usuario u1=new Usuario(txt_NuevoNombre.getText(),txt_Nuevoapellidos.getText(),txt_NuevoEmail.getText(),txt_Nuevocontrasena.getText());
			
			if((u1.getGestor().anadirUsuario(u1)==true)) {
				
				JOptionPane.showMessageDialog(null, "Se ha registrado correctamente :)");
			}
		}
	}
}
