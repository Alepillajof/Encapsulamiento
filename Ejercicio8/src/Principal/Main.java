package Principal;

import modelo.Estudiante;

public class Main {
    public static void main(String[] args) {
        Estudiante e = new Estudiante();
        Estudiante e2 = new Estudiante();
        e.setNombre("Juan");
        e2.setNombre("Alessandro");
        System.out.println("Nombre del estudiante: " + e.getNombre());
        System.out.println("Nombre del estudiante: " + e2.getNombre());
    }
}
