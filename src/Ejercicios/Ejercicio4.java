package Ejercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ejercicio4 {
    
    public static void main(String[] args) {
        
        try{
            Scanner leer = new Scanner(System.in);
            
            System.out.println("INGRESE LOS SIGUIENTES DATOS.");
            System.out.println("=============================");
            System.out.println("Ingrese el nombre de la maquina");
            String nombre = leer.nextLine();
            System.out.println("Ingrese el costo de la maquinaria");
            double costo = leer.nextDouble();
            System.out.println("Ingrese los años de la depreciaición");
            int anios = leer.nextInt();
            System.out.println("====================================");
            
            DeprecMaquinaria(costo, anios);
            
        }catch(Exception e){
            
            System.out.println(e.getMessage());
        }
    }
    
    public static void DeprecMaquinaria(double costo, int anios){
        
        DecimalFormat formato = new DecimalFormat("#.####");
        
        double depreciacion = anios * (anios + 1) / 2;
        int i = 1;
        while(i <= anios ){
            
            double deprecAnio = 100 * (anios / depreciacion);
            double totalDeprec = costo * (anios / depreciacion);
            
            System.out.println("La de preciación en el año " + anios + " es de: $" + formato.format(deprecAnio) + "%");
            System.out.println("EL valor es de: " + totalDeprec);
            System.out.println("================================================");
            anios--;
        }
    }
}
