/*
    Problema 14

    En una hosteria de la ciudad de Loja se hace un descuento del 10% si el cliente se hospeda más de 5 días, del 15% si se hospeda más de 10 días y del 20% si se hospeda más de 15 días. Elaborar un solución que pida como datos de entrada el número de días y el precio diario de la habitación y luego calcule e imprima el subtotal por pagar, el descuento y el total por pagar.

 */
import java.util.Scanner;
public class HOSTERIAmotel {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int dias;
        double costo1, descuento, subtotal, TOTAL;
        System.out.println("Ingresa el numero de dias que te vas a hospedar en el motel");
        dias = teclado.nextInt();
        System.out.println("Ingresa el valor del costo por dia de tu putisuite");
        costo1 = teclado.nextDouble();
        subtotal = dias * costo1;
        TOTAL = dias * costo1;
        descuento = 0;
        if (dias > 15){
            descuento = TOTAL * 0.2;
            TOTAL = TOTAL - descuento;
        }
        else {
            if (dias > 10){
                descuento = TOTAL * 0.15;
                TOTAL = TOTAL - descuento;
            }
            else{
                if (dias > 5){
                    descuento = TOTAL * 0.1;
                    TOTAL = TOTAL - descuento;
                }
            }
        }
        System.out.println("------------------------");
        System.out.println("SUBTOTAL: " + subtotal);
        System.out.println("DESCUENTO: " + descuento);
        System.out.println("TOTAL: " + TOTAL);
        System.out.println("si sales en la noche llegaras pronto porque cerramos bro y te quedas afuera");
    }
}
