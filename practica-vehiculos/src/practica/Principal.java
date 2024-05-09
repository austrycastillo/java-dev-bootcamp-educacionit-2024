package practica;

public class Principal {

	public static void main(String[] args) {
		Terrestre t1 = new Terrestre(100, 300);
		Terrestre t2 = new Terrestre(20, 300);
		Acuatico a1 = new Acuatico(0, 400);
		Acuatico a2 = new Acuatico(0, 400);
		System.out.println(a1.calcularRevolucionesMotor(2, 4));
		a1.acelerar(20);
		t1.frenar(10);
		t2.acelerar(100);

	}

}
