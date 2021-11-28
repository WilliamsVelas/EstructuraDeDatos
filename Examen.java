package examen;

public class Examen {

   
    public static void main(String[] args) {
    
        Cola colaCajero = new Cola();
        
        colaCajero.insertar(new Trans ("Retiro","Juan","Rodriguez",27, 234));
        colaCajero.insertar(new Trans ("Deposito","Luis","Loponcio",120, 432));
        colaCajero.insertar(new Trans ("Retiro","Juana","Marina",90, 532));
        
        colaCajero.detMontoTotalTiempo();
    }
}
    class Trans  {
   
     String Tramite, Nombre, Apellido; 
     int Tiempo;
     Double Monto;
    
    public Trans (String tramite, String nombre, String apellido, int tiempo, double monto){
    
        Tramite = tramite;
        
        Nombre = nombre;
        
        Apellido = apellido;
        
        Tiempo = tiempo;
        
        Monto = monto; 
    }
    public String getTramite(){
          return Tramite;
    }
    public String getNombre(){
          return Nombre;
    }
    public String getApellido(){
          return Apellido;
    }
    public int getTiempo(){
          return Tiempo;
    }
    public Double getMonto(){
          return Monto; 
     }
    }
    class Cola {
    
        NodoCola inicio,fin;
    
        public Cola(){
        inicio=fin=null;
        }
    class NodoCola {
    
        String dato;
    
        NodoCola siguiente;
        
        Trans info;
    
        public NodoCola(String d){
    
            dato = d;
    
            siguiente = null; 
                        }

        private NodoCola(Trans info) {
             
        }
    }       
    boolean vacia(){
        
        if (inicio == fin)
            return true;
        else
            return false;
        
    }
    public void insertar(Trans info){
            
        NodoCola nuevo;
        
        nuevo = new NodoCola(info);
        
        nuevo.info = info;
        
        nuevo.siguiente = null;
        
        if(vacia()){
        
            inicio = nuevo;
            fin = nuevo;
            
        }else{
            fin.siguiente = nuevo; 
        }
        fin = nuevo;
    
    }
   public void getMontoFinal(){
   
       Double MontoFinal = 0.0;
       
       NodoCola mf = inicio;
       
       while (mf != null){
       
           MontoFinal += mf.info.getMonto();
           
           mf = mf.siguiente;   
       }
       System.out.println("El monto final de las operaciones es "+ MontoFinal);
   }
   public void getTiempoFinal(){
   
       int TiempoFinal = 0;
       
       NodoCola mf = inicio;
       
       while(mf != null){
       
           TiempoFinal += mf.info.getTiempo();
           
           mf = mf.siguiente;
       }
       System.out.println("El tiempo es de "+TiempoFinal+"s");
   } 
  public void extraer(){
   
      Trans info = inicio.info;
      
      if(!vacia ()){
      
          inicio = null;
          fin = null;
          
      }else{
          inicio = inicio.siguiente;
      }
}
public void detMontoTotalTiempo(){

    this.getMontoFinal();
    this.getTiempoFinal();
}
}


    

