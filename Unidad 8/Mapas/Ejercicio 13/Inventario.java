import java.util.Map;
import java.util.HashMap;

public class Inventario{
	//Atributos
	private HashMap<String,Producto>inventario;
	
	//Constructor
	public Inventario(){
		inventario = new HashMap<>();
	}
	
	//Métodos
	public void anadirProducto(Producto p, int cantidad){
		inventario.put(p.getNombre(),p);
		p.setStock(cantidad);
	}
	
	public void actualizarStockProducto(Producto p, int nueva_cantidad){
		Producto tmp = inventario.get(p.getNombre());
		if(tmp != null){
			tmp.setStock(nueva_cantidad);
			System.out.println("Stock Actualizado: " + tmp.getNombre() + "(" + nueva_cantidad + ")");
		}
		else{
			System.out.println("El producto no está en el inventario");
		}
	}
	
	public void eliminarProducto(Producto p){
		if(inventario.remove(p.getNombre()) != null){
			System.out.println(p.getNombre() + " borrado");
		}
		else{
			System.out.println("No lo he podido encontrar");
		}
	}
	
	public void mostrarInventario(){
		for(Map.Entry<String, Producto> product : inventario.entrySet()){
			System.out.println(" Nombre: " + product.getKey() + " Producto: " + product.getValue());
		}
	}
}