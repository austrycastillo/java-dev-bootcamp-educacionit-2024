package practicaInmueble;

public class InmuebleVivienda extends Inmueble {
	/*
	 * Atributos
	 */
	protected int númeroHabitaciones;
	protected int númeroBaños;

	/**
	 * Constructor
	 */
	public InmuebleVivienda(int identificadorInmobiliario, int área, String dirección, int númeroHabitaciones,
			int númeroBaños) {
		super(identificadorInmobiliario, área, dirección); /*
															 * Invoca al constructor de la clase padre
															 */
		this.númeroHabitaciones = númeroHabitaciones;
		this.númeroBaños = númeroBaños;
	}

	/**
	* Método que muestra en pantalla los datos de un inmueble para la
	* vivienda
	*/
	@Override
	public void imprimir() {
	super.imprimir(); // Invoca al método imprimir de la clase padre
	System.out.println("Número de habitaciones = " +
	númeroHabitaciones);
	System.out.println("Número de baños = " + númeroBaños);
	}
}
