package src.lista04.questao05;

public class Main {
    public static void main(String[] args) {
        Leao le1 = new Leao("Simba", "Mamífero", 15, "Selva", 1.2, 20, 4);


        le1.setNome("lion");

        le1.comer(5);
        le1.dormir(3);
        le1.moverse(8);
        le1.correr(true);

        System.out.println("Leão: " + le1.getNome());
        System.out.println("O leão comeu " + le1.getComidaIngerida() + " kg de comida.");
        System.out.println("O leão dormiu  " + le1.getHorasDormidas() + " horas.");
        System.out.println("O leão percorreu " + le1.getCaminhoPercorrido() + " quilômetros.");
    }
}
