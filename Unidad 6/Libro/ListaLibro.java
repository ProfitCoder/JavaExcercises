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
		
		/*Si queremos ordenar por precio usando el sort podemos probar:
		*/
		
		//Arrays.sort(libro);
		
		/*
		Pero nos da un erro y vemos que no es "comparable" ya que esta comparando objetos con muchos atributos
		esto se puede arreglar y mejorar si usamos el compareTo
		
		que devuelven el valor -1,0 o +1
		
		Lo que viene a hacer referencia a que el valor tendria q estar en la posicion:
		
		-1 (anterior)
		0 (la misma en la que esta)
		+1 (una posción posterior)
		
		Este metodo lo vamos a implementar en la clase Libro añadiendo princcipalmente en public class un complemento
		*/
		
		//despues de implementar en la clase Libro el ultimo metodo y poner el @Override ua si funciona el sort:
		Arrays.sort(libros);
	}
}