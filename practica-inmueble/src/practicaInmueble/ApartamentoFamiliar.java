package practicaInmueble;

public class ApartamentoFamiliar extends Apartamento {
	// Atributos
	protected static final double VALORAREA = 2000000;
	protected int valorAdministración;

	/**
	 * Constructor
	 */
	public ApartamentoFamiliar(int identificadorInmobiliario, int área,
	String dirección, int númeroHabitaciones, int númeroBaños, int
			valorAdministración) {
	// Invoca al constructor de la clase padre
	super(identificadorInmobiliario, área, dirección,
	númeroHabitaciones, númeroBaños);
	this.valorAdministración = valorAdministración;
	}

	/**
	* Método que muestra en pantalla los datos de un apartamento familiar
	*/
	@Override
	public void imprimir() {
	super.imprimir(); // Invoca al método imprimir de la clase padre
	System.out.println("Valor de la administración = $" +
	valorAdministración);
	System.out.println();
	}
}
