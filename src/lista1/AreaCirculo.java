package src.lista1;

import java.util.Scanner;

public class AreaCirculo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ler o raio
        System.out.print("Valor do raio: ");
        double raio = scanner.nextDouble();
        // calcula area
        double area = Math.PI * Math.pow(raio, 2);
        // arredonda valor
        long areaArredondada = Math.round(area);
        // exibe na tela
        System.out.println("A área do círculo com raio " + raio + " é aproximadamente: " + areaArredondada);
    }
}
