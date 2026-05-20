/*
Implementacion de los 3 tipos de Map utilizandos para guardar
elementos <Par,Integer>. Anadimos elementos y los mostramos por
pantalla utilizando un bucle for-each para recorrerlos
*/

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.uti.Iterator;
import java.util.Map;

public class EjMapPar{
	public static void main(String [] args){
		HashMap<Par,Integer> hM = new HashMap<>();
		LinkedHashMap<Par,Integer> lM = new LinkedHashMap<>();
		TreeMap<Par,Integer> tM = new TreeMap<>();
		
		//Guardamos 
		Par par1 = new Par("Madrid",25);
		Par par2 = new Par("Barcelona",19);
		Par par3 = new Par("Barcelona",19);
		Par par4 = new Par("Granada",13);
		
		hM.put(par1,1);
		hM.put(par2,2);
		hM.put(par3,3);
		hM.put(par4,4);
		
		Iterator<Par> it = hM.keySet().iterator();
		while(it.hasNext()){
			System.out.println(it2.next);
		}
		
		/*Mostramos los valores guardados
		System.out.println("HashMap");
		for(Par i : hM.keySet()){
			System.out.println(i);
		}
		*/
		//Guardamos 
		lM.put(par1,1);
		lM.put(par2,2);
		lM.put(par3,3);
		lM.put(par4,4);
		
		Iterator<Integer> it2 = lM.values().iterator();
		while(it2.hasNext()){
			System.out.println(it2.next);
		}
		
		//Mostramos los valores guardados
		System.out.println("\nLinkedHashMap");
		for(Par i : lM.keySet()){
			System.out.println(i);
		}
		
		//Guardamos 
		tM.put(par1,1);
		tM.put(par2,2);
		tM.put(par3,3);
		tM.put(par4,4);
		
		Iterator<Map.Entry<Par,Integer>> it3 = tM.entrySet().iterator();
		while(it2.hasNext()){
			Map.Entry<Par,Integer> entrada = it3.next();
			System.out.printf("Clave: %s,Valor: %d\n",entrada.getKey(),entrada.getValue());
		}
		
		/*Mostramos los valores guardados
		System.out.println("\nTreeHashMap");
		for(Par i : tM.keySet()){
			System.out.println(i);
		}
		*/
	}
}
