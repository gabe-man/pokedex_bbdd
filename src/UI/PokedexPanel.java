package UI;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.TextField;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import models.Usuario;
import models.Pokemon;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import javax.swing.JTextPane;
import java.awt.TextArea;
import javax.swing.JTextArea;
import dao.pokemonDAO;

public class PokedexPanel {

	private JFrame frmPokedexinha;
	private JLabel lblTitulo;
	private JLabel lblConfirmPass;
	private TextField txtConfirmPass;
	private JLabel lblNumyNombre;
	private JButton btnPrevio;
	private JButton btnSiguiente;
	private JLabel lbllblaltura;
	private JLabel lblaltura;
	private JLabel lbllblpeso;
	private JLabel lblpeso;
	private JLabel lbllblsexo;
	private JLabel lbllbltipo1;
	private JLabel lblsexo;
	private JLabel lbltipo1;
	private JLabel lbllbltipo2;
	private JLabel lbltipo2;
	private JLabel lblpokedexde;
	private JTextArea txtDescripcion;
	private JButton btnCrear;
	private JButton btnEliminar;
	private JButton btnActualizar;
	private JLabel lblImagen;
	private pokemonDAO pokemonDAO;
	private ArrayList<Pokemon> listapokemon;
	private int indice;
	

	/**
	 * Create the application.
	 */
	public PokedexPanel(String usuario) {
		this.pokemonDAO=new pokemonDAO();
		this.listapokemon= new ArrayList<>();
		indice = 0;
		this.listapokemon = pokemonDAO.getAll();
		initialize(usuario);
		this.frmPokedexinha.setVisible(true);
		configureListeners(usuario);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(String usuario) {
		frmPokedexinha = new JFrame();
		frmPokedexinha.getContentPane().setBackground(new Color(50, 205, 50));
		frmPokedexinha.getContentPane().setLayout(null);
		
		lblTitulo = new JLabel("Pok\u00E9mon Esmeralda");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblTitulo.setForeground(new Color(255, 255, 0));
		lblTitulo.setBounds(10, 33, 574, 29);
		frmPokedexinha.getContentPane().add(lblTitulo);
		
		lblNumyNombre = new JLabel();
		lblNumyNombre.setText(String.valueOf(listapokemon.get(indice).getNum())+" "+listapokemon.get(indice).getNombre());
		lblNumyNombre.setForeground(Color.WHITE);
		lblNumyNombre.setHorizontalAlignment(SwingConstants.CENTER);
		lblNumyNombre.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNumyNombre.setBounds(10, 99, 574, 29);
		frmPokedexinha.getContentPane().add(lblNumyNombre);
		
		btnPrevio = new JButton("<");
		btnPrevio.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnPrevio.setBounds(10, 266, 60, 23);
		frmPokedexinha.getContentPane().add(btnPrevio);
		
		btnSiguiente = new JButton(">");
		btnSiguiente.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnSiguiente.setBounds(539, 266, 60, 23);
		frmPokedexinha.getContentPane().add(btnSiguiente);
		
		lbllblaltura = new JLabel("Altura");
		lbllblaltura.setHorizontalAlignment(SwingConstants.CENTER);
		lbllblaltura.setForeground(Color.WHITE);
		lbllblaltura.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbllblaltura.setBounds(293, 163, 77, 14);
		frmPokedexinha.getContentPane().add(lbllblaltura);
		
		lblaltura = new JLabel();
		lblaltura.setText(String.valueOf(listapokemon.get(indice).getAltura())+" m");
		lblaltura.setHorizontalAlignment(SwingConstants.CENTER);
		lblaltura.setForeground(new Color(0, 0, 0));
		lblaltura.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblaltura.setBounds(293, 188, 77, 14);
		frmPokedexinha.getContentPane().add(lblaltura);
		
		lbllblpeso = new JLabel("Peso");
		lbllblpeso.setHorizontalAlignment(SwingConstants.CENTER);
		lbllblpeso.setForeground(Color.WHITE);
		lbllblpeso.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbllblpeso.setBounds(293, 252, 77, 14);
		frmPokedexinha.getContentPane().add(lbllblpeso);
		
		lblpeso = new JLabel();
		lblpeso.setText(String.valueOf(listapokemon.get(indice).getPeso()+" Kg"));
		lblpeso.setHorizontalAlignment(SwingConstants.CENTER);
		lblpeso.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblpeso.setBounds(293, 277, 77, 14);
		frmPokedexinha.getContentPane().add(lblpeso);
		
		lbllblsexo = new JLabel("Sexo");
		lbllblsexo.setForeground(Color.WHITE);
		lbllblsexo.setHorizontalAlignment(SwingConstants.CENTER);
		lbllblsexo.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbllblsexo.setBounds(293, 326, 77, 14);
		frmPokedexinha.getContentPane().add(lbllblsexo);
		
		lbllbltipo1 = new JLabel("Tipo 1");
		lbllbltipo1.setHorizontalAlignment(SwingConstants.CENTER);
		lbllbltipo1.setForeground(Color.WHITE);
		lbllbltipo1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbllbltipo1.setBounds(423, 163, 77, 14);
		frmPokedexinha.getContentPane().add(lbllbltipo1);
		
		lblsexo = new JLabel();
		lblsexo.setText(listapokemon.get(indice).getSexo());
		lblsexo.setHorizontalAlignment(SwingConstants.CENTER);
		lblsexo.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblsexo.setBounds(293, 351, 77, 14);
		frmPokedexinha.getContentPane().add(lblsexo);
		
		lbltipo1 = new JLabel();
		lbltipo1.setText(listapokemon.get(indice).getTipo1());
		lbltipo1.setHorizontalAlignment(SwingConstants.CENTER);
		lbltipo1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lbltipo1.setBounds(423, 188, 77, 14);
		frmPokedexinha.getContentPane().add(lbltipo1);
		
		lbllbltipo2 = new JLabel("Tipo 2");
		lbllbltipo2.setHorizontalAlignment(SwingConstants.CENTER);
		lbllbltipo2.setForeground(Color.WHITE);
		lbllbltipo2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbllbltipo2.setBounds(423, 252, 77, 14);
		frmPokedexinha.getContentPane().add(lbllbltipo2);
		
		lbltipo2 = new JLabel();
		lbltipo2.setText(listapokemon.get(indice).getTipo2());
		lbltipo2.setHorizontalAlignment(SwingConstants.CENTER);
		lbltipo2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lbltipo2.setBounds(423, 275, 77, 14);
		frmPokedexinha.getContentPane().add(lbltipo2);
		
		lblpokedexde = new JLabel("Pokedex de "+ usuario);
		lblpokedexde.setForeground(Color.YELLOW);
		lblpokedexde.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblpokedexde.setBounds(10, 582, 574, 21);
		frmPokedexinha.getContentPane().add(lblpokedexde);
		
		txtDescripcion = new JTextArea();
		txtDescripcion.setWrapStyleWord(true);
		txtDescripcion.setText(listapokemon.get(indice).getDescripcion());
		txtDescripcion.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtDescripcion.setLineWrap(true);
		txtDescripcion.setBounds(10, 393, 574, 119);
		frmPokedexinha.getContentPane().add(txtDescripcion);
		
		btnCrear = new JButton("Crear");
		btnCrear.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnCrear.setBounds(10, 548, 89, 23);
		frmPokedexinha.getContentPane().add(btnCrear);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnEliminar.setBounds(495, 548, 89, 23);
		frmPokedexinha.getContentPane().add(btnEliminar);
		
		btnActualizar = new JButton("Actualizar");
		btnActualizar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnActualizar.setBounds(248, 548, 108, 23);
		frmPokedexinha.getContentPane().add(btnActualizar);
		
		lblImagen = new JLabel();
		lblImagen.setIcon(new ImageIcon(listapokemon.get(indice).getImagen()));
		lblImagen.setBounds(73, 139, 234, 243);
		frmPokedexinha.getContentPane().add(lblImagen);
		frmPokedexinha.setTitle("Pokedexinha");
		frmPokedexinha.setBounds(100, 100, 629, 653);
		frmPokedexinha.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	private void configureListeners(String usuario)
	{
		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(indice!=(listapokemon.size()-1))
				{
					indice++;
					lblNumyNombre.setText(String.valueOf(listapokemon.get(indice).getNum())+" "+listapokemon.get(indice).getNombre());
					lblaltura.setText(String.valueOf(listapokemon.get(indice).getAltura())+" m");
					lblpeso.setText(String.valueOf(listapokemon.get(indice).getPeso())+" Kg");
					lblsexo.setText(listapokemon.get(indice).getSexo());
					lbltipo1.setText(listapokemon.get(indice).getTipo1());
					lbltipo2.setText(listapokemon.get(indice).getTipo2());
					txtDescripcion.setText(listapokemon.get(indice).getDescripcion());
					lblImagen.setIcon(new ImageIcon(listapokemon.get(indice).getImagen()));
				}
			}
		});
		
		btnPrevio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(indice!=0)
				{
					indice--;
					lblNumyNombre.setText(String.valueOf(listapokemon.get(indice).getNum())+" "+listapokemon.get(indice).getNombre());
					lblaltura.setText(String.valueOf(listapokemon.get(indice).getAltura())+" m");
					lblpeso.setText(String.valueOf(listapokemon.get(indice).getPeso())+" Kg");
					lblsexo.setText(listapokemon.get(indice).getSexo());
					lbltipo1.setText(listapokemon.get(indice).getTipo1());
					lbltipo2.setText(listapokemon.get(indice).getTipo2());
					txtDescripcion.setText(listapokemon.get(indice).getDescripcion());
					lblImagen.setIcon(new ImageIcon(listapokemon.get(indice).getImagen()));
				}
			}
		});
		
		btnCrear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmPokedexinha.dispose();
				CreationPanel window=new CreationPanel(usuario);
			}
		});

		btnActualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmPokedexinha.dispose();
				UpdatePanel window=new UpdatePanel(usuario, listapokemon.get(indice));
			}
		});

		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pokemonDAO.delete(listapokemon.get(indice));
				listapokemon.remove(indice);
			}
		});
	}
}
