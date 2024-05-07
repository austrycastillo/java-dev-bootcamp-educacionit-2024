package practicaInmueble;

/**
 * Es la clase raíz de una jerarquía de herencia.
 * 
 * @version 1.2/2020
 */
public abstract class Inmueble {
	// Atributos p
	protected int identificadorInmobiliario;
	protected int área;
	protected String dirección;
	protected double precioVenta;

	/**
	 * Constructor
	 */
	public Inmueble(int identificadorInmobiliario, int área, String dirección) {
		this.identificadorInmobiliario = identificadorInmobiliario;
		this.área = área;
		this.dirección = dirección;
	}

	/**
	 * setters y getters
	 */



	public int getIdentificadorInmobiliario() {
		return identificadorInmobiliario;
	}

	public void setIdentificadorInmobiliario(int identificadorInmobiliario) {
		this.identificadorInmobiliario = identificadorInmobiliario;
	}

	public int getÁrea() {
		return área;
	}

	public void setÁrea(int área) {
		this.área = área;
	}

	public String getDirección() {
		return dirección;
	}

	public void setDirección(String dirección) {
		this.dirección = dirección;
	}

	public double getPrecioVenta() {
		return precioVenta;
	}

	public void setPrecioVenta(double precioVenta) {
		this.precioVenta = precioVenta;
	}

	/**
	 * método toString
	 */

	@Override
	public String toString() {
		return "Inmueble [identificadorInmobiliario=" + identificadorInmobiliario + ", área=" + área + ", dirección="
				+ dirección + ", precioVenta=" + precioVenta + "]";
	}

	/**
	 * Método que a partir del valor del área de un inmueble, calcula su precio de
	 * venta
	 * 
	 */
	public double calcularPrecioVenta(double valorArea) {
		precioVenta = área * valorArea;
		return precioVenta;
	}

	/**
		* Método que muestra en pantalla los datos de un inmueble
		*/
	public void imprimir() {
		System.out.println("Identificador inmobiliario = " +
		identificadorInmobiliario);
		System.out.println("Area = " + área);
		System.out.println("Dirección = " + dirección);
		System.out.println("Precio de venta = $" + precioVenta);
		}

}
