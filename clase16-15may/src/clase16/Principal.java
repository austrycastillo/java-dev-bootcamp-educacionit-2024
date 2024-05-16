package clase16;

import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Principal {

	public static void main(String[] args) {
		// COLECCIONES

		// SET--> NO ADMITE DUPLICADOS
		Set<String> nombres = new HashSet<>();
		HashSet<String> nombres2 = new HashSet<>();
		AbstractSet<String> nombre3 = new HashSet<>();
		nombres.add("Agustin");
		nombres.add("María");
		nombres.add("Damian");
		nombres.add("Lucas");
		nombres.add("Laura");
		System.out.println(nombres.size());
		nombres.add("María");
		nombres.add("Lucas");
		System.out.println(nombres.size());
		nombres.add("Tutu");
		System.out.println(nombres.size());
		System.out.println(nombres.contains("María"));
		// recorrer la colección con foreach
		nombres.forEach((x) -> System.out.println(x));
		// recorrer la colección con un iterador
		System.out.println("***");
		Iterator<String> it = nombres.iterator();
		while (it.hasNext()) {
			String nombre = it.next();
			if (nombre.equals("María"))
				it.remove();
			else
				System.out.println(nombre);
		}
		System.out.println(nombres.size());
		System.out.println(nombres.isEmpty());
		nombres.clear();
		System.out.println(nombres.isEmpty());
		System.out.println(nombres.size());

		Set<Mascota> masc = new HashSet<>();
		Mascota mascota1 = new Mascota("Laqui", 15, "Perro");
		Mascota mascota2 = new Mascota("Lin", 1, "Conejo");
		Mascota mascota3 = new Mascota("Coqui", 1, "Tortuga");
		Mascota mascota4 = new Mascota("Roco", 11, "Perro");
		masc.add(mascota1);
		masc.add(mascota2);
		masc.add(mascota3);
		masc.add(mascota4);
		System.out.println("***lista objetos****");
		for (Mascota mascotin : masc) {
			System.out.println(mascotin);
		}
		System.out.println("****TRESET*****");// es más lento pero ordena
		TreeSet<Integer> nums = new TreeSet<>();
		nums.add(100000);
		nums.add(1);
		nums.add(10);
		nums.add(10000);
		nums.add(100);
		nums.add(100);
		System.out.println(nums.size());
		for (Integer n : nums) {
			System.out.println(n);
		}
		System.out.println("***");
		TreeSet<String> colores = new TreeSet<>();
		colores.add("verde");
		colores.add("amarillo");
		colores.add("negro");
		System.out.println(colores.size());
		for (String c : colores) {
			System.out.println(c);
		}
		/*
		 * armar un treeset de objetos, recorrer y ordenar ****
		 */

		/*
		 * LIST: SI ADMITE DUPLICADOS, TENEMOS INDICE
		 */
		System.out.println("******LIST******");
		ArrayList<String> productos = new ArrayList<>();
		productos.add("papa");
		productos.add("tomate");
		productos.add("brocoli");
		productos.add("zanahoria");
		System.out.println(productos.size());
		for (String p : productos) {
			System.out.println(p);
		}
		System.out.println(productos.get(2));
		productos.set(2, "pepino");
		System.out.println(productos.get(2));
		Iterator<String> i = productos.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("******");

		List<Integer> numbers = new ArrayList<>();
		numbers.add(100);
		numbers.add(1);
		numbers.add(10);
		System.out.println(numbers);
		Collections.sort(numbers);
		System.out.println(numbers);

		System.out.println("****GENERICOS******");
		GDatos<String> dato1 = new GDatos<>();
		GDatos<Integer> dato2 = new GDatos<>();
		GDatos<Double> dato3 = new GDatos<>();
		dato1.setDato("Juan");
		dato2.setDato(25);
		dato3.setDato(2.2);
		System.out.println(dato1.getDato());
		System.out.println(dato2.getDato());
		System.out.println(dato3.getDato());

	}

}
