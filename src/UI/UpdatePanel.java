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
import tipos.*;

import models.Usuario;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Choice;
import javax.swing.JTextArea;
import javax.swing.JComboBox;

public class UpdatePanel {

	private JFrame frmPokedexinha;
	private JLabel lblTitulo;
	private JLabel lblNombre;
	private JLabel lblAltura;
	private JButton btnActualizar;
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
	/**
	 * Create the application.
	 */
	public UpdatePanel() {
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
		
		btnActualizar = new JButton("Actualizar");
		btnActualizar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnActualizar.setBounds(267, 507, 89, 23);
		frmPokedexinha.getContentPane().add(btnActualizar);
		
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
		
		comboBoxSexo = new JComboBox(tipos.sexopokemon.values());
		comboBoxSexo.setBounds(205, 245, 224, 22);
		frmPokedexinha.getContentPane().add(comboBoxSexo);
		
		comboBoxTipo1 = new JComboBox(tipos.tipospokemon.values());
		comboBoxTipo1.setBounds(205, 283, 224, 22);
		frmPokedexinha.getContentPane().add(comboBoxTipo1);
		
		comboBoxTipo2 = new JComboBox(tipos.tipospokemon.values());
		comboBoxTipo2.setBounds(205, 318, 224, 22);
		frmPokedexinha.getContentPane().add(comboBoxTipo2);
		frmPokedexinha.setTitle("Pokedexinha");
		frmPokedexinha.setBounds(100, 100, 610, 580);
		frmPokedexinha.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	private void configureListeners()
	{
		btnActualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean existe=false;
				for (int i = 0; i < Listas.Pokedex.size(); i++) {
					if(txtNombre.getText().equals(Listas.Pokedex.get(i).getNombre()) && i!=Listas.contPokemon)
					{
						existe=true;
						JOptionPane.showMessageDialog(btnActualizar, "Este Pokemon ya existe");
						break;
					}
				}
				if(!existe)
				{
					Listas.Pokedex.get(Listas.contPokemon).setNombre(txtNombre.getText());
					Listas.Pokedex.get(Listas.contPokemon).setAltura(Double.parseDouble(txtAltura.getText()));
					Listas.Pokedex.get(Listas.contPokemon).setPeso(Double.parseDouble(txtPeso.getText()));
					Listas.Pokedex.get(Listas.contPokemon).setSexo((tipos.sexopokemon)comboBoxSexo.getSelectedItem());
					Listas.Pokedex.get(Listas.contPokemon).setTipo2((tipos.tipospokemon)comboBoxTipo2.getSelectedItem());
					Listas.Pokedex.get(Listas.contPokemon).setTipo1((tipos.tipospokemon)comboBoxTipo1.getSelectedItem());
					Listas.Pokedex.get(Listas.contPokemon).setImagen(txtURL.getText());
					Listas.Pokedex.get(Listas.contPokemon).setDescripcion(txtDescripcion.getText());
					frmPokedexinha.dispose();
				}
			}
		});
	}
}