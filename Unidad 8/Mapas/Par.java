//Ejemplo de la clase Par no generica

public class Par{
	//Atributos
	private String clave;
	private int valor;
	
	//Constructor	
	public Par (String c,int v){
		clave=c;
		valor=v;
	}
	
	//Metodos
	public int getValor(){
		return valor;
	}
	
	public String getClave(){
		return clave;
	}
	
	@Override
	public String toString(){
		return String.format("{%s,%d}",clave,valor);
	}
}
