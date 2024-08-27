package src.ListaHerancaPolimorfismo.Questao07;

public class FuncionarioGraduacao extends FuncionarioEnsinoMedio {
    private String universidade;

    public FuncionarioGraduacao(String nome, int codigoFuncional, String escolaBasico, String escolaMedio, String universidade) {
        super(nome, codigoFuncional, escolaBasico, escolaMedio);
        this.universidade = universidade;
    }

    public String getUniversidade() {
        return universidade;
    }

    @Override
    public double getRendaBasica() {
        return super.getRendaBasica() * 2.00;
    }

}
