package src.ListaHerancaPolimorfismo.Questao03;

abstract class AnimalQueCorre extends Animal {

    public AnimalQueCorre(String nome, int idade) {
        super(nome, idade);
    }

    public abstract void correr();
}