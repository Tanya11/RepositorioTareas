package listas;

	public class listasdobles
	{
	    nodo primero;
	    nodo ultimo;
	    listasdobles()
	    {
	        primero=null;
	        ultimo=null;
	    }
	 
	    public boolean estavacio()
	    {
	        if(primero==null) return true;
	        else return false;
	    }
	 
	    public listasdobles alta(int dat)
	    {
	        if(estavacio())
	        {
	            nodo nuevo=new nodo(dat);
	            primero=nuevo;
	            ultimo=nuevo;
	        }
	        else
	        {
	            nodo nuevo=new nodo(dat);
	            ultimo.next=nuevo;
	            nuevo.ant=ultimo;
	            ultimo=nuevo;
	        }
	        return this;
	    }
	 
	    public listasdobles borrar(int a)
	    {
	        nodo w=primero;
	        nodo y;
	        for(int i=0;i<a;i++)
	        {
	            y=w.ant;
	            w=w.next;
	        }
	        y=w.ant;
	        return this;
	    }
	 
	    public boolean delete(int num)
	    {
	        nodo anterior=null;
	        nodo actual=primero;
	        while(actual!=ultimo)
	        {
	            if(actual.dato==num)
	            {
	                if(anterior==null)
	                {
	                    primero=actual.next;
	                    primero.ant=null;
	                }
	                else{
	                    anterior.next=actual.next;
	                    nodo temporal;
	                    temporal=actual.next;
	                    temporal.ant=anterior;
	                }
	                return true;
	            }
	            anterior=actual;
	            actual=actual.next;
	        }
	        if(num==ultimo.dato)
	        {
	            ultimo=actual.ant;
	            return true;
	        }
	        return false;
	    }
	 
	        public void imprimir2()
	    {
	        nodo actual;
	        actual=ultimo;
	        while(actual!=primero)
	        {
	            System.out.println(actual.dato);
	            actual=actual.ant;
	        }
	                System.out.println(actual.dato);
	 
	    }
	        public void imprimir()
	    {
	        nodo actual;
	        actual=primero;
	        while(actual!=ultimo)
	        {
	            System.out.println(actual.dato);
	            actual=actual.next;
	        }
	                System.out.println(actual.dato);
	                 
	    }
	}
