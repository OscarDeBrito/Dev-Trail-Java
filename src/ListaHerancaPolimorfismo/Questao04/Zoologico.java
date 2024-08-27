package src.ListaHerancaPolimorfismo.Questao04;

class Zoologico {
    private Animal[] jaulas;

    public Zoologico() {
        jaulas = new Animal[10]; // Inicializando array de 10 jaulas
    }

    public void adicionarAnimal(int index, Animal animal) {
        if (index >= 0 && index < jaulas.length) {
            jaulas[index] = animal;
        } else {
            System.out.println("Índice fora dos limites das jaulas.");
        }
    }

    public void percorrerJaulas() {
        for (int i = 0; i < jaulas.length; i++) {
            Animal animal = jaulas[i];
            if (animal != null) {
                System.out.println("Na jaula " + (i + 1) + ":");
                animal.emitirSom();
                if (animal instanceof AnimalQueCorre) {
                    ((AnimalQueCorre) animal).correr();
                }
                System.out.println();
            } else {
                System.out.println("Jaula " + (i + 1) + " está vazia.");
            }
        }
    }
}