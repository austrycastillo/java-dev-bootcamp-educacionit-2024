package practica;

public class Ornitorrinco extends Mamifero implements Oviparo {

	@Override
	protected void amamantarCrias() {
		System.out.println("El orni... amamanta blabla");
	}

	@Override
	public void ponerHuevos() {
		System.out.println("El orini... pone huevos");

	}

}
