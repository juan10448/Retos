package Retos;
import java.util.Scanner;

public class Reto4 {
    public static void main(String[]args)
   {
        
        int eleccion;
        int Juego = 0;
        int Opcion = (int)(Math.random() * 3 + 1 );

        Scanner Terminal = new Scanner(System.in);
        System.out.println("Eliga:\n1 para Piedra\n2 para Papel\n3 para tijera");
        eleccion = Terminal.nextInt();
        switch(eleccion)
            {
                case 1:
                {
                    if(Juego == 1)
                    {
                        System.out.println("Sacaste piedra");
                        if(Opcion == 1)
                        {
                            System.out.println("La maquina saco piedra");
                            System.out.println("Empate");
                        }
                        else if(Opcion == 2)
                        {
                            System.out.println("la maquina saco papel");
                            System.out.println("Perdiste");
                        }
                        else if(Opcion == 3)
                        {
                            System.out.println("La maquina saco tijera");
                            System.out.println("Ganaste");
                        }
                    }
                }
                case 2:
                {
                    if(Juego == 2)
                    {
                        System.out.println("Sacaste tijeras");
                        if(Opcion == 1)
                        {
                            System.out.println("La maquina saco tijeras");
                            System.out.println("Empate");
                        }
                        else if(Opcion == 2)
                        {
                            System.out.println("la maquina saco piedra");
                            System.out.println("Perdiste");
                        }
                        else if(Opcion == 3)
                        {
                            System.out.println("La maquina saco papel");
                            System.out.println("Ganaste");
                        }
                    }
                }
                case 3: 
                {
                    if(Juego == 3)
                    {
                        System.out.println("Sacaste papel");
                        if(Opcion == 1)
                        {
                            System.out.println("La maquina saco piedra");
                            System.out.println("Empate");
                        }
                        else if(Opcion == 2)
                        {
                            System.out.println("la maquina saco papel");
                            System.out.println("Perdiste");
                        }
                        else if(Opcion == 3)
                        {
                            System.out.println("La maquina saco tijera");
                            System.out.println("Ganaste");
                        }
                    }
                }     
        }  
        Terminal.close();    
    }
}
