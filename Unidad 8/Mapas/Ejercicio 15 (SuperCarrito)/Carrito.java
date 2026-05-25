//ProfitCoder       9:31   21/05/2026

import java.util.ListIterator;
import java.util.LinkedList;
import 

public class Carrito{
	//Atributos
	private LinkedList <ItemCarrito> carrito;
	
	//Constructor
	public Carrito(){
		carrito = new LinkedList<>();
	}
	
	//Métodos
	public void anadirArticulos(ItemCarrito nuevo){
		if(carrito.contains(nuevo) == false){
			carrito.add(nuevo);
		}
		else{
			carrito.get(carrito.indexOf(nuevo)).aumentarCantidad();
		}
	}
	
	public void imprimirCarrito(){
		double pvp = 0;
		System.out.println("\n************   Carrito   ****************");
		for(ItemCarrito item : carrito){
			System.out.println(item);
			pvp += item.getArticulo().getPrecio() * item.getCantidad();
		}
		System.out.printf("%20s: %.2f€\n","P.V.P.",pvp);
	}
	
	public void imprimirCarritoInvertido(){
		double pvp = 0;
		System.out.println("\n********* Carrito Invertido *********");
		ListIterator <ItemCarrito> it = carrito.listIterator(carrito.size());
		
		while(it.hasPrevious()){
			ItemCarrito item = it.previous();
			System.out.println(item);
			pvp += item.getArticulo().getPrecio() * item.getCantidad();
		}
		
		System.out.printf("%20s: %.2f€\n","P.V.P.",pvp);
	}
	
	public void validar(){
		System.out.println("\n********************** VALIDACIÓN ****************");
		
		//Recorrer el carirto buscando los errores con un Iterator
		ListIterator<ItemCarrito> it = carrito.listIterator();
		
		while(it.hasNext()){
			ItemCarrito tmp = it.next();
			String nombre = tmp.getArticulo().getNombre();
			//Disponibilidad cero
			if(tmp.getArticulo().getDisponibilidad() == 0){
				System.out.println(nombre + " No esta disponible.");
				System.out.println("Se añadee una tarjeta regalo 10");
				it.set(new ItemCarrito(new Articulo("R002","Tarjeta Regalo10",-10,50)));
			}
			else if(tmp.getArticulo().getDisponibilidad() <= 0 && !tmp.getArticulo().getNombre().contains("DESCUENTO")){
				System.out.println(nombre + " Error de Precio.");
				it.remove();
			}
			else if(tmp.getArticulo().getNombre().startsWith("EXP")){
				System.out.println(nombre + " Cupón caducado.");
				it.remove();
			}
			else if(tmp.getArticulo().getNombre().equals("Ratón Gaming")){
				it.add(new ItemCarrito(new Articulo("R001","Funda regalo",0,100)));
				System.out.println("Se ha añadido una funda de regalo.");
			}
		}
	}
}