package zoológico;

import java.awt.EventQueue;


import javax.swing.JFrame;

import javax.swing.JScrollPane;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JButton;


import java.awt.Color;

import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;

import javax.swing.Action;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.sun.istack.internal.logging.Logger;

import java.awt.Font;

import javax.swing.BoxLayout;
import javax.swing.JPanel;

import javax.swing.JTextField;
import javax.swing.DropMode;


public class VentanaZooMamiferos {

	private JFrame frmVentanaMamiferos;
	private final Action action = new SwingAction();

	//Variables para agregar
	static JTextField txtGMamarias;
	static JTextField txtOreja;
	static JTextField txtHuesosOido;
	static JTextField txtNombre;
	static JTextField txtEdad;
	static JTextField txtPeso;
	static JTextField txtPatas;
	static JTextField txtTamaño;
	static JTextField txtMedio;
	static JTextField txtGenero;
	static JTextField txtAlimentacion;
	static JTextField txtColor;
	static JTextField txtPelo;
	static JTextField txtCantPelo;
	static JTextField txtNDientes;
	
	static ArrayList<Mamiferos> listaMamiferos = new ArrayList<Mamiferos>();
	private JTable table;
	private final Action action_1 = new SwingAction_1();
	
	//Variables para borrar
	String edad = "";
	String peso = "";
	String numeroDePatas = "";
	String nombre = " ";
	String tamaño = "";
	String medio = "";
	String genero = "";
	String alimentacion = "";
	String color = "";
	String pelo = "";
	String numeroDeDientes = "";
	String numeroDeGlandulasMamarias = "";
	String cantidadDePelo = "";
	String oreja = "";
	String huesosEnElOido = "";

	
	//Mamiferos
			Mamiferos leon = new Mamiferos(9, 190, 4, "Leon","Grande", "Terrestre", "Macho", "Carnivoro",
				"amarillo", true, 30, 0, "abundante", true, true);  
			Mamiferos canguro = new Mamiferos(10, 30, 2, "Canguro", "grande", "terrestre", "hembra", "herbivoro", 
				"gris", true, 14, 4, "moderado", true, true);
			Mamiferos espin = new Mamiferos(22, 10, 4, "Puercoespín", "pequeño", "Terrestre", "Hembra", "Herbivoro", 
						"marron", true, 36, 6, "poco", true, true);
			private final Action action_2 = new SwingAction_2();
			private final Action action_3 = new SwingAction_3();
			
		
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaZooMamiferos window = new VentanaZooMamiferos();
					window.frmVentanaMamiferos.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public VentanaZooMamiferos() {

		listaMamiferos.add(leon);
		listaMamiferos.add(canguro);
		listaMamiferos.add(espin);
		initialize();
		
		table.addMouseListener(new MouseAdapter() {
			DefaultTableModel model = new DefaultTableModel();
			
			public void mouseClicked(MouseEvent e) {
				int i = table.getSelectedRow();
				nombre = (table.getValueAt(i, 0).toString());
				edad = (table.getValueAt(i, 1).toString());
				peso = (table.getValueAt(i, 2).toString());
				numeroDePatas = (table.getValueAt(i, 3).toString());
				tamaño = (table.getValueAt(i, 4).toString());
				medio = (table.getValueAt(i, 5).toString());
				genero = (table.getValueAt(i, 6).toString());
				alimentacion = (table.getValueAt(i, 7).toString());
				color = (table.getValueAt(i, 8).toString());
				pelo = (table.getValueAt(i, 9).toString());
				numeroDeDientes = (table.getValueAt(i, 10).toString());
				numeroDeGlandulasMamarias = (table.getValueAt(i, 11).toString());
				cantidadDePelo = (table.getValueAt(i, 12).toString());
				oreja = (table.getValueAt(i, 13).toString());
				huesosEnElOido = (table.getValueAt(i, 14).toString());
				}});
		
	}
	
	//public static connection getConnection() {}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
		
