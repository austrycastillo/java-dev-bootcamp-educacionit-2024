package practicaInmueble;

public class Apartamento extends InmuebleVivienda {
	/**
	 * Constructor
	 */
	public Apartamento(int identificadorInmobiliario, int área, String dirección, int númeroHabitaciones,
			int númeroBaños) {
		// Invoca al constructor de la clase padre
		super(identificadorInmobiliario, área, dirección, númeroHabitaciones, númeroBaños);
	}

	/**
	 * Método que muestra en pantalla los datos de un apartamento
	 */
	@Override
	public void imprimir() {
		super.imprimir(); // Invoca al método imprimir de la clase padre
	}
}
