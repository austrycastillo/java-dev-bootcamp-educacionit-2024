package practicaInmueble;

public class Oficina extends Local {
	// Atributos
	protected static final double VALORAREA = 3500000;
	protected boolean esGobierno;

	/**
	 * Constructor
	 */
	public Oficina(int identificadorInmobiliario, int área, String dirección, boolean esGobierno) {
		// Invoca al constructor de la clase padre
		super(identificadorInmobiliario, área, dirección);
		this.esGobierno = esGobierno;
	}

	/**
	 * Método que muestra en pantalla los datos de una oficina
	 */
	@Override
	public void imprimir() {
		super.imprimir(); // Invoca al método imprimir de la clase padre
		System.out.println("Es oficina gubernamental = " + esGobierno);
		System.out.println();
	}
}
