//ProfitCoder       9:31   21/05/2026

import java.util.Iterator;
import java.util.LinkedHashMap;

public class Carrito{
	//Atributos
	private LinkedHashMap <String,ItemCarrito> carrito;
	
	//Constructor
	public Carrito(){
		carrito = new LinkedHashMap<>();
	}
	
	//Métodos
	public void anadirArticulos(ItemCarrito nuevo){
		if(carrito.containsKey(nuevo.getArticulo().getId()) == false ){
			carrito.put(nuevo.getArticulo().getId(),nuevo);
		}
		else{
			ItemCarrito tmp = carrito.get(nuevo.getArticulo().getId());
			tmp.aumentarCantidad();
		}
	}
	
	public void imprimirCarrito(){
		double pvp = 0;
		System.out.println("\nCarrito");
		for(ItemCarrito item : carrito.values()){
			System.out.println(item);
			pvp += item.getArticulo().getPrecio() * item.getCantidad();
		}
		System.out.printf("%20s: %.2f€\nS","P.V.P.",pvp);
	}
	
	public void validar(){
		System.out.println("\n********************** VALIDACIÓN ****************");
		
		//Recorrer el carirto buscando los errores con un Iterator
		Iterator<ItemCarrito> it = carrito.values().iterator();
		
		while(it.hasNext()){
			ItemCarrito tmp = it.next();
			String nombre = tmp.getArticulo().getNombre();
			//Disponibilidad cero
			if(tmp.getArticulo().getDisponibilidad() == 0){
				System.out.println(nombre + " No esta disponible.");
				it.remove();
			}
			
			if(tmp.getArticulo().getDisponibilidad() <= 0 && !tmp.getArticulo().getNombre().contains("DESCUENTO")){
				System.out.println(nombre + " Error de Precio.");
				it.remove();
			}
			
			if(tmp.getArticulo().getDisponibilidad() <= 0 && !tmp.getArticulo().getNombre().startsWith ("EXP")){
				System.out.println(nombre + " Cupón caducado.");
				it.remove();
			}
		}
	}
}