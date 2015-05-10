package classes;

public class mainC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	       cola cola=new cola();
			

			cola.offer("1");
			cola.offer("2");
			cola.offer("3");
			cola.offer("numeros");
			
			cola.offer("1");
			cola.offer("2");
			cola.offer("3");
			cola.offer("numeros");

			System.out.println("Primer valor Cola"); 
			System.out.println(cola.peek()); 

			System.out.println(" "); 
			System.out.println(" "); 

			System.out.println("Datos Cola"); 

			while(cola.peek()!=null){ 
			System.out.println(cola.poll()); 
			}

		
	}

}
