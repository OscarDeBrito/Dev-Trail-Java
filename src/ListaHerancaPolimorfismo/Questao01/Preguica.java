package src.ListaHerancaPolimorfismo.Questao01;

public class Preguica extends Animal {

    public Preguica(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Preguica Grita");
    }

    public void subirEmArvores() {
        System.out.println(this.nome + " subiu na arvore!");
    }
}