package src.lista1;

import java.util.Scanner;

public class DiaDaSemana {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // array com os dias da semana
        String[] diasDaSemana = {"Segunda-feira", "Terça-feira", "Quarta-feira", "Quinta-feira", "Sexta-feira", "Sábado", "Domingo"};
        // ler o numero do usuario
        System.out.print("Digite um número de 1 a 7: ");
        int numero = scanner.nextInt();
        // verifica se o numero está dentro do intervalo
        if (numero >= 1 && numero <= 7) {
            // imprime o dia da semana
            System.out.println("O dia da semana correspondente é: " + diasDaSemana[numero - 1]);
        } else {
            // else fora do intervalo
            System.out.println("Número inválido. Por favor, digite um número de 1 a 7.");
        }
    }
}
