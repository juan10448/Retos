package Retos;
import java.util.Scanner;

public class Reto2 {
        public static void main(String[] args)
        {
            double PKilos, DosisVacuna;
            int Meses;

     
            Scanner Dosis = new Scanner(System.in);
     
            System.out.println("Ingrese el peso del bebe en kilos: " );
            PKilos = Dosis.nextDouble();
     
            System.out.println("Ingrese los meses que tiene el bebe desde que nacio: " );
            Meses = Dosis.nextInt();
           
            DosisVacuna = (PKilos + 10) / (Meses * 10) * 8;
     
            System.out.println("La dosis que debe aplicar al bebe es: " + DosisVacuna );
            System.out.println("--------------------------");
            Dosis.close();
        }
}
     

