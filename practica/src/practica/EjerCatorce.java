package practica;

import java.util.Scanner;

public class EjerCatorce {

			public static void main(String args[])
		{
		
							
				int n,i,j;

				Scanner obj1=new Scanner(System.in);

				System.out.print("ingrese numero de elementos ");
				n=obj1.nextInt();

				for(i=1;i<=n;i++){
				   System.out.println();

				    for(j=1;j<=n;j++){

				       if(i==1 || j==1){
				          System.out.print("*");
				          }
				     else{
				          if(i==n || j==n)               
				          System.out.print("*");
				        else
				          System.out.print(" ");
				     }   
				    
				     }}
				
				}
				     }
				

