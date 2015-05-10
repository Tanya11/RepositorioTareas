package App1;
import java.util.Scanner;
public class TransMercanPeligrosas {
	
	
	
		
		 public static void main(String[] args){
			 Scanner s= new Scanner(System.in);
			 
			 int sueldoB;
			 int horas;
			 int toneladas;
			 int viajes;
			 System.out.println("Ingrese el numero de horas");
			 horas= s.nextInt();
			 sueldoB= 700;
			 
			 System.out.println("Ingrese el numero de toneladas transportadas");
			 toneladas= s.nextInt();
			 System.out.println("Ingrese el numero de viajes realizados");
			 viajes = s.nextInt();
		System.out.print("El sueldo es " + ((horas*5)+(toneladas)*2 + sueldoB+viajes*50) );     		 
			
			
			
		    }
	

}
