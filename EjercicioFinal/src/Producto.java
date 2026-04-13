public class Producto {
    private String nombre;
    private int stock;
    private double precio;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setPrecio(double precio) {
        if (precio>=0){
            this.precio = precio;
        }
        else {
            System.out.println("El precio no puede ser menor a 0");
        }
    }

    public double getPrecio() {
        return precio;
    }

    public void setStock(int stock) {
        if (stock>=0){
            this.stock = stock;
        }
        else {
            System.out.println("El stock no puede ser inferior a cero");
        }
    }

    public int getStock() {
        return stock;
    }

    public void calcularTotal(){
        double total=precio*stock;
        System.out.println("Su total a pagar es: $"+total);
    }
}
