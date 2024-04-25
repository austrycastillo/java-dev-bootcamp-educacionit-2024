package practicaInicial;

public class Principal {

	public static void main(String[] args) {
		// comentario simple
		/*
		 * mucho comentarios
		 */
//		System.out.print("Hola mundis");
		// Tipos Datos Primitivos
		// variable declarar (tipo nombre;) inicializar (nombre = valor;)
		// byte - short - int - long
		// double - float
		// char boolean
//		byte a;
//		a = 1;
//		System.out.println(a);
//		int numero = 123456;
//		int b = 1, c = 2, d = 3;
//		double num1 = 125.33;
//		float num2 = 42.45f;
//		System.out.println(a + " " + b + " " + c);
//		boolean x = true;
//		boolean y = false;
//		String dia = "lunes";
//		System.out.println("Hoy es " + b + "º día de la semana, " + dia + (c + d));
		/*
		 * OPERADORES: + - * / %(MODULO) += -= *= /= %= < > <= >= == != ! ++ -- && (AND)
		 * & || (or) |
		 */
		// PRACTICA
		// SUMAR 2 VARIABLES
//		int num1 = 240;
//		int num2 = 560;
//		int num3 = num1 + num2;
//		System.out.println("La suma de " + num1 + " más " + num2 + " es " + num3);
//		System.out.println(num1 + num2);
//		// mostrar el resto de la división de 24 entre 7
//		int dividendo = 24;
//		int divisor = 7;
//		int resto = 24 % 7;
//		System.out.println(resto);
//		// utiliza el operador de asignación para multiplicar una variable por 2
//		int a = 250;
//		a *= 2; // a = a * 2;
//		System.out.println(a);
//		// verificar si el número 120 es menor a 150 con booleanos
//		int x = 120, y = 150;
//		boolean z = x < y;
//		System.out.println("¿120 es menos a 150? " + z);
//		// verificar si son diferentes
//		System.out.println(x != y);
//		// incrementa alguna variable en solo 1 unidad
//		System.out.println(num1++);
//		//utiliza algún operador lógico para analizar si numero 1 es menor que numero 2 y diferente
//		int numero1 = 18;
//		int numero2 = 50;
//		boolean result = (numero1 < numero2) && (numero1 != numero2);
//		System.out.println(result);
		/*
		 * if(condición){ sentencias 1 }else{ sentencias 2 }
		 */

		// voy al boliche y el patovica dice si puedo pasar o no
//		int edad = 15;
//		if (edad >= 18) {
//			System.out.println("Bienvenid@ ;)");
//		} else {
//			System.out.println("no puedes pasar ;(");
//		}

		// agrega al anterior que al ingresar al boliche si tiene 22
		// tiene bebida gratis
		// y si no puede pasar decir la razón (en este boliche solo entran de
		// 18 a 46)
//		int edad = 25;
//		if (edad >= 18 && edad <= 46) {
//			System.out.println("Bienvenid@ ;)");
//			if(edad == 22)
//				System.out.println("Bebida gratis!!!");
//		} else {
//			System.out.println("no puedes pasar ;(");
//			if (edad < 18)
//				System.out.println("por bebito");
//			else
//				System.out.println("por viejito");
//		}

//		int edad = 46;
//		System.out.println("que le tocara al pibardo?");
//		if (edad >= 18 && edad <= 45) {
//			System.out.println("le dan vinardo");
//		}
//		else if (edad >= 46) {
//			System.out.println("viejo borracho \n\t vayase de aqui");
//		}
//		else {
//			System.out.print("le traen un enano");
//		}
		/*
		 * me dan un número, decir si tiene 1,2,3, 4 o más cifras Utiliza los if
		 * anidados (else if)
		 */
		int X = 984;
		if (X > 0 && X < 10) {
			System.out.println("tiene una cifra");
		} else if (X >= 10 && X < 100) {
			System.out.println("tiene dos cifras");
		} else if (X >= 100 && X < 1000) {
			System.out.println("tiene tres cifras");
		} else {
			System.out.println("tiene cuatro o más cifras");
		}
	}

}
