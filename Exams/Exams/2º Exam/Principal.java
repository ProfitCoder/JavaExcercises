//Pablo Manuel Fernández Velázquez

import compraonline.*;

import java.util.Scanner;
import java.util.Arrays;

public class Principal{
	public static void main(String [] args){
		//Creacion de objetos y variables
		Scanner sc = new Scanner(System.in);
		String nombrePlat;
		String prodBusc;
		int pos;
		
		Productos prod1 = new Productos("Patinete","Toys","23/02/2026");
		Productos prod2 = new Productos("Gafas","RayBan","23/02/2026");
		Productos prod3 = new Productos("Bicicleta","Canyon","23/02/2026");
		
		Vendedores vend1 = new Vendedores("Manuel");
		Vendedores vend2 = new Vendedores("Angela");
		
		
		//Añadir Productos
		if(vend1.anadirProducto(prod1) == true){
			System.out.println("\nProducto añadido Correctamente");
		}
		else{
			System.out.println("\nProducto ha fallado al añadirse");
		}
		if(vend1.anadirProducto(prod2) == true){
			System.out.println("\nProducto añadido Correctamente");
		}
		else{
			System.out.println("\nProducto ha fallado al añadirse");
		}
		if(vend2.anadirProducto(prod3) == true){
			System.out.println("\nProducto añadido Correctamente");
		}
		else{
			System.out.println("\nProducto ha fallado al añadirse");
		}
		
		//Nombre de la plataforma
		System.out.print("Cual quieres que sea el nombre de la Plataforma: ");
		nombrePlat = sc.nextLine();
		
		PlataformaDeVenta plat1 = new PlataformaDeVenta (nombrePlat);
		
		/*
		//Registrar a los vendedores en la plataforma
		if(registrarVendedor(vend1) == true){
			System.out.println("Vendedor Registrado con exito");
		}
		else{
			System.out.println("Vendedor no registrado");
		}
		if(registrarVendedor(vend2) == true){
			System.out.println("Vendedor Registrado con exito");
		}
		else{
			System.out.println("Vendedor no registrado");
		}
		
		
		//Mostrar Lista de vendedores Registrados
		System.out.pritnln(listarVendedores());
		
		//Mostrar lista de Productos a la venta en la platadorma
		System.out.println(listarProductos());
		
		
		//Pedir nombre de usuario y mostrar informacion de este
		System.out.println("\nQue producto buscamos para mostrarte su información");
		prodBusc = sc.nextLine();
		
		pos = buscarProducto(prodBusc);
		System.out.println(lista[pos]);
		*/
		
		//Eliminar el producto de el trabajador que tenia 2
		vend1.eliminarProductos(prod2.nombre);
		
		/*
		//Mostrar los productos a la venta en la plataforma
		System.out.println(lista.listarProductos());
		*/
	}
}