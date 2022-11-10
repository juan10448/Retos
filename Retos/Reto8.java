package Retos;

import java.util.Scanner;

public class Reto8 
{
    public static void main(String[] args) 
    {

        
          int competidores;
        
          int ganador = 0;

          Scanner Terminal = new Scanner(System.in);

          System.out.println("Ingrese la cantidad de competidores");
          competidores = Terminal.nextInt();


          double[] tiempo = new double[competidores];
          String[] nombres = new String[competidores];
          for(int i = 0 ; i< competidores ; i++) 
          {
              System.out.println("Ingrese el nombre del competidor " + (i+1));
              nombres[i] = Terminal.nextLine();        
          }
          for(int n = 0 ; n< competidores ; n++) 
          {        
              System.out.println("Ingrese el tiempo del competidor " + nombres[n]);
              tiempo[n] = Terminal.nextDouble();
          }
          System.out.println("Los tiempos finales  fueron: ");
          for(int z= 0 ; z<competidores; z++)
            {
              System.out.println(nombres[z]);
              System.out.println(tiempo[z]);
            }
            
          double menor =tiempo[0];

          for(int c = 0; c <nombres.length; c++) 
          {
        	  if(tiempo[c] < menor) {
        		  menor = tiempo[c];
        	  }
        	  if(tiempo[c] == menor) {
        		   ganador = c;
        	  }
          }
          System.out.println("El ganador es: " + nombres[ganador]+ "y su tiempo fue: " + menor);

          
          Terminal.close();
        
    }


    
    
}
