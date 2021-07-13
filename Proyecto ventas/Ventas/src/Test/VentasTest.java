package Test;

import Ventas.*;
public class VentasTest {
    public static void main(String[] args) {
        Producto producto1 = new Producto("Sopa", 250.5);
        Producto producto2 = new Producto("Cazuela", 700.5);
        Producto producto3 = new Producto("Bandeja Paisa", 490.8);
        Producto producto4 = new Producto("Gaseosa de litro", 35.0);

        Orden orden1 = new Orden();
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        orden1.agregarProducto(producto3);

        orden1.mostrarOrden();

        Orden orden2 = new Orden();
        orden2.agregarProducto(producto1);
        orden2.agregarProducto(producto2);
        orden2.agregarProducto(producto3);
        orden2.agregarProducto(producto4);

        orden2.mostrarOrden();
    }
}
