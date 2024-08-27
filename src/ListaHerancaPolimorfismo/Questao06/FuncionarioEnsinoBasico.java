package src.ListaHerancaPolimorfismo.Questao06;

public class FuncionarioEnsinoBasico extends Funcionario {
    private String escolaBasico;

    public FuncionarioEnsinoBasico(String nome, int codigoFuncional, String escolaBasico) {
        super(nome, codigoFuncional);
        this.escolaBasico = escolaBasico;
    }

    public String getEscolaBasico() {
        return escolaBasico;
    }

    @Override
    public double getRendaBasica() {
        return super.getRendaBasica() * 1.10;
    }

}
