package clase15;

import java.util.AbstractSet;
import java.util.HashSet;
import java.util.Set;

public class Principal {

	public static void main(String[] args) {
		// ej. sintaxis de Excepciones
//		System.out.println("BLOQUE 1");
//		try {
//			System.out.println("BLOQUE 2");
//		} catch (Exception e) {
//			System.out.println("BLOQUE 3");
//		} finally {
//			System.out.println("BLOQUE 4");
//		}
//		System.out.println("BLOQUE 5");
		/*
		 * ¿qué bloque imprime si no tiene excepciones? 1 - 2 - 4 - 5
		 * 
		 * ¿qué bloques imprime si encuentra una excepción 1 - 2* - 3 - 4 - 5
		 */
		// otro ejemplo
//		int[] a = { 4, 8, 19, 32, 64, 128, 256, 512, 1024 };
//		int[] b = { 2, 0, 4, 4, 0, 8 };
//		try {
//			for (int i = 0; i < a.length; i++) {
//				try {
//					System.out.println(a[i] + " / " + b[i] + " = " + a[i] / b[i]);
//				} catch (ArithmeticException e) {
//					System.out.println("te capturé aritmético");
//					System.out.println(e.getMessage());
//					System.out.println("no se puede dividir entre cero");
//				}
//			}
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("error no existe ese indice del arreglo");
//			System.out.println(e.getMessage());
//		} finally {
//			System.out.println("... Finalizando ;)");
//		}

		// podemos crear y ser creativos creando nuestras propias excepciones
//		try {
//			int num = 1;
//			if (num == 2)
//				throw new Exception("no está permitido el 2");
//			else if (num == 13)
//				throw new Exception("No nos gusta el número 13 de mala suerte");
//			else {
//				System.out.println(num);
//				System.out.println(num / 0);
//				System.out.println("seguimos blabla....");
//			}
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
		// PrimeraExcep.calcular(8, 0);
//		try {
//			Calcular cal = new Calcular();
//			System.out.println(cal.dividir(8, 8));
//		} catch (SegundaExcep e) {
//			System.out.println(e.getMensaje());
//			System.out.println(e.getMessage());
//			System.out.println(e.getCause());
//			e.printStackTrace();
//		}

		// COLECCIONES

		// SET--> NO ADMITE DUPLICADOS
		Set<String> nombres = new HashSet<>();
		HashSet<String> nombres2 = new HashSet<>();
		AbstractSet<String> nombre3 = new HashSet<>();


	}

}
