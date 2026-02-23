//@ProfitCoder 	17:28		17/02/2026

public class Alumno{
	//Atributos
	private String nombre;
	private String dni;
	private double calificacionTrim1 = -1;
	private double calificacionTrim2 = -1;
	private double calificacionTrim3 = -1;
	
	//Constructor por defecto
	public Alumno(){
		calificacionTrim1 = -1;
		calificacionTrim2 = -1;
		calificacionTrim3 = -1;
	}
	
	//Constructor con todos los parametros
	public Alumno(String nombre, String dni, double calificacionTrim1, double calificacionTrim2, double calificacionTrim3){
		this.nombre = nombre;
		this.dni = dni;
		this.calificacionTrim1 = calificacionTrim1;
		this.calificacionTrim2 = calificacionTrim2;
		this.calificacionTrim3 = calificacionTrim3;
	}
	
	//Constructor con atributos
	public Alumno(String nombre, String dni){
		this.nombre = nombre;
		this.dni = dni;
		this.calificacionTrim1 = -1;
		this.calificacionTrim2 = -1;
		this.calificacionTrim3 = -1;
	}
	
	//Setters y getters
	public String getNombre(){
		return nombre;
	}
	
	public String getDNI(){
		return dni;
	}
	
	public double getCal1Trim(){
		return calificacionTrim1;
	}
	
	public double getCal2Trim(){
		return calificacionTrim2;
	}
	
	public double getCal3Trim(){
		return calificacionTrim3;
	}
	
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	
	public void setDNI(String dni){
		this.dni = dni;
	}
	
	public void setCal1Trim(double calificacionTrim1){
		this.calificacionTrim1 = calificacionTrim1;
	}
	
	public void setCal2Trim(double calificacionTrim2){
		this.calificacionTrim2 = calificacionTrim2;
	}
	
	public void setCal3Trim(double calificacionTrim3){
		this.calificacionTrim3 = calificacionTrim3;
	}
	
	//Metodo Calificación final hecha con media aritmética.
	public double calificacionFinal(){
		double notaFinal = -1;
		
		if(calificacionTrim1 != -1 && calificacionTrim2 != -1 &&  calificacionTrim3 != -1){
			notaFinal = (calificacionTrim1+calificacionTrim2+calificacionTrim3)/3;
		}
		return notaFinal;
	}
	
	//Metodo informe del alumno
	public void informeAlumno(){
		System.out.println("-----------------------------");
		System.out.println("Nombre " + nombre);
		System.out.println("DNI " + dni);
		System.out.println("1er Trim " + calificacionTrim1);
		System.out.println("2nd Trim: " + calificacionTrim2);
		System.out.println("3rd Trim: " + calificacionTrim3);
		System.out.println("Calificacion final " + calificacionFinal());
		System.out.println("-----------------------------");
	}	

}
