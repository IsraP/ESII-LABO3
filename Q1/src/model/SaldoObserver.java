package model;

import interfaces.Observer;

public class SaldoObserver implements Observer {
    Assinante a;

    public SaldoObserver(Assinante a) {
        this.a = a;
    }

    @Override
    public void update(SaldoRepl sr) {
        a.movimento(sr.getValor());
    }

    public void update(float valor){
        a.movimento(valor);
    }

    public void setA(Assinante a) {
        this.a = a;
    }

    public Assinante getA() {
        return a;
    }
}
