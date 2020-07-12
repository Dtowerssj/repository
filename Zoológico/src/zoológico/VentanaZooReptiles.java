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

public class VentanaZooReptiles {

	private JFrame frmVentanaMamiferos;
	private final Action action = new SwingAction(); 
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
	static JTextField txtCaparazon;
	static JTextField txtExtremidades;
	ArrayList<Reptiles> listaReptiles = new ArrayList<Reptiles>();
	private JTable table;
	private final Action action_1 = new SwingAction_1();
	
	
	//Reptiles
			Reptiles titu = new Reptiles(20, 290, 4, "Tortuga", "Muy grande", "acuatico", "hembra",
					"omnivoro", "verde orcuro", false, true, true, false, 0);
			Reptiles cobra = new Reptiles(5, 12, 0, "Cobra", "grande (largo)", "terrestre", "macho", 
					"carnivoro", "marron claro", false, false, false, true, 2);
			private JTextField textDientes;
			private JTextField txtNDientes;
			
			
			
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		  
	
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaZooReptiles window = new VentanaZooReptiles();
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
	public VentanaZooReptiles() {
		listaReptiles.add(cobra);
		 listaReptiles.add(titu);
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
		
		frmVentanaMamiferos = new JFrame();
		frmVentanaMamiferos.setTitle("Ventana Reptiles");
		frmVentanaMamiferos.setBounds(100, 100, 799, 418);
		frmVentanaMamiferos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmVentanaMamiferos.getContentPane().setLayout(new BoxLayout(frmVentanaMamiferos.getContentPane(), BoxLayout.X_AXIS));
		
		JPanel panel = new JPanel();
		frmVentanaMamiferos.getContentPane().add(panel);
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(92, 35, 340, 283);
		panel.add(scrollPane);
		
		table = new JTable();
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column"
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
		
		JLabel Titulo = new JLabel("Reptiles");
		Titulo.setFont(new Font("Tahoma", Font.BOLD, 17));
		Titulo.setBounds(215, 5, 95, 25);
		panel.add(Titulo);
		
		JButton agregarOtro = new JButton(" Agregar -anfibio");
		agregarOtro.setAction(action);
		agregarOtro.setBounds(476, 346, 155, 23);
		panel.add(agregarOtro);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Atributos");
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_1.setBounds(10, 41, 64, 14);
		panel.add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_1_2_4 = new JLabel("Peso: ");
		lblNewLabel_1_2_4.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_2_4.setBounds(10, 93, 74, 15);
		panel.add(lblNewLabel_1_2_4);
		
		JLabel lblNewLabel_1_2_4_1 = new JLabel("Nombre: ");
		lblNewLabel_1_2_4_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_2_4_1.setBounds(10, 60, 74, 15);
		panel.add(lblNewLabel_1_2_4_1);
		
		JLabel lblNewLabel_1_2_4_1_1 = new JLabel("Edad: ");
		lblNewLabel_1_2_4_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_2_4_1_1.setBounds(10, 77, 74, 15);
		panel.add(lblNewLabel_1_2_4_1_1);
		
		JLabel lblNewLabel_1_2_4_2 = new JLabel("Tama\u00F1o: ");
		lblNewLabel_1_2_4_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_2_4_2.setBounds(10, 124, 74, 16);
		panel.add(lblNewLabel_1_2_4_2);
		
		JLabel lblNewLabel_1_2_4_5 = new JLabel("N\u00B0 de patas: ");
		lblNewLabel_1_2_4_5.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_2_4_5.setBounds(10, 108, 74, 16);
		panel.add(lblNewLabel_1_2_4_5);
		
		JLabel lblNewLabel_1_2_4_2_1 = new JLabel("Color: ");
		lblNewLabel_1_2_4_2_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_2_4_2_1.setBounds(10, 188, 74, 16);
		panel.add(lblNewLabel_1_2_4_2_1);
		
		JLabel lblNewLabel_1_2_4_2_2 = new JLabel("Genero: ");
		lblNewLabel_1_2_4_2_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_2_4_2_2.setBounds(10, 156, 74, 16);
		panel.add(lblNewLabel_1_2_4_2_2);
		
		JLabel lblNewLabel_1_2_4_2_3 = new JLabel("Medio: ");
		lblNewLabel_1_2_4_2_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_2_4_2_3.setBounds(10, 140, 74, 16);
		panel.add(lblNewLabel_1_2_4_2_3);
		
		JLabel lblNewLabel_1_2_4_2_4 = new JLabel("Pelo: ");
		lblNewLabel_1_2_4_2_4.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_2_4_2_4.setBounds(10, 204, 74, 16);
		panel.add(lblNewLabel_1_2_4_2_4);
		
		JLabel lblNewLabel_1_2_4_2_5 = new JLabel("Caparazon:  ");
		lblNewLabel_1_2_4_2_5.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_2_4_2_5.setBounds(10, 220, 74, 16);
		panel.add(lblNewLabel_1_2_4_2_5);
		
		JLabel lblNewLabel_1_2_4_2_6 = new JLabel("Extrmidades: ");
		lblNewLabel_1_2_4_2_6.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_2_4_2_6.setBounds(10, 236, 74, 16);
		panel.add(lblNewLabel_1_2_4_2_6);
		
		JLabel lblNewLabel_1_2_4_2_7 = new JLabel("Alimentacion: ");
		lblNewLabel_1_2_4_2_7.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_2_4_2_7.setBounds(10, 172, 74, 16);
		panel.add(lblNewLabel_1_2_4_2_7);
		
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
		txtPelo.setText("boolean");
		txtPelo.setColumns(10);
		txtPelo.setBounds(523, 250, 86, 20);
		panel.add(txtPelo);
		
		JLabel lblNewLabel_1_2_4_1_2_7 = new JLabel("Caparzon: ");
		lblNewLabel_1_2_4_1_2_7.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_2_4_1_2_7.setBounds(448, 276, 74, 15);
		panel.add(lblNewLabel_1_2_4_1_2_7);
		
		JLabel lblNewLabel_1_2_4_1_1_1_7 = new JLabel("Extremidades: ");
		lblNewLabel_1_2_4_1_1_1_7.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_2_4_1_1_1_7.setBounds(438, 301, 84, 15);
		panel.add(lblNewLabel_1_2_4_1_1_1_7);
		
		txtCaparazon = new JTextField();
		txtCaparazon.setDropMode(DropMode.INSERT);
		txtCaparazon.setForeground(Color.GRAY);
		txtCaparazon.setText("boolean");
		txtCaparazon.setColumns(10);
		txtCaparazon.setBounds(523, 273, 86, 20);
		panel.add(txtCaparazon);
		
		txtExtremidades = new JTextField();
		txtExtremidades.setDropMode(DropMode.INSERT);
		txtExtremidades.setForeground(Color.GRAY);
		txtExtremidades.setText("boolean");
		txtExtremidades.setColumns(10);
		txtExtremidades.setBounds(523, 298, 86, 20);
		panel.add(txtExtremidades);
		
		JButton btnNewButton = new JButton("Mostrar Peces");
		btnNewButton.setAction(action_1);
		btnNewButton.setBounds(143, 346, 144, 23);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel_1_2_4_1_1_1_5_1 = new JLabel("Dientes: ");
		lblNewLabel_1_2_4_1_1_1_5_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_2_4_1_1_1_5_1.setBounds(612, 27, 74, 15);
		panel.add(lblNewLabel_1_2_4_1_1_1_5_1);
		
		textDientes = new JTextField();
		textDientes.setText("boolean");
		textDientes.setForeground(Color.GRAY);
		textDientes.setDropMode(DropMode.INSERT);
		textDientes.setColumns(10);
		textDientes.setBounds(687, 24, 86, 20);
		panel.add(textDientes);
		
		JLabel lblNewLabel_1_2_4_1_2_7_1 = new JLabel("N\u00B0 de Dientes: ");
		lblNewLabel_1_2_4_1_2_7_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_2_4_1_2_7_1.setBounds(612, 50, 74, 15);
		panel.add(lblNewLabel_1_2_4_1_2_7_1);
		
		txtNDientes = new JTextField();
		txtNDientes.setText("Int");
		txtNDientes.setForeground(Color.GRAY);
		txtNDientes.setDropMode(DropMode.INSERT);
		txtNDientes.setColumns(10);
		txtNDientes.setBounds(687, 47, 86, 20);
		panel.add(txtNDientes);
		
		JLabel lblNewLabel_1_2_4_2_4_1 = new JLabel("Dientes: ");
		lblNewLabel_1_2_4_2_4_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_2_4_2_4_1.setBounds(8, 256, 74, 16);
		panel.add(lblNewLabel_1_2_4_2_4_1);
		
		JLabel lblNewLabel_1_2_4_2_5_1 = new JLabel("N\u00B0 dientes:  ");
		lblNewLabel_1_2_4_2_5_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_2_4_2_5_1.setBounds(8, 272, 74, 16);
		panel.add(lblNewLabel_1_2_4_2_5_1);
		}
		
	
	

