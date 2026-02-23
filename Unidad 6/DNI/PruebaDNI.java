//@ProfitCoder  		10:05  16/02/2026

public class PruebaDNI{
	public static void main(String [] args){
		//Crear un objeto dni
		DNI dni1 = new DNI();
		
		//Mostrar el dni1
		System.out.println(dni1);
		
		//Establecemos el dni a un valor
		try{
			dni1.establecer("74851432Y");
			System.out.println(dni1);
		}
		catch(Exception e){
			System.out.println(e);
		}
		try{
			dni1.establecer(74851432);
			System.out.println(dni1);
		}
		catch (Exception f){
			System.out.println(f);
		}
		
		//Calcular letra de un dni
		//12345678
		int dni = 12345678;
		System.out.println(DNI.calcularLetraNIF(dni));
	}

}
