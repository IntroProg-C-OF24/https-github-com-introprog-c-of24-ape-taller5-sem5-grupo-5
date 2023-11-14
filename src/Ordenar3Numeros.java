/*

    Problema-9

    Ordenamiento de Tres Números: Dados tres números, ordenarlos en orden ascendente.


*/
import java.util.Scanner;
public class Ordenar3Numeros {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero1, numero2, numero3;
        System.out.println("Ingresa 3 numeros");
        numero1 = teclado.nextInt();
        numero2 = teclado.nextInt();
        numero3 = teclado.nextInt();
        if(numero1 >= numero2 && numero2 >= numero3)
            System.out.println("Los numeros ordenados: " + numero3 + ", " + numero2 + ", " + numero1);  
        else 
            if(numero1 >= numero3 && numero3 >= numero2)
                System.out.println("Los numeros ordenados: " + numero2 + ", " + numero3 + ", " + numero1);
            else 
                if(numero2 >= numero3 && numero3 >= numero1)
                    System.out.println("Los numeros ordenados: " + numero1 + ", " + numero3 + ", " + numero2);
                else 
                    if(numero2 >= numero1 && numero1 >= numero3)
                        System.out.println("Los numeros ordenados: " + numero3 + ", " + numero1 + ", " + numero2);
                    else 
                        if(numero3 >= numero2 && numero2 >= numero1)
                            System.out.println("Los numeros ordenados: " + numero1 + ", " + numero2 + ", " + numero3);
                        else 
                            if(numero3 >= numero1 && numero1 >= numero2){
                                System.out.println("Los numeros ordenados: " + numero2 + ", " + numero1 + ", " + numero3);
        }
    }
}   
