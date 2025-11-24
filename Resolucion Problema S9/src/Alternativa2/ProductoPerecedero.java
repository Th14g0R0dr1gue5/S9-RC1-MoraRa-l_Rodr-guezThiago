package Alternativa2;
import java.time.LocalDate;

public class ProductoPerecedero extends Producto {
    private LocalDate fechaCaducidad;

    public ProductoPerecedero(String nombre, int cantidad, double precio, int puntoReorden, LocalDate fechaCaducidad) {
        super(nombre, cantidad, precio, puntoReorden);
        this.fechaCaducidad = fechaCaducidad;
    }

    @Override
    public boolean necesitaReabastecimiento() {
        return cantidad <= puntoReorden || fechaCaducidad.isBefore(LocalDate.now().plusDays(3));
    }

    @Override
    public String toString() {
        return super.toString() + " | Vence: " + fechaCaducidad;
    }
}
