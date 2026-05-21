public class ProgramaPrincipal{
	public static void main(String [] args){
		//Crear inventarios
		Inventario i1 = new Inventario();
		
		//Crear productos
		Producto p1 = new Ordenadores("PCPablo","Asus",700,"CPU","64GB","Intel","2T");
		Producto p2 = new Telefono("MovilPablo","Iphone",200,1200,"Movistar",7.2);
		Producto p3 = new Ordenadores("PCJuan","Asus",1200,"CPU","32GB","Intel","1T");
		Producto p4 = new Ordenadores("PCManuel","Asus",700,"CPU","64GB","Intel","500GB");
		
		//Añadimos los productos a el mapa
		i1.anadirProducto(p1,5);
		i1.anadirProducto(p2,32);
		i1.anadirProducto(p3,7);
		i1.anadirProducto(p4,23);
		
		System.out.println();
		System.out.println("******* Mapa Principal *******");
		System.out.println();
		i1.mostrarInventario();
		
		//Actualizamos el stock de 1 producto
		i1.actualizarStockProducto(p2,40);
		
		//Eliminamos un producto
		i1.eliminarProducto(p4);
		
		//Mostramos el mapa final
		System.out.println();
		System.out.println("******* Mapa Final *******");
		System.out.println();
		i1.mostrarInventario();
	}
}