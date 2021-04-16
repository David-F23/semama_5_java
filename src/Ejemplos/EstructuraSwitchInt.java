package Ejemplos;

import java.util.Scanner;

public class EstructuraSwitchInt {
    
    public static void main(String[] args) {
        
        try{
            Scanner leer = new Scanner(System.in);
            
            System.out.println("Ingrese un numero del 1 al 5");
            int numero = leer.nextInt();
            
            SwitchInt(numero);
        }catch(Exception e){
            
            System.out.println(e.getMessage());
        }
    }
    
    public static void SwitchInt(int numero){
        
        String mensaje;
        
        switch(numero){
            case 1:
                mensaje = "UNO";
                break;
            case 2:
                mensaje = "DOS";
                break;
            case 3:
                mensaje = "TRES";
                break;
            case 4:
                mensaje = "CUATRO";
                break;
            case 5:
                mensaje = "CINCO";
                break;
            default:
                mensaje = "Número no válido";
                break;
        }
        
        System.out.println("El numero es: " + mensaje);
    }
}
