//ProfitCoder       9:31   21/05/2026

public class ItemCarrito implements Comparable<ItemCarrito>{
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
		return String.format("%s x%d %.2f",articulo.getNombre(),cantidad,articulo.getPrecio()*cantidad);
	}
	
	@Override
	public int compareTo(ItemCarrito otro){
		return Double.compare(otro.getArticulo().getPrecio(), this.getArticulo(),getPrecio());
	}
}

/*
Aqui es mejor usar un Double.compare() en vez de un casting de enteros, porque al comparar
precios por ejemplo, si compara 15,0€ y 15,20€ va a detectarlos como iguales,
y va a fallar el programa, asi implementamos este metodo y se queda todo bien.
*/