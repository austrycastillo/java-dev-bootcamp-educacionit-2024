package clase15;

public class Calcular {

	public int dividir(int a, int b) throws SegundaExcep {
		if (a == b)
			throw new SegundaExcep("no puedes dividir iguales");
		if (a == 0)
			throw new SegundaExcep("no puedes dividir entre cero");
		if (a == 2)
			throw new SegundaExcep("no puedes dividir entre 2");
		return a / b;
	}
}
