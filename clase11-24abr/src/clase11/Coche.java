package clase11;

//mi clase concreta coche
public class Coche {
	// atributos: descripción, lo que tiene...
	public String color;
	private String marca;
	String modelo;
	int precio;

	// métodos: funciones(return), procedimientos(void), acciones, lo que hace
	void arrancarMotor() {
		System.out.println("arrancando motor...");
	}

	String frenar() {
		String mensaje = "el auto está frenando";
		return mensaje;
	}

	void acelerar(int km) {
		System.out.println("El auto está acelerando a " + km + " km");
	}

	boolean tocarClaxon() {
		return true;
	}

	double calcularPrecio(double desc) {
		return precio * desc;
	}

	// SETTERS: INICIALIZAR UNA VARIABLE, PASAR UN VALOR, SETEAR UN DATO

	public void setMarca(String marca) {
		this.marca = marca;
	}

	// GETTERS: RETORNA EL VALOR DE LA VARIABLE
	public String getMarca() {
		return marca;
	}

	// CONSTRUCTOR
	// sobrecarga de constructor (un tipo de polimorfismo)
	Coche(String color, String marca, String modelo, int precio) {
		this.color = color;
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
		// int x = 2 *3;
	}

	Coche(String color, String marca) {
		this.color = color;
		this.marca = marca;

	}
	Coche() {

	}


}
