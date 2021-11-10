package examen2estructuradedatos.ejercicio2;

import java.util.Scanner;

public class principal {
    
    
    public static void main(String[] args){
    
    Scanner tec = new Scanner(System.in);
        
    lista listan = new lista();
    int op = 0;
    
    do{
        System.out.println("//Escoga una opcion//");
        System.out.println("");
        System.out.println("1. Ingrese un nodo");
        System.out.println("2. Mostrar la lista");
        System.out.println("3. Buscar en la lista");
        
        op = tec.nextInt();
        
        switch(op){
            case 1:
                System.out.println("Ingrese un nodo");
                int dat = tec.nextInt();
                listan.ingresar(dat);
                break;
            case 2:
                System.out.println("Mostrar Lista");
                listan.mostrar();
                break;
            case 3:
                System.out.println("Buscar");
                System.out.println("Ingrese un dato a buscar: ");
                int dat3 = tec.nextInt();
                listan.buscar(dat3);
                break;
        }
    }while(op!=3);
   
    
    
    }
}
