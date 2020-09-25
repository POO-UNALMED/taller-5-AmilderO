package zooAnimales;

import java.util.ArrayList;

public class Ave extends Animal {

	// Attributes.
		private static ArrayList<Ave> listado = new ArrayList<Ave>();
		public static int halcones;
		public static int aguilas;
		private String colorPlumas;
		
		// Getters.
		public String getColorPlumas() {
			return colorPlumas;
		}
		
		// Setters.
		public void setPelaje(String color) {
			colorPlumas = color;
		}
		
		// Constructors.
		public Ave(String nombre, int edad, String habitat, String genero, String color) {
			this.setNombre(nombre);
			this.setEdad(edad);
			this.setHabitat(habitat);
			this.setGenero(genero);
			colorPlumas = color;
			nacioSubAnimal();
			listado.add(this);
		}
		public Ave() {
			nacioSubAnimal();
			listado.add(this);
		}
		
		// Methods.
		public static int cantidadAves() {
			return listado.size();
		}
		public String movimiento() {
			return "volar";
		}
		public static Ave crearHalcon(String nombre, int edad, String genero) {
			halcones ++;
			return new Ave(nombre, edad, "monta�as", genero, "cafe glorioso");
		}
		public static Ave crearAguila(String nombre, int edad, String genero) {
			aguilas ++;
			return new Ave(nombre, edad, "monta�as", genero, "blanco y amarillo");
		}
}
