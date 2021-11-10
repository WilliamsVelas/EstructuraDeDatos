package examen2estructuradedatos;

import java.util.LinkedList;

public class Examen2EstructuradeDatos {

    public static void main(String[] args) {
        LinkedList<Estudiante> ListaEs = new LinkedList<>();
      
        String [] aux1,aux2;
         
        archivo a = new archivo();
        String s1 = a.leerTxt("Estudiantes.in.txt");
        
        aux1 = s1.split("#");
        
       for(int i=0; i< aux1.length; i++){
       aux2 = aux1[i].split("//");
       int year, prom;
       year = Integer.parseInt(aux2[4]);
       prom = Integer.parseInt(aux2[3]);      
       Estudiante objeto = new Estudiante(aux2[0],aux2[1],aux2[2],year,prom);
       ListaEs.add(objeto);
      
      
          
       
       }
        int suma = 0;
        for (int j = 0; j < ListaEs.size(); j++) {
              suma+= ListaEs.get(j).getPromedio();
           }
        double promedioGe = suma/ListaEs.size();
        System.out.println("El promedio general es "+promedioGe);
    }
   
   }
