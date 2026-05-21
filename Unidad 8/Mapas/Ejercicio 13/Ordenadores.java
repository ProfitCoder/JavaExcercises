

public class Ordenadores extends Producto{
	//Atributos
	private String cpu;
	private String ram;
	private String placa;
	private String almacemaniemto;
	
	//Constructor
	public Ordenadores(String nombre, String marca, double precio,String cpu, String ram, String placa, String almacemaniemto){
		super(nombre,marca,precio);
		this.cpu = cpu;
		this.ram = ram;
		this.placa = placa;
		this.almacemaniemto = almacemaniemto;
	}
	
	//Métodos
	@Override
	public String toString(){
		return super.toString() + String.format("|%-10s | %-10s |%-10s | %-10s|",cpu,ram,placa,almacemaniemto);
	}
	
	
	
	
	
	
}