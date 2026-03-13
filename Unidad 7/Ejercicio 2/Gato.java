//ProfitCoder    13:11				13/03/2026

public class Gato extends Animal{
	//Constructor
	public Gato(){
		this.especie = "Felis catus";
	}
	
	//Metodos
	@Override
	public void hacerSonido(){
		System.out.println("Miau");
	}
}