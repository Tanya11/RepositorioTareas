package practica;
import java.util.Scanner;
public class Ejer6 {

				public static void main(String []arqs){
				Scanner s = new Scanner(System.in);
				int num1, num2;
				System.out.println("Ingrese 2 numeros");
				num1= s.nextInt(); 
				num2= s.nextInt();
				System.out.println("Ingrese letra");
					String operacion;
				operacion= s.next();
				//String.valueOf(operacion);
				
		    switch (operacion){
		    int sume, reste, multiplique, divida; 
		        case 's': {
		        sume= num1 + num2;
		        System.out.println("la suma es:" +sume);
			    break;
		        }case'r': {
		        reste= num1-num2;
		        System.out.println("la resta es:" +reste);
			    break;
		        }case 'm': {
		        multiplique= num1*num2;
		        System.out.println("la multiplicacion es:" +multiplique);
			    break;
		        }case 'd':{
		        divida= num1/num2;
		        System.out.println("la division es:" +divida);
			    break;
		        }   
		        }
		    }     
		        
		 	
		   

				
				
				
			
		

	}

}
