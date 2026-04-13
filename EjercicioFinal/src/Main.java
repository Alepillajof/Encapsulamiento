public class Main {
    public static void main(String[] args) {
        Producto p = new Producto();
        p.setNombre("Laptop");
        p.setPrecio(900);
        p.setStock(5);
        System.out.println("Nombre del producto: "+p.getNombre()+" Precio: "+p.getPrecio()+" Cantidad: "+p.getStock());
        p.calcularTotal();
        Producto p1 = new Producto();
        p1.setNombre("Celular");
        System.out.println("Nombre del producto: "+p1.getNombre()+" Precio: "+p1.getPrecio()+" Cantidad: "+p1.getStock());
        p1.setPrecio(-10);
        p1.setStock(-3);
        p1.calcularTotal();
    }
}