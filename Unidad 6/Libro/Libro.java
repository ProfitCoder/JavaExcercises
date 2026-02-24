//@ProfitCoder		9:08    20/02/2026

public class Libro implements Comparable<Libro>{
	//Atributos 
	static final int NUM_LIB = 4;
	private String titulo;
	private String autor;
	private String isbn;
	private String editorial;
	private double precio;
	private Libro[] libros = new Libro[NUM_LIB];
	
	//Constructores
	public Libro(String titulo, String autor, String isbn, String editorial, double precio){
		this.titulo = titulo;
		this.autor = autor;
		this.isbn = isbn;
		this.editorial = editorial;
		this.precio = precio;
	}
	
	//toString
	public String toString(){
		return String.format("Titulo: %s\nAutor: %s\nISBN: %s\nEditorial: %s\nPrecio: %.2f.",titulo,autor,isbn,editorial,precio);
	}
	
	public static void burbuja(Libro[] array){
		Libro aux;
		
		for(int i = 0;i < array.length;i++){
			for(int j = 0;j < array.length - i - 1;j++){
				if(array[j].precio > array[j+1].precio){
					aux = array[j];
					array[j] = array[j+1];
					array[j+1] = aux;
				}
			}
		}
		
	}
	
	//Metodo compareTo de la interfaz Comparable(precio)
	@Override	//Para indicar que estamos sobreescribiendo un metodo obligado para complimiento de esta interfaz
	public int compareTo(Libro libros){
		int orden = 0;
		
		if(precio < libros.precio){
			orden = -1;
		}
		else if(precio > libros.precio){
			orden = +1;
		}
		return orden;
	}

}
