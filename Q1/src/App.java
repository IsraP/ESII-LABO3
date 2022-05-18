import model.Assinante;
import model.SaldoObserver;
import model.SaldoRepl;

public class App {
    public static void main(String[] args) {
        SaldoRepl sr = new SaldoRepl();

        Assinante a = new Assinante();
        a.movimento(10);
        Assinante b = new Assinante();


        SaldoObserver so1 = new SaldoObserver(a);
        SaldoObserver so2 = new SaldoObserver(b);

        sr.movimento(30);

        System.out.println("Valor da replica em " + sr.getValor() + ". Sem observers anexados.");

        sr.cadastrar(so1);
        sr.cadastrar(so2);

        sr.movimento(50);
        System.out.println("Valor da replica em " + sr.getValor() + ". Observers anexados.");

        System.out.println();
        System.out.println("Valor inicial de a = 10, valor atual de a = " + a.getValor());
        System.out.println("Valor inicial de b = 0, valor atual de b = " + b.getValor());

    }
}
