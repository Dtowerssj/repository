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

public class VentanaZooAves {

	private JFrame frmVentanaMamiferos;
	private final Action action = new SwingAction();
	
	static JTextField txtGarras;
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
	static JTextField txtNPlumas;
	static JTextField txtPico;
	ArrayList<Aves> listaAves = new ArrayList<Aves>();
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
		String numeroDePlumas = "";
		String colorDePico = "";
		String garras = "";
		
	
	
	//Aves
			Aves aguila = new Aves(15, 5, 2, "Águila", "mediano", "aereo", "macho",
					"carnivoro", "marron con blanco", false, 20000, "gris", true);
			Aves colibri = new Aves(2, 4, 2, "Colibrí", "muy pequeño", "aereo", "hembra", 
					"herbivoro", "verde esmeralda", false, 100, "negro", true);
			private final Action action_2 = new SwingAction_2();
			
			
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		VentanaZooAves ab = new VentanaZooAves();
		  
	
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaZooAves window = new VentanaZooAves();
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
	public VentanaZooAves() {

		 listaAves.add(aguila);
		 listaAves.add(colibri);
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
				numeroDePlumas = (table.getValueAt(i, 10).toString());
				colorDePico = (table.getValueAt(i, 11).toString());
				garras = (table.getValueAt(i, 12).toString());
			}	
		});
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
		
		frmVentanaMamiferos = new JFrame();
		frmVentanaMamiferos.setTitle("Ventana Aves");
		frmVentanaMamiferos.setBounds(100, 100, 824, 418);
		frmVentanaMamiferos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmVentanaMamiferos.getContentPane().setLayout(new BoxLayout(frmVentanaMamiferos.getContentPane(), BoxLayout.X_AXIS));
		
		JPanel panel = new JPanel();
		frmVentanaMamiferos.getContentPane().add(panel);
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 35, 428, 283);
		panel.add(scrollPane);
		
		table = new JTable();
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null},
			},
			new String[] {
					"Nombre", "Edad", "Peso", "# Patas", "Tamaño", "Medio", "Genero", "Alimentacion", "Color", "Pelo", "# Plumas", "Color pico", "garras"
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
		
		JLabel Titulo = new JLabel("Aves");
		Titulo.setFont(new Font("Tahoma", Font.BOLD, 17));
		Titulo.setBounds(215, 11, 95, 14);
		panel.add(Titulo);
		
		JButton agregarOtro = new JButton("Agregar");
		agregarOtro.setAction(action);
		agregarOtro.setBounds(522, 346, 155, 23);
		panel.add(agregarOtro);
		
		JLabel lblNewLabel_1_2_4_1_2 = new JLabel("Garras: ");
		lblNewLabel_1_2_4_1_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_2_4_1_2.setBounds(619, 31, 74, 15);
		panel.add(lblNewLabel_1_2_4_1_2);
		
		txtGarras = new JTextField();
		txtGarras.setForeground(Color.GRAY);
		txtGarras.setText("String");
		txtGarras.setBounds(694, 28, 86, 20);
		panel.add(txtGarras);
		txtGarras.setColumns(10);
		
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
		
		JLabel lblNewLabel_1_2_4_1_2_7 = new JLabel("N\u00B0 de PLumas: ");
		lblNewLabel_1_2_4_1_2_7.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_2_4_1_2_7.setBounds(448, 276, 74, 15);
		panel.add(lblNewLabel_1_2_4_1_2_7);
		
		JLabel lblNewLabel_1_2_4_1_1_1_7 = new JLabel("Color de pico: ");
		lblNewLabel_1_2_4_1_1_1_7.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_2_4_1_1_1_7.setBounds(448, 301, 74, 15);
		panel.add(lblNewLabel_1_2_4_1_1_1_7);
		
		txtNPlumas = new JTextField();
		txtNPlumas.setDropMode(DropMode.INSERT);
		txtNPlumas.setForeground(Color.GRAY);
		txtNPlumas.setText("Int");
		txtNPlumas.setColumns(10);
		txtNPlumas.setBounds(523, 273, 86, 20);
		panel.add(txtNPlumas);
		
		txtPico = new JTextField();
		txtPico.setDropMode(DropMode.INSERT);
		txtPico.setForeground(Color.GRAY);
		txtPico.setText("String");
		txtPico.setColumns(10);
		txtPico.setBounds(523, 298, 86, 20);
		panel.add(txtPico);
		
		JButton btnNewButton = new JButton("Mostrar Aves");
		btnNewButton.setAction(action_1);
		btnNewButton.setBounds(56, 346, 144, 23);
		panel.add(btnNewButton);
		
		JButton btnEliminar = new JButton("New button");
		btnEliminar.setAction(action_2);
		btnEliminar.setBounds(259, 346, 132, 23);
		panel.add(btnEliminar);
		
		}
		
	
	

	//table.setPreferredScrollableViewportSize(new Dimension(450, 63));

	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "Agregar ave");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			Aves av = new Aves(Integer.parseInt(VentanaZooAves.txtEdad.getText()), Integer.parseInt(VentanaZooAves.txtPeso.getText()), 
					Integer.parseInt(VentanaZooAves.txtPatas.getText()), VentanaZooAves.txtNombre.getText(), VentanaZooAves.txtTamaño.getText(), VentanaZooAves.txtMedio.getText(), 
					VentanaZooAves.txtGenero.getText(), VentanaZooAves.txtAlimentacion.getText(), VentanaZooAves.txtColor.getText(), true,
					Integer.parseInt(VentanaZooAves.txtNPlumas.getText()), VentanaZooAves.txtPico.getText(), true);
			listaAves.add(av);
			mostrar();
			
		}
		
		public void mostrar() {
			String matriz [][] = new String[listaAves.size()][13];
			
			for (int i = 0; i < listaAves.size(); i++) {
				

				matriz[i][0]=listaAves.get(i).getNombre();
				matriz[i][1]=Integer.toString(listaAves.get(i).getEdad());
				matriz[i][2]=Integer.toString(listaAves.get(i).getPeso());
				matriz[i][3]=Integer.toString(listaAves.get(i).getNumeroDePatas());
				matriz[i][4]=listaAves.get(i).getTamaño();
				matriz[i][5]=listaAves.get(i).getMedio();
				matriz[i][6]=listaAves.get(i).getGenero();
				matriz[i][7]=listaAves.get(i).getAlimentacion();
				matriz[i][8]=listaAves.get(i).getColor();
				matriz[i][9]=listaAves.get(i).getTamaño(); 
				matriz[i][10]=Integer.toString(listaAves.get(i).getNumeroDePlumas()); 
				matriz[i][11]=listaAves.get(i).getColorDePico();
				matriz[i][12]=Integer.toString(listaAves.get(i).getNumeroDePatas()); //garras
				
				} 												
			table.setModel(new DefaultTableModel(
					matriz,
					new String[] {
							"Nombre", "Edad", "Peso", "# Patas", "Tamaño", "Medio", "Genero", "Alimentacion", "Color", "Pelo", "# Plumas", "Color pico", "garras"
					}
				));
		}
	}
	private class SwingAction_1 extends AbstractAction {
		public SwingAction_1() {
			putValue(NAME, "Mostrar Aves");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
String matriz [][] = new String[listaAves.size()][13];
			
			for (int i = 0; i < listaAves.size(); i++) {
				

				matriz[i][0]=listaAves.get(i).getNombre();
				matriz[i][1]=Integer.toString(listaAves.get(i).getEdad());
				matriz[i][2]=Integer.toString(listaAves.get(i).getPeso());
				matriz[i][3]=Integer.toString(listaAves.get(i).getNumeroDePatas());
				matriz[i][4]=listaAves.get(i).getTamaño();
				matriz[i][5]=listaAves.get(i).getMedio();
				matriz[i][6]=listaAves.get(i).getGenero();
				matriz[i][7]=listaAves.get(i).getAlimentacion();
				matriz[i][8]=listaAves.get(i).getColor();
				matriz[i][9]=listaAves.get(i).getTamaño(); 
				matriz[i][10]=Integer.toString(listaAves.get(i).getNumeroDePlumas()); 
				matriz[i][11]=listaAves.get(i).getColorDePico();
				matriz[i][12]=Integer.toString(listaAves.get(i).getNumeroDePatas()); //garras
				
				} 									
			table.setModel(new DefaultTableModel(
					matriz,
					new String[] {
							"Nombre", "Edad", "Peso", "# Patas", "Tamaño", "Medio", "Genero", "Alimentacion", "Color", "Pelo", "# Plumas", "Color pico", "garras"
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
			for (int i = 0; i< listaAves.size(); i++) {
				if(nombre==listaAves.get(i).getNombre()) {
					listaAves.remove(i);
				}
			}
			//Actualizar (funcion mostrar)
			String matriz [][] = new String[listaAves.size()][13];
			
			for (int i = 0; i < listaAves.size(); i++) {
				

				matriz[i][0]=listaAves.get(i).getNombre();
				matriz[i][1]=Integer.toString(listaAves.get(i).getEdad());
				matriz[i][2]=Integer.toString(listaAves.get(i).getPeso());
				matriz[i][3]=Integer.toString(listaAves.get(i).getNumeroDePatas());
				matriz[i][4]=listaAves.get(i).getTamaño();
				matriz[i][5]=listaAves.get(i).getMedio();
				matriz[i][6]=listaAves.get(i).getGenero();
				matriz[i][7]=listaAves.get(i).getAlimentacion();
				matriz[i][8]=listaAves.get(i).getColor();
				matriz[i][9]=listaAves.get(i).getTamaño(); 
				matriz[i][10]=Integer.toString(listaAves.get(i).getNumeroDePlumas()); 
				matriz[i][11]=listaAves.get(i).getColorDePico();
				matriz[i][12]=Integer.toString(listaAves.get(i).getNumeroDePatas()); //garras
				
				} 											
			table.setModel(new DefaultTableModel(
					matriz,
					new String[] {
							"Nombre", "Edad", "Peso", "# Patas", "Tamaño", "Medio", "Genero", "Alimentacion", "Color", "Pelo", "# Plumas", "Color pico", "garras"
					}
				));
		}
		}
	
}


