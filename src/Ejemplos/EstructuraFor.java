package Ejemplos;

import java.util.Scanner;

public class EstructuraFor {
    
    public static void main(String[] args) {
        
        try{
            Scanner leer = new Scanner(System.in);
            
            System.out.println("Ingrese un numero limite de repetición");
            String limite = leer.next();
            
            InstruccionFor(Integer.parseInt(limite));
            
        }catch(Exception e){
            
            System.out.println(e.getMessage());
        }
    }
    
    public static void InstruccionFor(int limite){
        
        for(int i = 1; i <= limite; i++){
            
            System.out.println("El valor de la repetición es: " + i);
        }
    }
}
