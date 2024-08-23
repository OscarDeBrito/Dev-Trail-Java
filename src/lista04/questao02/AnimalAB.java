package src.lista04.questao02;

public abstract class AnimalAB implements AnimalIF {

    @Override
    public abstract int comer(int quantidadeComida);


    @Override
    public abstract int moverse(int caminhoPercorrido);

    @Override
    public abstract int dormir(int quantidadeHoras);
}
