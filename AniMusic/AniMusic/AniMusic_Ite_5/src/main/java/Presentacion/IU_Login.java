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
import java.awt.CardLayout;


public class IU_Login {

	private JFrame frame;
	private JPanel pnl_login;
	private JLabel lblAnimusic;
	private JTextField txt_email;
	private JLabel lblemail;
	private JLabel lblNewLabel;
	private JTextField txt_pass;
	private JButton btn_IniciarSesion;
	private JButton btn_Registrarse;
	private JLabel lblnoTienesCuenta;
	private JLabel lblNewLabel_1;
	private JLabel label;
	private JLabel lblNombre;
	private JLabel lblApellidos;
	private JTextField txt_nuevoEmail;
	private JTextField txt_nuevoPassword;
	private JTextField txt_nuevoNombre;
	private JTextField txt_nuevoApellido;
	private JButton btnNewButton;
	private JButton btnNewButton_1;

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
	
	public JFrame getFrame() {
		return this.frame;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 434, 596);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		pnl_login = new JPanel();
		frame.getContentPane().add(pnl_login, "name_62472250549592");
		pnl_login.setLayout(null);
		
		lblAnimusic = new JLabel("AniMusic");
		lblAnimusic.setFont(new Font("Calibri", Font.PLAIN, 31));
		lblAnimusic.setBounds(29, 45, 178, 75);
		pnl_login.add(lblAnimusic);
		
		txt_email = new JTextField();
		txt_email.setBounds(102, 203, 86, 20);
		pnl_login.add(txt_email);
		txt_email.setColumns(10);
		
		lblemail = new JLabel("email");
		lblemail.setHorizontalAlignment(SwingConstants.RIGHT);
		lblemail.setBounds(29, 206, 63, 14);
		pnl_login.add(lblemail);
		
		lblNewLabel = new JLabel("Contrase\u00F1a");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setBounds(10, 253, 82, 14);
		pnl_login.add(lblNewLabel);
		
		txt_pass = new JTextField();
		txt_pass.setBounds(102, 250, 86, 20);
		pnl_login.add(txt_pass);
		txt_pass.setColumns(10);
		
		btn_IniciarSesion = new JButton("Iniciar Sesion");
		btn_IniciarSesion.addActionListener(new BtnNewButtonActionListener());
		btn_IniciarSesion.setBounds(241, 223, 119, 23);
		pnl_login.add(btn_IniciarSesion);
		
		btn_Registrarse = new JButton("Registrarse");
		btn_Registrarse.addActionListener(new BtnNewButton_1ActionListener());
		btn_Registrarse.setBounds(88, 341, 105, 23);
		pnl_login.add(btn_Registrarse);
		
		lblnoTienesCuenta = new JLabel("\u00BFNo tienes cuenta?");
		lblnoTienesCuenta.setBounds(78, 315, 178, 14);
		pnl_login.add(lblnoTienesCuenta);
		
		lblNewLabel_1 = new JLabel("Nueva Contrase\u00F1a:");
		lblNewLabel_1.setBounds(10, 420, 112, 14);
		pnl_login.add(lblNewLabel_1);
		
		label = new JLabel("Nuevo email:");
		label.setBounds(10, 395, 94, 14);
		pnl_login.add(label);
		
		lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(230, 395, 46, 14);
		pnl_login.add(lblNombre);
		
		lblApellidos = new JLabel("Apellidos:");
		lblApellidos.setBounds(230, 420, 46, 14);
		pnl_login.add(lblApellidos);
		
		txt_nuevoEmail = new JTextField();
		txt_nuevoEmail.setBounds(121, 392, 86, 20);
		pnl_login.add(txt_nuevoEmail);
		txt_nuevoEmail.setColumns(10);
		
		txt_nuevoPassword = new JTextField();
		txt_nuevoPassword.setBounds(121, 417, 86, 20);
		pnl_login.add(txt_nuevoPassword);
		txt_nuevoPassword.setColumns(10);
		
		txt_nuevoNombre = new JTextField();
		txt_nuevoNombre.setBounds(286, 392, 86, 20);
		pnl_login.add(txt_nuevoNombre);
		txt_nuevoNombre.setColumns(10);
		
		txt_nuevoApellido = new JTextField();
		txt_nuevoApellido.setBounds(286, 417, 86, 20);
		pnl_login.add(txt_nuevoApellido);
		txt_nuevoApellido.setColumns(10);
		
		btnNewButton = new JButton("New button");
		btnNewButton.setBounds(10, 326, 27, -15);
		pnl_login.add(btnNewButton);
		
		btnNewButton_1 = new JButton("Registrarse con Facebook");
		btnNewButton_1.setBounds(78, 490, 188, 29);
		pnl_login.add(btnNewButton_1);
	}
	private class BtnNewButtonActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			Usuario user=new Usuario(txt_email.getText(),txt_pass.getText());
			
				if((user.getGestor().autenticarUsuario(user))) {
					JOptionPane.showMessageDialog(null,"¡Bienvenido! "+txt_email.getText());
				}
			
			
		}
	}
	private class BtnNewButton_1ActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			Usuario user=new Usuario(txt_nuevoEmail.getText(),txt_nuevoPassword.getText(),txt_nuevoNombre.getText(),txt_nuevoApellido.getText());
			if(user.getGestor().anadirUsuario(user)) {
				JOptionPane.showMessageDialog(null,"Enhorabuena, te has registrado con Ã©xito "+txt_email.getText());
			}
		}
	}
}
