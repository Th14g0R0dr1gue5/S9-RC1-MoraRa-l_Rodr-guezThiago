package Alternativa1;

public class Producto {
    private String nombre;
    private int cantidad;
    private double precio;
    private int puntoReorden;

    public Producto(String nombre, int cantidad, double precio, int puntoReorden) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
        this.puntoReorden = puntoReorden;
    }

    // Métodos Getters y Setters
    public String getNombre() { return nombre; }
    public int getCantidad() { return cantidad; }
    public double getPrecio() { return precio; }
    public int getPuntoReorden() { return puntoReorden; }

    public void setCantidad(int cantidad) { this.cantidad = cantidad; }

    // Método para verificar si se necesita reabastecer
    public boolean necesitaReabastecimiento() {
        return cantidad <= puntoReorden;
    }

    @Override
    public String toString() {
        return "Producto: " + nombre + " | Cantidad: " + cantidad +
                " | Precio: $" + precio + " | Reorden en: " + puntoReorden;
    }
}



