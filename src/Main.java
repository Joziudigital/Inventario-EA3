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

                case 1:
                    System.out.print("_______Registrar Producto_______");
                    System.out.print("\nIngrese el ID del producto (número entero): ");
                    while (!scanner.hasNextInt()) {
                        System.out.print("Número no válido. Por favor, ingrese un número entero: ");
                        scanner.next();
                    }
                    int id = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Ingrese el nombre del producto: ");
                    String nombre = scanner.nextLine().trim();

                    if (nombre.isEmpty()){
                        System.out.println("El nombre del producto no puede estar vacío. Producto no registrado.");
                    } else {
                        inventario.insertar(id, nombre);
                        System.out.println("Producto registrado correctamente.");

                    }
                    break;

                case 2:
                    System.out.print("_______Inventario Ordenado (Inorden)_______");
                    inventario.mostrarInorden();
                    break;
                
                case 3:
                    System.out.print("_______Buscar Producto por ID_______");
                    System.out.print("\nIngrese el ID del producto a buscar: ");
                    while (!scanner.hasNextInt()) {
                        System.out.print("Número no válido. Por favor, ingrese un número entero: ");
                        scanner.next();
                    }
                    int idBusqueda = scanner.nextInt();
                    scanner.nextLine();
                    inventario.buscar(idBuscar);
                    break;

                case 4:
                    System.out.println("Saliendo del sistema. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción del 1 al 4.");
                
            }
            System.out.println();

        }   while (opcion != 4);
        scanner.close();
    }

    private static void mostrarMenu() {
        System.out.println("1. Registrar Producto");
        System.out.println("2. Mostrar Inventario (Inorden)");
        System.out.println("3. Buscar Producto por ID");
        System.out.println("4. Salir");
    }
}
