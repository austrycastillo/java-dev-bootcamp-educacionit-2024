package practica;

public class Terrestre extends Vehiculo implements Motor {

	public Terrestre(int velocidadActual, int velocidadMaxima) {
		super(velocidadActual, velocidadMaxima);

	}

	@Override
	public void acelerar(int velocidad) {
		velocidadActual = velocidadActual + velocidad;
		System.out.println("La velocidad terrestre solicitada es " + velocidadActual);

	}

	@Override
	public void frenar(int velocidad) {
		velocidadActual = velocidadActual - velocidad;
		System.out.println("La velocidad terrestre solicitada es " + velocidadActual);
	}

	@Override
	public int calcularRevolucionesMotor(int fuerza, int radio) {
		return fuerza * radio;
	}

}
