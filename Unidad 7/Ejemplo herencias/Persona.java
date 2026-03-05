//@ProfitCoder 		9:24   05/03/2026

import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;

public class Persona{
	//Atributo
	protected String nombre;
	protected String apellidos;
	protected GregorianCalendar fechaNac;		//Calendario Standar
	
	//Constructores
	public Persona(String nombre, String apellidos, GregorianCalendar fechaNac){
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechaNac = fechaNac;
	}
	
	public Persona(){}
	
	//Metodos
	public void SetNombre(String nom){
		this.nombre = nombre;
	}
	
	public void setApellidos(String apellidos){
		this.apellidos = apellidos;
	}
	
	public void setFechaNac(GregorianCalendar fechaNac){
		this.fechaNac = fechaNac;
	}
	
	public String getNombre(){
		return nombre;
	}
	
	public String getApellidos(){
		return apellidos;
	}
	
	public GregorianCalendar getFechaNac(){
		return fechaNac;
	}
	
	//toString
	
	/*
	@Override
	public String toString(){				Se suele usar Override cuando se sobreescribe un metodo de la clase Object
		return "Ejemplo ";
	}
	*/

	//Metodo mostrar
	public void mostrar(){
		System.out.println("Nombre: " + nombre);
		System.out.println("Apellidos: " + apellidos);
		
		//Formato para fecha GregorianCalendar
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");		//En calendar los meses van del 0 al 11 siendo 0 enero y 11 Diciembre
		String fecha = sdf.format(this.fechaNac.getTime());			//El getTime viene de la clase Calendar
		System.out.println("Fecha Nacimiento: " + fecha);
	}
}