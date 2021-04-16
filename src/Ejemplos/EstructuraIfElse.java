package Ejemplos;

import java.util.Scanner;

public class EstructuraIfElse {
    
    public static void main(String[] args) {
        
        try{
            
            Scanner leer = new Scanner(System.in);
            
            System.out.println("Ingrese la cantidad de su salario");
            double salario = leer.nextDouble();
            
            ifElse(salario);
        }catch(Exception e){
            
            System.out.println(e.getMessage());
        }
    }
    
    public static void ifElse(double salario){
        
        if(salario > 235){
            
            System.out.println("Usted ganas mas del salario minimo");
        }else{
            
            System.out.println("Usted gana menos del salario minimo");
        }
    }
}
