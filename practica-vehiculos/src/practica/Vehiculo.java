package practica;

public abstract class Vehiculo {
	// atributos
	protected int velocidadActual;
	protected int velocidadMaxima;

	// métodos
	public Vehiculo(int velocidadActual, int velocidadMaxima) {
		this.velocidadActual = velocidadActual;
		this.velocidadMaxima = velocidadMaxima;
	}

	public void imprimir() {
		System.out
				.println("La velocidad actual es " + velocidadActual + " y la velocidad máxima es " + velocidadMaxima);

	}

	public abstract void acelerar(int velocidad);

	public abstract void frenar(int velocidad);

}
