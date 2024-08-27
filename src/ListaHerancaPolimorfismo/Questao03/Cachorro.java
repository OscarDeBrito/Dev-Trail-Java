package src.ListaHerancaPolimorfismo.Questao03;

public class Cachorro extends AnimalQueCorre {

    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Au Au");
    }

    @Override
    public void correr() {
        System.out.println(this.nome + " está correndo!");
    }
}