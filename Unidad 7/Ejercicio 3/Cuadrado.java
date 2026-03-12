//ProfitCoder     9:28     12/03/2026

public class Cuadrado extends Figura{
	//Atributos
	private double lado;
	
	//Constructores
	public Cuadrado(double lado){
		this.lado = lado;
	}
	
	//Metodos
	@Override
	public double calcularArea(){
		double area = (lado*lado);
		return area;
	}
}