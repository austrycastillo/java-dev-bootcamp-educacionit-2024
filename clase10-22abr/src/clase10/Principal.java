package clase10;

public class Principal {

	public static void main(String[] args) {
		// NÚMERO PERFECTO
//		Scanner t = new Scanner(System.in);
//		int num, sumaDiv = 0, i = 1;// declaro variables
//		System.out.println("Escribe un número que crees que es perfecto");
//		num = t.nextInt();
//		if (num > 0) {
//			do {
//				if (num % i == 0)
//					sumaDiv += i;
//				i++;
//			} while (i <= num / 2);
//			if (sumaDiv == num)
//				System.out.println(num + " es perfecto");
//			else
//				System.out.println(num + " no es perfecto");
//		}

		// ARREGLO
//		int num[] = new int[6];// int [] num ;
//		num[0] = 4;
//		num[1] = 3;
//		num[2] = 9;
//		num[3] = 18;
//		num[4] = 100;
//		num[5] = 1;
//
//		System.out.println(num[2]);
//		String[] nombres = { "Ana", "Franco", "María", "Mario" };
//		System.out.println(nombres[2]);
//		for (int i = 0; i < nombres.length; i++) {
//			System.out.println(nombres[i]);
//		}
//		for (int n : num) {// foreach
//			System.out.println(n);
//		}

		// EJERCICIO ARRAYS DUPLICADOS
		int cont = 0;
		int[] nums = { 2, 4, 4, 8, 12, 12, 20, 42, 42, 86, 98, 102, 102, 200 };
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] == nums[j]) {
					System.out.println(nums[i] + " Duplicado");
					cont++;
				}
			}
		}
		System.out.println("Al final tuve " + cont + " duplicados");
	}

}
