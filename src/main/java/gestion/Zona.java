package gestion;
import java.util.ArrayList;
import zooAnimales.Animal;
public class Zona {
	
	// Attributes.
	private String nombre;
	private Zoologico zoo;
	private ArrayList<Animal> animales = new ArrayList<Animal>();
	
	// Getters.
	public String getNombre() {
		return nombre;
	}
	public Zoologico getZoo() {
		return this.zoo;
	}
	
	// Setters.
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setZoo(Zoologico zoo) {
		this.zoo = zoo;
	}
	
	// Constructors.
	public Zona(String nombre, Zoologico zoo){
		this.nombre = nombre;
		this.zoo = zoo;
	}
	public Zona() {}
	
	// Methods.
	public void agregarAnimales(Animal animal) {
		animales.add(animal);
	}
	public int cantidadAnimales() {
		return animales.size();
	}

}
