package clase9;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		/*
		 * switch(variable){ case valor1: sentencias... break; case valor2:
		 * sentencias... break; case valor3: sentencias... break; default: sentencias...
		 * break; }
		 */
//		int n = 3;
//		String mensaje = "";
//		switch (n) {
//		case 1:
//			mensaje = "Hoy es lunes de inicios";
//			break;
//		case 2:
//			mensaje = "Hoy es martes de chachacha";
//			break;
//		case 3:
//			mensaje = "Hoy es miércoles de vinos";
//			break;
//		case 4:
//			mensaje = "Hoy es jueves de helado";
//			break;
//		case 5:
//			mensaje = "Hoy es viernes de fernet";
//			break;
//		default:
//			mensaje = "Fin de semana yupiiiiiii a bailar";
//			break;
//		}
//		System.out.println(mensaje);

		/*
		 * while(condición){ sentencias... ajuste }
		 */
//		int a = 1;
//		while (a <= 10) {
//			System.out.println(a);
//			a++;
//		}
		/*
		 * a= 1 2 3 ...10 11 impre= 1 2 3.......10
		 */
		// imprimir los números del 880 al 240 de 20 en 20, sin mostrar
		// el 500 ni el 360

//		int num = 880;
//		while (num >= 240) {
//			if (num != 500 && num != 360) {
//				System.out.println(num);
//			}
//			num -= 20; // num = num - 20;
//		}

		/*
		 * do{ sentencias + ajuste; }while(condición);
		 */
//		int b = 100;
//		do {
//			System.out.println(b);
//			b++;
//		} while (b <= 10);
		/*
		 * for(inicio;condición;ajuste){ sentencias... }
		 */
//		for (int i = 150; i <= 200; i++) {
//			System.out.println(i);
//		}

		// imprimir los números del 20 al 80 y decir cuales son pares e impares

//		for (int i = 20; i <= 80; i++) {
//			if (i % 2 == 0) {
//				System.out.println(i + " es par");
//			} else {
//				System.out.println(i + " es impar");
//			}
//		}

		/*
		 * Estamos de navidad imprimir en pantalla la siguiente figura
		 * 
		 * @
		 * 
		 * @@
		 * 
		 * @@@
		 * 
		 * @@@@
		 * 
		 * @@@@@
		 * 
		 * @@@@@@
		 * 
		 * @@@@@@@
		 */
//		String ar = "";
//		for (int i = 1; i <= 7; i++) {
//			ar += "@";
//			System.out.println(ar);
//		}
//		for (int i = 1; i <= 7; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("@");
//            }
//            System.out.println();
//		}

		Scanner teclado = new Scanner(System.in);
//		System.out.println("¿qué edad tienes?");
//		byte edad = teclado.nextByte();
//		System.out.println("Dijiste que tu edad es " + edad);

		/*
		 * Farmacity desea que desarrolles un programa para ingresar por teclado el
		 * monto de la compra y el día de la semana Si es mièrcoles o viernes se
		 * realizará un descuento del 20% mostrar el descuento y el total a pagar
		 */
		double monto;
		String dia;
		double montoDesc = 0, desc2 = 0.20;
		double total;
		System.out.println("escribe el monto de compra");
		monto = teclado.nextDouble();
		System.out.println("indica el día de la semana");
		dia = teclado.next();
		if (dia.equals("miercoles") || dia.equals("viernes")) {
			montoDesc = monto * desc2;
			System.out.println("el descuento es " + montoDesc);
			System.out.println("El total a pagar es " + (monto - montoDesc));
		} else {
			System.out.println("Sin descuento, El total a pagar es " + monto);
		}
		/*
		 * Desarrollar un sistema de telecajero
		 * 
		 */
	}

}
