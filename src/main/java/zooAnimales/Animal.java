package zooAnimales;
import gestion.Zona;
public class Animal {
	
	// Attributes.
	private static int totalAnimales;
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private Zona zona;
	
	// Getters.
	public String getNombre() {
		return nombre;
	}
	public int getEdad() {
		return edad;
	}
	public String getHabitat() {
		return habitat;
	}
	public String getGenero() {
		return genero;
	}
	public Zona getZona() {
		return zona;
	}
	public int getTotalAnimales() {
		return totalAnimales;
	}
	
	// Setters.
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public void setZona(Zona zona) {
		this.zona = zona;
	}
	public void nacioSubAnimal() {
		totalAnimales ++;
	}
	
	// Constructors.
	public Animal(String nombre, int edad, String habitat, String genero){
		this.nombre	= nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		totalAnimales ++;
	}
	public Animal() {
		totalAnimales ++;
	}
	
	// Methods.
	public String movimiento() {
		return "Desplazarse";
	}
	public String toString() {
		if(this.zona == null) {
			return "Mi nombre es " + this.nombre + ", tengo una edad de " + this.edad + ", habito en " + this.habitat + " y mi genero es " + this.genero;
		}
		else {
			return "Mi nombre es " + this.nombre + ", tengo una edad de " + this.edad + ", habito en " + this.habitat + " y mi genero es " + this.genero + ", la zona en la que me ubico es " + this.zona.getNombre() + ", en el " + this.zona.getZoo().getNombre();
		}
		      
	}
	public static String totalPorTipo() {
		return ("Mamiferos: " + Mamifero.cantidadMamiferos() + "\n" +
				"Aves: " + Ave.cantidadAves() + "\n" +
				"Reptiles: " + Reptil.cantidadReptiles() + "\n" +
				"Peces: " + Pez.cantidadPeces() + "\n" +
				"Anfibios: " + Anfibio.cantidadAnfibios());
	}
}
