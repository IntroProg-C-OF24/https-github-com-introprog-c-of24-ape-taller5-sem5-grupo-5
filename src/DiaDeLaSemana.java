/*

    Problema-2

    Día de la Semana: Mostrar el nombre del día de la semana en función del número ingresado (1 para lunes, 2 para martes, etc.).

*/
import java.util.Scanner;
public class DiaDeLaSemana {
        public static void main(String[] args) {
        Scanner pezFueraDeControl = new Scanner(System.in);
        double numero;
        System.out.println("Ingresa un numero");
        numero = pezFueraDeControl.nextInt();
        if (numero == 1)
            System.out.println("Hoy es Lunes");
        else
            if(numero == 2)
                System.out.println("Hoy es martes ");
            else
                if (numero ==  3)
                    System.out.println("Hoy es miercoles");
                else
                    if (numero == 4)
                        System.out.println("Hoy es Jueves");
                    else
                        if (numero == 5)
                            System.out.println("Hoy es viernes");
                        else
                            if (numero == 6)
                                System.out.println("Hoy es sabado,");
                            else
                                if (numero == 7){
                                    System.out.println("Hoy es Domingo");
                                }
                                else
                                    System.out.println("No hay mas de 7 dias ve pelado bobo");                  
    }    
}
    
