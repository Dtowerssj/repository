package zoológico;

import java.awt.EventQueue;


import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.border.LineBorder;

import jdk.nashorn.internal.runtime.ListAdapter;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.AbstractListModel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.Action;
import javax.swing.JTextPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.Font;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JTextField;
import javax.swing.DropMode;

public class VentanaZooPeces {

	private JFrame frmVentanaMamiferos;
	private final Action action = new SwingAction(); 
	static JTextField txtCartilaginoso;
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
	static JTextField txtAletas;
	static JTextField txtBranquias;
	ArrayList<Peces> listaPeces = new ArrayList<Peces>();
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
		String numeroDeAletas = "";
		String numeroDeBranquias = "";
		String cartilaginoso = "";
		String oseo = "";
		String escamas = "";
		
	
	
	//Peces
			Peces tiburon = new Peces(25, 1005, 0, "Tiburon", "Grande", "acuatico", "hembra", "carnivoro", 
					"gris con blanco", false, 8, 5, true, false, true);
			Peces bagre = new Peces(40, 1, 0, "Bagre", "pequeño", "acuatico y terrestre", "macho", 
					"omnivoro", "gris oscuro", false, 7, 6, false, true, false);
			Peces globo = new Peces(6, 300, 0, "Pez Globo", "pequeño", "acuatico", "macho", "omnivoro", 
					"marron amarillento", false, 4, 8, false, true, false);
			private JTextField textOseo;
			private JTextField textEscamas;
			private final Action action_2 = new SwingAction_2();
			
			
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		  
	
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaZooPeces window = new VentanaZooPeces();
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
	public VentanaZooPeces() {
		listaPeces.add(tiburon);
		 listaPeces.add(bagre);
		 listaPeces.add(globo);
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
				numeroDeAletas = (table.getValueAt(i, 10).toString());
				numeroDeBranquias = (table.getValueAt(i, 11).toString());
				cartilaginoso = (table.getValueAt(i, 12).toString());
				oseo = (table.getValueAt(i, 13).toString());
				escamas = (table.getValueAt(i, 14).toString());
			}	
		});
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
		
		frmVentanaMamiferos = new JFrame();
		frmVentanaMamiferos.setTitle("Ventana Peces");
		frmVentanaMamiferos.setBounds(100, 100, 824, 418);
		frmVentanaMamiferos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmVentanaMamiferos.getContentPane().setLayout(new BoxLayout(frmVentanaMamiferos.getContentPane(), BoxLayout.X_AXIS));
		
		JPanel panel = new JPanel();
		frmVentanaMamiferos.getContentPane().add(panel);
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 35, 422, 283);
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
					"Nombre", "Edad", "Peso", "# Patas", "Tamaño", "Medio", "Genero", "Alimentacion", "Color", "Pelo", "# Aletas", "# Branquias", "Cartilaginoso", "Oseo", "Escamas"
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
		
		JLabel Titulo = new JLabel("Peces");
		Titulo.setFont(new Font("Tahoma", Font.BOLD, 17));
		Titulo.setBounds(179, 10, 49, 14);
		panel.add(Titulo);
		
		JButton agregarOtro = new JButton("Agregar");
		agregarOtro.setAction(action);
		agregarOtro.setBounds(522, 346, 155, 23);
		panel.add(agregarOtro);
		
		JLabel lblNewLabel_1_2_4_1_2 = new JLabel("Cartilaginoso: ");
		lblNewLabel_1_2_4_1_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_2_4_1_2.setBounds(619, 31, 74, 15);
		panel.add(lblNewLabel_1_2_4_1_2);
		
		txtCartilaginoso = new JTextField();
		txtCartilaginoso.setForeground(Color.GRAY);
		txtCartilaginoso.setText("String");
		txtCartilaginoso.setBounds(694, 28, 86, 20);
		panel.add(txtCartilaginoso);
		txtCartilaginoso.setColumns(10);
		
		JLabel lblNewLabel_1_2_4_1_2_1 = new JLabel("Nombre: ");
		lblNewLabel_1_2_4_1_2_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_2_4_1_2_1.setBounds(448, 31, 74, 15);
		panel.add(lblNewLabel_1_2_4_1_2_1);
		
		JLabel lblNewLabel_1_2_4_1_1_1_1 = new JLabel("Edad: ");
		lblNewLabel_1_2_4_1_1_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_2_4_1_1_1_1.setBounds(448, 56, 74, 15);
		panel.add(lblNewLabel_1_2_4_1_1_1_1);
		
		txtNombre = new JTextField();
		txtNombre.setDropMode(DropMode.INSERT);
		txtNombre.setForeground(Color.GRAY);
		txtNombre.setFont(new Font("Tahoma", Font.ITALIC, 10));
		txtNombre.setText("String");
		txtNombre.setColumns(10);
		txtNombre.setBounds(523, 28, 86, 20);
		panel.add(txtNombre);
		
		txtEdad = new JTextField();
		txtEdad.setDropMode(DropMode.INSERT);
		txtEdad.setForeground(Color.GRAY);
		txtEdad.setFont(new Font("Tahoma", Font.ITALIC, 10));
		txtEdad.setText("Int");
		txtEdad.setColumns(10);
		txtEdad.setBounds(523, 53, 86, 20);
		panel.add(txtEdad);
		
		JLabel lblNewLabel_1_2_4_1_2_2 = new JLabel("Peso: ");
		lblNewLabel_1_2_4_1_2_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_2_4_1_2_2.setBounds(448, 83, 74, 15);
		panel.add(lblNewLabel_1_2_4_1_2_2);
		
		JLabel lblNewLabel_1_2_4_1_1_1_2 = new JLabel("N\u00B0de Patas: ");
		lblNewLabel_1_2_4_1_1_1_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_2_4_1_1_1_2.setBounds(449, 111, 74, 15);
		panel.add(lblNewLabel_1_2_4_1_1_1_2);
		
		txtPeso = new JTextField();
		txtPeso.setDropMode(DropMode.INSERT);
		txtPeso.setText("Int");
		txtPeso.setFont(new Font("Tahoma", Font.ITALIC, 10));
		txtPeso.setForeground(Color.GRAY);
		txtPeso.setColumns(10);
		txtPeso.setBounds(523, 80, 86, 20);
		panel.add(txtPeso);
		
		txtPatas = new JTextField();
		txtPatas.setDropMode(DropMode.INSERT);
		txtPatas.setText("Int");
		txtPatas.setFont(new Font("Tahoma", Font.ITALIC, 10));
		txtPatas.setForeground(Color.GRAY);
		txtPatas.setColumns(10);
		txtPatas.setBounds(523, 105, 86, 20);
		panel.add(txtPatas);
		
		JLabel lblNewLabel_1_2_4_1_2_3 = new JLabel("Tama\u00F1o: ");
		lblNewLabel_1_2_4_1_2_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_2_4_1_2_3.setBounds(448, 132, 74, 15);
		panel.add(lblNewLabel_1_2_4_1_2_3);
		
		JLabel lblNewLabel_1_2_4_1_1_1_3 = new JLabel("Medio: ");
		lblNewLabel_1_2_4_1_1_1_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_2_4_1_1_1_3.setBounds(448, 157, 74, 15);
		panel.add(lblNewLabel_1_2_4_1_1_1_3);
		
		txtTamaño = new JTextField();
		txtTamaño.setDropMode(DropMode.INSERT);
		txtTamaño.setForeground(Color.GRAY);
		txtTamaño.setText("String");
		txtTamaño.setColumns(10);
		txtTamaño.setBounds(523, 129, 86, 20);
		panel.add(txtTamaño);
		
		txtMedio = new JTextField();
		txtMedio.setDropMode(DropMode.INSERT);
		txtMedio.setForeground(Color.GRAY);
		txtMedio.setText("String");
		txtMedio.setColumns(10);
		txtMedio.setBounds(523, 154, 86, 20);
		panel.add(txtMedio);
		
		JLabel lblNewLabel_1_2_4_1_2_4 = new JLabel("Genero: ");
		lblNewLabel_1_2_4_1_2_4.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_2_4_1_2_4.setBounds(448, 180, 74, 15);
		panel.add(lblNewLabel_1_2_4_1_2_4);
		
		JLabel lblNewLabel_1_2_4_1_1_1_4 = new JLabel("Alimentacion: ");
		lblNewLabel_1_2_4_1_1_1_4.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_2_4_1_1_1_4.setBounds(448, 205, 74, 15);
		panel.add(lblNewLabel_1_2_4_1_1_1_4);
		
		txtGenero = new JTextField();
		txtGenero.setDropMode(DropMode.INSERT);
		txtGenero.setForeground(Color.GRAY);
		txtGenero.setText("String");
		txtGenero.setColumns(10);
		txtGenero.setBounds(523, 177, 86, 20);
		panel.add(txtGenero);
		
		txtAlimentacion = new JTextField();
		txtAlimentacion.setDropMode(DropMode.INSERT);
		txtAlimentacion.setForeground(Color.GRAY);
		txtAlimentacion.setText("String");
		txtAlimentacion.setColumns(10);
		txtAlimentacion.setBounds(523, 202, 86, 20);
		panel.add(txtAlimentacion);
		
		JLabel lblNewLabel_1_2_4_1_2_5 = new JLabel("Color: ");
		lblNewLabel_1_2_4_1_2_5.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_2_4_1_2_5.setBounds(448, 228, 74, 15);
		panel.add(lblNewLabel_1_2_4_1_2_5);
		
		JLabel lblNewLabel_1_2_4_1_1_1_5 = new JLabel("Pelo: ");
		lblNewLabel_1_2_4_1_1_1_5.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_2_4_1_1_1_5.setBounds(448, 253, 74, 15);
		panel.add(lblNewLabel_1_2_4_1_1_1_5);
		
		txtColor = new JTextField();
		txtColor.setDropMode(DropMode.INSERT);
		txtColor.setForeground(Color.GRAY);
		txtColor.setText("String");
		txtColor.setColumns(10);
		txtColor.setBounds(523, 225, 86, 20);
		panel.add(txtColor);
		
		txtPelo = new JTextField();
		txtPelo.setDropMode(DropMode.INSERT);
		txtPelo.setForeground(Color.GRAY);
		txtPelo.setText("String");
		txtPelo.setColumns(10);
		txtPelo.setBounds(523, 250, 86, 20);
		panel.add(txtPelo);
		
		JLabel lblNewLabel_1_2_4_1_2_7 = new JLabel("N\u00B0 de Aletas: ");
		lblNewLabel_1_2_4_1_2_7.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_2_4_1_2_7.setBounds(448, 276, 74, 15);
		panel.add(lblNewLabel_1_2_4_1_2_7);
		
		JLabel lblNewLabel_1_2_4_1_1_1_7 = new JLabel("N\u00B0 de Branquias: ");
		lblNewLabel_1_2_4_1_1_1_7.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_2_4_1_1_1_7.setBounds(438, 301, 84, 15);
		panel.add(lblNewLabel_1_2_4_1_1_1_7);
		
		txtAletas = new JTextField();
		txtAletas.setDropMode(DropMode.INSERT);
		txtAletas.setForeground(Color.GRAY);
		txtAletas.setText("Int");
		txtAletas.setColumns(10);
		txtAletas.setBounds(523, 273, 86, 20);
		panel.add(txtAletas);
		
		txtBranquias = new JTextField();
		txtBranquias.setDropMode(DropMode.INSERT);
		txtBranquias.setForeground(Color.GRAY);
		txtBranquias.setText("Int");
		txtBranquias.setColumns(10);
		txtBranquias.setBounds(523, 298, 86, 20);
		panel.add(txtBranquias);
		
		JButton btnNewButton = new JButton("Mostrar Peces");
		btnNewButton.setAction(action_1);
		btnNewButton.setBounds(53, 346, 144, 23);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel_1_2_4_1_1_1_5_1 = new JLabel("Oseo: ");
		lblNewLabel_1_2_4_1_1_1_5_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_2_4_1_1_1_5_1.setBounds(619, 59, 74, 15);
		panel.add(lblNewLabel_1_2_4_1_1_1_5_1);
		
		textOseo = new JTextField();
		textOseo.setText("String");
		textOseo.setForeground(Color.GRAY);
		textOseo.setDropMode(DropMode.INSERT);
		textOseo.setColumns(10);
		textOseo.setBounds(694, 56, 86, 20);
		panel.add(textOseo);
		
		JLabel lblNewLabel_1_2_4_1_2_7_1 = new JLabel("Escamas: ");
		lblNewLabel_1_2_4_1_2_7_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_2_4_1_2_7_1.setBounds(619, 82, 74, 15);
		panel.add(lblNewLabel_1_2_4_1_2_7_1);
		
		textEscamas = new JTextField();
		textEscamas.setText("Int");
		textEscamas.setForeground(Color.GRAY);
		textEscamas.setDropMode(DropMode.INSERT);
		textEscamas.setColumns(10);
		textEscamas.setBounds(694, 79, 86, 20);
		panel.add(textEscamas);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setAction(action_2);
		btnEliminar.setBounds(249, 346, 124, 23);
		panel.add(btnEliminar);
		}
		
	
	

	//table.setPreferredScrollableViewportSize(new Dimension(450, 63));

	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "Agregar pez");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			Peces pe = new Peces(Integer.parseInt(txtEdad.getText()), Integer.parseInt(txtPeso.getText()), 
					Integer.parseInt(txtPatas.getText()), txtNombre.getText(), txtTamaño.getText(), txtMedio.getText(), 
					txtGenero.getText(), txtAlimentacion.getText(), txtColor.getText(), true,
					Integer.parseInt(txtAletas.getText()), Integer.parseInt(txtBranquias.getText()), true, true, true);
			listaPeces.add(pe);
			mostrar();
			
		}
		
		public void mostrar() {
String matriz [][] = new String[listaPeces.size()][15];
			
			for (int i = 0; i < listaPeces.size(); i++) {
				
				matriz[i][0]=listaPeces.get(i).getNombre();
				matriz[i][1]=Integer.toString(listaPeces.get(i).getEdad());
				matriz[i][2]=Integer.toString(listaPeces.get(i).getPeso());
				matriz[i][3]=Integer.toString(listaPeces.get(i).getNumeroDePatas());
				matriz[i][4]=listaPeces.get(i).getTamaño();
				matriz[i][5]=listaPeces.get(i).getMedio();
				matriz[i][6]=listaPeces.get(i).getGenero();
				matriz[i][7]=listaPeces.get(i).getAlimentacion();
				matriz[i][8]=listaPeces.get(i).getColor();
				matriz[i][9]=Integer.toString(listaPeces.get(i).getNumeroDePatas()); //pelo
				matriz[i][10]=Integer.toString(listaPeces.get(i).getNumeroDeAletas()); 
				matriz[i][11]=Integer.toString(listaPeces.get(i).getNumeroDeBranquias()); 
				matriz[i][12]=listaPeces.get(i).getTamaño(); //cartilaginoso
				matriz[i][13]=listaPeces.get(i).getTamaño(); //oseo
				matriz[i][14]=Integer.toString(listaPeces.get(i).getPeso()); //escamas
				
				} 												
			table.setModel(new DefaultTableModel(
					matriz,
					new String[] {
							"Nombre", "Edad", "Peso", "# Patas", "Tamaño", "Medio", "Genero", "Alimentacion", "Color", "Pelo", "# Aletas", "# Branquias", "Cartilaginoso", "Oseo", "Escamas"
					}
				));
		}
	}
	private class SwingAction_1 extends AbstractAction {
		public SwingAction_1() {
			putValue(NAME, "Mostrar Peces");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
String matriz [][] = new String[listaPeces.size()][15];
			
			for (int i = 0; i < listaPeces.size(); i++) {
				
				matriz[i][0]=listaPeces.get(i).getNombre();
				matriz[i][1]=Integer.toString(listaPeces.get(i).getEdad());
				matriz[i][2]=Integer.toString(listaPeces.get(i).getPeso());
				matriz[i][3]=Integer.toString(listaPeces.get(i).getNumeroDePatas());
				matriz[i][4]=listaPeces.get(i).getTamaño();
				matriz[i][5]=listaPeces.get(i).getMedio();
				matriz[i][6]=listaPeces.get(i).getGenero();
				matriz[i][7]=listaPeces.get(i).getAlimentacion();
				matriz[i][8]=listaPeces.get(i).getColor();
				matriz[i][9]=Integer.toString(listaPeces.get(i).getNumeroDePatas()); //pelo
				matriz[i][10]=Integer.toString(listaPeces.get(i).getNumeroDeAletas()); 
				matriz[i][11]=Integer.toString(listaPeces.get(i).getNumeroDeBranquias()); 
				matriz[i][12]=listaPeces.get(i).getTamaño(); //cartilaginoso
				matriz[i][13]=listaPeces.get(i).getTamaño(); //oseo
				matriz[i][14]=Integer.toString(listaPeces.get(i).getPeso()); //escamas
				
				} 												
			table.setModel(new DefaultTableModel(
					matriz,
					new String[] {
							"Nombre", "Edad", "Peso", "# Patas", "Tamaño", "Medio", "Genero", "Alimentacion", "Color", "Pelo", "# Aletas", "# Branquias", "Cartilaginoso", "Oseo", "Escamas"
					}
				));
		}
	}
	private class SwingAction_2 extends AbstractAction {
		public SwingAction_2() {
			putValue(NAME, "ELiminar");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			for (int i = 0; i< listaPeces.size(); i++) {
				if(nombre==listaPeces.get(i).getNombre()) {
					listaPeces.remove(i);
				}
			}
			//Actualizar (funcion mostrar)
			String matriz [][] = new String[listaPeces.size()][15];
			
			for (int i = 0; i < listaPeces.size(); i++) {
				
				matriz[i][0]=listaPeces.get(i).getNombre();
				matriz[i][1]=Integer.toString(listaPeces.get(i).getEdad());
				matriz[i][2]=Integer.toString(listaPeces.get(i).getPeso());
				matriz[i][3]=Integer.toString(listaPeces.get(i).getNumeroDePatas());
				matriz[i][4]=listaPeces.get(i).getTamaño();
				matriz[i][5]=listaPeces.get(i).getMedio();
				matriz[i][6]=listaPeces.get(i).getGenero();
				matriz[i][7]=listaPeces.get(i).getAlimentacion();
				matriz[i][8]=listaPeces.get(i).getColor();
				matriz[i][9]=Integer.toString(listaPeces.get(i).getNumeroDePatas()); //pelo
				matriz[i][10]=Integer.toString(listaPeces.get(i).getNumeroDeAletas()); 
				matriz[i][11]=Integer.toString(listaPeces.get(i).getNumeroDeBranquias()); 
				matriz[i][12]=listaPeces.get(i).getTamaño(); //cartilaginoso
				matriz[i][13]=listaPeces.get(i).getTamaño(); //oseo
				matriz[i][14]=Integer.toString(listaPeces.get(i).getPeso()); //escamas
				} 												
			table.setModel(new DefaultTableModel(
					matriz,
					new String[] {
							"Nombre", "Edad", "Peso", "# Patas", "Tamaño", "Medio", "Genero", "Alimentacion", "Color", "Pelo", "# Aletas", "# Branquias", "Cartilaginoso", "Oseo", "Escamas"
					}
				));
		}
		}
	}

