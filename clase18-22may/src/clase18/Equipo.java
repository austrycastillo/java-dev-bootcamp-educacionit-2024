package clase18;

public enum Equipo {
	MISIONES("Misiones", 145), MENDOZA("Mendoza", 351), BUENOS_AIRES("Buenos Aires", 140), NEUQUEN("Neuquén", 123),
	CÓRDOBA("Córdoba", 351);

	private String provincia;
	private int codigo;

	private Equipo(String provincia, int codigo) {
		this.provincia = provincia;
		this.codigo = codigo;
	}

	public String getProvincia() {
		return provincia;
	}

	public int getCodigo() {
		return codigo;
	}

	@Override
	public String toString() {
		return "Provincia : " + provincia + "\n" + "Codigo: " + codigo;
	}

}
