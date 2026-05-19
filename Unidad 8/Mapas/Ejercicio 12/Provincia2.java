//ProfitCoder     21:45         19/05/2026

import java.util.HashMap;
import java.util.TreeMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Provincia2{
	//Atributos
	private String abreviatura;
	private String nombre;
	private int codigoPostal;
	
	//Constructor
	public Provincia2(String abreviatura, String nombre, int codigoPostal){
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
		Provincia2 p1 = new Provincia2 	("GR","Granada",18);
		Provincia2 p2 = new Provincia2("J","Jaen",23);
		Provincia2 p3 = new Provincia2("AL","Almeria",04);
		Provincia2 p4 = new Provincia2("CO","Cordoba",14);
		Provincia2 p5 = new Provincia2("SE","Sevilla",41);
		Provincia2 p6 = new Provincia2("MA","Malaga",29);
		Provincia2 p7 = new Provincia2("CA","Cadiz",11);
		Provincia2 p8 = new Provincia2("H","Huelva",21);
		Provincia2 p9 = new Provincia2("GR","Granada",18);
		
		//b)
		HashMap<Provincia2,Integer> mapaHash = new HashMap<>();
		
		mapaHash.put(p1,18);
		mapaHash.put(p2,23);
		mapaHash.put(p3,04);
		mapaHash.put(p4,14);
		mapaHash.put(p5,41);
		mapaHash.put(p6,29);
		mapaHash.put(p7,11);
		mapaHash.put(p8,21);
		
		LinkedHashMap<Provincia2,Integer> mapaLinked = new LinkedHashMap<>();
		
		mapaLinked.put(p1,18);
		mapaLinked.put(p2,23);
		mapaLinked.put(p3,04);
		mapaLinked.put(p4,14);
		mapaLinked.put(p5,41);
		mapaLinked.put(p6,29);
		mapaLinked.put(p7,11);
		mapaLinked.put(p8,21);
		
		TreeMap<Provincia2,Integer> mapaTree = new TreeMap<>();
		
		mapaTree.put(p1,18);
		mapaTree.put(p2,23);
		mapaTree.put(p3,04);
		mapaTree.put(p4,14);
		mapaTree.put(p5,41);
		mapaTree.put(p6,29);
		mapaTree.put(p7,11);
		mapaTree.put(p8,21);
		
		//Mostrar por pantalla
		System.out.println();
		System.out.println("******** Mapa Hash ********");
		for(Map.Entry<Provincia2,Integer> mapaH : mapaHash.entrySet()){
			System.out.println();
			System.out.println("Clave: " + mapaH.getKey() + mapaH.getValue());
		}
		
		System.out.println();
		System.out.println();
		System.out.println("******** Mapa Linked ********");
		for(Map.Entry<Provincia2,Integer> mapaLink : mapaLinked.entrySet()){
			System.out.println();
			System.out.println("Clave: " + mapaLink.getKey() + mapaLink.getValue());
		}
		
		System.out.println();
		System.out.println();
		System.out.println("******** Mapa Tree ********");
		for(Map.Entry<Provincia2,Integer> mapaTr : mapaTree.entrySet()){
			System.out.println();
			System.out.println("Clave: " + mapaTr.getKey() + mapaTr.getValue());
		}
		
		//Ahora vamos a probar a duplicar Granada en los tres casos
		mapaHash.put(p9,18);
		mapaLinked.put(p9,18);
		mapaTree.put(p9,18);
		
		//Mostrar por pantalla
		System.out.println();
		System.out.println("******** Nuevo Mapa Hash ********");
		for(Map.Entry<Provincia2,Integer> mapaH : mapaHash.entrySet()){
			System.out.println();
			System.out.println("Clave: " + mapaH.getKey() + mapaH.getValue());
		}
		
		System.out.println();
		System.out.println();
		System.out.println("******** Nuevo Mapa Linked ********");
		for(Map.Entry<Provincia2,Integer> mapaLink : mapaLinked.entrySet()){
			System.out.println();
			System.out.println("Clave: " + mapaLink.getKey() + mapaLink.getValue());
		}
		
		System.out.println();
		System.out.println();
		System.out.println("******** Nuevo Mapa Tree ********");
		for(Map.Entry<Provincia2,Integer> mapaTr : mapaTree.entrySet()){
			System.out.println();
			System.out.println("Clave: " + mapaTr.getKey() + mapaTr.getValue());
		}
	}
}