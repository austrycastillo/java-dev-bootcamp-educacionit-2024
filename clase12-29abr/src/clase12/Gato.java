package clase12;

public class Gato extends Animal {
	private String marca_arena;

	public void imprimeMarcaArena() {
		System.out.println(marca_arena);
	}

	@Override
	public void saludar() {
		super.saludar();
		System.out.println("Hola Gato");
	}

	@Override
	public String cantar() {
		return super.cantar() + " Canto como un gatito";

	}
}
