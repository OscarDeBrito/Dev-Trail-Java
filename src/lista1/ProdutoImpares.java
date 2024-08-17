package src.lista1;

public class ProdutoImpares {

    public static void main(String[] args) {
        // produto usando int
        int produtoInt = 1;
        // produto usando float
        float produtoFloat = 1.0f;
        // loop pelos números
        for (int i = 15; i <= 30; i++) {
            if (i % 2 != 0) { // Verifica se o número é ímpar
                produtoInt *= i; //over flow ?
                produtoFloat *= i;
            }
        }
        // imprime os resultados
        System.out.println("Produto dos números ímpares de 15 a 30 (int): " + produtoInt);
        System.out.println("Produto dos números ímpares de 15 a 30 (float): " + produtoFloat);
    }
}
