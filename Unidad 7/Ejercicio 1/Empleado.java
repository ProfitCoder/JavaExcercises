//ProfitCoder 	8:42			12/03/2026

public class Empleado{
	//Atributos
	protected String nombre;
	protected double salarioBase;
	
	//Constructor
	public Empleado(String nombre, double salarioBase){
		this.nombre = nombre;
		this.salarioBase = salarioBase;
	}
	
	//Metodos
	public double calcularPago(){
		return salarioBase;
	}
}