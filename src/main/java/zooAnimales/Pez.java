package zooAnimales;

import java.util.ArrayList;

public class Pez extends Animal{

	// Attributes.
		private static ArrayList<Pez> listado = new ArrayList<Pez>();
		public static int salmones;
		public static int bacalaos;
		private String colorEscamas;
		private int cantidadAletas;
		
		// Getters.
		public String getColorEscamas() {
			return colorEscamas;
		}
		public int getCantidadAletas() {
			return cantidadAletas;
		}
		
		// Setters.
		public void setColorEscamas(String color) {
			colorEscamas = color;
		}
		public void setCantidadAletas(int aletas) {
			cantidadAletas = aletas;
		}
			
		// Constructors.
		public Pez(String nombre, int edad, String habitat, String genero, String color, int aletas) {
			this.setNombre(nombre);
			this.setEdad(edad);
			this.setHabitat(habitat);
			this.setGenero(genero);
			colorEscamas = color;
			cantidadAletas = aletas;
			nacioSubAnimal();
			listado.add(this);
		}
		public Pez() {
			nacioSubAnimal();
			listado.add(this);
		}
			
		// Methods.
		public static int cantidadPeces() {
			return listado.size();
		}
		public String movimiento() {
			return "nadar";
		}
		public static Pez crearSalmon(String nombre, int edad, String genero) {
			salmones ++;
			return new Pez(nombre, edad, "oceano", genero, "rojo", 6);
		}
		public static Pez crearBacalao(String nombre, int edad, String genero) {
			bacalaos ++;
			return new Pez(nombre, edad, "oceano", genero, "blanco", 6);
		}
}
