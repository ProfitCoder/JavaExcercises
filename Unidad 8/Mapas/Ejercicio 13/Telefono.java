public class Telefono extends Producto{
	//Atributos
	private double bateria;
	private String senal;
	private double autonomia;
	
	//Constructor
	public Telefono(String nombre, String marca, double precio,double bateria, String senal, double autonomia){
		super(nombre,marca,precio);
		this.bateria = bateria;
		this.senal = senal;
		this.autonomia = autonomia;
	}
	
	//Métodos
	@Override
	public String toString(){
		return super.toString() + String.format("|%-10.2f | %-10s |%-10.2f |",bateria,senal,autonomia);
	}
	
	
	
	
	
	
}