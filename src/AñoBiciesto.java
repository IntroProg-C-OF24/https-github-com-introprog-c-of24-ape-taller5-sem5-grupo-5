/*

    Problema-5

    Año Bisiesto: Comprobar si un año ingresado es bisiesto o no. Si es bisiesto, mostrar un mensaje especial.

*/
import java.util.Scanner;
public class AñoBiciesto {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);  
        int año;
        System.out.println("Hola, ingresa un año");
        año = teclado.nextInt();
       if((año % 4 == 0 && año % 100 != 0) || año % 400 == 0)
           System.out.println("El ano es bisiesto");
       else
           System.out.println("El ano no es bisiesto");
    }   
}