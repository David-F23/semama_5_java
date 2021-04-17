package Ejemplos;

import java.util.Scanner;

public class CalcularIntereSimple {
    
    public static void main(String[] args) {
        
        try{
            Scanner leer = new Scanner(System.in);
            
            System.out.println("INGRESE LA SIGUIENTE INFORMACIÓN");
            System.out.println("================================");
            
            System.out.println("Cantidad de dinero depositada");
            double cantidad = leer.nextDouble();
            System.out.println("Cantidad de años del deposito");
            int anios = leer.nextInt();
            System.out.println("Interes anual por el deposito");
            double interes = leer.nextDouble();
            System.out.println("================================");
            
            IntereSimple(cantidad, anios, interes);
            
        }catch(Exception e){
            
            System.out.println(e.getMessage());
        }
    }
    
    public static void IntereSimple(double cantidad, int anios, double interes){
        
        for(int i = 1; i <= anios; i++){
            
            double interesPorAnio = cantidad * (interes / 100);
            cantidad += cantidad * (interes / 100);
            System.out.println("Cantidad de interes en el año " + i + " : " + interesPorAnio + "%");
            System.out.println("Monto interes mas dinero " + cantidad);
            System.out.println("=====================================");
        }
    }
}
