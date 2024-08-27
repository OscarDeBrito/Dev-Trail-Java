package src.ListaHerancaPolimorfismo.Questao11;

public class Gerente extends Funcionario {
    private static final double comissaoGerente = 1500.00;

    public Gerente(String nome, int codigoFuncional, double salarioBase) {
        super(nome, codigoFuncional, salarioBase, comissaoGerente);
    }

    @Override
    public String toString() {
        return super.toString() + " (Gerente)";
    }
}
