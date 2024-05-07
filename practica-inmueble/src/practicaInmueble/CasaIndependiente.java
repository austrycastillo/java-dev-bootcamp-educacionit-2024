package practicaInmueble;

public class CasaIndependiente extends CasaUrbana {
	// Atributo
	protected static final double VALORAREA = 3000000;

	/**
	 * Constructor
	 */
	public CasaIndependiente(int identificadorInmobiliario, int área, String dirección, int númeroHabitaciones,
			int númeroBaños, int númeroPisos) {
		// Invoca al constructor de la clase padre
		super(identificadorInmobiliario, área, dirección, númeroHabitaciones, númeroBaños, númeroPisos);
	}

	/**
	 * Método que muestra en pantalla los datos de una casa independiente
	 */
	@Override
	public void imprimir() {
		super.imprimir(); // Invoca al método imprimir de la clase padre
		System.out.println();
	}
}
