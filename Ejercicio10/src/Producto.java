public class Producto {
    private String nombre;
    private double precio;


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setPrecio(double precio) {
        if (precio >= 0) {
            this.precio = precio;
        }
        else {
            System.out.println("Error");
        }
    }

    public double getPrecio() {
        return precio;
    }



}
