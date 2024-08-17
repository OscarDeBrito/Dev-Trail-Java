package src.lista1;

import java.util.Scanner;

public class VerificaPalindromo {

    // verifica se é palindromo
    public static boolean Palindromo(String palavra) {
        int comprimento = palavra.length();
        for (int i = 0; i < comprimento / 2; i++) {
            // compara a letra da esquerda com a  da direita
            if (palavra.charAt(i) != palavra.charAt(comprimento - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = scanner.nextLine();
        // converte a palavra para minúsculas
        palavra = palavra.toLowerCase();
        // verifica se é um palíndromo
        if (Palindromo(palavra)) {
            System.out.println("A palavra '" + palavra + "' é um palíndromo.");
        } else {
            System.out.println("A palavra '" + palavra + "' não é um palíndromo.");
        }
    }
}
