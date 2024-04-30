package clase12;

public class AppPrincipal {

	public static void main(String[] args) {
		Animal ani = new Animal();
		ani.saludar();
		ani.nombre = "coco";
		ani.color = "azul";
		ani.setTipo("doméstico");
		System.out.println(ani.getTipo());
		Animal ani2 = new Animal("michi", "x", "negro", "mediano", "x");
		System.out.println(ani2.toString());
		// crear un objeto para mi clase derivada
		Perro p1 = new Perro();
		p1.saludar();
		Perro p2 = new Perro("michi", "x", "negro", "mediano", "x", "dog show");
		System.out.println("El animal se llama " + p2.getNombre() + " y su color es " + p2.getColor());
		System.out.println(p2.toString());
		Gato g1 = new Gato();
		g1.saludar();
		System.out.println("****mostramos cantar***");
		System.out.println(ani.cantar());
		System.out.println(g1.cantar());
	}

}
