package Ejemplos;

import java.util.Scanner;

public class EstructuraIfSencilla {
    
    public static void main(String[] args) {
        
        try{
            Scanner leer = new Scanner(System.in); 
            
            System.out.println("Ingrese la cantidad de su salario");
            double salario = leer.nextDouble();
            
            ifSencillo(salario);
        }catch(Exception e){
            
            System.out.println(e.getMessage());
        }
    }
    
    public static void ifSencillo(double salario){
        
        if(salario > 235){
            System.out.println("Usted gana mas del salario mínimo");
        }
    }
}
