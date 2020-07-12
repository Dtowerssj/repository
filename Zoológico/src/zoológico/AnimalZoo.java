package zool�gico;

public abstract class AnimalZoo {

	//Atributos animales
	private int edad, peso, numeroDePatas;
	private String nombre, tama�o, medio, genero, alimentacion, color;
	boolean pelo;
	
	//M�todos:
	
	//M�todos constructores
	public AnimalZoo() {
		this.edad = 3; //a�os
		this.peso = 2; //kg         
		this.numeroDePatas = 4;
		this.nombre = "perro";
		this.tama�o = "peque�o";
		this.medio = "terrestre";
		this.genero = "hembra";
		this.alimentacion = "omnivoro";
		this.color = "blanco";         // Sobrecarga de m�todos constructores
		this.pelo = true;
	}
	public AnimalZoo(int edad, int peso, int numeroDePatas, String nombre, String tama�o, 
			String medio, String genero, String alimentacion,  String color,
			boolean pelo) {
		
		this.edad = edad;
		this.peso = peso;
		this.numeroDePatas = numeroDePatas;
		this.nombre = nombre;
		this.tama�o = tama�o;
		this.medio = medio;
		this.genero = genero;
		this.alimentacion = alimentacion;
		this.color = color;
		this.pelo = pelo;
	}
	
	//Getters y Setters
	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	public int getNumeroDePatas() {
		return numeroDePatas;
	}

	public void setNumeroDePatas(int numeroDePatas) {
		this.numeroDePatas = numeroDePatas;
	}

	public String getTama�o() {
		return tama�o;
	}

	public void setTama�o(String tama�o) {
		this.tama�o = tama�o;
	}

	public String getMedio() {
		return medio;
	}

	public void setMedio(String medio) {
		this.medio = medio;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getAlimentacion() {
		return alimentacion;
	}

	public void setAlimentacion(String alimentacion) {
		this.alimentacion = alimentacion;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isPelo() {
		return pelo;
	}

	public void setPelo(boolean pelo) {
		this.pelo = pelo;
	}
	
	//M�todos: dormir, comer, mover, procrear 

	public abstract void dormir();
	
	public abstract void comer();
	
	public abstract void mover();
	
	public abstract void procrear();
	
	public abstract void respirar();
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
}
