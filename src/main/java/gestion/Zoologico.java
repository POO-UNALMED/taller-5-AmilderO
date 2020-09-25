package gestion;
import java.util.ArrayList;
public class Zoologico {
	
	// Attributes.
	private String nombre;
	private String ubicacion;
	private ArrayList<Zona> zonas = new ArrayList<Zona>();
	
	// Getters.
	public String getNombre() {
		return nombre;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public ArrayList<Zona> getZona() {
		return zonas;
	}
	
	// Setters.
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	
	// Constructors.
	public Zoologico(String nombre, String ubicacion){
		this.nombre = nombre;
		this.ubicacion = ubicacion;
	}
	public Zoologico() {}
	
	// Methods.
	public void agregarZonas(Zona r) {
		zonas.add(r);
	}
	public int cantidadTotalAnimales() {
		int acumulador = 0;
		for (int i = 0; i < zonas.size(); i++) {
			acumulador += zonas.get(i).cantidadAnimales();
		}
		return acumulador;
	}


}
