/*

    Problema-8

    Calculadora de IMC: 
Calcular el índice de masa corporal (IMC) de una persona y clasificarla en función de su valor (bajo peso, peso normal, sobrepeso, etc.)
*/
import java.util.Scanner;
public class calculadoraDeIMC {
        public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double kilos, altura, IMC;
        System.out.println("Ingresa tu peso en kilos");
        kilos = teclado.nextDouble();
        System.out.println("Ingresa tu altura en metros");
        altura = teclado.nextDouble();
        IMC = kilos / (altura * altura);
        if(IMC < 18) {
            System.out.println("Estas desnutrido");
            System.out.println("Tu IMC es: " + IMC);
        }    
        else {
            if(IMC < 25){
                System.out.println("Estas en tu peso ideal");
                System.out.println("Tu IMC es: " + IMC);
            }
            else {
                if(IMC < 30){
                    System.out.println("Estas con sobrepeso");
                    System.out.println("Tu IMC es: " + IMC);
                }        
                else {
                    System.out.println("Estas con obesidad");
                    System.out.println("Tu IMC es: " + IMC);
                }
            }    
        }
    }
}


