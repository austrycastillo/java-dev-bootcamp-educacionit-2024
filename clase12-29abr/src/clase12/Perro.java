package clase12;

public class Perro extends Animal {
	// atributos
	private String marca_croquetas;

	// métodos
	// constructor
	public Perro(String nombre, String raza, String color, String tamano, String tipo, String marca_croquetas) {
		super(nombre, raza, color, tamano, tipo);
		this.marca_croquetas = marca_croquetas;
	}

	public Perro() {

	}
	public void imprimeMarcaCroquetas() {
		System.out.println(marca_croquetas);
	}

	@Override
	public String toString() {
		return "Perro [marca_croquetas=" + marca_croquetas + "]" + super.toString();
	}

	@Override
	public void saludar() {
		System.out.println("Hola Perro");
	}

}
