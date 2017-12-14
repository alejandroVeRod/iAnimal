package Presentacion;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class IU_Registro extends JPanel {
	private JLabel lblEmail;
	private JLabel lblContrasea;
	private JLabel lblNombre;
	private JLabel lblApellidos;
	private JTextField txt_nuevoEmail;
	private JTextField txt_nuevoPassword;
	private JTextField txt_nuevoNombre;
	private JTextField txt_nuevoApellidos;

	/**
	 * Create the panel.
	 */
	public IU_Registro() {
		setLayout(null);
		
		lblEmail = new JLabel("email:");
		lblEmail.setBounds(45, 11, 46, 14);
		add(lblEmail);
		
		lblContrasea = new JLabel("contrase\u00F1a:");
		lblContrasea.setBounds(20, 45, 71, 14);
		add(lblContrasea);
		
		lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(234, 11, 46, 14);
		add(lblNombre);
		
		lblApellidos = new JLabel("Apellidos:");
		lblApellidos.setBounds(234, 45, 46, 14);
		add(lblApellidos);
		
		txt_nuevoEmail = new JTextField();
		txt_nuevoEmail.setBounds(96, 8, 86, 20);
		add(txt_nuevoEmail);
		txt_nuevoEmail.setColumns(10);
		
		txt_nuevoPassword = new JTextField();
		txt_nuevoPassword.setBounds(96, 42, 86, 20);
		add(txt_nuevoPassword);
		txt_nuevoPassword.setColumns(10);
		
		txt_nuevoNombre = new JTextField();
		txt_nuevoNombre.setBounds(289, 8, 86, 20);
		add(txt_nuevoNombre);
		txt_nuevoNombre.setColumns(10);
		
		txt_nuevoApellidos = new JTextField();
		txt_nuevoApellidos.setBounds(290, 42, 86, 20);
		add(txt_nuevoApellidos);
		txt_nuevoApellidos.setColumns(10);

	}

	public JTextField getTxt_nuevoEmail() {
		return txt_nuevoEmail;
	}

	public void setTxt_nuevoEmail(JTextField txt_nuevoEmail) {
		this.txt_nuevoEmail = txt_nuevoEmail;
	}

	public JTextField getTxt_nuevoPassword() {
		return txt_nuevoPassword;
	}

	public void setTxt_nuevoPassword(JTextField txt_nuevoPassword) {
		this.txt_nuevoPassword = txt_nuevoPassword;
	}

	public JTextField getTxt_nuevoNombre() {
		return txt_nuevoNombre;
	}

	public void setTxt_nuevoNombre(JTextField txt_nuevoNombre) {
		this.txt_nuevoNombre = txt_nuevoNombre;
	}

	public JTextField getTxt_nuevoApellidos() {
		return txt_nuevoApellidos;
	}

	public void setTxt_nuevoApellidos(JTextField txt_nuevoApellidos) {
		this.txt_nuevoApellidos = txt_nuevoApellidos;
	}

}
