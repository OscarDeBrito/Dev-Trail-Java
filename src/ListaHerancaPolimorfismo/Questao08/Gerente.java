package src.ListaHerancaPolimorfismo.Questao08;

public class Gerente extends Funcionario {
    private final double COMISSAO = 1500.00;

    public Gerente(String nome, int codigoFuncional, double salarioBase) {
        super(nome, codigoFuncional, salarioBase);
    }

    @Override
    public double getRendaTotal() {
        return getSalarioBase() + COMISSAO;
    }

    @Override
    public String toString() {
        return super.toString() + " (Gerente)";
    }
}
