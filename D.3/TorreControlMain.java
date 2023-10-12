package ar.com.educationit.D3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainTorreDeControl {
	public static void main(String[] args) {
		
		List<IVolador> voladores = new ArrayList<>();
		voladores.add(new Avion());
		voladores.add(new Helicoptero());
		voladores.add(new Pajaro());
		
		TorreDeControl torre = new TorreDeControl() {
			@Override
			public void autorizarAterrizaje(IVolador volador) {
				if(volador instanceof IposibleAterrizaje) {
					((IposibleAterrizaje) volador).aterrizarPista1();
				}else{
					System.out.println("No autorizado. Pedir autorización adicional");
					System.out.println("Solicitando aprobación...");
					if(Math.round(Math.random()*10) > 5) {
						System.out.println("[SI] Puede aterrizar en Pista 2");
					}else{
						System.out.println("[NO] Permiso denegado para aterrizar en Pista 2");
					}
				}
			}	
		};
		for(IVolador volador : voladores) {
			volador.volar();
			torre.autorizarAterrizaje(volador);
			System.out.println("------------> \n");
		}
	}
}