package src.lista0;

import java.util.Scanner;

public class MediaAritmetica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 1;
        double soma = 0.0;
        double numero;

        // le os numeros, vai adicionando um por um e somando eles
        while (contador < 51) {
            System.out.print("Digite o número " + (contador ) + ": ");
            numero = scanner.nextDouble();
            soma += numero;
            contador++;
        }
        // calcula media
        double media = soma / 50;
        System.out.println("A média aritmética é: " + media);

        scanner.close();
    }
}
