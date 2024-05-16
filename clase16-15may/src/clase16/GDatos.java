package clase16;

//clase genérica
public class GDatos<e> {
	private e dato;

	public GDatos(e dato) {
		this.dato = dato;
	}

	public GDatos() {

	}

	public e getDato() {
		return dato;
	}

	public void setDato(e dato) {
		this.dato = dato;
	}

	@Override
	public String toString() {
		return "GDatos [dato=" + dato + "]";
	}

}
