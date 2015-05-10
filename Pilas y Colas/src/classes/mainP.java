package classes;

import java.util.Scanner;


public class mainP {

		public static void main(String[] args) {
		// TODO Auto-generated method stub
       filo pila=new filo();
		

		pila.push("a");
		pila.push("e");
		pila.push("i");
		pila.push("o");
		pila.push("u");
		pila.push("Vocales");

		pila.push("vocales");
		pila.push("u");
		pila.push("o");
		pila.push("i");
		pila.push("e");
		pila.push("a");
		System.out.println("ultimo valor Pila"); 
		System.out.println(pila.peek()); 

		System.out.println(" "); 
		System.out.println(" "); 

		System.out.println("Datos Pila"); 

		while(pila.empty()==false){ 
		System.out.println(pila.pop()); 
		
		}

		
		

		
	}

}
