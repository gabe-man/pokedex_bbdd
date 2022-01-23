package UI;

import java.awt.Color;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

import Listas.Listas;
import dao.usuariosDAO;
import models.Usuario;
public class LoginPanel {

	private JFrame frmPokedexinha;
	private JLabel lblTitulo;
	private JLabel lblUsuario;
	private JLabel lblPassword;
	private JButton btnLogin;
	private JButton btnRegistrar;
	private TextField txtPassword;
	private TextField txtUsuario;
	private Usuario user;
	private boolean existe=false;
	private usuariosDAO usuarioDAO;

	/**
	 * Create the application.
	 */
	public LoginPanel() {
		initialize();
		this.usuarioDAO = new usuariosDAO();
		this.frmPokedexinha.setVisible(true);
		configureListener();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPokedexinha = new JFrame();
		frmPokedexinha.getContentPane().setBackground(new Color(50, 205, 50));
		frmPokedexinha.getContentPane().setLayout(null);
		
		lblTitulo = new JLabel("Pok\u00E9mon Esmeralda");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblTitulo.setForeground(new Color(255, 255, 0));
		lblTitulo.setBounds(10, 33, 574, 29);
		frmPokedexinha.getContentPane().add(lblTitulo);
		
		lblUsuario = new JLabel("Usuario");
		lblUsuario.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblUsuario.setForeground(new Color(255, 255, 255));
		lblUsuario.setBounds(102, 139, 97, 14);
		frmPokedexinha.getContentPane().add(lblUsuario);
		
		lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPassword.setForeground(new Color(255, 255, 255));
		lblPassword.setBounds(102, 175, 97, 14);
		frmPokedexinha.getContentPane().add(lblPassword);
		
		btnLogin = new JButton("Login");
		btnLogin.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnLogin.setBounds(209, 234, 89, 23);
		frmPokedexinha.getContentPane().add(btnLogin);
		
		btnRegistrar = new JButton("Registrar");
		btnRegistrar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnRegistrar.setBounds(340, 234, 89, 23);
		frmPokedexinha.getContentPane().add(btnRegistrar);
		
		txtPassword = new TextField();
		txtPassword.setEchoChar('*');
		txtPassword.setBounds(205, 167, 224, 22);
		frmPokedexinha.getContentPane().add(txtPassword);
		
		txtUsuario = new TextField();
		txtUsuario.setBounds(205, 131, 224, 22);
		frmPokedexinha.getContentPane().add(txtUsuario);
		frmPokedexinha.setTitle("Pokedexinha");
		frmPokedexinha.setBounds(100, 100, 610, 358);
		frmPokedexinha.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	private void configureListener()
	{
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Usuario usuario= new Usuario(0, txtUsuario.getText(), txtPassword.getText());
				existe=usuarioDAO.login(usuario);
				if(existe)
				{
					JOptionPane.showMessageDialog(txtPassword, "Login correcto");
					frmPokedexinha.setVisible(false);
					PokedexPanel window = new PokedexPanel(txtUsuario.getText());
					
				}
				else
				{
					JOptionPane.showMessageDialog(txtPassword, "Login inorrecto");
					frmPokedexinha.setVisible(false);
					RegisterPanel window = new RegisterPanel();
				}
			}
		});
		
		txtPassword.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER)
				{
					
					Usuario usuario= new Usuario(0, txtUsuario.getText(), txtPassword.getText());
					existe=usuarioDAO.login(usuario);
					if(existe)
					{
						JOptionPane.showMessageDialog(txtPassword, "Login correcto");
						frmPokedexinha.setVisible(false);
						PokedexPanel window = new PokedexPanel(txtUsuario.getText());
						
					}
					else
					{
						JOptionPane.showMessageDialog(txtPassword, "Login inorrecto");
						frmPokedexinha.setVisible(false);
						RegisterPanel window = new RegisterPanel();
					}
				}
			}
		});
		
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmPokedexinha.setVisible(false);
				RegisterPanel window = new RegisterPanel();
			}
		});
	}
}
