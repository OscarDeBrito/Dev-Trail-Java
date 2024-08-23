package src.lista04.questao05;

public class Peixe extends AnimalMarinhoAB {

    public Peixe(String nome, String tipoAnimal, int idade, String habitat, double altura, double peso) {
        super(nome, tipoAnimal, idade, habitat, altura, peso);
    }

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

    @Override
    public Boolean nadar(Boolean nadando) {
        System.out.println("Está nadando" );
        return nadando;
    }


}
