//Pablo Manuel Fernández Velázquez

package compraonline;

public class PlataformaDeVenta{
	//Atributos
	private final int NUM_VENDE = 10;
	private String nombre;
	private Vendedores [] vendedores;
	private static int contador;
	
	//Constructor
	public PlataformaDeVenta(String nombre){
		this.nombre = nombre;
		vendedores = new Vendedores [NUM_VENDE];
	}
	
	//Registrar vendedor
	public boolean registrarVendedor(Vendedores vendedor){
		boolean registrado = false;
		
		for(int i = contador;i < vendedores.length;i++){
			if(vendedores [i] != null){
				vendedores [i] = vendedor;
				registrado = true;
			}
		}
		return registrado;
	}
	
	//Buscar Producto
	public int buscarProducto(String nombre){
		int nuevapos = -1;
		if(buscarProducto(nombre) != -1){
			nuevapos = buscarProducto(nombre);
		}
		return nuevapos;
	}
	
	//Listar Vendedores
	public String listarVendedores(){
		String cad1 = "";
		
		for(int i = 0;i < vendedores.length;i++){
			cad1 += vendedores[i] + "\n";
		}
		return cad1;
	}
	
	//listarProductos
	public String listarProductos(){
		String cad2 = "" + listarProductos();
		return cad2;
	}
}