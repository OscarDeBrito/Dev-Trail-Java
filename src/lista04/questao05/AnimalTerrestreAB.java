package src.lista04.questao05;


public abstract class AnimalTerrestreAB extends AnimalAB {
    protected int quantidadePatas;

    public AnimalTerrestreAB(String nome, String tipoAnimal, int idade, String habitat, double altura, double peso) {
        super(nome, tipoAnimal, idade, habitat, altura, peso);
    }

    public abstract Boolean correr(Boolean correndo);

    public int getQuantidadePatas() {
        return quantidadePatas;
    }

    public void setQuantidadePatas(int quantidadePatas) {
        this.quantidadePatas = quantidadePatas;
    }
}
