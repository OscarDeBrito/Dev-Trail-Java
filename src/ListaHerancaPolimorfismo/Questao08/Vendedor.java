package src.ListaHerancaPolimorfismo.Questao08;

public class Vendedor extends Funcionario {
    private final double COMISSAO = 250.00;

    public Vendedor(String nome, int codigoFuncional, double salarioBase) {
        super(nome, codigoFuncional, salarioBase);
    }

    @Override
    public double getRendaTotal() {
        return getSalarioBase() + COMISSAO;
    }

    @Override
    public String toString() {
        return super.toString() + " (Vendedor)";
    }
}
