package Retos;
import java.util.Scanner;
public class Reto5 {
    public static void main(String[]args)
    {
        int Producto, Precio;
        int Operación = 0;
       

        Scanner Terminal = new Scanner(System.in);

        System.out.println("Cuantos productos desea comprar:");
        Producto = Terminal.nextInt();
        for( int nPro = 1; nPro <= Producto; nPro ++)
        {
            System.out.println("El precio del producto " + nPro+ " es:");
            Precio = Terminal.nextInt();
            Operación = Operación + Precio;
        }
        System.out.println("Total de la compra es : " + Operación);
        System.out.println("-------------------------------------");
        Terminal.close();

    }

}
