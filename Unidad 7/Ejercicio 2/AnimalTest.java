//ProfitCoder    13:11				13/03/2026

public class AnimalTest{
	public static void main(String [] args){
		Animal [] animales = new Animal[3];
		animales[0] = new Perro();
		animales[1] = new Gato();
		animales[2] = new Vaca();
		
		for(int i = 0;i < animales.length;i++){
			animales[i].hacerSonido();
			System.out.println(animales[i].getEspecie());
		}
	}
}