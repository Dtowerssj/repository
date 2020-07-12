package zoológico;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Main {
	
	public static void main(String[] args) {
	
			
			int tipo = Integer.parseInt(JOptionPane.showInputDialog("¡BIENVENIDO AL ZOOLÓGICO! \n\n" 
					+ "ESPECIALIZADO EN ANIMALES VERTEBRADOS \n\n" 
				
					+"Seleccione la clasificacion de animales para ver o agregar: \n\n"
					+ "1. Mamiferos \n"
					+ "2. Aves \n"
					+ "3. Peces \n"
					+ "4. Anfibios \n"
					+ "5. Reptiles \n"));
					
			switch(tipo) {
	
			case 1: 
				
				VentanaZooMamiferos.main(null);
				
				break;
					
			case 2: 
				
				VentanaZooAves.main(null);
					
					break;
					
			case 3: 
			
				VentanaZooPeces.main(null);
			
		
					break;
			
			case 4: 
				
				VentanaZooAnfibios.main(null);
				
				
					break;
					
			case 5: 

				VentanaZooReptiles.main(null);
				
				
			break;
			
			
		
					
						}
					}

}
	

