/*

    Problema-3

    Mayor de tres números: Dados tres números, determinar cuál es el mayor. Si son iguales, mostrar un mensaje
*/
import java.util.Scanner;
public class MayorDeTresNumeros {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero1, numero2, numero3;
        System.out.println("Ingrese un numero");
        numero1 = teclado.nextInt();
        System.out.println("Ingrese otro numero");
        numero2 = teclado.nextInt();
        System.out.println("Ingrese otro numero");
        numero3 = teclado.nextInt();
        if (numero1 == numero2 && numero1 == numero3 )
            System.out.println("La inteligencia te persigue bro pero tu eres mas rapido, esto es un programa para ver quien es el mayor de 3 numeros no me hagas voltear el higado");
        else 
            if (numero1 > numero2 && numero1 > numero3)
                System.out.println("El mayor es: " + numero1);
            else
                if (numero2 > numero1 && numero2 > numero3)
                    System.out.println("El mayor es: " + numero3);
                else
                    if (numero3 > numero1 && numero3 > numero2)
                        System.out.println("El mayor es: " + numero3);
    }
}