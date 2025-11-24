package Alternativa1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n---- MENÚ INVENTARIO ----");
            System.out.println("1. Agregar producto");
            System.out.println("2. Mostrar productos");
            System.out.println("3. Buscar producto");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt(); sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Nombre del producto: ");
                    String nombre = sc.nextLine();
                    System.out.print("Cantidad: ");
                    int cantidad = sc.nextInt();
                    System.out.print("Precio: ");
                    double precio = sc.nextDouble();
                    System.out.print("Punto de reorden: ");
                    int reorden = sc.nextInt();
                    Producto nuevo = new Producto(nombre, cantidad, precio, reorden);
                    inventario.agregarProducto(nuevo);
                    break;

                case 2:
                    inventario.mostrarProductos();
                    break;

                case 3:
                    System.out.print("Nombre del producto a buscar: ");
                    String buscar = sc.nextLine();
                    Producto encontrado = inventario.buscarPorNombre(buscar);
                    if (encontrado != null) {
                        System.out.println("🔎 Producto encontrado:\n" + encontrado);
                    } else {
                        System.out.println("Producto no encontrado.");
                    }
                    break;

                case 0:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 0);
        sc.close();
    }
}

