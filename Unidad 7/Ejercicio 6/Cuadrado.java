//ProfitCoder     9:28     12/03/2026

public class Cuadrado extends Figura implements Dibujable{
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
	
	@Override
	public void dibujar() throws Exception{
		if(lado <= 0){
			throw new Exception("No se puede dibujar un cuadrado con estas medidas");
		}
		
		}
	}
}