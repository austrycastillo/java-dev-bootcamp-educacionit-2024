package practicaInmueble;

public class CasaUrbana extends Casa {
	/**
	 * Constructor de la clase CasaUrbana
	 * 
	 */
	public CasaUrbana(int identificadorInmobiliario, int área, String dirección, int númeroHabitaciones,
			int númeroBaños, int númeroPisos) {
		// Invoca al constructor de la clase padre
		super(identificadorInmobiliario, área, dirección, númeroHabitaciones, númeroBaños, númeroPisos);
	}

	/**
	 * Método que muestra en pantalla los datos de una casa urbana
	 */
	@Override
	public void imprimir() {
		super.imprimir(); // Invoca al método imprimir de la clase padre
	}
}
