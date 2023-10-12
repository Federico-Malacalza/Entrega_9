package ar.com.educacionit.D2;

import java.util.ArrayList;

public class Alumno {

	private String Name;
	private String apellido;
	private int numExamenes;
	private ArrayList<Integer> notas;
	
	public Alumno(String Name, String apellido, int numExamenes) {
		this.Name = Name;
		this.apellido = apellido;
		this.numExamenes = numExamenes;
		this.notas = new ArrayList<>();
	}

	public String getName() {
		return Name;
	}

	public void setName(String Name) {
		this.Name = Name;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getnumExamenes() {
		return numExamenes;
	}

	public void setnumExamenes(int numExamenes) {
		this.numExamenes = numExamenes;
	}

	public ArrayList<Integer> getNotas() {
		return notas;
	}

	public void setNota(int nota) {
		notas.add(nota);
	}
	public int getMayorNota() {
		int mayor = this.getNotas().get(0);
		for(int nota : this.getNotas()) {
			if(nota > mayor) {
				mayor = nota;
			}
		}
		return mayor;
	}
	public int getMenorNota() {
		int menor = this.notas.get(0);
		for(int nota : this.getNotas()) {
			if(nota < menor) {
				menor = nota;
			}
		}
		return menor;
	}
	public int getPromedio() {
		int suma = 0;
		for(int nota : notas) {
			suma += nota;
		}
		return suma / this.numExamenes;
	}

	@Override
	public String toString() {
		return "Alumno [Name=" + Name + ", apellido=" + apellido + ", numExamenes=" + numExamenes
				+ ", notas=" + notas + "]";
	}
	
}