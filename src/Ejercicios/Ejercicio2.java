package Ejercicios;

import java.util.Scanner;

public class Ejercicio2 {
    
    public static void main(String[] args) {
        
        try{
            Scanner leer = new Scanner(System.in);
            
            System.out.println("Ingrese el valor de la venta");
            double venta = leer.nextDouble();
            
            System.out.println("El sueldo total es de: " + ComisionRenta(venta)); 
            
        }catch(Exception e){
            
            System.out.println(e.getMessage());
        }
    }
    
    public static double ComisionRenta(double venta){
        
        double comision = 0.0, salario ,salarioTotal;
        
        if(venta >= 3000){
            
            comision = venta * 0.1;
            
        }else if(venta >= 1000 && venta <= 2999){
            
            comision = venta * 0.08;
            
        }else if(venta >= 1 && venta <= 999){
            
            comision = venta * 0.05;
        }
        
        salario = 300 + comision;
        double renta = salario * 0.1;
        salarioTotal = salario - renta;
        
        return salarioTotal;
    }
}
