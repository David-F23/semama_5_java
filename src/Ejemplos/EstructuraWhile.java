package Ejemplos;

import java.util.Scanner;

public class EstructuraWhile {
    
    public static void main(String[] args) {
        
        try{
            Scanner leer = new Scanner(System.in);
            
            System.out.println("Ingresar un numero limite de repeticion");
            String limite = leer.next();
            
            if(limite == null){
                
                System.out.println("Dato inválido");
                
            }else{
                
                WhileSencillo(Integer.parseInt(limite));
            }
        }catch(Exception e){
            
            System.out.println(e.getMessage());
        }
    }
    
    public static void WhileSencillo(int limite){
        
        int i = 1;
        
        while(i <= limite){
            
            System.out.println("El valor de la repetición es: " + i);
            i++;
        }
    }
}
