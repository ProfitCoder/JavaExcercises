//ProfitCoder      9:21       18/05/2026

import java.util.List;
import java.util.ListIterator;
import java.util.ArrayList;
import java.util.Arrays;

public class EjListIterator{
	public static void main(String [] args){
		List<String> palabras = new ArrayList<>(Arrays.asList("Hola","Mundo","Java","Genial"));
		ListIterator<String> it = palabras.listIterator();
		
		while(it.hasNext()){
			String p = it.next();
			
			if(p.equalsIgnoreCase("java")){
				it.set("JAVA");
				it.add("es");
			}
		}
		
		System.out.println();
		
		while(it.hasPrevious()){
			System.out.println("Palabra: " + it.previous());
		}
		
		System.out.println();
		System.out.println(palabras);
	}
}