package model;

import interfaces.Transacao;

public class Saldo implements Transacao {
    private float valor;

    public float getValor() {
        return valor;
    }

    public void movimento(float valorMovimento) {
        valor += valorMovimento;
    }
}