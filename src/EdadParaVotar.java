/*

    Problema-1

    Edad para Votar: Determinar si una persona es elegible para votar en función de su edad (mayor o igual a 18 años).

 */
import java.util.Scanner;

public class EdadParaVotar {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double edad;
        System.out.println("Ingresa su edad:");
        edad = teclado.nextDouble();
        if (edad >= 18)
            System.out.println("Tienes acceso a la votacion obligatoria ");
        else
            System.out.println("Aun tienes que votar");
    }   
}
