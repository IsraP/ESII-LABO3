package model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SaldoRepl extends Saldo{
    List<SaldoObserver> observerList = new ArrayList<>();

    public void cadastrar(SaldoObserver so){
        observerList.add(so);
    }

    @Override
    public void movimento(float valorMovimento) {
        super.movimento(valorMovimento);

        atualizar(valorMovimento);
    }

    public void atualizar(float valorMovimento){
        Iterator it = observerList.iterator();

        while(it.hasNext()){
            SaldoObserver so = (SaldoObserver) it.next();

            so.update(valorMovimento);
        }
    }
}
