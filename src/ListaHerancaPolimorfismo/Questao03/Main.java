package src.ListaHerancaPolimorfismo.Questao03;

public class Main {
    public static void main(String[] args) {
        Animal cachorro = new Cachorro("Cachorro", 5);
        Animal cavalo = new Cavalo("Cavalo", 8);
        Animal preguica = new Preguica("Preguiça", 2);

        Veterinario veterinario = new Veterinario();

        veterinario.examinar(cachorro);
        veterinario.examinar(cavalo);
        veterinario.examinar(preguica);
    }
}
