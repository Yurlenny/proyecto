package Taller2;

import java.util.Scanner;

public class Reto2 {
    public final static int Rock = 1;
    public final static int Paper = 2;
    public final static int Scissors = 3;
    public static void main(String[] args) {
        Scanner Lectura = new Scanner(System.in);
        
        System.out.println("La computadora ya escojio...");
        System.out.println("Seleccione una opcion");
        System.out.println("1 -  Piedra");
        System.out.println("2 -  papel");
        System.out.println("3 -  Tijera");

        int Option = Lectura.nextInt();

        int RandomNumber = (int)(Math.random()*3+1);
        System.out.println(RandomNumber);

        // if(Option == RandomNumber){
        //     System.out.println("Computadora escojio " +  );
        // }
        switch (RandomNumber) {
            case 1:
                System.out.println("Piedra");
                    switch (Option) {
                        case 1:
                            System.out.println("Empate");
                            System.out.println("Nadie gana");
                            break;
                        case 2:
                            System.out.println("Gana la maquina");
                            System.out.println("la maquina saco papel");
                            break;
                    
                        case 3:
                            System.out.println("Usted Gana");
                            System.out.println("la maquina saco tijera");
                            break;
                        default:
                        System.out.println("Error");
                        System.exit(0);
                            break;
                    }
                break;

            case 2:
                System.out.println("Papel");
                    switch (Option) {
                        case 1:
                            System.out.println("Usted gana");
                            System.out.println("la maquina saco papel");
                            break;
                        case 2:
                            System.out.println("Empate");
                            System.out.println("Nadie Gana");
                            break;
                    
                        case 3:
                            System.out.println("Gana la maquina");
                            System.out.println("la maquina saco papel");
                            break;
                        default:
                        System.out.println("Error");
                        System.exit(0);
                            break;
                    }
                break;

            case 3:
                System.out.println("Tijera");
                    switch (Option) {
                        case 1:
                            System.out.println("Ganaste");
                            System.out.println("la maquina saco tijera");
                            break;
                        case 2:
                            System.out.println("Gana la maquina");
                            System.out.println("la maquina saco tijera");
                            break;
                    
                        case 3:
                            System.out.println("Empate");
                            System.out.println("Nadie Gana");
                            break;
                        default:
                        System.out.println("Error");
                        System.exit(0);
                            break;
                    }
                break;
        
            default:
            System.out.println("Error");
            System.exit(0);
                break;
        }

    }
}
