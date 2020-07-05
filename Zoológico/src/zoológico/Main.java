package zoológico;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Main {
	
	
	private static ArrayList <Mamiferos> listaMamiferos = new ArrayList<Mamiferos>();
	

		
	public static void main(String[] args) {
		 
		Mamiferos leon = new Mamiferos(9, 190, 4, "Leon","Grande", "Terrestre", "Macho", "Carnivoro",
				"amarillo", true, 30, 0, "abundante", true, true);  

		Mamiferos canguro = new Mamiferos(10, 30, 2, "Canguro", "grande", "terrestre", "hembra", "herbivoro", 
"gris", true, 14, 4, "moderado", true, true);

Mamiferos espin = new Mamiferos(22, 10, 4, "Puercoespín", "pequeño", "Terrestre", "Hembra", "Herbivoro", 
"marron", true, 36, 6, "poco", true, true);

//Aves
Aves aguila = new Aves(15, 5, 2, "Águila", "mediano", "aereo", "macho",
"carnivoro", "marron con blanco", false, 20000, "gris", true);

Aves colibri = new Aves(2, 4, 2, "Colibrí", "muy pequeño", "aereo", "hembra", 
"herbivoro", "verde esmeralda", false, 100, "negro", true);

//Peces
Peces tiburon = new Peces(25, 1005, 0, "Tiburon", "Grande", "acuatico", "hembra", "carnivoro", 
"gris con blanco", false, 8, 5, true, false, true);

Peces bagre = new Peces(40, 1, 0, "Bagre", "pequeño", "acuatico y terrestre", "macho", 
"omnivoro", "gris oscuro", false, 7, 6, false, true, false);

Peces globo = new Peces(6, 300, 0, "Pez Globo", "pequeño", "acuatico", "macho", "omnivoro", 
"marron amarillento", false, 4, 8, false, true, false);

//Anfibios
Anfibios ranaV = new Anfibios(3, 10, 4, "Rana Venenosa", "muy pequeño", "acuatico y terrestre", 
"macho", "insectivoro", "negro con manchas de colores llamativos", 
false, false, "cutanea y pulmonar");

Anfibios salamandra = new Anfibios(15, 40, 4, "Salamandra", "pequeño", "acuatico y terrestre",
"hembra", "insectivoro", "Gris ocscuro con manchas", false, true, "branquial/pulmonar");

//Reptiles
Reptiles titu = new Reptiles(20, 290, 4, "Tortuga", "Muy grande", "acuatico", "hembra",
"omnivoro", "verde orcuro", false, true, true, false, 0);

Reptiles cobra = new Reptiles(5, 12, 0, "Cobra", "grande (largo)", "terrestre", "macho", 
"carnivoro", "marron claro", false, false, false, true, 2);

//ArrayList

		//ArrayList Mamíferos
		listaMamiferos = new ArrayList<Mamiferos>();
		listaMamiferos.add(leon);
		listaMamiferos.add(canguro);
		listaMamiferos.add(espin);
		
		//ArrayList Aves
		ArrayList <Aves> listaAves = new ArrayList<Aves>();
		listaAves.add(aguila);
		listaAves.add(colibri);
		
		//ArrayList Peces
		ArrayList <Peces> listaPeces = new ArrayList<Peces>();
		listaPeces.add(tiburon);
		listaPeces.add(bagre);
		listaPeces.add(globo);
		
		//ArrayList Anfibios
		ArrayList <Anfibios> listaAnfibios = new ArrayList<Anfibios>();
		listaAnfibios.add(ranaV);		
		listaAnfibios.add(salamandra);
		
		//ArrayList Reptiles
		ArrayList <Reptiles> listaReptiles = new ArrayList<Reptiles>();
		listaReptiles.add(cobra);
		listaReptiles.add(titu);
	
		listaMamiferos = new ArrayList<Mamiferos>();
		

		int si = Integer.parseInt(JOptionPane.showInputDialog("¡BIENVENIDO AL ZOOLÓGICO! \n "
				+ "Especializado en animales vertebrados \n\n"
				+ "Seleccione la opcion de ver animales(digitando un numero): \n\n"
				+ "1. Ver animales del Zoologico \n"
				+ "2. Agregar animal al Zoologico"));
		
		if (si ==1) {
			
			int tipo = Integer.parseInt(JOptionPane.showInputDialog("Seleccione la clasificación: \n\n"
					+ "1. Mamiferos \n"
					+ "2. Aves \n"
					+ "3. Peces \n"
					+ "4. Anfibios \n"
					+ "5. Reptiles \n"));
					
			switch(tipo) {
	
			case 1: 
				
				System.out.println("CARACTERISTICAS DE LOS MAMIFEROS DEL ZOO: ");
				
				for (Mamiferos mam : listaMamiferos) {
				
				System.out.println("\n\n"
						+ "NOMBRE: "+mam.getNombre()
						+ "\nEdad: "+ mam.getEdad()+" años \n" 
						+ "Peso: "+ mam.getPeso()+" kg \n"
						+ "Color: "+ mam.getColor()
						+ "\nNumero de patas: "+ mam.getNumeroDePatas()
						+ "\nTamaño: "+ mam.getTamaño()
						+ "\nMedio: "+ mam.getMedio()
						+ "\nGenero: "+ mam.getGenero()
						+ "\nTipo de alimentacion: "+ mam.getAlimentacion()
						+ "\nPelo: "+ mam.isPelo()
						+ "\nCantidad de pelo: "+ mam.getCantidadDePelo()
						+ "\nNumero de dientes: "+ mam.getNumeroDeDientes()
						+ "\nNumero de glandulas mamarias: "+ mam.getNumeroDeGlandulasMamarias()
						+ "\nOreja: "+ mam.isOreja()
						+ "\nHuesos en el oido: "+ mam.isHuesosEnElOido()
						+ "\nNumero de dientes: "+ mam.getNumeroDeDientes());
					}
			
					System.out.println("\n\nCOMPORTAMIENTO DE LOS MAMIFEROS DEL ZOO:\n\n"
					+"\n\nEl "+leon.getNombre()+":");
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
				
					System.out.println("\n\nEl "+canguro.getNombre()+":");
					canguro.comer();
					canguro.dormir();
					canguro.mover(); canguro.saltar(); 
					canguro.procrear();
					canguro.respirar();
					canguro.cuidarCrias();
					canguro.jugar();
					canguro.adaptacion();
					canguro.defensa(); canguro.atacaDeRegreso();
					
					System.out.println("\n\nEl "+espin.getNombre()+":");
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
					
			case 2: 
				
			System.out.println("CARACTERISTICAS DE LAS AVES DEL ZOO: ");
			
			for (Aves av : listaAves) {
			
			System.out.println("\n\n"
					+ "NOMBRE: "+av.getNombre()
					+ "\nEdad: "+ av.getEdad()+" años \n" 
					+ "Peso: "+ av.getPeso()+" kg \n"
					+ "Color: "+ av.getColor()
					+ "\nNumero de patas: "+ av.getNumeroDePatas()
					+ "\nTamaño: "+ av.getTamaño()
					+ "\nMedio: "+ av.getMedio()
					+ "\nGenero: "+ av.getGenero()
					+ "\nTipo de alimentacion: "+ av.getAlimentacion()
					+ "\nPelo: "+ av.isPelo()
					+ "\nNumero de plumas: "+ av.getNumeroDePlumas()
					+ "\nColor de pico: "+ av.getColorDePico()
					+ "\nGarras: "+ av.isGarras());
				}
			
					System.out.println("\n\nCOMPORTAMIENTO DE LAS AVES DEL ZOO: \n\n"
					+ "El "+aguila.getNombre()+":");
					aguila.dormir();
					aguila.comer();
					aguila.mover(); aguila.planear(); System.out.print(" y "); aguila.volar();
					aguila.procrear();
					aguila.respirar();
					aguila.migrar();
					aguila.caza();
					
					System.out.println("\n\nEl "+colibri.getNombre()+":");
					colibri.dormir();
					colibri.comer();
					colibri.mover(); colibri.volar();
					colibri.procrear();
					colibri.respirar();
					colibri.migrar();
					
					break;
					
			
			
			case 3: 
			
			System.out.println("CARACTERISTICAS DE LOS PECES DEL ZOO: ");
			
			for (Peces pe : listaPeces) {
			
			System.out.println("\n\n"
					+ "NOMBRE: "+pe.getNombre()
					+ "\nEdad: "+ pe.getEdad()+" años \n" 
					+ "Peso: "+ pe.getPeso()+" kg \n"
					+ "Color: "+ pe.getColor()
					+ "\nNumero de patas: "+ pe.getNumeroDePatas()
					+ "\nTamaño: "+ pe.getTamaño()
					+ "\nMedio: "+ pe.getMedio()
					+ "\nGenero: "+ pe.getGenero()
					+ "\nTipo de alimentacion: "+ pe.getAlimentacion()
					+ "\nPelo: "+ pe.isPelo()
					+ "\nNumero de aletas: "+ pe.getNumeroDeAletas()
					+ "\nNumero de branquias: "+ pe.getNumeroDeBranquias()
					+ "\nCartilaginoso: "+ pe.isCartilaginoso()
					+ "\nOseo: "+ pe.isOseo()
					+ "\nEscamas: "+ pe.isEscamas());
			}
			
					System.out.println("\n\nCOMPORTAMIENTO DE LOS PECES DEL ZOO: \n\n"
							+ "El "+globo.getNombre()+":");
					globo.dormir();
					globo.comer();
					globo.mover(); globo.nadar();
					globo.defensa(); globo.veneno();
					globo.procrear();
					globo.respirar();
					
					System.out.println("\n\nEl "+tiburon.getNombre()+":");
					tiburon.dormir();
					tiburon.comer();
					tiburon.mover(); tiburon.nadar();
					tiburon.procrear();
					tiburon.respirar();
					tiburon.caza();
					
					System.out.println("\n\nEl "+bagre.getNombre()+":");
					bagre.dormir();
					bagre.comer();
					bagre.mover(); bagre.salta(); System.out.print(" y "); bagre.nadar();
					bagre.procrear();
					bagre.respirarB();
					
					break;
			
			case 4: 
				
				System.out.println("CARACTERISTICAS DE LOS ANFIBIOS DEL ZOO: ");
				
				for (Anfibios anf : listaAnfibios) {
				
				System.out.println("\n\n"
						+ "NOMBRE: "+anf.getNombre()
						+ "\nEdad: "+ anf.getEdad()+" años \n" 
						+ "Peso: "+ anf.getPeso()+" kg \n"
						+ "Color: "+ anf.getColor()
						+ "\nNumero de patas: "+ anf.getNumeroDePatas()
						+ "\nTamaño: "+ anf.getTamaño()
						+ "\nMedio: "+ anf.getMedio()
						+ "\nGenero: "+ anf.getGenero()
						+ "\nTipo de alimentacion: "+ anf.getAlimentacion()
						+ "\nPelo: "+ anf.isPelo()
						+ "\nCola: "+ anf.isCola()
						+ "\nTipo de respiracion: "+ anf.getTipoDeRespiracion());
				}
				
					System.out.println("\n\nCOMPORTAMIENTO DE LOS ANFIBIOS DEL ZOO: \n\n"
							+ "La "+ranaV.getNombre()+":");
					ranaV.dormir();
					ranaV.comer();
					ranaV.mover(); ranaV.saltar();
					ranaV.procrear();
					ranaV.respirar();
					ranaV.caza();
					ranaV.defensa(); ranaV.veneno();
					
					System.out.println("\n\nLa "+salamandra.getNombre()+":");
					salamandra.dormir();
					salamandra.comer();
					salamandra.mover(); salamandra.caminar(); System.out.print(", "); salamandra.correr(); System.out.print(" y "); salamandra.trepar();
					salamandra.procrear();
					salamandra.respirar();
					
					break;
					
			case 5: 

				System.out.println("CARACTERISTICAS DE LOS REPTILES DEL ZOO: ");
				
				for (Reptiles rep : listaReptiles) {
				
				System.out.println("\n\n"
						+ "NOMBRE: "+rep.getNombre()
						+ "\nEdad: "+ rep.getEdad()+" años \n" 
						+ "Peso: "+ rep.getPeso()+" kg \n"
						+ "Color: "+ rep.getColor()
						+ "\nNumero de patas: "+ rep.getNumeroDePatas()
						+ "\nTamaño: "+ rep.getTamaño()
						+ "\nMedio: "+ rep.getMedio()
						+ "\nGenero: "+ rep.getGenero()
						+ "\nTipo de alimentacion: "+ rep.getAlimentacion()
						+ "\nPelo: "+ rep.isPelo()
						+ "\nCaparazon: "+ rep.isCaparazon()
						+ "\nExtremidades: "+ rep.isExtremidades()
						+ "\nDientes: "+ rep.isDientes()
						+ "\nNumero de dientes: "+ rep.getNumeroDeDientes());
						
				}
			
					System.out.println("\n\nCOMPORTAMIENTO DE LOS REPTILES DEL ZOO: \n\n"
							+ "La "+cobra.getNombre()+":");
					cobra.dormir();
					cobra.comer();
					cobra.mover();
					cobra.arrastrarse();
					cobra.procrear();
					cobra.respirar();
					cobra.defensa();
					cobra.atacaDeRegreso();
					cobra.caza();
			
			System.out.println("\n\nLa "+titu.getNombre()+":");
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
			
		}else if (si == 2) {
				int x = Integer.parseInt(JOptionPane.showInputDialog("Seleccione la categoría del animal a agregar:"
						+ "\n\n1. Mamiferos"
						+ "\n2. Aves"
						+ "\n3. Peces"
						+ "\n4. Anfibios"
						+ "\n5. Reptiles"));
				
				switch (x) {
				case 1:
					
					int z=0;
					
					do{
							
						String n = JOptionPane.showInputDialog("Nombre: "), 
								t = JOptionPane.showInputDialog("Tamaño: "),
								m = JOptionPane.showInputDialog("Medio ambiente: "),
								g = JOptionPane.showInputDialog("Genero: "),
								a = JOptionPane.showInputDialog("tipo de alimentacion: "),
								c = JOptionPane.showInputDialog("Color: "),
								cp = JOptionPane.showInputDialog("Cantidad de pelo: ");
												
								
						int e = Integer.parseInt(JOptionPane.showInputDialog("Edad: ")), 
							p = Integer.parseInt(JOptionPane.showInputDialog("Peso: ")),
							np = Integer.parseInt(JOptionPane.showInputDialog("Numero de patas: ")),
							nd = Integer.parseInt(JOptionPane.showInputDialog("Numero de dientes: ")),
							ngm = Integer.parseInt(JOptionPane.showInputDialog("Numero de Glandulas mamarias: "));
						
							
							//pelo true, oreja true, huesoseneloido true
							listaMamiferos.add(new Mamiferos(e,p,np,n,t,m,g,a,c,true,nd,ngm,cp,true,true));
			
							for (int i=3;i<listaMamiferos.size();i++) {
								
							}
							
							z = Integer.parseInt(JOptionPane.showInputDialog("1. Agregar otro animal \n"
									+ "2. Mostrar animales mamiferos"));
							
							if(z == 2) {
								
								System.out.println("CARACTERISTICAS DE LOS MAMIFEROS DEL ZOO: ");
								
								for (Mamiferos mam : listaMamiferos) {
								
								System.out.println("\n\n"
										+ "NOMBRE: "+mam.getNombre()
										+ "\nEdad: "+ mam.getEdad()+" años \n" 
										+ "Peso: "+ mam.getPeso()+" kg \n"
										+ "Color: "+ mam.getColor()
										+ "\nNumero de patas: "+ mam.getNumeroDePatas()
										+ "\nTamaño: "+ mam.getTamaño()
										+ "\nMedio: "+ mam.getMedio()
										+ "\nGenero: "+ mam.getGenero()
										+ "\nTipo de alimentacion: "+ mam.getAlimentacion()
										+ "\nPelo: "+ mam.isPelo()
										+ "\nCantidad de pelo: "+ mam.getCantidadDePelo()
										+ "\nNumero de dientes: "+ mam.getNumeroDeDientes()
										+ "\nNumero de glandulas mamarias: "+ mam.getNumeroDeGlandulasMamarias()
										+ "\nOreja: "+ mam.isOreja()
										+ "\nHuesos en el oido: "+ mam.isHuesosEnElOido()
										+ "\nNumero de dientes: "+ mam.getNumeroDeDientes());
									}
							
									System.out.println("\n\nCOMPORTAMIENTO DE LOS MAMIFEROS DEL ZOO:\n\n"
									+"\n\nEl "+leon.getNombre()+":");
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
								
									System.out.println("\n\nEl "+canguro.getNombre()+":");
									canguro.comer();
									canguro.dormir();
									canguro.mover(); canguro.saltar(); 
									canguro.procrear();
									canguro.respirar();
									canguro.cuidarCrias();
									canguro.jugar();
									canguro.adaptacion();
									canguro.defensa(); canguro.atacaDeRegreso();
									
									System.out.println("\n\nEl "+espin.getNombre()+":");
									espin.comer();
									espin.dormir();
									espin.mover(); espin.caminar(); System.out.print(" y "); espin.trepar(); System.out.println("");
									espin.procrear();
									espin.respirar();
									espin.cuidarCrias();
									espin.jugar();
									espin.adaptacion();
									espin.defensa(); espin.espinas();
							
									for (int i=3;i<listaMamiferos.size();i++) {
										
											System.out.println("\n\nEl "
													+ listaMamiferos.get(i).getNombre()
													+ ": \n");
											listaMamiferos.get(i).comer();
											listaMamiferos.get(i).dormir();
											listaMamiferos.get(i).procrear();
											listaMamiferos.get(i).respirar();
											listaMamiferos.get(i).mover();
											listaMamiferos.get(i).cuidarCrias();
											listaMamiferos.get(i).jugar();
											listaMamiferos.get(i).adaptacion();
											listaMamiferos.get(i).agrupacion();		
									}
								}
							}while (z == 1);
					break;
					
				case 2:
					
					int z1=0;
					
					do{
							
						String n = JOptionPane.showInputDialog("Nombre: "), 
								t = JOptionPane.showInputDialog("Tamaño: "),
								m = JOptionPane.showInputDialog("Medio ambiente: "),
								g = JOptionPane.showInputDialog("Genero: "),
								a = JOptionPane.showInputDialog("tipo de alimentacion: "),
								c = JOptionPane.showInputDialog("Color: "),
								cp = JOptionPane.showInputDialog("Color de pico: ");
												
								
						int e = Integer.parseInt(JOptionPane.showInputDialog("Edad: ")), 
							p = Integer.parseInt(JOptionPane.showInputDialog("Peso: ")),
							np = Integer.parseInt(JOptionPane.showInputDialog("Numero de patas: ")),
							npl = Integer.parseInt(JOptionPane.showInputDialog("Numero de plumas: "));
							
						
						//pelo true, garras true
						
							listaAves.add(new Aves(e, p, np, n, t, m, g, a, c, true, npl, cp, true));
			
							
							z = Integer.parseInt(JOptionPane.showInputDialog("1. Agregar otro animal \n"
									+ "2. Mostrar aves del Zoo"));
							
							if(z == 2) {
								
								System.out.println("CARACTERISTICAS DE LAS AVES DEL ZOO: ");
								
								for (Aves av : listaAves) {
								
								System.out.println("\n\n"
										+ "NOMBRE: "+av.getNombre()
										+ "\nEdad: "+ av.getEdad()+" años \n" 
										+ "Peso: "+ av.getPeso()+" kg \n"
										+ "Color: "+ av.getColor()
										+ "\nNumero de patas: "+ av.getNumeroDePatas()
										+ "\nTamaño: "+ av.getTamaño()
										+ "\nMedio: "+ av.getMedio()
										+ "\nGenero: "+ av.getGenero()
										+ "\nTipo de alimentacion: "+ av.getAlimentacion()
										+ "\nPelo: "+ av.isPelo()
										+ "\nNumero de plumas: "+ av.getNumeroDePlumas()
										+ "\nColor de pico: "+ av.getColorDePico()
										+ "\nGarras: "+ av.isGarras());
									}
								
										System.out.println("\n\nCOMPORTAMIENTO DE LAS AVES DEL ZOO: \n\n"
												
										+ "El "+aguila.getNombre()+":");
										aguila.dormir();
										aguila.comer();
										aguila.mover(); aguila.planear(); System.out.print(" y "); aguila.volar();
										aguila.procrear();
										aguila.respirar();
										aguila.migrar();
										aguila.caza();
										
										System.out.println("\n\nEl "+colibri.getNombre()+":");
										colibri.dormir();
										colibri.comer();
										colibri.mover(); colibri.volar();
										colibri.procrear();
										colibri.respirar();
										colibri.migrar();
										
							
									for (int i=2;i<listaAves.size();i++) {
										
											System.out.println("\n\nEl "
													+ listaAves.get(i).getNombre()
													+ ": \n");
											listaAves.get(i).comer();
											listaAves.get(i).dormir();
											listaAves.get(i).procrear();
											listaAves.get(i).respirar();
											listaAves.get(i).mover();
											listaAves.get(i).migrar();
									}
								}
							}while (z1 == 1);
					break;
					
				case 3: //Peces
				
					int z2=0;
					
					do{
							
						String n = JOptionPane.showInputDialog("Nombre: "), 
								t = JOptionPane.showInputDialog("Tamaño: "),
								m = JOptionPane.showInputDialog("Medio ambiente: "),
								g = JOptionPane.showInputDialog("Genero: "),
								a = JOptionPane.showInputDialog("tipo de alimentacion: "),
								c = JOptionPane.showInputDialog("Color: ");
												
								
						int e = Integer.parseInt(JOptionPane.showInputDialog("Edad: ")), 
							p = Integer.parseInt(JOptionPane.showInputDialog("Peso: ")),
							np = Integer.parseInt(JOptionPane.showInputDialog("Numero de patas: ")),
							na = Integer.parseInt(JOptionPane.showInputDialog("Numero de aletas: ")),
							nb = Integer.parseInt(JOptionPane.showInputDialog("Numero de branquias: "));
						
						
						//pelo true, cartilaginoso true, oseo true, escamas true
						
							listaPeces.add(new Peces(e, p, np, n, t, m, g, a, c, true, na, nb, true, true, true));
			
							
							z = Integer.parseInt(JOptionPane.showInputDialog("1. Agregar otro animal \n"
									+ "2. Mostrar peces del Zoo"));
							
							if(z == 2) {
								
								System.out.println("CARACTERISTICAS DE LOS PECES DEL ZOO: ");
								
								for (Peces pe : listaPeces) {
								
								System.out.println("\n\n"
										+ "NOMBRE: "+pe.getNombre()
										+ "\nEdad: "+ pe.getEdad()+" años \n" 
										+ "Peso: "+ pe.getPeso()+" kg \n"
										+ "Color: "+ pe.getColor()
										+ "\nNumero de patas: "+ pe.getNumeroDePatas()
										+ "\nTamaño: "+ pe.getTamaño()
										+ "\nMedio: "+ pe.getMedio()
										+ "\nGenero: "+ pe.getGenero()
										+ "\nTipo de alimentacion: "+ pe.getAlimentacion()
										+ "\nPelo: "+ pe.isPelo()
										+ "\nNumero de aletas: "+ pe.getNumeroDeAletas()
										+ "\nNumero de branquias: "+ pe.getNumeroDeBranquias()
										+ "\nCartilaginoso: "+ pe.isCartilaginoso()
										+ "\nOseo: "+ pe.isOseo()
										+ "\nEscamas: "+ pe.isEscamas());
								}
								
										System.out.println("\n\nCOMPORTAMIENTO DE LOS PECES DEL ZOO: \n\n"
												+ "El "+globo.getNombre()+":");
										globo.dormir();
										globo.comer();
										globo.mover(); globo.nadar();
										globo.defensa(); globo.veneno();
										globo.procrear();
										globo.respirar();
										
										System.out.println("\n\nEl "+tiburon.getNombre()+":");
										tiburon.dormir();
										tiburon.comer();
										tiburon.mover(); tiburon.nadar();
										tiburon.procrear();
										tiburon.respirar();
										tiburon.caza();
										
										System.out.println("\n\nEl "+bagre.getNombre()+":");
										bagre.dormir();
										bagre.comer();
										bagre.mover(); bagre.salta(); System.out.print(" y "); bagre.nadar();
										bagre.procrear();
										bagre.respirarB();
										
										for (int i=3;i<listaPeces.size();i++) {
											
											System.out.println("\n\nEl "
													+ listaPeces.get(i).getNombre()
													+ ": \n");
											listaPeces.get(i).comer();
											listaPeces.get(i).dormir();
											listaPeces.get(i).procrear();
											listaPeces.get(i).respirar();
											listaPeces.get(i).mover();
											listaPeces.get(i).nadar();
									}
										
								
								}
							}while (z2 == 1);
					break;
					
				case 4:	
					
					int z3=0;
					
					do{
							
						String n = JOptionPane.showInputDialog("Nombre: "), 
								t = JOptionPane.showInputDialog("Tamaño: "),
								m = JOptionPane.showInputDialog("Medio ambiente: "),
								g = JOptionPane.showInputDialog("Genero: "),
								a = JOptionPane.showInputDialog("tipo de alimentacion: "),
								c = JOptionPane.showInputDialog("Color: "),
								tr = JOptionPane.showInputDialog("Color: ");
												
								
						int e = Integer.parseInt(JOptionPane.showInputDialog("Edad: ")), 
							p = Integer.parseInt(JOptionPane.showInputDialog("Peso: ")),
							np = Integer.parseInt(JOptionPane.showInputDialog("Numero de patas: "));
						
						//pelo true, cola true
							listaAnfibios.add(new Anfibios(e, p, np, n, t, m, g, a, c, true, true, tr));
			
							
							z = Integer.parseInt(JOptionPane.showInputDialog("1. Agregar otro animal \n"
									+ "2. Mostrar anfibios del Zoo"));
							
							if(z == 2) {
								
								System.out.println("CARACTERISTICAS DE LOS ANFIBIOS DEL ZOO: ");
								
								for (Anfibios anf : listaAnfibios) {
								
								System.out.println("\n\n"
										+ "NOMBRE: "+anf.getNombre()
										+ "\nEdad: "+ anf.getEdad()+" años \n" 
										+ "Peso: "+ anf.getPeso()+" kg \n"
										+ "Color: "+ anf.getColor()
										+ "\nNumero de patas: "+ anf.getNumeroDePatas()
										+ "\nTamaño: "+ anf.getTamaño()
										+ "\nMedio: "+ anf.getMedio()
										+ "\nGenero: "+ anf.getGenero()
										+ "\nTipo de alimentacion: "+ anf.getAlimentacion()
										+ "\nPelo: "+ anf.isPelo()
										+ "\nCola: "+ anf.isCola()
										+ "\nTipo de respiracion: "+ anf.getTipoDeRespiracion());
								}
								
									System.out.println("\n\nCOMPORTAMIENTO DE LOS ANFIBIOS DEL ZOO: \n\n"
											+ "La "+ranaV.getNombre()+":");
									ranaV.dormir();
									ranaV.comer();
									ranaV.mover(); ranaV.saltar();
									ranaV.procrear();
									ranaV.respirar();
									ranaV.caza();
									ranaV.defensa(); ranaV.veneno();
									
									System.out.println("\n\nLa "+salamandra.getNombre()+":");
									salamandra.dormir();
									salamandra.comer();
									salamandra.mover(); salamandra.caminar(); System.out.print(", "); salamandra.correr(); System.out.print(" y "); salamandra.trepar();
									salamandra.procrear();
									salamandra.respirar();
									
										
										for (int i=2;i<listaAnfibios.size();i++) {
											
											System.out.println("\n\nEl "
													+ listaAnfibios.get(i).getNombre()
													+ ": \n");
											listaAnfibios.get(i).comer();
											listaAnfibios.get(i).dormir();
											listaAnfibios.get(i).procrear();
											listaAnfibios.get(i).respirar();
											listaAnfibios.get(i).mover();
											
									}
								}
							}while (z3 == 1);
					break;
					
				case 5:
					
					int z4=0;
					
					do{
							
						String n = JOptionPane.showInputDialog("Nombre: "), 
								t = JOptionPane.showInputDialog("Tamaño: "),
								m = JOptionPane.showInputDialog("Medio ambiente: "),
								g = JOptionPane.showInputDialog("Genero: "),
								a = JOptionPane.showInputDialog("tipo de alimentacion: "),
								c = JOptionPane.showInputDialog("Color: ");
												
								
						int e = Integer.parseInt(JOptionPane.showInputDialog("Edad: ")), 
							p = Integer.parseInt(JOptionPane.showInputDialog("Peso: ")),
							np = Integer.parseInt(JOptionPane.showInputDialog("Numero de patas: ")),
							nd = Integer.parseInt(JOptionPane.showInputDialog("Numero de dientes: "));
						
						//pelo true, caparazon true, extremidades true, dientes true
							listaReptiles.add(new Reptiles(e, p, np, n, t, m, g, a, c, true, true, true, true, nd));
			
							
							z = Integer.parseInt(JOptionPane.showInputDialog("1. Agregar otro animal \n"
									+ "2. Mostrar reptiles del Zoo"));
							
							if(z == 2) {
								
								System.out.println("CARACTERISTICAS DE LOS REPTILES DEL ZOO: ");
								
								for (Reptiles rep : listaReptiles) {
								
								System.out.println("\n\n"
										+ "NOMBRE: "+rep.getNombre()
										+ "\nEdad: "+ rep.getEdad()+" años \n" 
										+ "Peso: "+ rep.getPeso()+" kg \n"
										+ "Color: "+ rep.getColor()
										+ "\nNumero de patas: "+ rep.getNumeroDePatas()
										+ "\nTamaño: "+ rep.getTamaño()
										+ "\nMedio: "+ rep.getMedio()
										+ "\nGenero: "+ rep.getGenero()
										+ "\nTipo de alimentacion: "+ rep.getAlimentacion()
										+ "\nPelo: "+ rep.isPelo()
										+ "\nCaparazon: "+ rep.isCaparazon()
										+ "\nExtremidades: "+ rep.isExtremidades()
										+ "\nDientes: "+ rep.isDientes()
										+ "\nNumero de dientes: "+ rep.getNumeroDeDientes());
										
								}
							
									System.out.println("\n\nCOMPORTAMIENTO DE LOS REPTILES DEL ZOO: \n\n"
											+ "La "+cobra.getNombre()+":");
									cobra.dormir();
									cobra.comer();
									cobra.mover();
									cobra.arrastrarse();
									cobra.procrear();
									cobra.respirar();
									cobra.defensa();
									cobra.atacaDeRegreso();
									cobra.caza();
							
							System.out.println("\n\nLa "+titu.getNombre()+":");
							titu.dormir();
							titu.comer();
							titu.mover();
							titu.nadar();
							titu.procrear();
							titu.respirar();
							titu.defensa();
							titu.caparazon();
							
							for (int i=2;i<listaReptiles.size();i++) {
								
								System.out.println("\n\nEl "
										+ listaReptiles.get(i).getNombre()
										+ ": \n");
								listaReptiles.get(i).comer();
								listaReptiles.get(i).dormir();
								listaReptiles.get(i).procrear();
								listaReptiles.get(i).respirar();
								listaReptiles.get(i).mover();
						}
							
							 }
								
							}while (z4 == 1);
					break;
					
						}
					}
				}
			}
	

