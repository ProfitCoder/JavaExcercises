public class Principal{
	public static void main(String [] args){
		//Creacion de variables
		Carrito c1 = new Carrito();
		
		Articulo articulo1 = new Articulo ("P001","Teclado Mecánico",45.50,12);
		Articulo articulo2 = new Articulo ("P002","Mayonesa",15.0,5);
		Articulo articulo3 = new Articulo ("P003","Pipas",-10.0,1);
		Articulo articulo4 = new Articulo ("P004","Helado",350.0,0);
		Articulo articulo5 = new Articulo ("P005","Patatas",0.0,20);
		
		//Añadimos items al carrito
		ItemCarrito item1 = new ItemCarrito (articulo1);		
		c1.anadirArticulos(new ItemCarrito(articulo2));
		c1.anadirArticulos(new ItemCarrito(articulo3));
		c1.anadirArticulos(new ItemCarrito(articulo4));
		c1.anadirArticulos(new ItemCarrito(articulo5));
		
		c1.imprimirCarrito();
		c1.validar();
		c1.imprimirCarrito();
	}
}