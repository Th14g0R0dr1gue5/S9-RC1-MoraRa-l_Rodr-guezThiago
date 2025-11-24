package Alternativa2;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n---- MENÚ ----");
            System.out.println("1. Agregar producto perecedero");
            System.out.println("2. Agregar producto no perecedero");
            System.out.println("3. Mostrar inventario");
            System.out.println("4. Buscar producto");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt(); sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Nombre: ");
                    String nombreP = sc.nextLine();
                    System.out.print("Cantidad: ");
                    int cantidadP = sc.nextInt();
                    System.out.print("Precio: ");
                    double precioP = sc.nextDouble();
                    System.out.print("Reorden: ");
                    int reordenP = sc.nextInt();
                    System.out.print("Fecha de caducidad (AAAA-MM-DD): ");
                    sc.nextLine(); // limpiar
                    LocalDate fecha = LocalDate.parse(sc.nextLine());
                    Producto perecedero = new ProductoPerecedero(nombreP, cantidadP, precioP, reordenP, fecha);
                    inventario.agregarProducto(perecedero);
                    break;

                case 2:
                    System.out.print("Nombre: ");
                    String nombreNP = sc.nextLine();
                    System.out.print("Cantidad: ");
                    int cantidadNP = sc.nextInt();
                    System.out.print("Precio: ");
                    double precioNP = sc.nextDouble();
                    System.out.print("Reorden: ");
                    int reordenNP = sc.nextInt();
                    Producto noPerecedero = new ProductoNoPerecedero(nombreNP, cantidadNP, precioNP, reordenNP);
                    inventario.agregarProducto(noPerecedero);
                    break;

                case 3:
                    inventario.mostrarInventario();
                    break;

                case 4:
                    System.out.print("Nombre a buscar: ");
                    String buscar = sc.nextLine();
                    Producto encontrado = inventario.buscarPorNombre(buscar);
                    System.out.println(encontrado != null ? encontrado : "Producto no encontrado.");
                    break;

                case 0:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 0);

        sc.close();
    }
}