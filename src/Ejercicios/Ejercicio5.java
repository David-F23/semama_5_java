package Ejercicios;

import java.util.Scanner;

public class Ejercicio5 {
    
    public static void main(String[] args) {
        
        try{
            Scanner leer = new Scanner(System.in);
            
            System.out.println("Ingrese los minutos que duró la llamada");
            int minutos = leer.nextInt();
            
            CalcularLlamada(minutos);
        }catch(Exception e){
            
            System.out.println(e.getMessage());
        }
    }
    
    public static void CalcularLlamada(int tiempo){
        
        double costoBase = 0.20;
        double totalFor = 0.0;
        
        if(tiempo <= 3){
            
            System.out.println("El total es: $" + costoBase);
            System.out.println("dos monedas de diez centacvos");
            
        }else{
            
            for(int i = 3; i < tiempo ; tiempo--){
                
                totalFor += 0.5;
                
            }
            
            double total = costoBase + totalFor;
            
            
            System.out.println("El total es: $" + total);
        }
    }
}
