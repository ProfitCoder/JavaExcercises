//ProfitCoder    13:11				13/03/2026

public class Perro extends Animal{
	//Constructor
	public Perro(){
		this.especie = "Canis lupus familiaris";
	}
	
	//Metodos
	@Override
	public void hacerSonido(){
		System.out.println("Guau");
	}
}