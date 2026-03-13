//@ProfitCoder 		9:24   05/03/2026

import java.util.GregorianCalendar;

public class PersonaTest{
	public static void main(String [] args){
		//Crear un alumno
		Alumno al1 = new Alumno("Jose Luís","Gárcia Cano",new GregorianCalendar(2026,02,05),"1º DAW Bilingüe",8.25);
		
		//Mostrarmos los datos por pantalla
		al1.mostrar();
		System.out.println("\n");
		
		//Creamos un profesor
		Profesor prof1 = new Profesor("Ana","Perez Martin",new GregorianCalendar(1990,05,16),1951.75,"Informática");
		
		//Mostramos por pantalla
		prof1.mostrar();
		
		al1.mostrarInfoEspecifica();
		
		prof1.mostrarInfoEspecifica();
	}
}