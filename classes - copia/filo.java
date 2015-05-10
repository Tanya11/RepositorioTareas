package classes;

import java.util.ArrayList;

public class filo {
	
	private ArrayList<Object> filo= new ArrayList();
	
	public void push(Object o){
	
	filo.add(o);
	
	}

	
	public Object pop(){
		       if(!(filo.isEmpty())){
               Object o = filo.get(filo.size()-1);
               filo.remove(filo.size()-1);
               return o;
       }else{
               return null;
       }
	       
	}

	public Object peek(){
			 if(!(filo.isEmpty())){
             return filo.get(filo.size()-1);
     }else{
             return null;
     }
		 
	}

	public boolean empty(){
				 return filo.isEmpty();
	}

}
