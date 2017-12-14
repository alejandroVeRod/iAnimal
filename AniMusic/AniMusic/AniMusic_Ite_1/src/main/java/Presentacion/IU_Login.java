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

public class IU_Login {

	private JFrame frame;
	private JPanel panel;
	private JLabel lblAnimusic;
	private JTextField txt_email;
	private JLabel lblemail;
	private JLabel lblNewLabel;
	private JTextField txt_pass;
	private JButton btnNewButton;

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
		
		btnNewButton = new JButton("Iniciar Sesion");
		btnNewButton.addActionListener(new BtnNewButtonActionListener());
		btnNewButton.setBounds(241, 223, 119, 23);
		panel.add(btnNewButton);
	}
	private class BtnNewButtonActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			Usuario user=new Usuario(txt_email.getText(),txt_pass.getText());
			System.out.print(user.getEmail());
				if(user.getGestor().AutenticarUsuario(user)==true) {
					JOptionPane.showMessageDialog(null,"¡Bienvenido! "+txt_email.getText());
				}
			
			
		}
	}
}
