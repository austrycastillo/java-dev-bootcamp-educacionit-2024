package practicaInmueble;

public class CasaRural extends Casa {
	// Atributos
	protected static final double VALORAREA = 1500000;
	protected int distanciaCabera;
	protected int altitud;

	/**
	 * Constructor
	 */
	public CasaRural(int identificadorInmobiliario, int área, String dirección, int númeroHabitaciones, int númeroBaños,
			int númeroPisos, int distanciaCabera, int altitud) {
		// Invoca al constructor de la clase padre
		super(identificadorInmobiliario, área, dirección, númeroHabitaciones, númeroBaños, númeroPisos);
		this.distanciaCabera = distanciaCabera;
		this.altitud = altitud;
	}

	/**
			* Método que muestra en pantalla los datos de una casa rural
			*/
	@Override
	public void imprimir() {
			super.imprimir(); // Invoca al método imprimir de la clase padre
			System.out.println("Distancia la cabecera municipal = " + númeroHabitaciones + " km.");
			System.out.println("Altitud sobre el nivel del mar = " + altitud + " metros.");
			System.out.println();
			}
}
