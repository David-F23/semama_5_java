package Ejemplos;

import java.util.Scanner;

public class EstructuraSwitchChar {
    
    public static void main(String[] args) {
        
        try{
            Scanner leer = new Scanner(System.in);
            
            System.out.println("Ingrese el estado civil de la persona.");
            String estadoCivil = leer.nextLine();
            
            SwitchChar(estadoCivil.toUpperCase().charAt(0));
        }catch(Exception e){
            
            System.out.println(e.getMessage());
        }
    }
    
    public static void SwitchChar(char estadoCivil){
    
        String mensaje;
        
        switch(estadoCivil){
            case 'S':
                mensaje = "Soltero/a";
                break;
            case 'C':
                mensaje = "Casado/a";
                break;
            case 'D':
                mensaje = "Divorsiado/a";
                break;
            case 'A':
                mensaje = "Acompañado/a";
                break;
            case 'F':
                mensaje = "Forever Alone";
                break;
            default:
                mensaje = "Estado civil erroneo";
                break;
        }
        
        System.out.println("Su estado civil es: " + mensaje);
    }
}
