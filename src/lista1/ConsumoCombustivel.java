package src.lista1;

import java.util.Scanner;

public class ConsumoCombustivel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quilometragemTotal = 0;
        int litrosTotais = 0;
        int tanqueCount = 0;

        // registrar os dados de cada tanque cheios
        while (true) {
            System.out.print("Digite os quilômetros rodados (-1 para encerrar): ");
            int quilometros = scanner.nextInt();
            if (quilometros == -1) {
                break;
            }

            System.out.print("Digite os litros de combustível consumidos: ");
            int litros = scanner.nextInt();
            // Ccalcula e exibe tanque atual
            double consumo = (double) quilometros / litros;
            System.out.println("O consumo deste tanque foi de " + consumo + " km/l");
            // atualiza o total dos tanques
            quilometragemTotal += quilometros;
            litrosTotais += litros;
            tanqueCount++;
            System.out.println();
        }

        // exibe o total depoia saida
        if (tanqueCount > 0) {
            double consumoMedioTotal = (double) quilometragemTotal / litrosTotais;
            System.out.println("Quilometragem combinada: " + quilometragemTotal + " km");
            System.out.println("Total de litros consumidos: " + litrosTotais + " litros");
            System.out.println("Consumo médio total: " + consumoMedioTotal + " km/l");
        } else {
            System.out.println("Nenhum dado foi inserido.");
        }
    }
}
