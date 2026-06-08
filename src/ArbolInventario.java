public class ArbolInventario {
    private Producto raiz;

    public ArbolInventario() {
        this.raiz = null;
    }

    public void insertar(int id, String nombre){
        raiz = insertarRecursivo(raiz, id, nombre);
    }

    private Producto insertarRecursivo(Producto nodoActual, int id, String nombre){
        if (nodoActual == null) {
            return new Producto(id, nombre);
        }

        if (id < nodoActual.id) {
            nodoActual.izquierdo = insertarRecursivo(nodoActual.izquierdo, id, nombre);
        } else if (id > nodoActual.id) {
            nodoActual.derecho = insertarRecursivo(nodoActual.derecho, id, nombre);
        } else {
            System.out.println("Ya existe un producto con ID" + id + ". No se insertó");
        }
        return nodoActual;
    }
    
    public void mostrarInorden() {
        if (raiz == null) {
            System.out.println("El inventario está vacío.");
            return;
        }
        System.out.println("   ID    |  Nombre");
        System.out.println("---------|----------------");
        inordenRecursivo(raiz);
    }

    private void inordenRecursivo(Producto nodo) {
        if (nodo != null) {
            inordenRecursivo(nodo.izquierdo);
            System.out.printf("%-5d | %s%n", nodo.id, nodo.nombre);
            inordenRecursivo(nodo.derecho);
        }
    }

    public void buscar (int id) {
        Producto resultado = buscarRecursivo(raiz, id);
        if (resultado != null) {
            System.out.println(" Producto encontrado --> ID: " + resultado.id + " Nombre: " + resultado.nombre);
        } else {
            System.out.println(" Producto no encontrado con ID " + id + ".");

        }
        }

    Private Producto buscarRecursivo(Producto nodo, int id) {
        if (nodo == null) {
            return null;
        }
        if 
    }
    }