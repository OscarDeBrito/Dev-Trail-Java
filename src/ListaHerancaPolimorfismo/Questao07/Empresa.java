package src.ListaHerancaPolimorfismo.Questao07;

public class Empresa {
    public static void main(String[] args) {
        Funcionario[] funcionarios = new Funcionario[10];

        funcionarios[0] = new FuncionarioEnsinoBasico("Ana Pereira", 5678, "Escola Municipal ABC");
        funcionarios[1] = new FuncionarioEnsinoBasico("Carlos Santos", 6789, "Escola Municipal DEF");
        funcionarios[2] = new FuncionarioEnsinoBasico("Beatriz Oliveira", 7890, "Escola Municipal GHI");
        funcionarios[3] = new FuncionarioEnsinoBasico("Eduardo Lima", 8901, "Escola Municipal JKL");

        funcionarios[4] = new FuncionarioEnsinoMedio("Roberto Lima", 9101, "Escola Municipal ABC", "Colégio Estadual XYZ");
        funcionarios[5] = new FuncionarioEnsinoMedio("Fernanda Souza", 1122, "Escola Municipal DEF", "Colégio Estadual UVW");
        funcionarios[6] = new FuncionarioEnsinoMedio("Gustavo Pereira", 2233, "Escola Municipal GHI", "Colégio Estadual RST");
        funcionarios[7] = new FuncionarioEnsinoMedio("Juliana Castro", 3344, "Escola Municipal JKL", "Colégio Estadual OPQ");

        funcionarios[8] = new FuncionarioGraduacao("Mariana Souza", 4455, "Escola Municipal DEF", "Colégio Estadual UVW", "Universidade Federal de São Paulo");
        funcionarios[9] = new FuncionarioGraduacao("Paulo Ribeiro", 5566, "Escola Municipal GHI", "Colégio Estadual RST", "Universidade Estadual de Campinas");

        double custoTotal = 0;
        double custoBasico = 0;
        double custoMedio = 0;
        double custoGraduacao = 0;

        for (Funcionario funcionario : funcionarios) {
            double renda = funcionario.getRendaBasica();
            custoTotal += renda;

            if (funcionario instanceof FuncionarioGraduacao) {
                custoGraduacao += renda;
            } else if (funcionario instanceof FuncionarioEnsinoMedio) {
                custoMedio += renda;
            } else if (funcionario instanceof FuncionarioEnsinoBasico) {
                custoBasico += renda;
            }
        }

        System.out.println("Custo total da empresa com salários: R$ " + custoTotal);
        System.out.println("Custo total com funcionários de ensino básico: R$ " + custoBasico);
        System.out.println("Custo total com funcionários de ensino médio: R$ " + custoMedio);
        System.out.println("Custo total com funcionários de graduação: R$ " + custoGraduacao);
    }
}
