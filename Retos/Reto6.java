package Retos;
import java.util.Scanner;//Permitir ingreso de datos a terminal

public class Reto6 
{
    public static void main(String[]args)
    {

        int Apuesta,  Elegir;
        int Operacion = 0, Resultado = 0;
        int Moneda = (int) (Math.random() * 2 + 1);
        Scanner Terminal = new Scanner(System.in);


            do
            { System.out.println("Ingrese su apuesta");
                Apuesta = Terminal.nextInt();
                System.out.println("------------------------------");

                System.out.println("\nElija: \n1 = cara \n2 = Cello");
                Elegir = Terminal.nextInt();
                System.out.println("------------------------------");

        
                if(Moneda == 1)
                {

                    System.out.println("Salio Cara");
                    if(Elegir == 1)
                    {
                        System.out.println("Gano");
                        System.out.println("------------------------------");
                        Operacion = Apuesta+Apuesta;
                    }
                    else if(Elegir == 2)
                        {
                            System.out.println("Perdio");
                            System.out.println("------------------------------");
                            Operacion = 0-Apuesta;
                        }
                } 
                    else if(Moneda == 2)
                    {
                        System.out.println("Salio Cello");
                        if(Elegir== 2)
                        {
                            System.out.println("Gano");
                            System.out.println("------------------------------");
                            Operacion = Apuesta+Apuesta;
                        }
                        else if(Elegir == 1)
                        {
                            System.out.println("Perdio");
                            System.out.println("------------------------------");
                            Operacion = 0-Apuesta;    
                        }
                    }   
                    
                    Resultado += Operacion;        
                    System.out.println("Tienes: "+ Resultado);
                    System.out.println("------------------------------");
                   

            }while(Apuesta == 1);
                Terminal.close();
    }

        
}


