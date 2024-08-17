package src.lista1;

import java.util.Scanner;

public class MaiorValor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // vai receber os valores 1 e 2
        System.out.print("Primeiro valor: ");
        int valor1 = scanner.nextInt();
        System.out.print("Segundo valor: ");
        int valor2 = scanner.nextInt();
        // faz o calculo do maior valor, usei ternario.
        int maiorValor = (valor1 > valor2) ? valor1 : valor2;
        // motra resultado
        System.out.println("O maior valor é: " + maiorValor);
    }
}
