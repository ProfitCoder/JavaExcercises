//ProfitCoder     9:28     12/03/2026

public class FiguraTest{
	public static void main(String [] args){
		Figura [] figura = new Figura [Figura.TIPOS];
		figura [0] = new Circulo(10);
		figura [1] = new Cuadrado(5);
		figura [2] = new Triangulo(3,6);
		for(int i = 0;i < Figura.TIPOS;i++){
			System.out.println("Area: " + figura[i].calcularArea());
		}
	}
}	