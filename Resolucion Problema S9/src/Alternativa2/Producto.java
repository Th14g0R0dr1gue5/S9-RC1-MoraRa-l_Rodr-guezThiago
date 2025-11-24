package Alternativa2;

public abstract class Producto {
    protected String nombre;
    protected int cantidad;
    protected double precio;
    protected int puntoReorden;

    public Producto(String nombre, int cantidad, double precio, int puntoReorden) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
        this.puntoReorden = puntoReorden;
    }

    public String getNombre() {
        return nombre;
    }

    public abstract boolean necesitaReabastecimiento();

    @Override
    public String toString() {
        return "Producto: " + nombre + " | Cantidad: " + cantidad +
                " | Precio: $" + precio + " | Reorden en: " + puntoReorden;
    }
}