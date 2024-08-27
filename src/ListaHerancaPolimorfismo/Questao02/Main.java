package src.ListaHerancaPolimorfismo.Questao02;

import src.ListaHerancaPolimorfismo.Questao01.Animal;
import src.ListaHerancaPolimorfismo.Questao01.Cavalo;
import src.ListaHerancaPolimorfismo.Questao01.Preguica;
import src.ListaHerancaPolimorfismo.Questao01.Cachorro;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Animal cachorro = new Cachorro("Rex", 5);
        Animal cavalo = new Cavalo("Spirit", 8);
        Animal preguica = new Preguica("Flash", 2);

        List<Animal> animais = new ArrayList<>();
        animais.add(cachorro);
        animais.add(cavalo);
        animais.add(preguica);

        for (Animal animal : animais) {
            animal.emitirSom();
        }
    }
}
