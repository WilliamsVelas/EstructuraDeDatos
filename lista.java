
package examen2estructuradedatos.ejercicio2;


public class lista {
    nodo primero;
    nodo ultimo;
    
    public lista(){
        primero = null;
        ultimo = null;
    }
    public void ingresar (int x){
        nodo nue = new nodo();
        nue.datos  = x;
        
        if(primero == null){
            primero = nue;
            primero.siguiente = primero;
            primero.anterior = ultimo;
            ultimo = nue;
        }else {
           ultimo.siguiente = nue;
           nue.siguiente = primero;
           ultimo = nue;
           primero.anterior = ultimo;
        }
    }   
        
             public void mostrar(){
             nodo actual = new nodo();
             actual = primero;
             
             do{
                 System.out.println(actual.datos);
              actual = actual.siguiente;
                }while(actual!=primero);
        }
             
             
     public void buscar(int x) {
    	 nodo actual = new nodo();
    	 actual = ultimo;
    	 boolean encontrado = false;
    	int dat = 0;
    	 do{
    		 if(actual.datos==x) {
    			 encontrado = true;
    			 dat = actual.datos; 
    		 }
    		 actual = actual.siguiente;
    	 }while(actual != ultimo);
    	 
    	 if(encontrado==true) {
    		 System.out.println ("Nodo encontrado  \n"+dat);
           }

    	 else{
    		 System.out.println ("Nodo no encontrado  \n"+dat);
           }
     }
}