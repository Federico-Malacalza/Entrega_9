package ar.com.educationit.D3;

public class Avion implements IVolador, IposibleAterrizaje {

	@Override
	public void aterrizarPista1() {
		System.out.println("Aterriza avion en Pista 1...");
	}

	@Override
	public void volar() {
		System.out.println("Avion volando...");
	}

}