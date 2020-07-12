package zoológico;

public class Peces extends AnimalZoo implements MecanismoDeAtaque, MecanismoDeDefensa{

	//Atributos
	private int numeroDeAletas, numeroDeBranquias;
	private boolean cartilaginoso, oseo, escamas;
	
	//Método Constructor
	public Peces() {
		super();
		}
	public Peces(int edad, int peso,  int numeroDePatas, String nombre, String tamaño, String medio, 
			String genero, String alimentacion, String color, boolean pelo, int numeroDeAletas, 
			int numeroDeBranquias, boolean cartilaginoso, boolean oseo, boolean escamas) {
		
		super(edad, peso, numeroDePatas, nombre, tamaño, medio, genero, alimentacion, color, pelo);
		
		this.numeroDeAletas = numeroDeAletas;
		this.numeroDeBranquias = numeroDeBranquias;
		this.cartilaginoso = cartilaginoso;
		this.oseo = oseo;
		this.escamas = escamas;
	}
	
	//Getters y Setters
	public int getNumeroDeAletas() {
		return numeroDeAletas;
	}

	public void setNumeroDeAletas(int numeroDeAletas) {
		this.numeroDeAletas = numeroDeAletas;
	}

	public int getNumeroDeBranquias() {
		return numeroDeBranquias;
	}

	public void setNumeroDeBranquias(int numeroDeBranquias) {
		this.numeroDeBranquias = numeroDeBranquias;
	}

	public boolean isCartilaginoso() {
		return cartilaginoso;
	}

	public void setCartilaginoso(boolean cartilaginoso) {
		this.cartilaginoso = cartilaginoso;
	}

	public boolean isOseo() {
		return oseo;
	}

	public void setOseo(boolean oseo) {
		this.oseo = oseo;
	}
	
	public boolean isEscamas() {
		return escamas;
	}

	public void setEscamas(boolean escamas) {
		this.escamas = escamas;
	}

	// Métodos:
	
	
	@Override
	public void dormir() {
		System.out.println("Duerme");
		
	}

	@Override
	public void comer() {
		System.out.println("Come");
		
	}

	@Override
	public void mover() {
		System.out.print("Se mueve: ");
		
	}

	@Override
	public void procrear() {
		System.out.println("Copulan y tienen huevos");
		
	}

	@Override
	public void respirar() {

		System.out.println("Respira mediante branquias");
		
	}
	
	public void nadar() {

		System.out.println("nada");
	}
	
	public void salta() {
		System.out.print("Hace pequeños saltos para respirar fuera del agua");
	}
	
	public void respirarB() {

		System.out.println("Respira mediante branquias y tambien puede respirar fuera del agua");
		
	}

	//Métodos de las interfaces
	@Override
	public void defensa() {
		System.out.print("Se defiende: ");
		
	}

	@Override
	public void atacaDeRegreso() {
		System.out.println("");
		
	}

	@Override
	public void espinas() {
		System.out.println("");
		
	}

	@Override
	public void veneno() {
		System.out.println("Se infla y suelta veneno");
		
	}

	@Override
	public void caza() {
		System.out.println("Caza a us presas");
		
	}

	@Override
	public void caparazon() {
		// TODO Auto-generated method stub
		
	}
	
	
}
