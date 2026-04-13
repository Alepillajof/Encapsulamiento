package principal;

import modelo.CuentaBancaria;

public class Main {
    public static void main(String[] args) {
        CuentaBancaria c = new CuentaBancaria();

        c.setSaldo(250);
        System.out.println("Saldo guardado: " + c.getSaldo());

        c.setSaldo(0);
        System.out.println("Saldo final: " + c.getSaldo());
    }
}
