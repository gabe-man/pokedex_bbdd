package UI;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.TextField;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import Listas.*;
import models.*;

import models.Usuario;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class RegisterPanel {

	private JFrame frmPokedexinha;
	private JLabel lblTitulo;
	private JLabel lblUsuario;
	private JLabel lblPassword;
	private JButton btnRegistrar;
	private TextField txtPassword;
	private TextField txtUsuario;
	private Usuario user;
	private JLabel lblConfirmPass;
	private TextField txtConfirmPass;
	private boolean existe=false;
	/**
	 * Create the application.
	 */
	public RegisterPanel() {
		initialize();
		this.frmPokedexinha.setVisible(true);
		configureListeners();
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
		
		btnRegistrar = new JButton("Registrar");
		btnRegistrar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnRegistrar.setBounds(264, 255, 89, 23);
		frmPokedexinha.getContentPane().add(btnRegistrar);
		
		txtPassword = new TextField();
		txtPassword.setEchoChar('*');
		txtPassword.setBounds(205, 167, 224, 22);
		frmPokedexinha.getContentPane().add(txtPassword);
		
		txtUsuario = new TextField();
		txtUsuario.setBounds(205, 131, 224, 22);
		frmPokedexinha.getContentPane().add(txtUsuario);
		
		lblConfirmPass = new JLabel("Confirmar Password");
		lblConfirmPass.setForeground(Color.WHITE);
		lblConfirmPass.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblConfirmPass.setBounds(27, 212, 152, 14);
		frmPokedexinha.getContentPane().add(lblConfirmPass);
		
		txtConfirmPass = new TextField();
		txtConfirmPass.setEchoChar('*');
		txtConfirmPass.setBounds(205, 204, 224, 22);
		frmPokedexinha.getContentPane().add(txtConfirmPass);
		frmPokedexinha.setTitle("Pokedexinha");
		frmPokedexinha.setBounds(100, 100, 610, 358);
		frmPokedexinha.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	private void configureListeners()
	{
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtPassword.getText().equals(txtConfirmPass.getText()))
				{
					user=new Usuario(txtUsuario.getText(), txtPassword.getText());
					for (int i = 0; i < Listas.Usuarios.size(); i++) {
						if(Listas.Usuarios.get(i).getUsuario().equals(txtUsuario.getText()))
						{
							existe = true;
							break;
						}
						else
						{
							existe=false;
						}
					}
					if(!existe)
					{
						Listas.Usuarios.add(user);
						JOptionPane.showMessageDialog(btnRegistrar, "Registro correcto");
						frmPokedexinha.setVisible(false);
						LoginPanel window=new LoginPanel();
					}
					else
					{
						JOptionPane.showMessageDialog(btnRegistrar, "Este usuario ya existe");
					}
				}
				else
				{
					JOptionPane.showMessageDialog(btnRegistrar, "Las contraseñas no coinciden");
				}
			}
		});
		
		txtConfirmPass.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER)
				{
					if(txtPassword.getText().equals(txtConfirmPass.getText()))
					{
						user=new Usuario(txtUsuario.getText(), txtPassword.getText());
						for (int i = 0; i < Listas.Usuarios.size(); i++) {
							if(Listas.Usuarios.get(i).getUsuario().equals(txtUsuario.getText()))
							{
								existe = true;
								break;
							}
							else
							{
								existe=false;
							}
						}
						if(!existe)
						{
							Listas.Usuarios.add(user);
							JOptionPane.showMessageDialog(txtConfirmPass, "Registro correcto");
							frmPokedexinha.setVisible(false);
							LoginPanel window=new LoginPanel();
						}
						else
						{
							JOptionPane.showMessageDialog(txtConfirmPass, "Este usuario ya existe");
						}
					}
					else
					{
						JOptionPane.showMessageDialog(txtConfirmPass, "Las contraseñas no coinciden");
					}
				}
			}
		});
	}
}
