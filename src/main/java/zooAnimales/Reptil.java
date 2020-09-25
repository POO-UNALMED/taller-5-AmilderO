package zooAnimales;

import java.util.ArrayList;

public class Reptil extends Animal {

	// Attributes.
	private static ArrayList<Reptil> listado = new ArrayList<Reptil>();
	public static int iguanas;
	public static int serpientes;
	private String colorEscamas;
	private int largoCola;
	
	// Getters.
	public String getColorEscamas() {
		return colorEscamas;
	}
	public int getLargoCola() {
		return largoCola;
	}
	
	// Setters.
	public void setColorEscamas(String color) {
		this.colorEscamas = color;
	}
	public void setPatas(int lcola) {
		this.largoCola = lcola;
	}
		
	// Constructors.
	public Reptil(String nombre, int edad, String habitat, String genero, String color, int lcola) {
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setHabitat(habitat);
		this.setGenero(genero);
		colorEscamas = color;
		largoCola = lcola;
		nacioSubAnimal();
		listado.add(this);
	}
	public Reptil() {
		nacioSubAnimal();
		listado.add(this);
	}
		
	// Methods.
	public static int cantidadReptiles() {
		return listado.size();
	}
	public String movimiento() {
		return "reptar";
	}
	public static Reptil crearIguana(String nombre, int edad, String genero) {
		iguanas ++;
		return new Reptil(nombre, edad, "humedal", genero, "verde", 3);
	}
	public static Reptil crearSerpiente(String nombre, int edad, String genero) {
		serpientes ++;
		return new Reptil(nombre, edad, "jungla", genero, "blanco", 1);
	}

}