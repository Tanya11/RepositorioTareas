package practica;
import java.util.Scanner;

 public class Ejer4 {
	
	
			public static void main(String[] args, String String) {
				
					System.out.println("Escriba C,X para calcular el area de un Circulo");
						System.out.println("Escriba U,X para calcular el area de un Cuadrado");
							System.out.println("Escriba C,X para calcular el area de un Triangulo");

							//String.charAt();
			  
				char a ;	 
				char[] string = new char[0];
			     
					if (a=='C'|| a=='U'||a=='T');
				     System.out.println("Ingrese X");
					
					
					float X;
				char  U, T;||
				Scanner s= new Scanner(System.in);
				 a=s.next();
				 X = s.nextFloat();
//				 C = s.next();
				 char op=a;
				 
				 
				// char[] C = {}; String = new String(C);
				 switch (op){
				 case 'C': {
					 double pi = 3.1416;
					 double m = (pi*X);
					 double n = (2*pi*X);
							 
					 System.out.println("El área es = " + m);
					 System.out.println("El perímetro es = " + n);
					 System.out.println("El radio es = " + X);
					 break;
				 }
				 case 'U': {
					 double j = (X*X);
					 double k = (2*X);
							 
					 System.out.println("El área es = " + j);
					 System.out.println("El perímetro es = " + X);
							// Math.sqrt(arg0)
					 break;
				 }
				 case 'T': {
					 double v =(Math.sqrt(3/4)*X*X);
					 double r = (3*X);
					 double h = ((Math.sqrt(3)/2)*X);
							 
					 System.out.println("El área es = " + v);
					 System.out.println("El perímetro es = " + r);
					 System.out.println("El radio es = " + h);
					 
					 break;
				 }
				 default: {
				 System.out.println("Ingrese lo que se indica");
				 }
				 }
				}

			

				


		}
	


