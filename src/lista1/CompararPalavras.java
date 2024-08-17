package src.lista1;

import java.util.Scanner;

public class CompararPalavras {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // entrada de valores
        System.out.print("Primeira palavra: ");
        String palavra1 = scanner.nextLine();
        System.out.print("Segunda palavra: ");
        String palavra2 = scanner.nextLine();

        // comapara as palavras e imprime em ordem alfabética
        if (palavra1.compareTo(palavra2) < 0) {
            System.out.println("Ordem alfabética: " + palavra1 + ", " + palavra2);
        } else if (palavra1.compareTo(palavra2) > 0) {
            System.out.println("Ordem alfabética: " + palavra2 + ", " + palavra1);
        } else {
            System.out.println("As palavras são iguais.");
        }

        // verifica qual é maior
        if (palavra1.length() > palavra2.length()) {
            System.out.println("A palavra '" + palavra1 + "' tem mais caracteres.");
        } else if (palavra2.length() > palavra1.length()) {
            System.out.println("A palavra '" + palavra2 + "' tem mais caracteres.");
        } else {
            System.out.println("As palavras têm o mesmo número de caracteres.");
        }
    }
}
