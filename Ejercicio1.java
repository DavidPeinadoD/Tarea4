import java.util.Scanner;

public class Ejercicio1 {
    //haz un algoritmo que calcule la media de notas que introduzca el usuario mediante Scanner,se han realizado 4 examenes y ninguna nota puede ser negativa
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nota1, nota2, nota3, nota4;
        double media;
        System.out.println("Introduce la nota del primer examen");
        nota1 = sc.nextInt();
        System.out.println("Introduce la nota del segundo examen");
        nota2 = sc.nextInt();
        System.out.println("Introduce la nota del tercer examen");
        nota3 = sc.nextInt();
        System.out.println("Introduce la nota del cuarto examen");
        nota4 = sc.nextInt();
        media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println("La media de las notas es: " + media);
    }
}
