package src.ListaHerancaPolimorfismo.Questao08;

public class Supervisor extends Funcionario {
    private final double COMISSAO = 600.00;

    public Supervisor(String nome, int codigoFuncional, double salarioBase) {
        super(nome, codigoFuncional, salarioBase);
    }

    @Override
    public double getRendaTotal() {
        return getSalarioBase() + COMISSAO;
    }

    @Override
    public String toString() {
        return super.toString() + " (Supervisor)";
    }
}
