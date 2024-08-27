package src.ListaHerancaPolimorfismo.Questao07;

public class FuncionarioEnsinoMedio extends FuncionarioEnsinoBasico {
    private String escolaMedio;

    public FuncionarioEnsinoMedio(String nome, int codigoFuncional, String escolaBasico, String escolaMedio) {
        super(nome, codigoFuncional, escolaBasico);
        this.escolaMedio = escolaMedio;
    }

    public String getEscolaMedio() {
        return escolaMedio;
    }

    @Override
    public double getRendaBasica() {
        return super.getRendaBasica() * 1.50;
    }

}
