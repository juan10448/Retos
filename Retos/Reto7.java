package Retos;

import java.util.Scanner;

public class Reto7
{
    public static void main(String[] args) 
    {
        int nNotas = 0;
        int suma = 0;
        float promedio = 0;
        int[] Notas = new int[nNotas];
        Scanner terminal = new Scanner(System.in);


        System.out.println("ingrese la cantidad de notas ");
        nNotas = terminal.nextInt();

        for(int i = 0; i< nNotas; i++)
        {
            System.out.println("ingrese las notas " + i);
            Notas [i]= terminal.nextInt();
        }
    
        for(int i = 0; i<Notas.length; i ++)
        {
            suma += Notas[i];
        }
        promedio=(suma/Notas.length);
        System.out.println("su promedio es: " + promedio);

        if(promedio < 3)
        {
            System.out.println("Reprobaste");
        }
        else if(promedio >= 3 && promedio <=4)
        {
            System.out.println("Pasaste Raspando");
        }
        else if(promedio > 4)
        {
            System.out.println("Aprobaste con buenos resultados");
        }
     terminal.close();
    }
    
}
