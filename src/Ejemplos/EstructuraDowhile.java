package Ejemplos;

import java.util.Scanner;

public class EstructuraDowhile {
    
    public static void main(String[] args) {
        
        try{
            Scanner leer = new Scanner(System.in);
            
            System.out.println("Ingrese un numero limite de repetición");
            String limite = leer.next();
            
            InstruccionDowhile(Integer.parseInt(limite));
            
        }catch(Exception e){
            
            System.out.println(e.getMessage());
        }
    }
    
    public static void InstruccionDowhile(int limite){
            
       int i = 1;
       
       do{
           System.out.println("El valor de la repetición es: " + i);
           i++;
       }while(i <= limite);
    }
}
