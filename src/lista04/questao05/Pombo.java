package src.lista04.questao05;

public class Pombo extends AnimalVoadorAB {

    public Pombo(String nome, String tipoAnimal, int idade, String habitat, double altura, double peso, int quantidadePatas, int quantidadeAssas, double envergaduraAssa) {
        super(nome, tipoAnimal, idade, habitat, altura, peso, quantidadePatas, quantidadeAssas, envergaduraAssa);
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
    public Boolean voar(Boolean voando) {
        System.out.println("Está voando" );
        return voando;
    }

}
