package src.ListaHerancaPolimorfismo.Questao09;

public class Gerente extends Funcionario {
    private static double comissaoGerente = 1500.00;

    public Gerente(String nome, int codigoFuncional, double salarioBase) {
        super(nome, codigoFuncional, salarioBase, comissaoGerente);
    }

    @Override
    public String toString() {
        return super.toString() + " (Gerente)";
    }
}
