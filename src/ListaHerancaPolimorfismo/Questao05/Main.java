package src.ListaHerancaPolimorfismo.Questao05;

public class Main {
    public static void main(String[] args) {
        Funcionario func1 = new Funcionario("Carlos Silva", 1234);
        FuncionarioEnsinoBasico func2 = new FuncionarioEnsinoBasico("Ana Pereira", 5678, "Escola Municipal ABC");
        FuncionarioEnsinoMedio func3 = new FuncionarioEnsinoMedio("Roberto Lima", 9101, "Escola Municipal ABC", "Colégio Estadual XYZ");
        FuncionarioGraduacao func4 = new FuncionarioGraduacao("Mariana Souza", 1121, "Escola Municipal DEF", "Colégio Estadual UVW", "Universidade Federal de São Paulo");

        System.out.println("Nome: " + func1.getNome() + ", Código Funcional: " + func1.getCodigoFuncional());
        System.out.println("Nome: " + func2.getNome() + ", Código Funcional: " + func2.getCodigoFuncional() + ", Escola (Ensino Básico): " + func2.getEscolaBasico());
        System.out.println("Nome: " + func3.getNome() + ", Código Funcional: " + func3.getCodigoFuncional() + ", Escola (Ensino Básico): " + func3.getEscolaBasico() + ", Escola (Ensino Médio): " + func3.getEscolaMedio());
        System.out.println("Nome: " + func4.getNome() + ", Código Funcional: " + func4.getCodigoFuncional() + ", Escola (Ensino Básico): " + func4.getEscolaBasico() + ", Escola (Ensino Médio): " + func4.getEscolaMedio() + ", Universidade: " + func4.getUniversidade());
    }
}
