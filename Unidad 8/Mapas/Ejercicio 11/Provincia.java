//ProfitCoder      19:01        19/05/2026

import java.util.HashMap;
import java.util.TreeMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Provincia{
	//Atributos
	private String abreviatura;
	private String nombre;
	private int codigoPostal;
	
	//Constructor
	public Provincia(String abreviatura, String nombre, int codigoPostal){
		this.abreviatura = abreviatura;
		this.nombre = nombre;
		this.codigoPostal = codigoPostal;
	}
	
	//Gets
	public String getAbreviatura(){
		return abreviatura;
	}
	
	public String getNombre(){
		return nombre;
	}
	
	public int getCodigoPostal(){
		return codigoPostal;
	}
	
	//toString
	public String toString(){
		return String.format("\nAbreviatura: %s\nNombre: %s\nCodigo Postal: %d",abreviatura,nombre,codigoPostal);
	}
	
	public static void main(String [] args){
		//Creacion de variables, objetos y Mapas
		Provincia p1 = new Provincia("GR","Granada",18);
		Provincia p2 = new Provincia("J","Jaen",23);
		Provincia p3 = new Provincia("AL","Almeria",04);
		Provincia p4 = new Provincia("CO","Cordoba",14);
		Provincia p5 = new Provincia("SE","Sevilla",41);
		Provincia p6 = new Provincia("MA","Malaga",29);
		Provincia p7 = new Provincia("CA","Cadiz",11);
		Provincia p8 = new Provincia("H","Huelva",21);
		Provincia p9 = new Provincia("GR","Granada",18);
		
		//b)
		HashMap<Integer,Provincia> mapaHash = new HashMap<>();
		
		mapaHash.put(1,p1);
		mapaHash.put(2,p2);
		mapaHash.put(3,p3);
		mapaHash.put(4,p4);
		mapaHash.put(5,p5);
		mapaHash.put(6,p6);
		mapaHash.put(7,p7);
		mapaHash.put(8,p8);
		
		LinkedHashMap<Integer,Provincia> mapaLinked = new LinkedHashMap<>();
		
		mapaLinked.put(1,p1);
		mapaLinked.put(2,p2);
		mapaLinked.put(3,p3);
		mapaLinked.put(4,p4);
		mapaLinked.put(5,p5);
		mapaLinked.put(6,p6);
		mapaLinked.put(7,p7);
		mapaLinked.put(8,p8);
		
		TreeMap<Integer,Provincia> mapaTree = new TreeMap<>();
		
		mapaTree.put(1,p1);
		mapaTree.put(2,p2);
		mapaTree.put(3,p3);
		mapaTree.put(4,p4);
		mapaTree.put(5,p5);
		mapaTree.put(6,p6);
		mapaTree.put(7,p7);
		mapaTree.put(8,p8);
		
		//Mostrar por pantalla
		System.out.println();
		System.out.println("******** Mapa Hash ********");
		for(Map.Entry<Integer,Provincia> mapaH : mapaHash.entrySet()){
			System.out.println();
			System.out.println("Clave: " + mapaH.getKey() + mapaH.getValue());
		}
		
		System.out.println();
		System.out.println();
		System.out.println("******** Mapa Linked ********");
		for(Map.Entry<Integer,Provincia> mapaLink : mapaLinked.entrySet()){
			System.out.println();
			System.out.println("Clave: " + mapaLink.getKey() + mapaLink.getValue());
		}
		
		System.out.println();
		System.out.println();
		System.out.println("******** Mapa Tree ********");
		for(Map.Entry<Integer,Provincia> mapaTr : mapaTree.entrySet()){
			System.out.println();
			System.out.println("Clave: " + mapaTr.getKey() + mapaTr.getValue());
		}
		
		//Ahora vamos a probar a duplicar Granada en los tres casos
		mapaHash.put(9,p9);
		mapaLinked.put(9,p9);
		mapaTree.put(9,p9);
		
		//Mostrar por pantalla
		System.out.println();
		System.out.println("******** Nuevo Mapa Hash ********");
		for(Map.Entry<Integer,Provincia> mapaH : mapaHash.entrySet()){
			System.out.println();
			System.out.println("Clave: " + mapaH.getKey() + mapaH.getValue());
		}
		
		System.out.println();
		System.out.println();
		System.out.println("******** Nuevo Mapa Linked ********");
		for(Map.Entry<Integer,Provincia> mapaLink : mapaLinked.entrySet()){
			System.out.println();
			System.out.println("Clave: " + mapaLink.getKey() + mapaLink.getValue());
		}
		
		System.out.println();
		System.out.println();
		System.out.println("******** Nuevo Mapa Tree ********");
		for(Map.Entry<Integer,Provincia> mapaTr : mapaTree.entrySet()){
			System.out.println();
			System.out.println("Clave: " + mapaTr.getKey() + mapaTr.getValue());
		}
	}
}