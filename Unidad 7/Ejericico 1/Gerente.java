//ProfitCoder 	8:42			12/03/2026

public class Gerente extends Empleado{
	//Atributos
	private double bono;
	
	//Constructor
	public Gerente(String nombre, double salarioBase, double bono){
		super(nombre,salarioBase);
		this.bono = bono;
	}
	
	//Metodos
	@Override
	public double calcularPago(){
		return salarioBase + bono;
	}
}