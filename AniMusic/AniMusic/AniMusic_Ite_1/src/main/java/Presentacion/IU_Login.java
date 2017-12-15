package Presentacion;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.HeadlessException;

import javax.swing.JTextField;
import javax.swing.SwingConstants;

import Dominio.Usuario;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class IU_Login {

	private JFrame frame;
	private JPanel panel;
	private JLabel lblAnimusic;
	private JTextField txt_email;
	private JLabel lblemail;
	private JLabel lblNewLabel;
	private JTextField txt_pass;
	private JButton btn_IniciarSesion;
	private JButton btn_Registrarse;
	private JLabel lblnoTienesCuenta;
	private JPanel pnl_nuevoUsuario;
	private JLabel lblNewLabel_1;
	private JLabel label;
	private JLabel lblNombre;
	private JLabel lblApellidos;
	private JTextField txt_nuevoEmail;
	private JTextField txt_nuevoPassword;
	private JTextField txt_nuevoNombre;
	private JTextField txt_nuevoApellido;

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
		frame.setBounds(100, 100, 434, 596);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		lblAnimusic = new JLabel("AniMusic");
		lblAnimusic.setFont(new Font("Calibri", Font.PLAIN, 31));
		lblAnimusic.setBounds(29, 45, 178, 75);
		panel.add(lblAnimusic);
		
		txt_email = new JTextField();
		txt_email.setBounds(102, 203, 86, 20);
		panel.add(txt_email);
		txt_email.setColumns(10);
		
		lblemail = new JLabel("email");
		lblemail.setHorizontalAlignment(SwingConstants.RIGHT);
		lblemail.setBounds(46, 206, 46, 14);
		panel.add(lblemail);
		
		lblNewLabel = new JLabel("Contrase\u00F1a");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setBounds(29, 253, 63, 14);
		panel.add(lblNewLabel);
		
		txt_pass = new JTextField();
		txt_pass.setBounds(102, 250, 86, 20);
		panel.add(txt_pass);
		txt_pass.setColumns(10);
		
		btn_IniciarSesion = new JButton("Iniciar Sesion");
		btn_IniciarSesion.addActionListener(new BtnNewButtonActionListener());
		btn_IniciarSesion.setBounds(241, 223, 119, 23);
		panel.add(btn_IniciarSesion);
		
		btn_Registrarse = new JButton("Registrarse");
		btn_Registrarse.addActionListener(new BtnNewButton_1ActionListener());
		btn_Registrarse.setBounds(102, 340, 89, 23);
		panel.add(btn_Registrarse);
		
		lblnoTienesCuenta = new JLabel("\u00BFNo tienes cuenta?");
		lblnoTienesCuenta.setBounds(78, 315, 110, 14);
		panel.add(lblnoTienesCuenta);
		
		lblNewLabel_1 = new JLabel("Nueva Contrase\u00F1a:");
		lblNewLabel_1.setBounds(10, 420, 94, 14);
		panel.add(lblNewLabel_1);
		
		label = new JLabel("Nuevo email:");
		label.setBounds(41, 395, 63, 14);
		panel.add(label);
		
		lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(230, 395, 46, 14);
		panel.add(lblNombre);
		
		lblApellidos = new JLabel("Apellidos:");
		lblApellidos.setBounds(230, 420, 46, 14);
		panel.add(lblApellidos);
		
		txt_nuevoEmail = new JTextField();
		txt_nuevoEmail.setBounds(121, 392, 86, 20);
		panel.add(txt_nuevoEmail);
		txt_nuevoEmail.setColumns(10);
		
		txt_nuevoPassword = new JTextField();
		txt_nuevoPassword.setBounds(121, 417, 86, 20);
		panel.add(txt_nuevoPassword);
		txt_nuevoPassword.setColumns(10);
		
		txt_nuevoNombre = new JTextField();
		txt_nuevoNombre.setBounds(286, 392, 86, 20);
		panel.add(txt_nuevoNombre);
		txt_nuevoNombre.setColumns(10);
		
		txt_nuevoApellido = new JTextField();
		txt_nuevoApellido.setBounds(286, 417, 86, 20);
		panel.add(txt_nuevoApellido);
		txt_nuevoApellido.setColumns(10);
	}
	private class BtnNewButtonActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			Usuario user=new Usuario(txt_email.getText(),txt_pass.getText());
			
				if((user.getGestor().AutenticarUsuario(user))==true) {
					JOptionPane.showMessageDialog(null,"¡Bienvenido! "+txt_email.getText());
				}
			
			
		}
	}
	private class BtnNewButton_1ActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			Usuario user=new Usuario(txt_nuevoEmail.getText(),txt_nuevoPassword.getText(),txt_nuevoNombre.getText(),txt_nuevoApellido.getText());
			user.getGestor().AñadirUsuario(user);
		}
	}
}
