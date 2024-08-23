package src.lista04.questao05;


public abstract class AnimalVoadorAB extends AnimalAB {
    protected int quantidadeAssas;
    protected double envergaduraAssa;

    public AnimalVoadorAB(String nome, String tipoAnimal, int idade, String habitat, double altura, double peso, int quantidadePatas, int quantidadeAssas, double envergaduraAssa) {
        super(nome, tipoAnimal, idade, habitat, altura, peso);
        this.quantidadeAssas = quantidadeAssas;
        this.envergaduraAssa = envergaduraAssa;
    }

    public abstract Boolean voar(Boolean voando);

    public double getEnvergaduraAssa() {
        return envergaduraAssa;
    }

    public void setEnvergaduraAssa(double envergaduraAssa) {
        this.envergaduraAssa = envergaduraAssa;
    }

    public int getQuantidadeAssas() {
        return quantidadeAssas;
    }

    public void setQuantidadeAssas(int quantidadeAssas) {
        this.quantidadeAssas = quantidadeAssas;
    }
}

