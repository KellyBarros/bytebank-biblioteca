package br.com.alura.bytebank;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteBiblioteca {

    public static void main(String[] args) {
        Conta cc = new ContaCorrente(2121, 2121);
        cc.deposita(1000);
        cc.deposita(1000);
        System.out.println(cc.getSaldo());
    }
}
