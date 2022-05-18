package interfaces;

import model.Assinante;
import model.SaldoRepl;

public interface Observer {
    void update(SaldoRepl sr);
}
