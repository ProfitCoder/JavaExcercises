//Pablo Manuel Fernández Velázquez
import java.util.Scanner;

public class MenuString
{
	public static void main(String [] args)
	{
		//Creación de variables
		char numcar;
		String cadenaus,palabrabus,posicionpa,palabracad,palabrarep,cadenaoriginal;
		int x = 0,respus,caractotal = 0,cadenaexis = 0,i,poss = 0,palabraexis = 0;
		Scanner sc = new Scanner(System.in);
		
		
		//Solución
		try
		{
			System.out.print("\n---MENÚ DE OPCIONES ---");
			System.out.print("\n (1) Cargar un texto");
			System.out.print("\n (2) Contar palabras");
			System.out.print("\n (3) Buscar texto");
			System.out.print("\n (4) Posición de una palabra");
			System.out.print("\n (5) Reemplazar una palabra");
			System.out.print("\n (s) Salir y finalizar");
			System.out.print("\n------------------------");
			System.out.print("\n Seleccione una opción (1-5 o s): ");
			respus = Integer.parseInt(sc.nextLine());
			
			if (respus == 1)
			{	
				System.out.print("\n¿Bienvenido, que cadena deseas definir? (Solo se guardaran 100 caracteres):");
				cadenaus = sc.nextLine().toLowerCase();
				System.out.print("\nCadena creada correctamente");
			do
			{
				if (respus == 1)
				{	
					x = 1;
				}
				else
				{
					if(respus == 2 && x == 1)
					{
						System.out.print("\nVoy a contar las palabras");
						for (i=0;i<cadenaus.length();i++)
						{
							numcar = cadenaus.charAt(i);
							caractotal++;
						}
						System.out.printf("\nHay un total de %d caracteres en tu cadena.",caractotal);
					}
					else
						if(respus == 3 && x == 1)
						{
							System.out.print("\nIntroduce una palabra y te dire si esta o no en to cadena:");
							palabrabus = sc.nextLine().toLowerCase();
							cadenaexis = cadenaus.indexOf(palabrabus);
							if (cadenaexis == -1)
							{
								System.out.print("\nEsa palabra no esta en tu cadena.");
							}
							else 
							{
								System.out.print("\nEsta palabra si esta en tu cadena");
							}
						}
						else
						{
							
							if(respus == 4 && x == 1)
							{
								System.out.print("\nAhora dime una palabra y si esta en tu cadena te dire la posición:");
								posicionpa = sc.nextLine().toLowerCase();
								poss = cadenaus.indexOf(posicionpa);
								if(poss == -1)
								{
									System.out.print("\nEsta palabra no esta en tu cadena.");
								}
								else
								{
									System.out.printf("\nTu palabra esta en la posición %d.",poss);
								}
							}
							else
								if(respus == 5 && x == 1)
								{
									System.out.print("\nAhora vamos a reemplazar palabras, dime que palabra de la cadena quieres reemplazar:");
									palabracad = sc.nextLine().toLowerCase();
									System.out.print("\nAhora dime porque palabra quieres reemplazarla: ");
									palabrarep = sc.nextLine().toLowerCase();
									palabraexis = cadenaus.indexOf(palabracad);
									if(palabraexis == -1)
									{
										System.out.print("\nEsta palabra no esta en la cadena.");
									}
									else
									{
										cadenaus = cadenaus.replace(palabracad,palabrarep);
										System.out.print("\nYa la he reemplazado");
									}
								}
								else 
								{
									System.out.print("\nFin del programa.");
								}
						}
						}
				}
				while (respus != 's');
				{
					System.out.print("Adiós");
				}
				}
				else
				{
					System.out.print("\nTienes que pulsar el 1 para empezar. Fin de programa");
				}
		}
		catch (IllegalStateException f)
		{
			System.out.print(f);
		}
		catch (Exception e)
		{
			System.out.print("ERROR: "+e);
		}
	}
}