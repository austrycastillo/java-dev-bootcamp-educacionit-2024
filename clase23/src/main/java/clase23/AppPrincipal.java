package clase23;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class AppPrincipal {

	public static void main(String[] args) throws IOException {
		// System.out.println("De vuelta a java");
		File ruta = new File("c:/junio");
		File archivo = new File(ruta, "miArchivo.txt");
		System.out.println(ruta.getAbsolutePath());
		System.out.println(archivo.getAbsolutePath());
		System.out.println(archivo.getParent());
//		if (ruta.mkdir()) {
//			System.out.println("directorio creado ;)");
//			if (archivo.createNewFile())
//				System.out.println("archivo creado");
//			else
//				System.out.println("no puedo crear el archivo");
//		}
//		else
//			System.out.println("ups no puedo crear el directorio");

		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe un color");
		String color1 = sc.nextLine();
		System.out.println("Escribe otro color");
		String color2 = sc.nextLine();
		System.out.println("Escribe un tercer color");
		String color3 = sc.nextLine();
		System.out.println(color1);
		BufferedWriter bw = new BufferedWriter(new FileWriter(archivo));
		bw.write(color1);
		bw.newLine();
		bw.write(color2);
		bw.newLine();
		bw.write(color3);
		bw.newLine();
		System.out.println("escribiendo el archivo....");
		bw.close();// no escribe si no cierran el objeto bw

	}

}
