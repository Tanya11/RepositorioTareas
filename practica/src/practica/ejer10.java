package practica;
import java.util.Scanner;  
public class ejer10 {

	public static void main(String[] args) {
		
		
			Scanner scan = new Scanner(System.in); 
			System.out.print("\nIngresa altura de la piramide: "); 
			int alto =scan.nextInt(); 
			int ancho = (alto*2)-1; 
			int num1= alto-1;
			for(int i=0; i<alto; i++){ 
			for(int j=0; j<ancho; j++) 
			System.out.println(" "+num1); 
			else if(j<ancho-i) System.out.print(""); 
			System.out.println(); 

						} 
			
			
						

}
}
