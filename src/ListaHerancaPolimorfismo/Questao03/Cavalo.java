package src.ListaHerancaPolimorfismo.Questao03;

public class Cavalo extends AnimalQueCorre {

    public Cavalo(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Relinchar");
    }

    @Override
    public void correr() {
        System.out.println(this.nome + " está galopando!");
    }
}