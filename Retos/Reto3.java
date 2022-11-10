package Retos;
import java.util.Scanner;
public class Reto3 {
    
    public static void main(String[]args)
    {
        int Moneda = (int) (Math.random() * 2 + 1);

        Scanner Terminal = new Scanner(System.in);

        System.out.println("Se esta lanzando la moneda");
        System.out.println("----------------------------");

        System.out.println("Eliga:\n1 para Cara\n2 para Sello");
        System.out.println("----------------------------");
        Moneda = Terminal.nextInt();
        System.out.println("----------------------------");
        if(Moneda == 1)
        {
          System.out.println("Gano");
          System.out.println("----------------------------");
        }
        else
        {
            System.out.println("Perdio");
            System.out.println("----------------------------");
        }
        Terminal.close();
    }
}
