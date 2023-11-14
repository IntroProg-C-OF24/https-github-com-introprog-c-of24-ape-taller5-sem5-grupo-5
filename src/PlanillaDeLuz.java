/*
    Problema 11

    Solución que permita calcular y mostrar el valor a cancelar de una planilla de luz. Se debe ingresar el valor de costo por kilovatio/hora y el número de kilovatios consumidos en el mes. Si el usuario tiene edad mayor a 65 años, se debe descontar el 10%.

*/
import java.util.Scanner;
public class PlanillaDeLuz {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double costo, consumomes, edad, resultado, descuento;
        System.out.println("Pon tu edad pues");
        edad = teclado.nextDouble();
        System.out.println("Pon el valor del kilovatio por hora");
        costo = teclado.nextDouble();
        System.out.println("Pon el valor de los kilovatios consumidos en el mes");
        consumomes = teclado.nextDouble();
        resultado = costo * consumomes;
        if (edad > 65){
            descuento = resultado * 0.1;
            resultado = resultado - descuento;
        }
        System.out.println("El valor de la planilla es: " + resultado);
    }
}
