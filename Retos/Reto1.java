package Retos;
import java.util.Scanner;//Permitir ingreso de datos a terminal

public class Reto1 {
 

    public static void main(String[] args)
    {
        double F, C;

        Scanner temperatura = new Scanner (System.in);
         
            System.out.println("Ingrese la cantidad de grados fahrenheit a convertir");
 
            F = temperatura.nextDouble();//Ingreso de datos a terminal
            C = (F-32)/1.8;//Operación

            System.out.println("--------------------------");
            System.out.println(F +" Grados fahrenheit son: "+ C +" Grados centígrados");
            System.out.println("--------------------------");
            temperatura.close();
    
    }
}


