//ProfitCoder     9:28     12/03/2026

public abstract class Figura{
	//Atributos
	protected static final int TIPOS = 3;
	
	//Metodos
	public abstract double calcularArea();
	
	//Abstract se obvia en la compilacion por eso es que no hay error con el @Override en las otras clases
	
	/*
	Una clase es abstracta porque se usa como un "Molde"
	para las clases que heredan de ella y es abstracta porque no se
	pueden hacer objetos de ello
	*/
}