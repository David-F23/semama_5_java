package Ejemplos;

import java.util.Scanner;

public class EstructuraIfElseAnidada {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        try{
            
            System.out.println("Ingrese la cantidad de su salario.");
            double salario = leer.nextDouble();
            
            IfElseAnidada(salario);
        }catch(Exception e){
            
            System.out.println(e.getMessage());
        }
    }
    
    public static void IfElseAnidada(double salario){
        
        if(salario > 235){
            
            System.out.println("Usted ganas mas del salario minimo");
            
        }else if(salario > 0){
            
            System.out.println("Usted gana menos del salario minimo");
            
        }else{
            
            System.out.println("Ingreso de dato erroneo");
        }
    }
}
