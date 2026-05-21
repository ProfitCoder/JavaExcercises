//ProfitCoder      13:12       20/05/2026

public abstract class Producto{
	//Atributos
	protected String nombre;
	protected String marca;
	protected double precio;
	protected int stock;
	
	//Constructor
	public Producto(String nombre, String marca, double precio){
		this.nombre = nombre;
		this.marca = marca;
		this.precio = precio;
	}
	
	//Métodos
	@Override
	public String toString(){
		return String.format("%-10s | %-6s | %-8.2f | %-8d",nombre,marca,precio,stock);
	}
	
	public void setStock(int stock){
		this.stock = stock;
	}
	
	public String getNombre(){
		return this.nombre;
	}
}