		frmVentanaMamiferos = new JFrame();
		frmVentanaMamiferos.setTitle("Ventana Mamiferos");
		frmVentanaMamiferos.setBounds(100, 100, 824, 418);
		frmVentanaMamiferos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmVentanaMamiferos.getContentPane().setLayout(new BoxLayout(frmVentanaMamiferos.getContentPane(), BoxLayout.X_AXIS));
		
		JPanel panel = new JPanel();
		frmVentanaMamiferos.getContentPane().add(panel);
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 36, 446, 283);
		panel.add(scrollPane);
		
		table = new JTable();
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
			},
			new String[] {
					"Nombre", "Edad", "Peso", "# Patas", "Tamaño", "Medio", "Genero", "Alimentacion", "Color", "Pelo", "Cantidad Pelo", "# Dientes", "# Glandulas Mamarias", "Oreja", "Huesos oido"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(81);
		table.getColumnModel().getColumn(0).setMinWidth(81);
		table.getColumnModel().getColumn(1).setPreferredWidth(81);
		table.getColumnModel().getColumn(1).setMinWidth(81);
		table.getColumnModel().getColumn(2).setPreferredWidth(81);
		table.getColumnModel().getColumn(2).setMinWidth(81);
		table.getColumnModel().getColumn(3).setPreferredWidth(81);
		table.getColumnModel().getColumn(3).setMinWidth(81);
		table.getColumnModel().getColumn(4).setPreferredWidth(81);
		table.getColumnModel().getColumn(4).setMinWidth(81);
		table.getColumnModel().getColumn(5).setPreferredWidth(81);
		table.getColumnModel().getColumn(5).setMinWidth(81);
		table.getColumnModel().getColumn(6).setPreferredWidth(81);
		table.getColumnModel().getColumn(6).setMinWidth(81);
		table.getColumnModel().getColumn(7).setPreferredWidth(81);
		table.getColumnModel().getColumn(7).setMinWidth(81);
		table.getColumnModel().getColumn(8).setPreferredWidth(81);
		table.getColumnModel().getColumn(8).setMinWidth(81);
		table.getColumnModel().getColumn(9).setPreferredWidth(81);
		table.getColumnModel().getColumn(9).setMinWidth(81);
		scrollPane.setViewportView(table);
		
		JLabel Titulo = new JLabel("Mam\u00EDferos");
		Titulo.setFont(new Font("Tahoma", Font.BOLD, 17));
		Titulo.setBounds(167, 11, 95, 14);
		panel.add(Titulo);
		
		JButton agregarOtro = new JButton("Agregar");
		agregarOtro.setAction(action);
		agregarOtro.setBounds(556, 346, 155, 23);
		panel.add(agregarOtro);
		
		JLabel lblNewLabel_1_2_4_1_2 = new JLabel("Glandulas Mamarias: ");
		lblNewLabel_1_2_4_1_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_2_4_1_2.setBounds(637, 31, 74, 15);
		panel.add(lblNewLabel_1_2_4_1_2);
		
		JLabel lblNewLabel_1_2_4_1_1_1 = new JLabel("Oreja: ");
		lblNewLabel_1_2_4_1_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_2_4_1_1_1.setBounds(637, 56, 74, 15);
		panel.add(lblNewLabel_1_2_4_1_1_1);
		
		txtGMamarias = new JTextField();
		txtGMamarias.setForeground(Color.GRAY);
		txtGMamarias.setBounds(712, 28, 86, 20);
		panel.add(txtGMamarias);
		txtGMamarias.setColumns(10);
		
		txtOreja = new JTextField();
		txtOreja.setForeground(Color.GRAY);
		txtOreja.setText("String");
		txtOreja.setColumns(10);
		txtOreja.setBounds(712, 53, 86, 20);
		panel.add(txtOreja);
		
		txtHuesosOido = new JTextField();
		txtHuesosOido.setForeground(Color.GRAY);
		txtHuesosOido.setText("String");
		txtHuesosOido.setColumns(10);
		txtHuesosOido.setBounds(712, 81, 86, 20);
		panel.add(txtHuesosOido);
		
		JLabel lblNewLabel_1_2_4_1_2_6 = new JLabel("Huesos Oido: ");
		lblNewLabel_1_2_4_1_2_6.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_2_4_1_2_6.setBounds(633, 86, 74, 15);
		panel.add(lblNewLabel_1_2_4_1_2_6);
		
		JLabel lblNewLabel_1_2_4_1_2_1 = new JLabel("Nombre: ");
		lblNewLabel_1_2_4_1_2_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_2_4_1_2_1.setBounds(466, 31, 74, 15);
		panel.add(lblNewLabel_1_2_4_1_2_1);
		
		JLabel lblNewLabel_1_2_4_1_1_1_1 = new JLabel("Edad: ");
		lblNewLabel_1_2_4_1_1_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_2_4_1_1_1_1.setBounds(466, 56, 74, 15);
		panel.add(lblNewLabel_1_2_4_1_1_1_1);
		
		txtNombre = new JTextField();
		txtNombre.setDropMode(DropMode.INSERT);
		txtNombre.setForeground(Color.GRAY);
		txtNombre.setFont(new Font("Tahoma", Font.ITALIC, 10));
		txtNombre.setText("String");
		txtNombre.setColumns(10);
		txtNombre.setBounds(541, 28, 86, 20);
		panel.add(txtNombre);
		
		txtEdad = new JTextField();
		txtEdad.setDropMode(DropMode.INSERT);
		txtEdad.setForeground(Color.GRAY);
		txtEdad.setFont(new Font("Tahoma", Font.ITALIC, 10));
		txtEdad.setColumns(10);
		txtEdad.setBounds(541, 53, 86, 20);
		panel.add(txtEdad);
		
		JLabel lblNewLabel_1_2_4_1_2_2 = new JLabel("Peso: ");
		lblNewLabel_1_2_4_1_2_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_2_4_1_2_2.setBounds(466, 83, 74, 15);
		panel.add(lblNewLabel_1_2_4_1_2_2);
		
		JLabel lblNewLabel_1_2_4_1_1_1_2 = new JLabel("N\u00B0de Patas: ");
		lblNewLabel_1_2_4_1_1_1_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_2_4_1_1_1_2.setBounds(467, 111, 74, 15);
		panel.add(lblNewLabel_1_2_4_1_1_1_2);
		
		txtPeso = new JTextField();
		txtPeso.setDropMode(DropMode.INSERT);
		txtPeso.setFont(new Font("Tahoma", Font.ITALIC, 10));
		txtPeso.setForeground(Color.GRAY);
		txtPeso.setColumns(10);
		txtPeso.setBounds(541, 80, 86, 20);
		panel.add(txtPeso);
		
		txtPatas = new JTextField();
		txtPatas.setDropMode(DropMode.INSERT);
		txtPatas.setFont(new Font("Tahoma", Font.ITALIC, 10));
		txtPatas.setForeground(Color.GRAY);
		txtPatas.setColumns(10);
		txtPatas.setBounds(541, 105, 86, 20);
		panel.add(txtPatas);
		
		JLabel lblNewLabel_1_2_4_1_2_3 = new JLabel("Tama\u00F1o: ");
		lblNewLabel_1_2_4_1_2_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_2_4_1_2_3.setBounds(466, 132, 74, 15);
		panel.add(lblNewLabel_1_2_4_1_2_3);
		
		JLabel lblNewLabel_1_2_4_1_1_1_3 = new JLabel("Medio: ");
		lblNewLabel_1_2_4_1_1_1_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_2_4_1_1_1_3.setBounds(466, 157, 74, 15);
		panel.add(lblNewLabel_1_2_4_1_1_1_3);
		
		txtTamaño = new JTextField();
		txtTamaño.setDropMode(DropMode.INSERT);
		txtTamaño.setForeground(Color.GRAY);
		txtTamaño.setText("String");
		txtTamaño.setColumns(10);
		txtTamaño.setBounds(541, 129, 86, 20);
		panel.add(txtTamaño);
		
		txtMedio = new JTextField();
		txtMedio.setDropMode(DropMode.INSERT);
		txtMedio.setForeground(Color.GRAY);
		txtMedio.setText("String");
		txtMedio.setColumns(10);
		txtMedio.setBounds(541, 154, 86, 20);
		panel.add(txtMedio);
		
		JLabel lblNewLabel_1_2_4_1_2_4 = new JLabel("Genero: ");
		lblNewLabel_1_2_4_1_2_4.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_2_4_1_2_4.setBounds(466, 180, 74, 15);
		panel.add(lblNewLabel_1_2_4_1_2_4);
		
		JLabel lblNewLabel_1_2_4_1_1_1_4 = new JLabel("Alimentacion: ");
		lblNewLabel_1_2_4_1_1_1_4.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_2_4_1_1_1_4.setBounds(466, 205, 74, 15);
		panel.add(lblNewLabel_1_2_4_1_1_1_4);
		
		txtGenero = new JTextField();
		txtGenero.setDropMode(DropMode.INSERT);
		txtGenero.setForeground(Color.GRAY);
		txtGenero.setText("String");
		txtGenero.setColumns(10);
		txtGenero.setBounds(541, 177, 86, 20);
		panel.add(txtGenero);
		
		txtAlimentacion = new JTextField();
		txtAlimentacion.setDropMode(DropMode.INSERT);
		txtAlimentacion.setForeground(Color.GRAY);
		txtAlimentacion.setText("String");
		txtAlimentacion.setColumns(10);
		txtAlimentacion.setBounds(541, 202, 86, 20);
		panel.add(txtAlimentacion);
		
		JLabel lblNewLabel_1_2_4_1_2_5 = new JLabel("Color: ");
		lblNewLabel_1_2_4_1_2_5.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_2_4_1_2_5.setBounds(466, 228, 74, 15);
		panel.add(lblNewLabel_1_2_4_1_2_5);
		
		JLabel lblNewLabel_1_2_4_1_1_1_5 = new JLabel("Pelo: ");
		lblNewLabel_1_2_4_1_1_1_5.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_2_4_1_1_1_5.setBounds(466, 253, 74, 15);
		panel.add(lblNewLabel_1_2_4_1_1_1_5);
		
		txtColor = new JTextField();
		txtColor.setDropMode(DropMode.INSERT);
		txtColor.setForeground(Color.GRAY);
		txtColor.setText("String");
		txtColor.setColumns(10);
		txtColor.setBounds(541, 225, 86, 20);
		panel.add(txtColor);
		
		txtPelo = new JTextField();
		txtPelo.setDropMode(DropMode.INSERT);
		txtPelo.setForeground(Color.GRAY);
		txtPelo.setText("String");
		txtPelo.setColumns(10);
		txtPelo.setBounds(541, 250, 86, 20);
		panel.add(txtPelo);
		
		JLabel lblNewLabel_1_2_4_1_2_7 = new JLabel("Cantidad pelo: ");
		lblNewLabel_1_2_4_1_2_7.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_2_4_1_2_7.setBounds(466, 276, 74, 15);
		panel.add(lblNewLabel_1_2_4_1_2_7);
		
		JLabel lblNewLabel_1_2_4_1_1_1_7 = new JLabel("N\u00B0 dientes: ");
		lblNewLabel_1_2_4_1_1_1_7.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_2_4_1_1_1_7.setBounds(466, 301, 74, 15);
		panel.add(lblNewLabel_1_2_4_1_1_1_7);
		
		txtCantPelo = new JTextField();
		txtCantPelo.setDropMode(DropMode.INSERT);
		txtCantPelo.setForeground(Color.GRAY);
		txtCantPelo.setText("String");
		txtCantPelo.setColumns(10);
		txtCantPelo.setBounds(541, 273, 86, 20);
		panel.add(txtCantPelo);
		
		txtNDientes = new JTextField();
		txtNDientes.setDropMode(DropMode.INSERT);
		txtNDientes.setForeground(Color.GRAY);
		txtNDientes.setColumns(10);
		txtNDientes.setBounds(541, 298, 86, 20);
		panel.add(txtNDientes);
		
		JButton btnNewButton = new JButton("Mostrar Mamiferos");
		btnNewButton.setAction(action_1);
		btnNewButton.setBounds(128, 329, 144, 40);
		panel.add(btnNewButton);
		
		JButton btnEliminar = new JButton("New button");
		btnEliminar.setAction(action_2);
		btnEliminar.setBounds(300, 346, 89, 23);
		panel.add(btnEliminar);
		
		JButton btnModificar = new JButton("New button");
		btnModificar.setAction(action_3);
		btnModificar.setBounds(10, 346, 89, 23);
		panel.add(btnModificar);
		}
		
	/*
	public ArrayList<Mamiferos> consultar(){
		String query = "select * from mamiferos";
		try {
			DB.stmt = DB.conn.createStatement();
			DB.rs = DB.stmt.executeQuery(query);
			while(DB.rs.next()) {}
		} catch (SQLException ex) {
			Logger.getLogger(Mamiferos.class.getName(), null).log(Level.SEVERE,null,ex);
			// TODO: handle exception
		}
		return null;
	} */

	//table.setPreferredScrollableViewportSize(new Dimension(450, 63));

	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "Agregar mamifero");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			Mamiferos mam = new Mamiferos(Integer.parseInt(VentanaZooMamiferos.txtEdad.getText()), Integer.parseInt(VentanaZooMamiferos.txtPeso.getText()), 
					Integer.parseInt(VentanaZooMamiferos.txtPatas.getText()), VentanaZooMamiferos.txtNombre.getText(), VentanaZooMamiferos.txtTamaño.getText(), VentanaZooMamiferos.txtMedio.getText(), 
					VentanaZooMamiferos.txtGenero.getText(), VentanaZooMamiferos.txtAlimentacion.getText(), VentanaZooMamiferos.txtColor.getText(), true,
					Integer.parseInt(VentanaZooMamiferos.txtNDientes.getText()), Integer.parseInt(VentanaZooMamiferos.txtGMamarias.getText()), VentanaZooMamiferos.txtCantPelo.getText(), true, true);
			listaMamiferos.add(mam);
			
		 /*	String nombre = ""+VentanaZooMamiferos.txtNombre.getText();
		 	String edad = ""+Integer.toString(Integer.parseInt(VentanaZooMamiferos.txtEdad.getText()));
		 	String peso = ""+Integer.toString(Integer.parseInt(VentanaZooMamiferos.txtPeso.getText()));
		 	String numeroDePatas =""+Integer.toString(Integer.parseInt(VentanaZooMamiferos.txtPatas.getText()));
		 	String tamaño =""+VentanaZooMamiferos.txtTamaño.getText();
		 	String	medio =""+VentanaZooMamiferos.txtMedio.getText();
		 	String	genero =""+VentanaZooMamiferos.txtGenero.getText();
		 	String	alimentacion =""+VentanaZooMamiferos.txtAlimentacion.getText();
			String	color =""+VentanaZooMamiferos.txtColor.getText();
			String	pelo  =""+VentanaZooMamiferos.txtMedio.getText();
			String	numeroDeDientes =""+Integer.toString(Integer.parseInt(VentanaZooMamiferos.txtNDientes.getText()));
			String	nGlandulasMamarias =""+Integer.toString(Integer.parseInt(VentanaZooMamiferos.txtGMamarias.getText()));
			String	cantidadDePelo  =""+VentanaZooMamiferos.txtCantPelo.getText();
			String	oreja =""+VentanaZooMamiferos.txtMedio.getText();
			String	huesosOido =""+VentanaZooMamiferos.txtMedio.getText() ; */
			  
			mostrar();
			
		/*	DB db= DB.getInstances();
			Object[] obj = {Integer.toString(Integer.parseInt(VentanaZooMamiferos.txtEdad.getText())), Integer.toString(Integer.parseInt(VentanaZooMamiferos.txtPeso.getText())), 
					Integer.toString(Integer.parseInt(VentanaZooMamiferos.txtPatas.getText())), VentanaZooMamiferos.txtNombre.getText(), VentanaZooMamiferos.txtTamaño.getText(), VentanaZooMamiferos.txtMedio.getText(), 
					VentanaZooMamiferos.txtGenero.getText(), VentanaZooMamiferos.txtAlimentacion.getText(), VentanaZooMamiferos.txtColor.getText(),  VentanaZooMamiferos.txtMedio.getText(),
					Integer.toString(Integer.parseInt(VentanaZooMamiferos.txtNDientes.getText())), Integer.toString(Integer.parseInt(VentanaZooMamiferos.txtGMamarias.getText())), VentanaZooMamiferos.txtCantPelo.getText(), VentanaZooMamiferos.txtMedio.getText(), VentanaZooMamiferos.txtMedio.getText()};
			*/
		/*	try {
			DB.conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Zoologico", "postgres", "17camarones");
				
			DB.stmt = DB.conn.createStatement();
			
			DB.stmt.executeUpdate("INSERT INTO mamiferos(nombre, edad, peso, numeroDePatas, tamaño, medio, genero, alimentacion, color, pelo, numeroDeDientes, nGlandulasMamarias, cantidadDePelo, oreja, huesosOido) VALUES('"+nombre+"', '"+edad+"', '"+peso+"', '"+numeroDePatas+"', '"+tamaño+"', '"+medio+"', '"+genero+"', '"+alimentacion+"', '"+color+"',  '"+pelo+"', '"+numeroDeDientes+"', '"+nGlandulasMamarias+"', '"+cantidadDePelo+"', '"+oreja+"', '"+huesosOido+"' ");
			
			JOptionPane.showConfirmDialog(null, "bien"); 
			
	
		}catch (SQLException e1) {
			System.out.println(e1.getMessage());
			JOptionPane.showMessageDialog(null, "xx");
		} */
			}
		
		public void mostrar() {
			String matriz [][] = new String[listaMamiferos.size()][15];
			
			for (int i = 0; i < listaMamiferos.size(); i++) {
				
				matriz[i][0]=listaMamiferos.get(i).getNombre();
				matriz[i][1]=Integer.toString(listaMamiferos.get(i).getEdad());
				matriz[i][2]=Integer.toString(listaMamiferos.get(i).getPeso());
				matriz[i][3]=Integer.toString(listaMamiferos.get(i).getNumeroDePatas());
				matriz[i][4]=listaMamiferos.get(i).getTamaño();
				matriz[i][5]=listaMamiferos.get(i).getMedio();
				matriz[i][6]=listaMamiferos.get(i).getGenero();
				matriz[i][7]=listaMamiferos.get(i).getAlimentacion();
				matriz[i][8]=listaMamiferos.get(i).getColor();
				matriz[i][9]=listaMamiferos.get(i).getCantidadDePelo(); //pelo
				matriz[i][10]=listaMamiferos.get(i).getCantidadDePelo(); 
				matriz[i][11]=Integer.toString(listaMamiferos.get(i).getNumeroDeDientes());
				matriz[i][12]=Integer.toString(listaMamiferos.get(i).getNumeroDeGlandulasMamarias());
				matriz[i][13]=listaMamiferos.get(i).getTamaño(); //oreja
				matriz[i][14]=listaMamiferos.get(i).getTamaño();
				} 												//h. oido
			table.setModel(new DefaultTableModel(
					matriz,
					new String[] {
							"Nombre", "Edad", "Peso", "# Patas", "Tamaño", "Medio", "Genero", "Alimentacion", "Color", "Pelo", "Cantidad Pelo", "# Dientes", "# Glandulas Mamarias", "Oreja", "Huesos oido"
					}
				));
		}
	}
	private class SwingAction_1 extends AbstractAction {
		public SwingAction_1() {
			putValue(NAME, "Mostrar Mamiferos");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
String matriz [][] = new String[listaMamiferos.size()][15];
			
			for (int i = 0; i < listaMamiferos.size(); i++) {
				
				matriz[i][0]=listaMamiferos.get(i).getNombre();
				matriz[i][1]=Integer.toString(listaMamiferos.get(i).getEdad());
				matriz[i][2]=Integer.toString(listaMamiferos.get(i).getPeso());
				matriz[i][3]=Integer.toString(listaMamiferos.get(i).getNumeroDePatas());
				matriz[i][4]=listaMamiferos.get(i).getTamaño();
				matriz[i][5]=listaMamiferos.get(i).getMedio();
				matriz[i][6]=listaMamiferos.get(i).getGenero();
				matriz[i][7]=listaMamiferos.get(i).getAlimentacion();
				matriz[i][8]=listaMamiferos.get(i).getColor();
				matriz[i][9]=listaMamiferos.get(i).getCantidadDePelo(); //pelo
				matriz[i][10]=listaMamiferos.get(i).getCantidadDePelo(); 
				matriz[i][11]=Integer.toString(listaMamiferos.get(i).getNumeroDeDientes());
				matriz[i][12]=Integer.toString(listaMamiferos.get(i).getNumeroDeGlandulasMamarias());
				matriz[i][13]=listaMamiferos.get(i).getTamaño(); //oreja
				matriz[i][14]=listaMamiferos.get(i).getTamaño();
				} 												//h. oido
			table.setModel(new DefaultTableModel(
					matriz,
					new String[] {
							"Nombre", "Edad", "Peso", "# Patas", "Tamaño", "Medio", "Genero", "Alimentacion", "Color", "Pelo", "Cantidad Pelo", "# Dientes", "# Glandulas Mamarias", "Oreja", "Huesos oido"
					}
				));
		}
		
		
	}
	private class SwingAction_2 extends AbstractAction {
		public SwingAction_2() {
			putValue(NAME, "Eliminar");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {

			for (int i = 0; i< listaMamiferos.size(); i++) {
				if(nombre==listaMamiferos.get(i).getNombre()) {
					listaMamiferos.remove(i);
				}
			}
			//Actualizar (funcion mostrar)
			String matriz [][] = new String[listaMamiferos.size()][15];
			
			for (int i = 0; i < listaMamiferos.size(); i++) {
				
				matriz[i][0]=listaMamiferos.get(i).getNombre();
				matriz[i][1]=Integer.toString(listaMamiferos.get(i).getEdad());
				matriz[i][2]=Integer.toString(listaMamiferos.get(i).getPeso());
				matriz[i][3]=Integer.toString(listaMamiferos.get(i).getNumeroDePatas());
				matriz[i][4]=listaMamiferos.get(i).getTamaño();
				matriz[i][5]=listaMamiferos.get(i).getMedio();
				matriz[i][6]=listaMamiferos.get(i).getGenero();
				matriz[i][7]=listaMamiferos.get(i).getAlimentacion();
				matriz[i][8]=listaMamiferos.get(i).getColor();
				matriz[i][9]=listaMamiferos.get(i).getCantidadDePelo(); //pelo
				matriz[i][10]=listaMamiferos.get(i).getCantidadDePelo(); 
				matriz[i][11]=Integer.toString(listaMamiferos.get(i).getNumeroDeDientes());
				matriz[i][12]=Integer.toString(listaMamiferos.get(i).getNumeroDeGlandulasMamarias());
				matriz[i][13]=listaMamiferos.get(i).getTamaño(); //oreja
				matriz[i][14]=listaMamiferos.get(i).getTamaño();
				} 												//h. oido
			table.setModel(new DefaultTableModel(
					matriz,
					new String[] {
						"Nombre", "Edad", "Peso", "# Patas", "Tamaño", "Medio", "Genero", "Alimentacion", "Color", "Pelo", "Cantidad Pelo", "# Dientes", "# Glandulas Mamarias", "Oreja", "Huesos oido"
					}
				));
		}
		
	}
	private class SwingAction_3 extends AbstractAction {
		public SwingAction_3() {
			putValue(NAME, "Modificar");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			//Modificar elemento del arraylist
		}
	}
	}



