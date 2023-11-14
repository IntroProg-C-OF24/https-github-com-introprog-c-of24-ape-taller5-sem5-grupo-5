/*

    Problema-4

    Descuento en Compras: Calcular el precio final de un producto con un descuento del 10% si el precio original es mayor de $100; de lo contrario, no hay descuento.

*/
import java.util.Scanner;
public class DescuentoDeCompras {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double preciofinal, descuento;
        System.out.println("Ingresa el precio del producto");
        preciofinal = teclado.nextDouble();
        if (preciofinal > 100){
            descuento = preciofinal * 0.1;
            preciofinal = preciofinal - descuento;
        } 
        System.out.println("El precio final del producto es: " + preciofinal); 
    }
}
