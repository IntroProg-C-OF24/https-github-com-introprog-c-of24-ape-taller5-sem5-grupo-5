/*

    Problema-6

    Categoría de Edad: Clasificar a una persona en una categoría de edad (niño, adolescente, adulto) en función de su edad.


*/
import java.util.Scanner;
public class CategoriaDeEdad {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int edad;
        System.out.println("Ponga su edad para saber que tipo de categoria tiene aunque seria tonto no saberlo no?");
        edad = teclado.nextInt();
        if(edad >= 18)
            System.out.println("Eres adulto");
        else 
            if(edad >= 12)
                System.out.println("Eres adolcente");
            else
                System.out.println("Eres niño");
    }
}
