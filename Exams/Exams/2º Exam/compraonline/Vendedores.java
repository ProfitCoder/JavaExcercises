//Pablo Manuel Fernández Velázquez

package compraonline;

public class Vendedores{
	//Atributos
	private final int NUM_PROD = 5;
	private String nombre;
	private static int idVendedor = 00000;
	private Productos [] lista;
 	private int contador;
	
	//Constructor con el atributo Nombre
	public Vendedores(String nombre){
		this.nombre = nombre;
		this.idVendedor = idVendedor++;
		lista = new Productos[NUM_PROD];
		contador ++;
	}
	
	//Getts
	public String getNombre(){
		return nombre;
	}
	
	public int getIDs(){
		return idVendedor;
	}
	
	//Metodo para añadir productos
	public boolean anadirProducto(Productos producto){
		boolean añadido = false;
		
		for(int i = contador;i < lista.length;i++){
			lista [contador] = producto;
			añadido = true;
		}
		return añadido;
	}
	
	//Eliminar un producto
	public boolean eliminarProductos(String nombre){
		boolean eliminado = false;
		Productos aux;
		int posicion = 0;
		
		for(int i = 0;i < lista.length;i++){
			if(lista[i].nombre == nombre){
				lista[i] = null;
				posicion = i;
				for(i = posicion;i < lista.length - 1;i++){
					aux = lista [posicion];
					lista [posicion] = lista[posicion + 1];
					lista [i + 1] = aux;
				}
			}
		}
		return eliminado;
	}
	
	//buscar un producto
	public int buscarProducto(String nombre){
		int pos = -1;
		
		for(int i = 0;i < lista.length;i++){
			if(lista[i].nombre == nombre){
				pos = i;
			}
		}
		return pos;
	}
	
	//Listar productos
	public void listarProductos(){
		for(int i = 0;i < lista.length;i++){
			if(lista[i] != null){
				System.out.println(lista[i]);
				System.out.println("*********************");
			}
		}
	}
	
	//toSting
	public String toString(){
		return String.format("Nombre Vendedor: " + nombre + "\nID del Vendedor: "+ idVendedor + "\nProductos en venta: " + lista);
	}
}