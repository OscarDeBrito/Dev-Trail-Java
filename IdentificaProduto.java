import java.util.Scanner;

public class IdentificaProduto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ler o código do produto
        System.out.print("Codigo que deseja consultar: ");
        String codigo = scanner.nextLine();

        // Identifica o produto com base no código
        String produto;
        if (codigo.equals("001")) {
            produto = "Parafuso";
        } else if (codigo.equals("002")) {
            produto = "Porca";
        } else if (codigo.equals("003")) {
            produto = "Prego";
        } else {
            produto = "Diversos";
        }// Exibir o nome do produto
        System.out.println("Produto: " + produto);

        scanner.close();
    }
}
