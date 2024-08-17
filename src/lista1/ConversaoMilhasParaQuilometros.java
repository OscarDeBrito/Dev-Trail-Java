package src.lista1;

import java.util.Scanner;

public class ConversaoMilhasParaQuilometros {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // ler a distancia
        System.out.print("Digite a distância em milhas: ");
        double milhas = scanner.nextDouble();
        // Converte  para quilômetros
        double quilometros = milhas * 1.609;
        // mostra o resultado
        System.out.println(milhas + " milhas equivalem a " + quilometros + " quilômetros.");
    }
}
