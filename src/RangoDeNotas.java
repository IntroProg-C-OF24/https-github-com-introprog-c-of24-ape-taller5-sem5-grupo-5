/*

    Problema-7

    Rango de Notas: Asignar una letra (A, B, C, D) a una calificación en función de su rango (A para 90-100, B para 80-89, etc.).

*/
import java.util.Scanner;
public class RangoDeNotas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int nota ;
        System.out.println("Ingresa tu nota bro, espero no sea desepcionante");
        nota = teclado.nextInt();
        if (nota >= 90 && nota <= 100) 
            System.out.println("TIENES A"); 
        else 
            if (nota >= 80 && nota <= 89) 
                System.out.println("TIENES B"); 
            else
                if (nota >= 70 && nota <= 79) 
                    System.out.println("TIENES C");
                else
                    if (nota >= 60 && nota <= 69) 
                        System.out.println("TIENES D");
                    else
                        if (nota >= 50 && nota <= 59) 
                            System.out.println("TIENES E ");
                        else
                            System.out.println("No loco mejor ponte a chambear");
    }
}