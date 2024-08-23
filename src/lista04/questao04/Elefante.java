package src.lista04.questao04;


public class Elefante extends AnimalAB {

    @Override
    public int comer(int quantidadeComida) {
        setComidaIngerida(quantidadeComida + getComidaIngerida());
        return quantidadeComida;
    }

    @Override
    public int moverse(int caminhoPercorrido) {
        setCaminhoPercorrido(caminhoPercorrido + getCaminhoPercorrido());
        return caminhoPercorrido;
    }

    @Override
    public int dormir(int quantidadeHoras) {
        setHorasDormidas(quantidadeHoras + getHorasDormidas());
        return quantidadeHoras;
    }
}
