package Taller2;

import java.util.Scanner;


public class Reto4 {
    public static void main(String[] args) {
        Scanner Lectura = new Scanner(System.in);
        System.out.println("Dijite el primer numero");
        int number1 = Lectura.nextInt();

        System.out.println("Dijite el segundo numero");
        int number2 =Lectura.nextInt();

        System.out.println("Escoja la opcion que usted requiere");
        System.out.println("1 Suma");
        System.out.println("2 Resta");
        System.out.println("3 Multiplicacion");
        System.out.println("4 Division");
        System.out.println("5 Potenciacion");
        System.out.println("6 Radicacion");
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
                System.out.println("El resultado de la potenciacion es: " + Math.pow(number1,number2));
                break;
            case 6:
                System.out.println("El resultado de la radicaccion del numero " + number1 + " es: " + (Math.sqrt(number1)));
                System.out.println("El resultado de la radicaccion del numero " + number2 + " es: " + (Math.sqrt(number2)));
                break;
            default:
                System.out.println("Opcion no definida");
                break;
        }
        Lectura.close();
    }
}
