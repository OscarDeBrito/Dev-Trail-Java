package src.ListaHerancaPolimorfismo.Questao11;

public class Main {
    public static void main(String[] args) {
        Funcionario[] funcionarios = new Funcionario[10];

        funcionarios[0] = new Gerente("Carlos Silva", 1234, 5000.00);

        funcionarios[1] = new Supervisor("Ana Pereira", 5678, 3000.00);
        funcionarios[2] = new Supervisor("Beatriz Oliveira", 6789, 3200.00);

        funcionarios[3] = new Vendedor("Eduardo Lima", 8901, 2000.00);
        funcionarios[4] = new Vendedor("Fernanda Souza", 9101, 2100.00);
        funcionarios[5] = new Vendedor("Gustavo Pereira", 1122, 2200.00);
        funcionarios[6] = new Vendedor("Juliana Castro", 2233, 2300.00);
        funcionarios[7] = new Vendedor("Mariana Souza", 3344, 2400.00);
        funcionarios[8] = new Vendedor("Paulo Ribeiro", 4455, 2500.00);
        funcionarios[9] = new Vendedor("Roberto Lima", 5566, 2600.00);

        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario);
        }
    }
}
