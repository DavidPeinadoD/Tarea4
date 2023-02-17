import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.println("Introduce un número");
        numero = sc.nextInt();
        while (numero % 3 != 0) {
            System.out.println("Error " + numero + " no es multiplo de 3");
            System.out.println("Introduce otro número");
            numero = sc.nextInt();
        }
        System.out.println("OK, el numero " + numero + " es multiplo de 3");
    }
}
