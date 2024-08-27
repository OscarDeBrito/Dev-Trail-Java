package src.ListaHerancaPolimorfismo.Questao09;

public class Main {
    public static void main(String[] args) {

        Funcionario gerente = new Gerente("Carlos Silva", 1234, 5000.00);
        Funcionario supervisor = new Supervisor("Ana Pereira", 5678, 3000.00);
        Funcionario vendedor = new Vendedor("Roberto Lima", 9101, 2000.00);


        System.out.println(gerente);
        System.out.println(supervisor);
        System.out.println(vendedor);
    }
}
