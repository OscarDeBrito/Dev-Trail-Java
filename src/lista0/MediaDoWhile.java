package src.lista0;

import java.util.Scanner;

public class MediaDoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;
        int contador = 1;
        int numero;

        // do-while para ler 50 numeros
        do {
            System.out.print("Digite o número " + (contador ) + ": ");
            numero = scanner.nextInt();
            soma += numero;
            contador++;
        } while (contador < 51);

        // calcula media
        double media = (double) soma / 50;

        // Exibição da média
        System.out.println("A média aritmética  é: " + media);
        scanner.close();
    }
}
