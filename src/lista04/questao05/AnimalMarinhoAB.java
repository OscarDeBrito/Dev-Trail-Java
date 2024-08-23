package src.lista04.questao05;


public abstract class AnimalMarinhoAB extends AnimalAB {

    public AnimalMarinhoAB(String nome, String tipoAnimal, int idade, String habitat, double altura, double peso) {
        super(nome, tipoAnimal, idade, habitat, altura, peso);
    }

    public abstract Boolean nadar(Boolean nadando);
}

