import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        ArbolInventario inventario =new ArbolInventario();
        int opcion;

        System.out.println("===============================");
        System.out.println("''   Sistema de Inventario    ''");
        System.out.println("''         Tree-Stock         ''");
        System.out.println("===============================");

        do {
            mostrarMenu();

            System.out.print("Seleccione una opción: ");
            while (!scanner.hasNextInt()) {
                System.out.print("Número no válido. Por favor, ingrese un número: ");
                scanner.next();
            }
            opcion = scanner.nextInt();
            scanner.nextLine();

            System.out.println();

            switch (opcion) {
                
            }
        }
    }
}