import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArbolInventario inventario = new ArbolInventario();
        int opcion;

        System.out.println("===============================");
        System.out.println("''   Sistema de Inventario    ''");
        System.out.println("''         Tree-Stock         ''");
        System.out.println("===============================");

        do {
            mostrarMenu();


            System.out.print("  Seleccione una opción: ");
            while (!scanner.hasNextInt()) {
                System.out.print("  Entrada inválida. Ingrese un número: ");
                scanner.next();
            }
            opcion = scanner.nextInt();
            scanner.nextLine();

            System.out.println();

            switch (opcion) {

                case 1: 
                    System.out.print("_______Registrar Producto_______");
                    System.out.print("  Ingrese el ID (número entero): ");
                    while (!scanner.hasNextInt()) {
                        System.out.print("  ID inválido. Ingrese un número entero: ");
                        scanner.next();
                    }
                    int id = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("  Ingrese el nombre del producto: ");
                    String nombre = scanner.nextLine().trim();

                    if (nombre.isEmpty()) {
                        System.out.println("   El nombre no puede estar vacío.");
                    } else {
                        inventario.insertar(id, nombre);
                        System.out.println("   Producto registrado correctamente.");
                    }
                    break;

                case 2:
                    System.out.println("─── Inventario Ordenado (Inorden) ───");
                    inventario.mostrarInorden();
                    break;

                case 3:
                    System.out.println("─── Buscar Producto ───");
                    System.out.print("  Ingrese el ID a buscar: ");
                    while (!scanner.hasNextInt()) {
                        System.out.print("  ID inválido. Ingrese un número entero: ");
                        scanner.next();
                    }
                    int idBuscar = scanner.nextInt();
                    scanner.nextLine();
                    inventario.buscar(idBuscar);
                    break;

                case 0:
                    System.out.println("  👋  ¡Hasta luego! Sistema Tree-Stock cerrado.");
                    break;

                default:
                    System.out.println("  Opción no válida. Intente de nuevo.");
            }

            System.out.println();

        } while (opcion != 0);

        scanner.close();
    }


    private static void mostrarMenu() {
        System.out.println("┌─────────────────────────────┐");
        System.out.println("│         MENÚ PRINCIPAL      │");
        System.out.println("├─────────────────────────────┤");
        System.out.println("│  1. Registrar Producto      │");
        System.out.println("│  2. Mostrar Inventario      │");
        System.out.println("│  3. Buscar Producto         │");
        System.out.println("│  0. Salir                   │");
        System.out.println("└─────────────────────────────┘");
    }
}