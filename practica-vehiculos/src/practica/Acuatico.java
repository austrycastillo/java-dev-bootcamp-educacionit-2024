package practica;

public class Acuatico extends Vehiculo implements Motor, Vela {

	public Acuatico(int velocidadActual, int velocidadMaxima) {
		super(velocidadActual, velocidadMaxima);

	}

	@Override
	public void acelerar(int velocidad) {
		velocidadActual = velocidadActual + velocidad;
		System.out.println("La velocidad acuática solicitada es " + velocidadActual);

	}

	@Override
	public void frenar(int velocidad) {
		velocidadActual = velocidadActual - velocidad;
		System.out.println("La velocidad acuática solicitada es " + velocidadActual);
	}

	@Override
	public void recomendarVelocidad(int velocidadViento) {
		if (velocidadViento > 50)
			System.out.println("Se recomienda disminuir la velocidad");
		else
			System.out.println("Vamos bien en velocidad");

	}

	@Override
	public int calcularRevolucionesMotor(int fuerza, int radio) {
		return fuerza * radio;
	}

}
