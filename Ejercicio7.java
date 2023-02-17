import java.util.Scanner;
/*
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("-----------------------------------");
            System.out.println("1 - Una cita de la ciudad del miedo");
            System.out.println("2 - Una cita de James Bond");
            System.out.println("3 - Una cita de la vida es un largo rio tranquilo");
            System.out.println("4 - Una cita de Star Wars");
            System.out.println("5 - Salir de esta magnífica aplicación");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("¿Qué es el miedo? El miedo es la imaginación de la muerte");
                    break;
                case 2:
                    System.out.println("Bond. James Bond");
                    break;
                case 3:
                    System.out.println("La vida es un largo rio tranquilo");
                    break;
                case 4:
                    System.out.println("No hay nada más peligroso que un Jedi con miedo");
                    break;
                case 5:
                    System.out.println("Gracias por usar esta magnífica aplicación");
                    break;
                default:
                    System.out.println("Opción incorrecta");
            }
        } while (opcion != 5);
    }
}
*/
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion, opcion2;
        do {
            System.out.println("-----------------------------------");
            System.out.println("1 - Una cita de la ciudad del miedo");
            System.out.println("2 - Una cita de James Bond");
            System.out.println("3 - Una cita de la vida es un largo rio tranquilo");
            System.out.println("4 - Una cita de Star Wars");
            System.out.println("5 - Salir de esta magnífica aplicación");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    opcion2 = (int) (Math.random() * 3 + 1);
                    switch (opcion2) {
                        case 1:
                            System.out.println("¿Qué es el miedo? El miedo es la imaginación de la muerte");
                            break;
                        case 2:
                            System.out.println("¿Qué es el miedo? El miedo es la imaginación de la muerte");
                            break;
                        case 3:
                            System.out.println("¿Qué es el miedo? El miedo es la imaginación de la muerte");
                            break;
                    }
                    break;
                case 2:
                    opcion2 = (int) (Math.random() * 3 + 1);
                    switch (opcion2) {
                        case 1:
                            System.out.println("Bond. James Bond");
                            break;
                        case 2:
                            System.out.println("Bond. James Bond");
                            break;
                        case 3:
                            System.out.println("Bond. James Bond");
                            break;
                    }
                    break;
                case 3:
                    opcion2 = (int) (Math.random() * 3 + 1);
                    switch (opcion2) {
                        case 1:
                            System.out.println("La vida es un largo rio tranquilo");
                            break;
                        case 2:
                            System.out.println("La vida es un largo rio tranquilo");
                            break;
                        case 3:
                            System.out.println("La vida es un largo rio tranquilo");
                            break;
                    }
                    break;
                case 4:
                    opcion2 = (int) (Math.random() * 3 + 1);
                    switch (opcion2) {
                        case 1:
                            System.out.println("No hay nada más peligroso que un Jedi con miedo");
                            break;
                        case 2:
                            System.out.println("Yo soy tu padre");
                            break;
                        case 3:
                            System.out.println("Paciencia debes tener, mi joven padawan");
                            break;
                    }
                    break;
                case 5:
                    System.out.println("Gracias por usar esta magnífica aplicación");
                    break;
                default:
                    System.out.println("Opción incorrecta");
            }
        } while (opcion != 5);
    }
}





































