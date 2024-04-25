package clase11;

public class Principal {

	public static void main(String[] args) {
		Coche coche1 = new Coche();// creando un objeto
		Coche coche2 = new Coche();
		Coche coche3 = new Coche();
		coche1.color = "rojo";
		// coche1.marca = "Toyota";
		coche1.modelo = "Prius";
		coche1.precio = 250000;
		System.out.println("El color de auto 1 es: " + coche1.color);
		coche1.color = "rosa";
		System.out.println("El color de auto 1 es: " + coche1.color);
		System.out.println(coche1.calcularPrecio(0.80));
		coche1.setMarca("Toyota");
		Coche coche4 = new Coche("azul", "Audi", "A4", 100000);

	}

}
