package clase12;

//clase concreta - superclase(herencia)
//clase encapsulada
public class Animal {
	// atributos
	protected String nombre;
	protected String raza;
	protected String color;
	protected String tamano;
	private String tipo;

	// métodos
	// constructor
	public Animal(String nombre, String raza, String color, String tamano, String tipo) {
		this.nombre = nombre;
		this.raza = raza;
		this.color = color;
		this.tamano = tamano;
		this.tipo = tipo;
	}

	public Animal() {

	}

	// setters y getters
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public String getRaza() {
		return raza;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public String getTamano() {
		return tamano;
	}

	public void setTamano(String tamano) {
		this.tamano = tamano;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public void imprimeDatos() {
		System.out.println("El nombre del animal es " + nombre);
	}

	public void saludar() {
		System.out.println("Hola Animal");
	}

	public String cantar() {
		return "Canto como un Animal";
	}
	@Override
	public String toString() {
		return "Animal---> nombre=" + nombre + ", raza=" + raza + ", color=" + color + ", tamano=" + tamano + ", tipo="
				+ tipo;
	}

}
