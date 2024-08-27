package src.ListaHerancaPolimorfismo.Questao11;

public class Funcionario {
    private String nome;
    private int codigoFuncional;
    private double salarioBase;
    private double comissao;

    public Funcionario(String nome, int codigoFuncional, double salarioBase, double comissao) {
        this.nome = nome;
        this.codigoFuncional = codigoFuncional;
        this.salarioBase = salarioBase;
        this.comissao = comissao;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigoFuncional() {
        return codigoFuncional;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public double getComissao() {
        return comissao;
    }

    public double getRendaTotal() {
        return salarioBase + comissao;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Comissão: R$ " + comissao + ", Salário Total: R$ " + getRendaTotal();
    }
}
