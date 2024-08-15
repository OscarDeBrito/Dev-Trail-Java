public class CombinacaoDados {
    public static void main(String[] args) {
        System.out.println("Possibilidades:");
        // possiveis valores do primeiro dado
        for (int dado1 = 1; dado1 <= 6; dado1++) {
            // possiveis valores do segundo dado
            for (int dado2 = 1; dado2 <= 6; dado2++) {
                // Verifica se a soma dos dois dados é igual a 7
                if (dado1 + dado2 == 7) {
                    // Imprime a combinação
                    System.out.println("Dado 1: " + dado1 + " | Dado 2: " + dado2);
                }
            }
        }
    }
}
