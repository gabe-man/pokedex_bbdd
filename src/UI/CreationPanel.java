package UI;

import java.awt.Color;
import dao.*;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.TextField;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import models.*;
import tipos.*;

import models.Usuario;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.awt.Choice;
import javax.swing.JTextArea;
import javax.swing.JComboBox;

public class CreationPanel {

	private JFrame frmPokedexinha;
	private JLabel lblTitulo;
	private JLabel lblNombre;
	private JLabel lblAltura;
	private JButton btnRegistrar;
	private TextField txtAltura;
	private TextField txtNombre;
	private JLabel lblPeso;
	private TextField txtPeso;
	private JLabel lblSexo;
	private JLabel lblTipo1;
	private JLabel lblTipo2;
	private JLabel lblimagen;
	private TextField txtURL;
	private JLabel lblDescripcion;
	private JTextArea txtDescripcion;
	private JComboBox comboBoxSexo;
	private JComboBox comboBoxTipo1;
	private JComboBox comboBoxTipo2;
	private TextField txtNumero;
	private JLabel lblNumero;
	private pokemonDAO pokemonDAO;
	private ArrayList<Pokemon> listapokemon;
	/**
	 * Create the application.
	 */
	public CreationPanel(String usuario) {
		this.pokemonDAO=new pokemonDAO();
		this.listapokemon=new ArrayList<>();
		listapokemon= pokemonDAO.getAll();
		initialize();
		this.frmPokedexinha.setVisible(true);
		configureListeners(usuario);
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
		
		lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNombre.setForeground(new Color(255, 255, 255));
		lblNombre.setBounds(102, 139, 97, 14);
		frmPokedexinha.getContentPane().add(lblNombre);
		
		lblAltura = new JLabel("Altura");
		lblAltura.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblAltura.setForeground(new Color(255, 255, 255));
		lblAltura.setBounds(102, 175, 97, 14);
		frmPokedexinha.getContentPane().add(lblAltura);
		
		btnRegistrar = new JButton("Registrar");
		btnRegistrar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnRegistrar.setBounds(267, 507, 89, 23);
		frmPokedexinha.getContentPane().add(btnRegistrar);
		
		txtAltura = new TextField();
		txtAltura.setBounds(205, 167, 224, 22);
		frmPokedexinha.getContentPane().add(txtAltura);
		
		txtNombre = new TextField();
		txtNombre.setBounds(205, 131, 224, 22);
		frmPokedexinha.getContentPane().add(txtNombre);
		
		lblPeso = new JLabel("Peso");
		lblPeso.setForeground(Color.WHITE);
		lblPeso.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPeso.setBounds(102, 212, 77, 14);
		frmPokedexinha.getContentPane().add(lblPeso);
		
		txtPeso = new TextField();
		txtPeso.setBounds(205, 204, 224, 22);
		frmPokedexinha.getContentPane().add(txtPeso);
		
		lblSexo = new JLabel("Sexo");
		lblSexo.setForeground(Color.WHITE);
		lblSexo.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblSexo.setBounds(102, 247, 77, 14);
		frmPokedexinha.getContentPane().add(lblSexo);
		
		lblTipo1 = new JLabel("Tipo 1");
		lblTipo1.setForeground(Color.WHITE);
		lblTipo1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTipo1.setBounds(102, 285, 77, 14);
		frmPokedexinha.getContentPane().add(lblTipo1);
		
		lblTipo2 = new JLabel("Tipo 2");
		lblTipo2.setForeground(Color.WHITE);
		lblTipo2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTipo2.setBounds(102, 320, 77, 14);
		frmPokedexinha.getContentPane().add(lblTipo2);
		
		lblimagen = new JLabel("URL");
		lblimagen.setForeground(Color.WHITE);
		lblimagen.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblimagen.setBounds(102, 350, 77, 14);
		frmPokedexinha.getContentPane().add(lblimagen);
		
		txtURL = new TextField();
		txtURL.setBounds(205, 346, 224, 22);
		frmPokedexinha.getContentPane().add(txtURL);
		
		lblDescripcion = new JLabel("Descripci\u00F3n");
		lblDescripcion.setForeground(Color.WHITE);
		lblDescripcion.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblDescripcion.setBounds(102, 387, 97, 14);
		frmPokedexinha.getContentPane().add(lblDescripcion);
		
		txtDescripcion = new JTextArea();
		txtDescripcion.setWrapStyleWord(true);
		txtDescripcion.setLineWrap(true);
		txtDescripcion.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtDescripcion.setBounds(205, 384, 333, 112);
		frmPokedexinha.getContentPane().add(txtDescripcion);
		
		comboBoxSexo = new JComboBox(tipos.sexo.values());
		comboBoxSexo.setBounds(205, 245, 224, 22);
		frmPokedexinha.getContentPane().add(comboBoxSexo);
		
		comboBoxTipo1 = new JComboBox(tipos.tipospokemon.values());
		comboBoxTipo1.setBounds(205, 283, 224, 22);
		frmPokedexinha.getContentPane().add(comboBoxTipo1);
		
		comboBoxTipo2 = new JComboBox(tipos.tipospokemon.values());
		comboBoxTipo2.setBounds(205, 318, 224, 22);
		frmPokedexinha.getContentPane().add(comboBoxTipo2);
		
		txtNumero = new TextField();
		txtNumero.setBounds(205, 93, 224, 22);
		frmPokedexinha.getContentPane().add(txtNumero);
		
		lblNumero = new JLabel("Numero");
		lblNumero.setForeground(Color.WHITE);
		lblNumero.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNumero.setBounds(102, 101, 97, 14);
		frmPokedexinha.getContentPane().add(lblNumero);
		frmPokedexinha.setTitle("Pokedexinha");
		frmPokedexinha.setBounds(100, 100, 610, 580);
		frmPokedexinha.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	private void configureListeners(String usuario)
	{
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean existe=false;
				for (int i = 0; i < listapokemon.size(); i++) {
					if(txtNombre.getText().equals(listapokemon.get(i).getNombre()) || Integer.parseInt(txtNumero.getText())==listapokemon.get(i).getNum())
					{
						existe=true;
						JOptionPane.showMessageDialog(btnRegistrar, "Este Pokemon ya existe");
						break;
					}
				}
				if(!existe)
				{
					pokemonDAO.insert(new Pokemon(Integer.parseInt(txtNumero.getText()), txtNombre.getText(), Double.parseDouble(txtAltura.getText()), Double.parseDouble(txtPeso.getText()), String.valueOf(comboBoxTipo1.getSelectedItem()), String.valueOf(comboBoxTipo2.getSelectedItem()), String.valueOf(comboBoxSexo.getSelectedItem()), false, txtDescripcion.getText(), txtURL.getText()));
					frmPokedexinha.dispose();
					PokedexPanel window = new PokedexPanel(usuario); 
				}
			}
		});
	}
}