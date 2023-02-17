import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int anchura, altura;
        char caracter;
        System.out.println("Introduce la anchura");
        anchura = sc.nextInt();
        System.out.println("Introduce la altura");
        altura = sc.nextInt();
        System.out.println("Introduce el caracter");
        caracter = sc.next().charAt(0);
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < anchura; j++) {
                System.out.print(caracter);
            }
            System.out.println();
        }
    }

}
