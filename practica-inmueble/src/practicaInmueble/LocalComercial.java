package practicaInmueble;

public class LocalComercial extends Local {
	// Atributos
	protected static final double VALORAREA = 3000000;
	protected String centroComercial;

	/**
	 * Constructor
	 */
	public LocalComercial(int identificadorInmobiliario, int área, String dirección,
			String centroComercial) {
		// Invoca al constructor de la clase padre
		super(identificadorInmobiliario, área, dirección);
		this.centroComercial = centroComercial;
	}

	/**
	* Método que muestra en pantalla los datos de un local comercial
	*/
	@Override
	public void imprimir() {
	super.imprimir(); // Invoca al método imprimir de la clase padre
	System.out.println("Centro comercial = " + centroComercial);
	System.out.println();
	}
}
