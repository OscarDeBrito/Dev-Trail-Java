package src.ListaHerancaPolimorfismo.Questao04;


class Veterinario {
    public void examinar(Animal animal) {
        System.out.println("Examinando " + animal.nome);
        animal.emitirSom();
    }
}