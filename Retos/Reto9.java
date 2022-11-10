package Retos;

import java.util.Scanner;

public class Reto9
{
    public static void main(String[] args) 
    {

        String codigo[][] = new String[4][4];
        String nombre[][] = new String[4][4];
        String precio[][] = new String[4][4];

        Scanner terminal = new Scanner(System.in);


        for (int F=0; F<codigo.length; F ++)
        {
            for(int C=0; C<nombre.length; C++)
            {    
                System.out.print("Ingrese el codigo el producto: ");
                codigo[F][C]=terminal.next();
                System.out.println("-------------------");

                System.out.print("Ingrese el nombre del producto: ");
                nombre[F][C]=terminal.next();
                System.out.println("-------------------");

                 System.out.print("Ingrese el precio del producto");
                 precio[F][C]=terminal.next();
                 System.out.println("-------------------");
            }
            System.out.println("--------------------------------------------");
        }
        terminal.close();
    }
    
}
