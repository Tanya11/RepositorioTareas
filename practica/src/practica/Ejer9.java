package practica;
import java.util.Scanner;  

public class Ejer9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner s=new Scanner(System.in);  
		      String Unidad[]={"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};  
		      String Decena[]={"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};  
		      String Centena[]={"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};  
		      System.out.println("Ingrese número entre 1 y 999");  
		      int A = s.nextInt();  
		      int u=A%10;  
		      int d=(A/10)%10;  
		      int c=A/100;  
		      if(A>=100){           
		          System.out.println(Centena[c]+Decena[d]+Unidad[u]);  
		      }else{  
		          if(A>=10){  
		              System.out.println(Decena[d]+Unidad[u]);            
		          }else{  
		              System.out.println(Unidad[A]);            
		          }            
		      }            
		    }  
		
		
		
	}


