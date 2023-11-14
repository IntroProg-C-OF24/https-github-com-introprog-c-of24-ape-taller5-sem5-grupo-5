/*

    Problema 13

    Elaborar una solución que permita leer los datos de un automóvil (marca, origen y costo) imprima el impuesto por pagar y el precio de venta (incluido el impuesto). Si el origen es Alemania el impuesto es 20%, si es de Japón el impuesto es 30%, si es de Italia, 15%, y si es de USA, 8%

*/
import java.util.Scanner;
public class Automivilcaracteristicas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String datos1, datos2;
        double costo, RTA;
        System.out.println("Pon los datos de tu Transformer bro");
        System.out.println("Ingresa la marca de tu tranformer bro");
        datos1 = teclado.nextLine();
        System.out.println("Ingresa el pais de origen de tu carrito precioso");
        datos2 = teclado.nextLine();
        System.out.println("Ingresa el costo del carrito precioso");
        costo = teclado.nextDouble();
        if (datos2.equals("Alemania")){
            RTA = costo * 0.2;
            costo = costo + RTA;
            System.out.println("Impuesto " + datos1 + ": " + RTA);
            System.out.println("TOTAL: " + costo);
        }    
        else { 
            if (datos2.equals("Japon")){
                RTA = costo * 0.3;
                costo = costo + RTA;
                System.out.println("Impuesto " + datos1 + ": " + RTA);
                System.out.println("TOTAL: " + costo);
            }
            else {
                if (datos2.equals("Italia")){
                    RTA = costo * 0.15;
                    costo = costo + RTA;
                    System.out.println("Impuesto " + datos1 + ": " + RTA);
                    System.out.println("TOTAL: " + costo);
                }    
                else {
                    if (datos2.equals("USA")){
                        RTA = costo * 0.08;
                        costo = costo + RTA;
                        System.out.println("Impuesto " + datos1 + ": " + RTA);
                        System.out.println("TOTAL: " + costo);
                    }    
                }
            }
        }
    }   
}
