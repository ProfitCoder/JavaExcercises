//ProfitCoder 	8:42			12/03/2026

public class PruebaEmpleado{
	public static void main(String [] args){
		//Creación de variables y objetos
		
		//Crea un empleado
		Empleado emp1 = new Empleado("Jose",2400);
		
		//Crea un gerente
		Gerente gen1 = new Gerente("Juan",1600,200.54);
		
		//Crea un Repartidor
		Repartidor rep1 = new Repartidor("Antonio",1200,15,10.45);
		
		//Mostrar sus sueldos
		System.out.println("***************************************");
		System.out.println("Sueldo Empleado: " + emp1.calcularPago());
		System.out.println("****************************************");
		System.out.println("Sueldo Gerente: " + gen1.calcularPago());
		System.out.println("****************************************");
		System.out.println("Sueldo Repartidor: " + rep1.calcularPago());
		System.out.println("****************************************");
	}
}