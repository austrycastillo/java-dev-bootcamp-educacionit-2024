package practicaInmueble;

public class Local extends Inmueble {

	/**
	 * Constructor
	 */
	public Local(int identificadorInmobiliario, int área, String dirección) {
		// Invoca al constructor de la clase padre
		super(identificadorInmobiliario, área, dirección);

	}

	/**
	* Método que muestra en pantalla los datos de un local
	*/
	@Override
	public void imprimir() {
	super.imprimir(); // Invoca al método imprimir de la clase padre
	System.out.println("local - ");
	}
}
