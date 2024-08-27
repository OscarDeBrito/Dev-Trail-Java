package src.ListaHerancaPolimorfismo.Questao03;


class Veterinario {
    public void examinar(Animal animal) {
        System.out.println("Examinando " + animal.nome);
        animal.emitirSom();
    }
}