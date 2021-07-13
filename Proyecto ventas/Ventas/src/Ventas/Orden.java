package Ventas;

public class Orden {
    private int idOrden;
    private Producto productos[];
    private static int contadorOrdenes;
    private final static int MAX_PRODUCTOS = 10;

    public Orden() {
        this.idOrden = ++Orden.contadorOrdenes;
        this.productos = new Producto[Orden.MAX_PRODUCTOS];
    }

    public void agregarProducto(Producto producto){
        if(producto.getIdProducto()<=Orden.MAX_PRODUCTOS){
            productos[producto.getIdProducto() -1] = producto;
        }
    }

    public double calcularTotal(){
        double suma = 0.0;
        for(Producto i: this.productos){
            if(i != null){
                suma += i.getPrecio();
            }
        }
        return suma;
    }

    public void mostrarOrden(){
        
        System.out.println("--------- Orden " + this.idOrden + " ---------");
        for(Producto i: this.productos){
            if(i != null){
                System.out.println(i);
            }
        }
        System.out.println("Total = " + calcularTotal());
             
    }
}
