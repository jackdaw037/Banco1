public class Usuario {

    private String nombre;
    private String dni;
    private int edad;
    private int saldo;

    public Usuario(String nombre, String dni, int edad) {
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
        this.saldo = 0;
    }

    public int getSaldo() {
        return saldo;
    }

    public void depositar(int cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Dinero depositado. Saldo actual: " + saldo);
        } else {
            System.out.println("No se puede depositar una cantidad negativa o cero.");
        }
    }

    public void retirar(int cantidad) {
        if (cantidad > 0) {
            if (cantidad <= saldo) {
                saldo -= cantidad;
                System.out.println("Dinero retirado. Saldo actual: " + saldo);
            } else {
                System.out.println("Error: No puedes retirar más de lo que tienes.");
            }
        } else {
            System.out.println("No se puede retirar una cantidad negativa o cero.");
        }
    }

    public void mostrarDatos() {
        System.out.println("\n===== DATOS DEL USUARIO =====");
        System.out.println("Nombre: " + nombre);
        System.out.println("DNI: " + dni);
        System.out.println("Edad: " + edad);
        System.out.println("Saldo actual: " + saldo);
    }
}
