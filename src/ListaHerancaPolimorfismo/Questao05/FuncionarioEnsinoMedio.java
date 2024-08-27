package src.ListaHerancaPolimorfismo.Questao05;

public class FuncionarioEnsinoMedio extends FuncionarioEnsinoBasico {
    private String escolaMedio;

    public FuncionarioEnsinoMedio(String nome, int codigoFuncional, String escolaBasico, String escolaMedio) {
        super(nome, codigoFuncional, escolaBasico);
        this.escolaMedio = escolaMedio;
    }

    public String getEscolaMedio() {
        return escolaMedio;
    }

    public void setEscolaMedio(String escolaMedio) {
        this.escolaMedio = escolaMedio;
    }
}
