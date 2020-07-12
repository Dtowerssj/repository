package zool�gico;

public class Mamiferos extends AnimalZoo implements MecanismoDeAtaque, MecanismoDeDefensa, FormasDeDesplazarse {

	//Atributos
	private int numeroDeDientes, numeroDeGlandulasMamarias;
	private String cantidadDePelo;
	private boolean oreja, huesosEnElOido;
	
	//M�todo Constructor
	public Mamiferos() {
		super();
		}
	public Mamiferos(int edad, int peso, int numeroDePatas, String nombre, String tama�o,
			String medio, String genero, String alimentacion, String color,
			boolean pelo, int numeroDeDientes, int numeroDeGlandulasMamarias, 
			String cantidadDePelo, boolean oreja, boolean huesosEnElOido) {
		
		super(edad, peso, numeroDePatas, nombre, tama�o, medio, genero, alimentacion, color, pelo);
		
	
		this.numeroDeDientes = numeroDeDientes;
		this.numeroDeGlandulasMamarias = numeroDeGlandulasMamarias;
		this.cantidadDePelo = cantidadDePelo;
		this.oreja = oreja;
		this.huesosEnElOido = huesosEnElOido;
	}
	
	//Getters y Setters
	public int getNumeroDeDientes() {
		return numeroDeDientes;
	}

	public void setNumeroDeDientes(int numeroDeDientes) {
		this.numeroDeDientes = numeroDeDientes;
	}

	public int getNumeroDeGlandulasMamarias() {
		return numeroDeGlandulasMamarias;
	}

	public void setNumeroDeGlandulasMamarias(int numeroDeGlandulasMamarias) {
		this.numeroDeGlandulasMamarias = numeroDeGlandulasMamarias;
	}

	public String getCantidadDePelo() {
		return cantidadDePelo;
	}

	public void setCantidadDePelo(String cantidadDePelo) {
		this.cantidadDePelo = cantidadDePelo;
	}

	public boolean isOreja() {
		return oreja;
	}

	public void setOreja(boolean oreja) {
		this.oreja = oreja;
	}

	public boolean isHuesosEnElOido() {
		return huesosEnElOido;
	}

	public void setHuesosEnElOido(boolean huesosEnElOido) {
		this.huesosEnElOido = huesosEnElOido;
	}
	
	//M�todos heredados
	
	public void comer() {
		System.out.println("Come usando su mandibula");
	}
	
	public void dormir() {
		System.out.println("Duerme");
	}
	
	public void mover() {
		System.out.print("Se mueve: ");
	}
	
	public void procrear() {
		System.out.println("Se aparea");
	}
	
	public void respirar() {
		System.out.println("Respira");
	}
	
	/* M�todos: 
	 * Cuidan a sus cr�as
	 * Juegan
	 * Se adaptan a un determinado h�bitat
	 * Se agrupan
	 * Dintintas formas de desplazarse (nadan, vuelan, corren, saltan, trepan, reptan o planean)
	 * */ 
	
	public void cuidarCrias() {
		System.out.println("Cuida a sus cr�as");
	}
	
	public void jugar() {
		System.out.println("Juega");
	}
	
	public void adaptacion() {
		System.out.println("Se adapta a distintos habitats");
	}
	
	public void agrupacion() {
		System.out.println("Van en manada");
	}
	
	//M�todos de la interfaz
	@Override
	public void defensa() {
		System.out.print("Se defiende cuando lo atacan: ");
	}
	
	@Override
	public void atacaDeRegreso() {
		System.out.println("Ataca de regreso");
	}
	
	public void espinas() {
		System.out.println("Suelta espinas");
	}

	@Override
	public void caza() {
		System.out.println("Caza a sus presas");
	}

	@Override
	public void caminar() {
		System.out.print("camina");
		
	}

	@Override
	public void volar() {
		System.out.print("vuela");
		
	}

	@Override
	public void nadar() {
		System.out.print("nada");
		
	}

	@Override
	public void saltar() {
		System.out.println("salta");
		
	}

	@Override
	public void trepar() {
		System.out.print("trepa");
		
	}

	@Override
	public void planear() {
		System.out.print("planea");
		
	}

	@Override
	public void correr() {
		System.out.print("corre");
		
	}

	@Override
	public void veneno() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void arrastrarse() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void caparazon() {
		// TODO Auto-generated method stub
		
	}
	
		
		
		
}
