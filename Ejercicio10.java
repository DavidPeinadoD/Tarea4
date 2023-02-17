import java.util.Scanner;
/*
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
*/
//realiza el mismo algoritmo que el anterior, pero despues de preguntar el caracter, pregunta la forma de la figura a dibujar, 1 para rectangulo con relleno, 2 para rengulo sin relleno, 3 para cruz de San Andrés, 4 para triangulo rectangulo, 5 para rombo y 6 para hacer un ajedrezado
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int anchura, altura, opcion;
        char caracter;
        System.out.println("Introduce la anchura");
        anchura = sc.nextInt();
        System.out.println("Introduce la altura");
        altura = sc.nextInt();
        System.out.println("Introduce el caracter");
        caracter = sc.next().charAt(0);
        System.out.println("Introduce la forma de la figura");
        opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                for (int i = 0; i < altura; i++) {
                    for (int j = 0; j < anchura; j++) {
                        System.out.print(caracter);
                    }
                    System.out.println();
                }
                break;
            case 2:
                for (int i = 0; i < altura; i++) {
                    for (int j = 0; j < anchura; j++) {
                        if (i == 0 || i == altura - 1 || j == 0 || j == anchura - 1) {
                            System.out.print(caracter);
                        } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
                break;
            case 3:
                for (int i = 0; i < altura; i++) {
                    for (int j = 0; j < anchura; j++) {
                        if (i == j || i == altura - j - 1) {
                            System.out.print(caracter);
                        } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
                break;
            case 4:
                for (int i = 0; i < altura; i++) {
                    for (int j = 0; j < anchura; j++) {
                        if (j <= i) {
                            System.out.print(caracter);
                        } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
                break;
            case 5:
                for (int i = 0; i < altura; i++) {
                    for (int j = 0; j < anchura; j++) {
                        if (j >= i && j <= anchura - i - 1) {
                            System.out.print(caracter);
                        } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
                break;
            case 6:
                for (int i = 0; i < altura; i++) {
                    for (int j = 0; j < anchura; j++) {
                        if ((i + j) % 2 == 0) {
                            System.out.print(caracter);
                        } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
                break;
            default:
                System.out.println("Opcion no valida");
        }
    }
}