	//table.setPreferredScrollableViewportSize(new Dimension(450, 63));

	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "Agregar Reptil");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			Reptiles rp = new Reptiles(Integer.parseInt(txtEdad.getText()), Integer.parseInt(txtPeso.getText()), 
					Integer.parseInt(txtPatas.getText()), txtNombre.getText(), txtTamaño.getText(), txtMedio.getText(), 
					txtGenero.getText(), txtAlimentacion.getText(), txtColor.getText(), false, false, true, true,
					Integer.parseInt(txtNDientes.getText()));
			listaReptiles.add(rp);
			mostrar();
			
		}
		
		public void mostrar() {
			String matriz [][] = new String[14][listaReptiles.size()];
			
			for (int i = 0; i < listaReptiles.size(); i++) {
				
				matriz[0][i]=listaReptiles.get(i).getNombre();
				matriz[1][i]=Integer.toString(listaReptiles.get(i).getEdad());
				matriz[2][i]=Integer.toString(listaReptiles.get(i).getPeso());
				matriz[3][i]=Integer.toString(listaReptiles.get(i).getNumeroDePatas());
				matriz[4][i]=listaReptiles.get(i).getTamaño();
				matriz[5][i]=listaReptiles.get(i).getMedio();
				matriz[6][i]=listaReptiles.get(i).getGenero();
				matriz[7][i]=listaReptiles.get(i).getAlimentacion();
				matriz[8][i]=listaReptiles.get(i).getColor();
				matriz[9][i]=String.valueOf(listaReptiles.get(i).isPelo()); //pelo
				matriz[10][i]=String.valueOf(listaReptiles.get(i).isCaparazon());
				matriz[11][i]=String.valueOf(listaReptiles.get(i).isExtremidades());
				matriz[12][i]=String.valueOf(listaReptiles.get(i).isDientes());
				matriz[13][i]=Integer.toString(listaReptiles.get(i).getNumeroDeDientes()); 
				} 												
			table.setModel(new DefaultTableModel(
					matriz,
					new String[] {
						"Reptil 1", "Reptil 2", "Reptil 3", "Reptil 4", "Reptil 5", "Reptil 6", "Reptil 7", "Reptil 8", "Reptil 9", "Reptil 10"
					}
				));
		}
	}
	private class SwingAction_1 extends AbstractAction {
		public SwingAction_1() {
			putValue(NAME, "Mostrar Reptiles");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
String matriz [][] = new String[14][listaReptiles.size()];
			
			for (int i = 0; i < listaReptiles.size(); i++) {
				
				matriz[0][i]=listaReptiles.get(i).getNombre();
				matriz[1][i]=Integer.toString(listaReptiles.get(i).getEdad());
				matriz[2][i]=Integer.toString(listaReptiles.get(i).getPeso());
				matriz[3][i]=Integer.toString(listaReptiles.get(i).getNumeroDePatas());
				matriz[4][i]=listaReptiles.get(i).getTamaño();
				matriz[5][i]=listaReptiles.get(i).getMedio();
				matriz[6][i]=listaReptiles.get(i).getGenero();
				matriz[7][i]=listaReptiles.get(i).getAlimentacion();
				matriz[8][i]=listaReptiles.get(i).getColor();
				matriz[9][i]=String.valueOf(listaReptiles.get(i).isPelo()); //pelo
				matriz[10][i]=String.valueOf(listaReptiles.get(i).isCaparazon());
				matriz[11][i]=String.valueOf(listaReptiles.get(i).isExtremidades());
				matriz[12][i]=String.valueOf(listaReptiles.get(i).isDientes());
				matriz[13][i]=Integer.toString(listaReptiles.get(i).getNumeroDeDientes()); 
				} 												
			table.setModel(new DefaultTableModel(
					matriz,
					new String[] {
						"Reptil 1", "Reptil 2", "Reptil 3", "Reptil 4", "Reptil 5", "Reptil 6", "Reptil 7", "Reptil 8", "Reptil 9", "Reptil 10"
					}
				));
		}
	}
}
