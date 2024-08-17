package src.lista1;

import java.util.Scanner;

public class NumerosPrimos {

    // Metodo que verifica se o numero é primo
    public static boolean Primo(int numero) {
        if (numero <= 1) {
            return false; // Não pode ser menor que 1
        }
        for (int i = 2; i < numero; i++) { // Verifica divisibilidade de 2 até numero-1
            if (numero % i == 0) {
                return false; // Se for divisível por qualquer número além de 1 e ele mesmo, não é primo
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // pega o numero pelo usuario
        System.out.print("Número inteiro: ");
        int numero = scanner.nextInt();
        // Imprime todos os números
        System.out.println("Números primos menores que " + numero + ":");
        for (int i = 2; i < numero; i++) { // Começa do 2 pois 1 não é considerado primo
            if (Primo(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
