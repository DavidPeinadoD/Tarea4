import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int num = 0;
            int min = 0;
            int max = 100;
            int intentos = 0;
            String respuesta = "";
            System.out.println("Piensa un numero entre 0 y 100");
            do {
                num = (min + max) / 2;
                System.out.println("El numero es " + num + "?");
                respuesta = sc.nextLine();
                if (respuesta.equals("+")) {
                    min = num;
                } else if (respuesta.equals("-")) {
                    max = num;
                }
                intentos++;
            } while (!respuesta.equals("="));
            System.out.println("El numero de intentos ha sido " + intentos);
        }
    }




