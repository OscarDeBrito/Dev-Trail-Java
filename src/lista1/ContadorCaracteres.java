package src.lista1;

import java.util.Scanner;

public class ContadorCaracteres {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ler a cadeia de caracteres
        System.out.print("Digite os  caracteres: ");
        String entrada = scanner.nextLine();
        // contadores
        int vogais = 0, espacos = 0, consoantes = 0;
        // ceonverte para lowcase
        entrada = entrada.toLowerCase();

        // itera por cada caractere
        for (int i = 0; i < entrada.length(); i++) {
            char c = entrada.charAt(i);

            // se é vogal
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vogais++;
            }
            // se é espaço em branco
            else if (c == ' ') {
                espacos++;
            }
            // se é consoante
            else if (c >= 'a' && c <= 'z') {
                consoantes++;
            }
        }

        // exibe na tela
        System.out.println("Quantidade de vogais: " + vogais);
        System.out.println("Quantidade de espaços em branco: " + espacos);
        System.out.println("Quantidade de consoantes: " + consoantes);
    }
}
