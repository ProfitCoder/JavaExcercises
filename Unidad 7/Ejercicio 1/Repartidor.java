//ProfitCoder 	8:42			12/03/2026

public class Repartidor extends Empleado{
	//Atributos
	private int entregasRealizadas;
	private double pagoPorEntrega;
	
	//Constructor
	public Repartidor(String nombre, double salarioBase, int entregasRealizadas, double pagoPorEntrega){
		super(nombre,salarioBase);
		this.entregasRealizadas = entregasRealizadas;
		this.pagoPorEntrega = pagoPorEntrega;
	}
	
	//Metodos
	@Override
	public double calcularPago(){
		double anadido = 0;
		
		for(int i = 0;i < entregasRealizadas;i++){
			anadido = anadido + pagoPorEntrega;
		}
		return salarioBase + anadido;
	}
}