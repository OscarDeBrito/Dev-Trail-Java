import java.util.Scanner;

public class ParOuImpar {

    // verifica número  par ou impar
    public static String verificarParOuImpar(int numero) {
        if (numero % 2 == 0) {  // se for divisivel por 2 é par, senão impar
            return numero + " é par.";
        } else {
            return numero + " é ímpar.";
        }
    }

    public static void main(String[] args) {

        int numero;

        Scanner scanner = new Scanner(System.in);

        // Ler o valor digitado pelo usuario
        System.out.print("Digite um número: ");
        numero = scanner.nextInt();
        // Verifica e imprime se o número é par ou ímpar
        System.out.println(verificarParOuImpar(numero));
        scanner.close();
    }
}
