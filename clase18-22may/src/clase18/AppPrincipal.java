package clase18;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class AppPrincipal {

	public static void main(String[] args) {
//		Equipo equipo = Equipo.BUENOS_AIRES;
//		System.out.println(equipo.name());
//		System.out.println(equipo.getProvincia());
//		System.out.println(equipo.getCodigo());
//		System.out.println(equipo.toString());
//		//
//		Equipo equipo2 = Equipo.MENDOZA;
//		System.out.println(equipo2.name());
//		System.out.println(equipo2.getProvincia());
//		System.out.println(equipo2.getCodigo());
//		System.out.println(equipo2.toString());

		
		//QUEUE: COLAS
//		Queue<Integer> q = new LinkedList<>();
//		q.add(100);
//		q.add(1);
//		q.add(110001);
//		q.add(10);
//		Queue<Integer> q2 = new LinkedList<>();
//		q2.addAll(q);
//		System.out.println(q.contains(10));
//		System.out.println(q.peek());// devuelve el primer dato de la cola
//		while (!q.isEmpty()) {
//			System.out.println(q.poll());
//		}
//		System.out.println(q.isEmpty());
//		q.remove();
//		try {
//			q.remove();
//			System.out.println("Eliminado");
//		} catch (NoSuchElementException e) {
//			System.out.println("no puedo eliminar");
//		}
//		System.out.println(q.poll());
//		q2.clear();

		// MAPAS: CONTIENE CLAVE - VALOR

		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Carolina");
		map.put(2, "Leonel");
		map.put(3, "Ysabel");
		System.out.println(map);
		System.out.println(map.get(2));
		Iterator it = map.keySet().iterator();
		while (it.hasNext()) {
			Integer clave = (Integer) it.next();
			System.out.println("clave: " + clave + " valor: " + map.get(clave));
		}
	}

}
