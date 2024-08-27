package src.ListaHerancaPolimorfismo.Questao11;

public class Vendedor extends Funcionario {
    private static final double comissaoVendedor = 250.00;

    public Vendedor(String nome, int codigoFuncional, double salarioBase) {
        super(nome, codigoFuncional, salarioBase, comissaoVendedor);
    }

    @Override
    public String toString() {
        return super.toString() + " (Vendedor)";
    }
}
