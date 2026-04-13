package principal;
import Modelo.Persona;

public class Main {
    public static void main(String[] args){
        Persona p = new Persona();
        p.setNombre("Ana");
        System.out.println(p.getNombre());
    }
}