package practicaInmueble;

public class ApartaEstudio extends Apartamento {
	// Atributo
	protected static final double VALORAREA = 1500000;

	/**
	 * Constructor
	 */
	public ApartaEstudio(int identificadorInmobiliario, int área,
			String
	dirección,
	int númeroHabitaciones, int númeroBaños) {
	// Invoca al constructor de la clase padre
	// Los apartaestudios tienen una sola habitación y un solo baño
	super(identificadorInmobiliario, área, dirección, 1, 1);
	}

	/**
	 * Método que muestra en pantalla los datos de un apartaestudio
	 */
	@Override
	public void imprimir() {
		super.imprimir(); // Invoca al método imprimir de la clase padre
		System.out.println();
	}
}
