import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, numeroAleatorio;
        numeroAleatorio = (int) (Math.random() * 100 + 1);
        System.out.println("Introduce un número");
        numero = sc.nextInt();
        while (numero != numeroAleatorio) {
            if (numero > numeroAleatorio) {
                System.out.println("El número es menor");
            } else {
                System.out.println("El número es mayor");
            }
            System.out.println("Introduce otro número");
            numero = sc.nextInt();
        }
        System.out.println("Has acertado");
    }
}
