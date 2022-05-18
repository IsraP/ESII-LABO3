package model;

import interfaces.Transacao;

public class Assinante implements Transacao {

    private float valorMovimento;

    @Override
    public void movimento(float valorMovimento) {
        this.valorMovimento += valorMovimento;
    }

    public float getValor() {
        return valorMovimento;
    }
}
