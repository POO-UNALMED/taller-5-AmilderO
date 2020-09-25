package zooAnimales;

import java.util.ArrayList;

public class Anfibio extends Animal {
	
	// Attributes.
		private static ArrayList<Anfibio> listado = new ArrayList<Anfibio>();
		public static int ranas;
		public static int salamandras;
		private String colorPiel;
		private boolean venenoso;
		
		// Getters.
		public String getColorPiel() {
			return colorPiel;
		}
		public boolean isVenenoso() {
			return venenoso;
		}
		
		// Setters.
		public void setColorPiel(String color) {
			this.colorPiel = color;
		}
		public void setVenenoso(boolean ven) {
			this.venenoso = ven;
		}
			
		// Constructors.
		public Anfibio(String nombre, int edad, String habitat, String genero, String color, boolean ven) {
			this.setNombre(nombre);
			this.setEdad(edad);
			this.setHabitat(habitat);
			this.setGenero(genero);
			colorPiel = color;
			venenoso = ven;
			nacioSubAnimal();
			listado.add(this);
		}
		public Anfibio() {
			nacioSubAnimal();
			listado.add(this);
		}
			
		// Methods.
		public static int cantidadAnfibios() {
			return listado.size();
		}
		public String movimiento() {
			return "saltar";
		}
		public static Anfibio crearRana(String nombre, int edad, String genero) {
			ranas ++;
			return new Anfibio(nombre, edad, "selva", genero, "rojo", true);
		}
		public static Anfibio crearSalamandra(String nombre, int edad, String genero) {
			salamandras ++;
			return new Anfibio(nombre, edad, "selva", genero, "negro y amarillo", false);
		}
}
