//ProfitCoder      9:56       18/05/2026

import java.util.HashMap;
import java.util.Map;

public class Diccionario{
	public static void main(String [] args){
		//Creacion de la colección
		HashMap<String,String> diccionario = new HashMap<>();
		
		//Añadir palabras
		diccionario.put("Libro","Book");
		diccionario.put("Vacaciones","Holidays");
		diccionario.put("Casa","House");
		diccionario.put("Coche","Car");
		diccionario.put("Oro","Gold");
		
		//Mostramos por pantalla
		System.out.println();
		for(Map.Entry<String,String> palabras : diccionario.entrySet()){
			System.out.printf("%-10s --> %-10s\n",palabras.getKey(),palabras.getValue());
		}
		
		//Buscamos la palabra Casa
		if(diccionario.get("Casa") != null){
			System.out.printf("%s: %s\n","Casa",diccionario.get("Casa"));
		}
	}
}