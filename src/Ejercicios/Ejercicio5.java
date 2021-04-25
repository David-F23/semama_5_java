package Ejercicios;

import java.util.Scanner;

public class Ejercicio5 {
    
    public static void main(String[] args) {
        
        try{
            Scanner leer = new Scanner(System.in);
            
            System.out.println("Ingrese los minutos que duró la llamada");
            int minutos = leer.nextInt();
            
            System.out.println("El costo de su llamada es de: $");
            System.out.println(CalcularLlamada(minutos));
            
            System.out.println("================\n En total:");
            
            Total(CalcularLlamada(minutos));
            
        }catch(Exception e){
            
            System.out.println(e.getMessage());
        }
    }
    
    public static double CalcularLlamada(int tiempo){
        double total = 0.0;
        double costoBase = 0.20;
        double totalFor = 0.0;
        
        if(tiempo <= 3){
            
            System.out.println("El total es: $" + costoBase);
            System.out.println("dos monedas de diez centacvos");
            
        }else{
            
            for(int i = 3; i < tiempo ; tiempo--){
                
                totalFor += 0.5;
                
            }
            
            total = costoBase + totalFor;
            
        }
        
        return total;
    }
    
    public static void Total(double total){
        
        double billete_1, billete_5, billete_10, billete_20;
        double moneda_25, moneda_10, moneda_5, moneda_1;
        
        moneda_1 = total;
        billete_20 = (moneda_1 - moneda_1 % 20) / 20;
        moneda_1 = moneda_1 % 20;
        billete_10 = (moneda_1 - moneda_1 % 10) / 10;
        moneda_1 = moneda_1 % 10;
        billete_5 = (moneda_1 - moneda_1 % 5) / 5;
        moneda_1 = moneda_1 % 10;
        billete_1 = (moneda_1 - moneda_1 % 1) / 1;
        moneda_1 = moneda_1 % 1;
        moneda_25 = (moneda_1 - moneda_1 % 0.25) / 0.25;
        moneda_1 = moneda_1 % 0.25;
        moneda_10 = (moneda_1 - moneda_1 % 0.10) / 0.10;
        moneda_1 = moneda_1 % 0.10;
        moneda_5 = (moneda_1 - moneda_1 % 0.05) / 0.05;
        moneda_1 = moneda_1 % 0.05;
        
        System.out.println("Billetes de 20 => " + (int)billete_20);
        System.out.println("Billetes de 10 => " + (int)billete_10);
        System.out.println("Billetes de 5 => " + (int)billete_5);
        System.out.println("Billetes de 1 => " + (int)billete_1);
        System.out.println("Monedas de 0.25 => " + (int)moneda_25);
        System.out.println("Monedas de 0.10 => " + (int)moneda_10);
        System.out.println("Monedas de 0.05 => " + (int)moneda_5);
        System.out.println("Monedas de 0.01 => " + (int)moneda_1);
    }
}
