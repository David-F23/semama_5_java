package Ejemplos;

import java.util.Scanner;

public class LecturaCaracteres {
    
    public static void main(String[] args) {
        
        try{
            Scanner leer = new Scanner(System.in);
            
            System.out.println("Ingrese un nombre");
            String nombre = leer.next();
            
            LeerCaracteres(nombre.toUpperCase());
            
        }catch(Exception e){
            
            System.out.println(e.getMessage());
        }
    }
    
    public static void LeerCaracteres(String nombre){
        
        for(int i = 0; i < nombre.length(); i++){
            
            System.out.println("Caracter " + i + " -> " + nombre.charAt(i));
        }
    }
}
