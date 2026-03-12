//ProfitCoder     9:28     12/03/2026

public class Circulo extends Figura{
	//Atributos
	private double radio;
	
	//Constructor
	public Circulo(double radio){
		this.radio = radio;
	}
	
	//Calcular Area
	@Override
	public double calcularArea(){
		double area;
		
		area = (Math.pow(radio,2) * Math.PI);
		
		return Math.ceil(area * 100) / 100;
	}
}