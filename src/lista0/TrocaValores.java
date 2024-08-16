package src.lista0;

import java.util.Scanner;

public class TrocaValores {
    public static void main(String[] args) {

        int A;
        int B;
        int temp;
        Scanner scanner = new Scanner(System.in);

        //ler vairavel A
        System.out.print("valor de A: ");
        A = scanner.nextInt();
        //ler variável B
        System.out.print("valor de B: ");
        B = scanner.nextInt();
        //apresenta os valores de antes
        System.out.println("valor digitado: A = " + A + ", B = " + B);
        //faz a troca usando referencia
        temp = A;
        A = B;
        B = temp;
        //apresenta os valores depois da troca
        System.out.println("valores trocados: A = " + A + ", B = " + B);

        scanner.close();
    }
}
