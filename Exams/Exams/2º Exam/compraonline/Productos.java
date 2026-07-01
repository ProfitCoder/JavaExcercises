//Pablo Manuel Fernández Velázquez

package compraonline;

import java.util.regex.*;

public class Productos{
	//Atributos
	public String nombre;
	private String marca;
	private String fechaDeRegistro;
	
	public Productos(String nombre, String marca, String fechaDeRegistro){
		this.nombre = nombre;
		this.marca = marca;
		if(comprobarFecha(fechaDeRegistro) == true){
			this.fechaDeRegistro = fechaDeRegistro;
		}
		else{
			System.out.println("Fecha Incorrecta");
		}	
	}
	
	
	private boolean comprobarFecha(String fechaDeRegistro){
		boolean fechaCorrecta = false;
		
		Pattern p = Pattern.compile("(3[01]|[21][0-9]|0?[0-9])[/](1[0-2]|0?[1-9])[/][\\d]+");
		Matcher m = p.matcher(fechaDeRegistro);
		
		if(m.matches()){
			fechaCorrecta = true;
		}
		return fechaCorrecta;
	}
	
	public String toString(){
		return String.format("Nombre: %s\nMarca: %s\nFecha de registro: %s",nombre,marca,fechaDeRegistro);
	}
}