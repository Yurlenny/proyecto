package Taller2;

import java.util.Scanner;

public class Reto1 {
    public static void main(String[] args) {
        Scanner Lectura = new Scanner(System.in);
        

        System.out.println("Jugador, escoja");
        System.out.println("1 -  Cara");
        System.out.println("2 -  Sello");
        int Option = Lectura.nextInt();

        if(Option !=1 && Option != 2){
            System.out.println("El opcion seleccionada es erronea");
            System.exit(0);
        }
        
        int RandomNumber = (int)(Math.random()*10+1);

        if(RandomNumber%2 == 0){
            System.out.println("Gano sello");
            if(Option%2 == 0){
                System.out.println("Usted gano");
            }else{

                System.out.println("Usted Perdio");
            }
        }else{
            System.out.println("Gano cara");
            if(Option%2 != 0){
                System.out.println("Usted gano");
            }else{

                System.out.println("Usted Perdio");
            }
        }

        Lectura.close();
    }
}
