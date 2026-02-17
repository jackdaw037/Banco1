import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Crear usuario
        System.out.print("Ingrese su nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese su DNI: ");
        String dni = sc.nextLine();

        System.out.print("Ingrese su edad: ");
        int edad = sc.nextInt();

        Usuario usuario = new Usuario(nombre, dni, edad);

        boolean continuar = true;

        while (continuar) {
            try {
                System.out.println("\nBienvenido al banco");
                System.out.println("Saldo actual: " + usuario.getSaldo());
                System.out.println("1. Ingresar dinero");
                System.out.println("2. Sacar dinero");
                System.out.println("3. Ver datos");
                System.out.println("4. Salir");
                System.out.print("Selecciona una opcion: ");

                int opcion = sc.nextInt();

                switch (opcion) {

                    case 1:
                        System.out.print("Ingrese la cantidad a depositar: ");
                        int ingresar = sc.nextInt();
                        usuario.depositar(ingresar);
                        break;

                    case 2:
                        System.out.print("Ingrese la cantidad a retirar: ");
                        int retirar = sc.nextInt();
                        usuario.retirar(retirar);
                        break;

                    case 3:
                        usuario.mostrarDatos();
                        break;

                    case 4:
                        System.out.println("Gracias por usar el banco.");
                        continuar = false;
                        break;

                    default:
                        System.out.println("Opción no válida.");
                }

            } catch (InputMismatchException e) {
                System.out.println("Error: Solo puedes ingresar números.");
                sc.nextLine();
            }
        }

        sc.close();
    }
}
