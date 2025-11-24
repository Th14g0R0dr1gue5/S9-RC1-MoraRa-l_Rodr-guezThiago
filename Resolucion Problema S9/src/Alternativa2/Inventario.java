package Alternativa2;
import java.util.ArrayList;

public class Inventario {
    private ArrayList<Producto> productos;

    public Inventario() {
        productos = new ArrayList<>();
    }

    public void agregarProducto(Producto p) {
        productos.add(p);
        System.out.println("Producto añadido.");
    }

    public void mostrarInventario() {
        if (productos.isEmpty()) {
            System.out.println("Inventario vacío.");
            return;
        }
        for (Producto p : productos) {
            System.out.println(p);
            if (p.necesitaReabastecimiento()) {
                System.out.println("⚠️ ¡Reabastecimiento urgente!");
            }
        }
    }

    public Producto buscarPorNombre(String nombre) {
        for (Producto p : productos) {
            if (p.getNombre().equalsIgnoreCase(nombre)) {
                return p;
            }
        }
        return null;
    }
}
