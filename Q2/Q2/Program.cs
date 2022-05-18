using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Q2
{
    class Program
    {
        static void Main(string[] args)
        {
            Experimento ex = new Experimento();
            ex.InserirAcao(Acao.AplicacaoProdutoQuimico);
            ex.InserirAcao(Acao.Chacoalhar);
            ex.InserirAcao(Acao.ElevacaoTemperaturaAmbiente);
            ex.InserirAcao(Acao.Misturar);
            ex.InserirAcao(Acao.Testar);
            Console.ReadLine();
        }
    }
    public class Experimento
    {
        List<Robo> robos;
        public Experimento()
        {
            robos = new List<Robo>();
        }
        public void InserirAcao(Acao acao)
        {
            robos.Add(new Robo(acao));
            if(acao == Acao.Testar)
            {
                Executar();
            }
        }
        public void Executar()
        {
            foreach (var item in robos)
            {
                item.Execute();
            }
            
        }
        public List<Robo> Clonar()
        {
            List<Robo> clone = new List<Robo>(robos);
            for (int i = 0; i < robos.Count; i++)
            {
                clone[i] = new Robo(clone[i].acao);
            }
            return clone;
        }
    }
    public class Robo : RoboAction
    {
        public Acao acao;
        public Robo(Acao acao)
        {
            this.acao = acao;
        }
        public void Execute()
        {
            Console.WriteLine("Executando: {0}", this.acao.ToString());
        }
    }
    public interface RoboAction
    {
        void Execute();
    }
    public enum Acao
    {
        ElevacaoTemperaturaAmbiente = 1,
        AplicacaoProdutoQuimico = 2,
        Chacoalhar = 3,
        Misturar = 4,
        Testar = 0
    }
}
