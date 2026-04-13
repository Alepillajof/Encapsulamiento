public class Main {
    public static void main() {
        Producto p = new Producto();
        p.setNombre("Laptop");
        p.setPrecio(-100);
        System.out.println(p.getNombre());
        System.out.println(p.getPrecio());
    }
}