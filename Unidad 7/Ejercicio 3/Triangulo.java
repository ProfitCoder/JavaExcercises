//ProfitCoder     9:28     12/03/2026

public class Triangulo extends Figura{
	//Atributos
	private double base;
	private double altura;
	
	//Constructor
	public Triangulo(int base, int altura){
		this.base = base;
		this.altura = altura;
	}
	
	//Calcular Area
	@Override
	public double calcularArea(){
		double resultado = (base * altura)/2;
		return resultado;
	}
}