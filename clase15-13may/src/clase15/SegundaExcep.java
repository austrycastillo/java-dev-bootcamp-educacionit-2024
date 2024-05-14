package clase15;

public class SegundaExcep extends Exception {
	private String mensaje;

	public SegundaExcep(String mensaje) {
		setMensaje(mensaje);
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	@Override
	public String getMessage() {
		return getMensaje();
	}

}
