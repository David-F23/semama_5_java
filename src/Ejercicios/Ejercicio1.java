package Ejercicios;

import java.util.Scanner;

public class Ejercicio1 {
    
    public static void main(String[] args) {
        
        try{
            Scanner leer = new Scanner(System.in);
            
            System.out.println("Ingrese un número");
            double numero1 = leer.nextDouble();
            System.out.println("Ingrese otro número");
            double numero2 = leer.nextDouble();
            System.out.println("Ingrese la operacón que desea realizar.");
            String operacion = leer.next();
            
            OperacionMath(numero1, numero2, operacion.toUpperCase().charAt(0));
        }catch(Exception e){
            
            System.out.println(e.getMessage());
        }
    }
    
    public static void OperacionMath(double numero1, double numero2, char operacion){
        
        double resultado;
        
        switch(operacion){
            case 'S':
                resultado = numero1 + numero2;
                System.out.println("El resultado de la suma es: " + resultado);
                break;
            case 'R':
                resultado = numero1 - numero2;
                System.out.println("El resultado de la resta es: " + resultado);
                break;
            case 'M':
                resultado = numero1 * numero2;
                System.out.println("El resultado de la multiplicación es: " + resultado);
                break;
            case 'D':
                if(!(numero1 == 0) && !(numero2 == 0)){
                    
                    resultado = numero1 / numero2;
                    System.out.println("El resultado de la división es: " + resultado);
                    
                }else{
                    
                    System.out.println("No se puede divir un numero entre cero.");
                }
                break;
            default:
                System.out.println("Operación no válida.");
        }
    }
}
