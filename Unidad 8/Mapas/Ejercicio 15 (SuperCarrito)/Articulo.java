//ProfitCoder       9:31   21/05/2026

public class Articulo{
	//Atributos
	private String id;
	private String nombre;
	private double precio;
	private int disponibilidad;
	
	//Constructor
	public Articulo(String id, String nombre, double precio, int disponibilidad){
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
		this.disponibilidad = disponibilidad;
	}
	
	//Métodos
	@Override
	public String toString(){
		return String.format("{%s,%s,%.2f,%d}",id,nombre,precio,disponibilidad);
	}
	
	public String getId(){
		return id;
	}
	
	public String getNombre(){
		return nombre;
	}
	
	public double getPrecio(){
		return precio;
	}
	
	public int getDisponibilidad(){
		return disponibilidad;
	}
}