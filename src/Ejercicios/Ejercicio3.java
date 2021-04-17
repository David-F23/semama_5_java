package Ejercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ejercicio3 {
    
    public static void main(String[] args) {
        
        try{
            Scanner leer = new Scanner(System.in);
            
            
            System.out.println("CALCULAR EL ÍNDICE DE MASA CORPORAL");
            System.out.println("===================================");
            
            System.out.println("Ingrese el peso en kg");
            double peso = leer.nextDouble();
            System.out.println("Ingrese su estatura en metros");
            double estatura = leer.nextDouble();
            
            CalcularIMC(peso, estatura);
            
        }catch(Exception e){
            
            System.out.println(e.getMessage());
        }
    }
    
    public static void CalcularIMC(double peso, double estatura){
        
        DecimalFormat formato = new DecimalFormat("##.#");
        
        double imc = peso / Math.pow(estatura, 2);
        String mensaje;
        
        if(imc < 18){
            
            mensaje = "Peso bajo. Necesario valorar signos de desnutrición";
            
        }else if(imc >= 18 && imc <= 24.9){
            
            mensaje = "Normal";
            
        }else if(imc >= 25 && imc <= 26.9 ){
            
            mensaje = "Sobrepeso";
            
        }else if(imc >= 27 && imc <= 29.9){
            
            mensaje = "Obesidad grado I. Riesgo relativo alto para desarrollar enfermedades cardiovasculares";
            
        }else if(imc >= 30 && imc <= 39.9){
            
            mensaje = "Obesidad grado II. Riesgo relativo muy alto para el desarrollo de enfermedades cardiovasculares";
            
        }else{
            
            mensaje = "Obesidad grado III Extrema o Mórbida. Riesgo relativo extremadamente alto para el desarrollo de enfermedades cardiovasculares ";
        }
        
        System.out.println("Su Ídice de Masa Corporal es de: " + formato.format(imc));
        System.out.println(mensaje);
    }
}
