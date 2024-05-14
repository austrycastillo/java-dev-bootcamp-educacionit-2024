package clase15;

public class PrimeraExcep {
	public static void calcular(int a, int b) {
		try {
			System.out.println(a / b);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
