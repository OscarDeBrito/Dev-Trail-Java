package src.lista1;

public class DivisaoMultiplosDeTres {

    public static void main(String[] args) {
        // loop pelos números
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) { // verifica se o número é múltiplo de 3
                // deivide por 2 usando int
                int divisaoInt = i / 2;
                // divide por 2 usando double
                double divisaoDouble = (double) i / 2;
                // imprime os resultados
                System.out.println("Número: " + i);
                System.out.println("Divisão (int): " + divisaoInt);
                System.out.println("Divisão (double): " + divisaoDouble);
                System.out.println(); // Linha em branco para separar as saídas
            }
        }
    }
}
