//ProfitCoder 		8:43		23/02/2026

import java.util.Arrays;

public class ListaLibro{
	public static void main(String [] args){
		//Variables y objetos
		final int N_LIBROS = 3;
		
		//Array con libro
		Libro [] libros = new Libro[N_LIBROS];
		
		//Crear objeto
		Libro lib1 = new Libro("El Quijote","Cervantes","644-1549-87854-0000","Planeta",30.00);
		Libro lib2 = new Libro("El Bosque","Saramago","548-7694-89486-5341","Planeta",45.90);
		Libro lib3 = new Libro("Java para principiantes","Anónimo","146-9962-785444-11111","Planeta",12.40);
		
		//Añadir objetos al Array
		libros[0] = lib1;
		libros[1] = lib2;
		libros[2] = lib3;
		
		//Ordenamos de menor a mayor
		Libro.burbuja(libros);
		
		//Mostramos por pantalla
		for(int i = 0;i < libros.length;i++){
			System.out.printf("\nLibro %d\n%s\n",i + 1,libros[i]);
		}
	}
}