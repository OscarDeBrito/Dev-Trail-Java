package src.lista04.questao05;

public class Elefante extends AnimalTerrestreAB{


    public Elefante(String nome, String tipoAnimal, int idade, String habitat, double altura, double peso, int patasElefante) {
        super(nome, tipoAnimal, idade, habitat, altura, peso);
        this.quantidadePatas = patasElefante;
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
    public Boolean correr(Boolean correndo) {
        System.out.println("Está correndo" );
        return correndo;
    }
}
