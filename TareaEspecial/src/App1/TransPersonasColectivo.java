package App1;
import java.util.Scanner;
public class TransPersonasColectivo {
	  
	 
		
		  Scanner s= new Scanner(System.in);
			 
			 int sueldoB;
			 int horas;
			 System.out.println("Ingrese el numero de horas");
			 horas= s.nextInt();
			 sueldoB= 700;
			 
		System.out.print("El sueldo es " + ((horas*5)/2 + sueldoB) );
	}
	}

