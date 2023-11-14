/*
    Problema 12

    Solución que imprima el costo de un pedido de un artículo del cual se tiene la descripción, la cantidad que se requiere y el precio unitario. Si la cantidad pedida excede de 50 unidades, se hace un descuento de 15%.

*/
import java.util.Scanner;
public class CostoDePedido {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String var;
        double costo, cantidad, total, descuento;
        System.out.println("Pon el nombre del producto que requieres");
        var = teclado.nextLine();
        System.out.println("Pon la cantidad de unidades que requieres");
        cantidad = teclado.nextDouble();
        System.out.println("Pon el costo del producto");
        costo = teclado.nextDouble();
        total = costo * cantidad;
        if (cantidad > 50){
            descuento = total * 0.15;
            total = total - descuento;
        }
        System.out.println("Costo por unidad de " + var + ": " + costo );
        System.out.println("Unidades: " + cantidad);
        System.out.println("TOTAL: " + total);
    }
}

