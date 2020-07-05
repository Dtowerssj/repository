package zoológico;

import javax.swing.JOptionPane;

public class Main {
	
	
	public static void main(String[] args) {
		 //Animales
		
		//Mamiferos:                                                     
		Mamiferos leon = new Mamiferos(9, 190, 4, "Grande", "Terrestre", "Macho", "Carnivoro",
										"amarillo", true, 30, 0, "abundante", true, true);  //Ejemplo de polimorfismo
		
		Mamiferos canguro = new Mamiferos(10, 30, 2, "grande", "terrestre", "hembra", "herbivoro", 
			"gris", true, 14, 4, "moderado", true, true);
		
		Mamiferos espin = new Mamiferos(22, 10, 4, "pequeño", "Terrestre", "Hembra", "Herbivoro", 
				"marron", true, 36, 6, "poco", true, true);
		
		//Aves
		Aves aguila = new Aves(15, 5, 2, "mediano", "aereo", "macho",
				"carnivoro", "marron con blanco", false, 20000, "gris", true);
		
		Aves colibri = new Aves(2, 4, 2, "muy pequeño", "aereo", "hembra", 
				"herbivoro", "verde esmeralda", false, 100, "negro", true);
		
		//Peces
		Peces tiburon = new Peces(25, 1005, 0, "Grande", "acuatico", "hembra", "carnivoro", 
				"gris con blanco", false, 8, 5, true, false, true);
		
		Peces bagre = new Peces(40, 1, 0, "pequeño", "acuatico y terrestre", "macho", 
				"omnivoro", "gris oscuro", false, 7, 6, false, true, false);
		
		Peces globo = new Peces(6, 300, 0, "pequeño", "acuatico", "macho", "omnivoro", 
				"marron amarillento", false, 4, 8, false, true, false);
		
		//Anfibios
		Anfibios ranaV = new Anfibios(3, 10, 4, "muy pequeño", "acuatico y terrestre", 
				"macho", "insectivoro", "negro con manchas de colores llamativos", 
				false, false, "cutanea y pulmonar");
		
		Anfibios salamandra = new Anfibios(15, 40, 4, "pequeño", "acuatico y terrestre",
				"hembra", "insectivoro", "Gris ocscuro con manchas", false, true, "branquial/pulmonar");
		
		//Reptiles
		Reptiles titu = new Reptiles(20, 290, 4, "Muy grande", "acuatico", "hembra",
				"omnivoro", "verde orcuro", false, true, true, false, 0);
		
		Reptiles cobra = new Reptiles(5, 12, 0, "grande (largo)", "terrestre", "macho", 
				"carnivoro", "marron claro", false, false, false, true, 2);
		
		
		
		
		int si = Integer.parseInt(JOptionPane.showInputDialog("¡BIENVENIDO AL ZOOLÓGICO! \n "
				+ "Especializado en animales vertebrados \n\n"
				+ "Seleccione la opcion de ver animales(digitando un numero): \n\n"
				+ "1. Ver animales del Zoologico \n"));
		
		
		if (si != 1) {
			System.out.println("Error digitando");
		}else{
			
			int opcion;
			
			opcion = Integer.parseInt(JOptionPane.showInputDialog("Seleccione la clasificación: \n\n"
					+ "1. Mamiferos \n"
					+ "2. Aves \n"
					+ "3. Peces \n"
					+ "4. Anfibios \n"
					+ "5. Reptiles \n"));
					
			switch(opcion) {
	
			case 1: System.out.println("Mamiferos: \n\n"
					+ "LEON: \n"
					+ "Edad: "+ leon.getEdad()+" años \n" 
					+ "Peso: "+ leon.getPeso()+" kg \n"
					+ "Color: "+ leon.getColor()
					+ "\nNumero de patas: "+ leon.getNumeroDePatas()
					+ "\nTamaño: "+ leon.getTamaño()
					+ "\nMedio: "+ leon.getMedio()
					+ "\nGenero: "+ leon.getGenero()
					+ "\nTipo de alimentacion: "+ leon.getAlimentacion()
					+ "\nPelo: "+ leon.isPelo()
					+ "\nCantidad de pelo: "+ leon.getCantidadDePelo()
					+ "\nNumero de dientes: "+ leon.getNumeroDeDientes()
					+ "\nNumero de glandulas mamarias: "+ leon.getNumeroDeGlandulasMamarias()
					+ "\nOreja: "+ leon.isOreja()
					+ "\nHuesos en el oido: "+ leon.isHuesosEnElOido());
			
					System.out.println("El Leon:");
					leon.comer();
					leon.dormir();
					leon.mover(); leon.caminar(); System.out.print(" y "); leon.correr(); System.out.println("");
					leon.procrear();
					leon.respirar();
					leon.cuidarCrias();
					leon.jugar();
					leon.adaptacion();
					leon.agrupacion();
					leon.defensa(); leon.atacaDeRegreso();
					leon.caza();
				
					System.out.println("\n\nCANGURO: \n"
					+ "Edad: "+ canguro.getEdad()+" años \n" 
					+ "Peso: "+ canguro.getPeso()+" kg \n"
					+ "Color: "+ canguro.getColor()
					+ "\nNumero de patas: "+ canguro.getNumeroDePatas()
					+ "\nTamaño: "+ canguro.getTamaño()
					+ "\nMedio: "+ canguro.getMedio()
					+ "\nGenero: "+ canguro.getGenero()
					+ "\nTipo de alimentacion: "+ canguro.getAlimentacion()
					+ "\nPelo: "+ canguro.isPelo()
					+ "\nCantidad de pelo: "+ canguro.getCantidadDePelo()
					+ "\nNumero de dientes: "+ canguro.getNumeroDeDientes()
					+ "\nNumero de glandulas mamarias: "+ canguro.getNumeroDeGlandulasMamarias()
					+ "\nOreja: "+ canguro.isOreja()
					+ "\nHuesos en el oido: "+ canguro.isHuesosEnElOido());
					
					System.out.println("El Canguro: ");
					canguro.comer();
					canguro.dormir();
					canguro.mover(); canguro.saltar(); 
					canguro.procrear();
					canguro.respirar();
					canguro.cuidarCrias();
					canguro.jugar();
					canguro.adaptacion();
					canguro.defensa(); canguro.atacaDeRegreso();
					
					
					System.out.println("\n\nPUERCOESPIN: \n"
					+ "Edad: "+ espin.getEdad()+" años \n" 
					+ "Peso: "+ espin.getPeso()+" kg \n"
					+ "Color: "+ espin.getColor()
					+ "\nNumero de patas: "+ espin.getNumeroDePatas()
					+ "\nTamaño: "+ espin.getTamaño()
					+ "\nMedio: "+ espin.getMedio()
					+ "\nGenero: "+ espin.getGenero()
					+ "\nTipo de alimentacion: "+ espin.getAlimentacion()
					+ "\nPelo: "+ espin.isPelo()
					+ "\nCantidad de pelo: "+ espin.getCantidadDePelo()
					+ "\nNumero de dientes: "+ espin.getNumeroDeDientes()
					+ "\nNumero de glandulas mamarias: "+ espin.getNumeroDeGlandulasMamarias()
					+ "\nOreja: "+ espin.isOreja()
					+ "\nHuesos en el oido: "+ espin.isHuesosEnElOido()); 
					
					System.out.println("EL Puercoespin:");
					espin.comer();
					espin.dormir();
					espin.mover(); espin.caminar(); System.out.print(" y "); espin.trepar(); System.out.println("");
					espin.procrear();
					espin.respirar();
					espin.cuidarCrias();
					espin.jugar();
					espin.adaptacion();
					espin.defensa(); espin.espinas();
					break;
					
			case 2: System.out.println("Aves: \n\n"
					+ "AGUILA: \n"
					+ "Edad: "+ aguila.getEdad()+" años \n" 
					+ "Peso: "+ aguila.getPeso()+" kg \n"
					+ "Color: "+ aguila.getColor()
					+ "\nNumero de patas: "+ aguila.getNumeroDePatas()
					+ "\nTamaño: "+ aguila.getTamaño()
					+ "\nMedio: "+ aguila.getMedio()
					+ "\nGenero: "+ aguila.getGenero()
					+ "\nTipo de alimentacion: "+ aguila.getAlimentacion()
					+ "\nPelo: "+ aguila.isPelo()
					+ "\nNumero de plumas: "+ aguila.getNumeroDePlumas()
					+ "\nColor de pico: "+ aguila.getColorDePico()
					+ "\nGarras: "+ aguila.isGarras());
			
					System.out.println("El Aguila: ");
					aguila.dormir();
					aguila.comer();
					aguila.mover(); aguila.planear(); System.out.print(" y "); aguila.volar();
					aguila.procrear();
					aguila.respirar();
					aguila.migrar();
					aguila.caza();
				
					
					System.out.println("\n\nCOLIBRI: \n"
					+ "Edad: "+ colibri.getEdad()+" años \n" 
					+ "Peso: "+ colibri.getPeso()+" g \n"
					+ "Color: "+ colibri.getColor()
					+ "\nNumero de patas: "+ colibri.getNumeroDePatas()
					+ "\nTamaño: "+ colibri.getTamaño()
					+ "\nMedio: "+ colibri.getMedio()
					+ "\nGenero: "+ colibri.getGenero()
					+ "\nTipo de alimentacion: "+ aguila.getAlimentacion()
					+ "\nPelo: "+ colibri.isPelo()
					+ "\nNumero de plumas: "+ colibri.getNumeroDePlumas()
					+ "\nColor de pico: "+ colibri.getColorDePico()
					+ "\nGarras: "+ colibri.isGarras()); 
					
					System.out.println("El Colibri: ");
					colibri.dormir();
					colibri.comer();
					colibri.mover(); colibri.volar();
					colibri.procrear();
					colibri.respirar();
					colibri.migrar();
					
					break;
					
			
			
			case 3: System.out.println("Peces: \n\n"
					+ "PEZ GLOBO: \n"
					+ "Edad: "+ globo.getEdad()+" años \n" 
					+ "Peso: "+ globo.getPeso()+" g \n"
					+ "Color: "+ globo.getColor()
					+ "\nNumero de patas: "+ globo.getNumeroDePatas()
					+ "\nTamaño: "+ globo.getTamaño()
					+ "\nMedio: "+ globo.getMedio()
					+ "\nGenero: "+ globo.getGenero()
					+ "\nTipo de alimentacion: "+ globo.getAlimentacion()
					+ "\nPelo: "+ globo.isPelo()
					+ "\nNumero de aletas: "+ globo.getNumeroDeAletas()
					+ "\nNumero de branquias: "+ globo.getNumeroDeBranquias()
					+ "\nCartilaginoso: "+ globo.isCartilaginoso()
					+ "\nOseo: "+ globo.isOseo()
					+ "\nEscamas: "+ globo.isEscamas());
			
					System.out.println("El pez globo: ");
					globo.dormir();
					globo.comer();
					globo.mover(); globo.nadar();
					globo.defensa(); globo.veneno();
					globo.procrear();
					globo.respirar();
					
					
					System.out.println("\n\n TIBURON: \n"
					+ "Edad: "+ tiburon.getEdad() + " años \n" 
					+ "Peso: "+ tiburon.getPeso() + " kg \n"
					+ "Color: "+ tiburon.getColor()
					+ "\nNumero de patas: "+ tiburon.getNumeroDePatas()
					+ "\nTamaño: "+ tiburon.getTamaño()
					+ "\nMedio: "+ tiburon.getMedio()
					+ "\nGenero: "+ tiburon.getGenero()
					+ "\nTipo de alimentacion: "+ tiburon.getAlimentacion()
					+ "\nPelo: "+ tiburon.isPelo()
					+ "\nNumero de aletas: "+ tiburon.getNumeroDeAletas()
					+ "\nNumero de branquias: "+ tiburon.getNumeroDeBranquias()
					+ "\nCartilaginoso: "+ tiburon.isCartilaginoso()
					+ "\nOseo: "+ tiburon.isOseo()
					+ "\nEscamas: "+ tiburon.isEscamas());
					
					System.out.println("El Tiburon: ");
					tiburon.dormir();
					tiburon.comer();
					tiburon.mover(); tiburon.nadar();
					tiburon.procrear();
					tiburon.respirar();
					tiburon.caza();
					
					System.out.println("\n\nBAGRE: \n"
					+ "Edad: "+ bagre.getEdad()+" años \n" 
					+ "Peso: "+ bagre.getPeso()+" kg \n"
					+ "Color: "+ bagre.getColor()
					+ "Numero de patas: "+ bagre.getNumeroDePatas()
					+ "\nTamaño: "+ bagre.getTamaño()
					+ "\nMedio: "+ bagre.getMedio()
					+ "\nGenero: "+ bagre.getGenero()
					+ "\nTipo de alimentacion: "+ bagre.getAlimentacion()
					+ "\nPelo: "+ bagre.isPelo()
					+ "\nNumero de aletas: "+ bagre.getNumeroDeAletas()
					+ "\nNumero de branquias: "+ bagre.getNumeroDeBranquias()
					+ "\nCartilaginoso: "+ bagre.isCartilaginoso()
					+ "\nOseo: "+ bagre.isOseo()
					+ "\nEscamas: "+ bagre.isEscamas()
					);
					
					System.out.println("El Bagre: ");
					bagre.dormir();
					bagre.comer();
					bagre.mover(); bagre.salta(); System.out.print(" y "); bagre.nadar();
					bagre.procrear();
					bagre.respirarB();
					
					break;
			
			case 4: System.out.println("Anfibios: \n\n"
					+ "RANA VENENOSA: \n"
					+ "Edad: "+ ranaV.getEdad()+" años \n" 
					+ "Peso: "+ ranaV.getPeso()+" g \n"
					+ "Color: "+ ranaV.getColor()
					+ "\nNumero de patas: "+ ranaV.getNumeroDePatas()
					+ "\nTamaño: "+ ranaV.getTamaño()
					+ "\nMedio: "+ ranaV.getMedio()
					+ "\nGenero: "+ ranaV.getGenero()
					+ "\nTipo de alimentacion: "+ ranaV.getAlimentacion()
					+ "\nPelo: "+ ranaV.isPelo()
					+ "\nCola: "+ ranaV.isCola()
					+ "\nTipo de respiracion: "+ ranaV.getTipoDeRespiracion());
					
					System.out.println("La Rana Venenosa: ");
					ranaV.dormir();
					ranaV.comer();
					ranaV.mover(); ranaV.saltar();
					ranaV.procrear();
					ranaV.respirar();
					ranaV.caza();
					ranaV.defensa(); ranaV.veneno();
				
	
					
					System.out.println("\n\nSALAMANDRA: \n"
					+ "Edad: "+ salamandra.getEdad()+" años \n" 
					+ "Peso: "+ salamandra.getPeso()+" g \n"
					+ "Color: "+ salamandra.getColor()
					+ "\nNumero de patas: "+ salamandra.getNumeroDePatas()
					+ "\nTamaño: "+ salamandra.getTamaño()
					+ "\nMedio: "+ salamandra.getMedio()
					+ "\nGenero: "+ salamandra.getGenero()
					+ "\nTipo de alimentacion: "+ salamandra.getAlimentacion()
					+ "\nPelo: "+ salamandra.isPelo()
					+ "\nCola: "+ salamandra.isCola()
					+ "\nTipo de respiracion: "+ salamandra.getTipoDeRespiracion()
			
					);
					
					System.out.println("La Salamandra: ");
					salamandra.dormir();
					salamandra.comer();
					salamandra.mover(); salamandra.caminar(); System.out.print(", "); salamandra.correr(); System.out.print(" y "); salamandra.trepar();
					salamandra.procrear();
					salamandra.respirar();
					
					break;
					
			case 5: System.out.println("Reptiles: \n\n"
					+ "COBRA: \n"
					+ "Edad: "+ cobra.getEdad()+" años \n" 
					+ "Peso: "+ cobra.getPeso()+" kg \n"
					+ "Color: "+ cobra.getColor()
					+ "\nNumero de patas: "+ cobra.getNumeroDePatas()
					+ "\nTamaño: "+ cobra.getTamaño()
					+ "\nMedio: "+ cobra.getMedio()
					+ "\nGenero: "+ cobra.getGenero()
					+ "\nTipo de alimentacion: "+ cobra.getAlimentacion()
					+ "\nPelo: "+ cobra.isPelo()
					+ "\nCaparazon: "+ cobra.isExtremidades()
					+ "\nExtremidades: "+ cobra.isExtremidades()
					+ "\nDientes: "+ cobra.isDientes()
					+ "\nNumero de dientes: "+ cobra.getNumeroDeDientes());
			
					System.out.println("La Cobra: ");
					cobra.dormir();
					cobra.comer();
					cobra.mover();
					cobra.arrastrarse();
					cobra.procrear();
					cobra.respirar();
					cobra.defensa();
					cobra.atacaDeRegreso();
					cobra.caza();
					
					//Me equivoque y lo subi al branch master
			System.out.println("\n\nTORTUGA MARINA:"
					+ "Edad: "+ titu.getEdad()+" años \n" 
					+ "Peso: "+ titu.getPeso()+" kg \n"
					+ "Color: "+ titu.getColor()
					+ "\nNumero de patas: "+ titu.getNumeroDePatas()
					+ "\nTamaño: "+ titu.getTamaño()
					+ "\nMedio: "+ titu.getMedio()
					+ "\nGenero: "+ titu.getGenero()
					+ "\nTipo de alimentacion: "+ titu.getAlimentacion()
					+ "\nPelo: "+ titu.isPelo()
					+ "\nCaparazon: "+ titu.isExtremidades()
					+ "\nExtremidades: "+ titu.isExtremidades()
					+ "\nDientes: "+ titu.isDientes()
					+ "\nNumero de dientes: "+ titu.getNumeroDeDientes()
			 
					
					); 
			
			System.out.println("La Trotuga Marina: ");
			titu.dormir();
			titu.comer();
			titu.mover();
			titu.nadar();
			titu.procrear();
			titu.respirar();
			titu.defensa();
			titu.caparazon();
			
			break;
			}
			
		}
				
			}
	
	}

