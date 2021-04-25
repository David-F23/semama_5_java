package Ejercicios;

import java.util.Scanner;

public class Ejercicio5 {
    
    /*public static void main(String[] args) {
        
        try{
            Scanner leer = new Scanner(System.in);
            
            System.out.println("Ingrese los minutos que duró la llamada");
            int minutos = leer.nextInt();
            
            System.out.println(CalcularLlamada(minutos));
            
            System.out.println("================");
            
        }catch(Exception e){
            
            System.out.println(e.getMessage());
        }
    }
    
    public static double CalcularLlamada(int tiempo){
        double total = 0.0;
        double costoBase = 0.20;
        double totalFor = 0.0;
        
        if(tiempo <= 3){
            
            System.out.println("El total es: $" + costoBase);
            System.out.println("dos monedas de diez centacvos");
            
        }else{
            
            for(int i = 3; i < tiempo ; tiempo--){
                
                totalFor += 0.5;
                
            }
            
            total = costoBase + totalFor;
            
        }
        
        return total;
    }*/
    
    public double tiempo;

    public double getTiempo() {
        return tiempo;
    }

    public void setTiempo(double tiempo) {
        this.tiempo = tiempo;
    }
    
    public double precio_llamada(double tiempo_minutos){
        double costoLlamada = 0;
        double minutos_extra = 0;
        double pagoxminExtras = 0;
        if(tiempo_minutos>3){
            minutos_extra = tiempo_minutos - 3;  //Minutos extra
        }else{
            minutos_extra = 0;
        }
        pagoxminExtras = minutos_extra * 0.5;    //Centavos
        costoLlamada = 0.2 + pagoxminExtras ;
        return costoLlamada;
    }
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Ejercicio5 monto = new Ejercicio5();
        
        String[] vector;
        
        System.out.println("Ingrese el tiempo de duración de la llamada");
        monto.setTiempo(Double.parseDouble(leer.nextLine()));
        double dinero = monto.precio_llamada(monto.getTiempo());
        //conversion del dinero a String.
        String pisto = String.valueOf(dinero);
        
        vector = new String[pisto.length()];
        
        for (int i = 0; i < pisto.length(); i++) {
            vector[i] =  pisto.substring(i);
        }
        
        System.out.println("*******************************");
        
        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);
        }
        
        System.out.println("El precio por su llamada es: $" + monto.precio_llamada(monto.getTiempo()));
    }
}
