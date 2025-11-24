package Alternativa2;

public class ProductoNoPerecedero extends Producto {

    public ProductoNoPerecedero(String nombre, int cantidad, double precio, int puntoReorden) {
        super(nombre, cantidad, precio, puntoReorden);
    }

    @Override
    public boolean necesitaReabastecimiento() {
        return cantidad <= puntoReorden;
    }
}
