package Taller1;

import java.util.Scanner;
public class Retoj {
    public static void main(String[] args) {
        Scanner Lectura = new Scanner(System.in);
            
        System.out.println("Digite un numero");
        int number1 = Lectura.nextInt();

        System.out.println("Digite un segundo numero");
        int number2 = Lectura.nextInt();

        System.out.println("Escoja una opcion");
        System.out.println("1 suma");
        System.out.println("2 resta");
        System.out.println("3 multiplicacion");
        System.out.println("4 division");
        System.out.println("5 potenciacion");
        System.out.println("6 radicaccion");
        int option = Lectura.nextInt();

        switch (option) {
            case 1:
                System.out.println("El resultado de la suma es: " + (number1+number2));
                break;
                case 2:
                System.out.println("El resultado de la resta es: " + (number1-number2));
                break;
                case 3:
                System.out.println("El resultado de la multiplicacion es: " + (number1*number2));
                break;
                case 4:
                System.out.println("El resultado de la division es: " + (number1/number2));
                break;
                case 5:
                System.out.println("El resultado de la potenciacion: " +Math.pow(number1,number2));
                break;
                case 6:
                System.out.println("El resultado de la potenciacion: " + Math.sqrt(number1));
                System.out.println("El resultado de la potenciacion: " + Math.sqrt(number2));
                break;

                default:
        Lectura.close();
        }
    }
}
