package src.ListaHerancaPolimorfismo.Questao08;

public class Funcionario {
    private String nome;
    private int codigoFuncional;
    private double salarioBase;

    public Funcionario(String nome, int codigoFuncional, double salarioBase) {
        this.nome = nome;
        this.codigoFuncional = codigoFuncional;
        this.salarioBase = salarioBase;
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

    public double getRendaTotal() {
        return salarioBase;  // Será sobrescrito nas subclasses
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Código Funcional: " + codigoFuncional + ", Salário Base: R$ " + salarioBase + ", Renda Total: R$ " + getRendaTotal();
    }
}
