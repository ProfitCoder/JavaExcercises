//ProfitCoder       9:31   21/05/2026

public class ItemCarrito{
	//Atributos
	private int cantidad;
	private Articulo articulo;
	
	//Constructor
	public ItemCarrito(Articulo a){
		this.articulo = a;
		this.cantidad = 1;
	}
	
	//Métodos
	public Articulo getArticulo(){
		return articulo;
	}
	
	public String getNomArticulo(){
		return articulo.getNombre();
	}
	
	public void setCantidad(int cantidad){
		this.cantidad = cantidad;
	}
	
	public int getCantidad(){
		return cantidad;
	}
	
	public void aumentarCantidad(){
		this.cantidad++;
	}
	
	@Override
	public String toString(){
		return String.format("%s-20s x%d %.2f",articulo.getNombre(),cantidad,articulo.getPrecio()*cantidad);
	}
}