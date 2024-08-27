package src.ListaHerancaPolimorfismo.Questao04;

public class Main {
    public static void main(String[] args) {
        Zoologico zoologico = new Zoologico();

        zoologico.adicionarAnimal(0, new Cachorro("Rex", 5));
        zoologico.adicionarAnimal(1, new Cavalo("Spirit", 8));
        zoologico.adicionarAnimal(2, new Preguica("Tuti", 2));
        zoologico.adicionarAnimal(3, new Cachorro("Max", 3));
        zoologico.adicionarAnimal(4, new Cavalo("Sushi", 7));
        zoologico.adicionarAnimal(5, new Preguica("Slowpoke", 4));
        zoologico.adicionarAnimal(6, new Cachorro("Buddy", 4));
        zoologico.adicionarAnimal(7, new Cavalo("Pé de pano", 9));
        zoologico.adicionarAnimal(8, new Preguica("Lazy", 5));
        zoologico.adicionarAnimal(9, new Cachorro("Rocky", 2));

        zoologico.percorrerJaulas();
    }
}