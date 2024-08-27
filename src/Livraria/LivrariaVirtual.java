package src.Livraria;

import java.util.Scanner;

public class LivrariaVirtual {
    private static final int MAX_IMPRESSOS = 10;
    private static final int MAX_ELETRONICOS = 20;
    private static final int MAX_VENDAS = 50;

    private Impresso[] impressos = new Impresso[MAX_IMPRESSOS];
    private Eletronico[] eletronicos = new Eletronico[MAX_ELETRONICOS];
    private Venda[] vendas = new Venda[MAX_VENDAS];

    private int numImpressos = 0;
    private int numEletronicos = 0;
    private int numVendas = 0;

    private Scanner scanner = new Scanner(System.in);

    public void cadastrarLivro() {
        System.out.println("Tipo de livro (1-Impresso, 2-Eletronico, 3-Ambos): ");
        int tipo = scanner.nextInt();
        scanner.nextLine();

        if (tipo == 1 || tipo == 3) {
            if (numImpressos < MAX_IMPRESSOS) {
                Impresso impresso = cadastrarLivroImpresso();
                impressos[numImpressos++] = impresso;
            } else {
                System.out.println("Limite de livros impressos atingido.");
            }
        }

        if (tipo == 2 || tipo == 3) {
            if (numEletronicos < MAX_ELETRONICOS) {
                Eletronico eletronico = cadastrarLivroEletronico();
                eletronicos[numEletronicos++] = eletronico;
            } else {
                System.out.println("Limite de livros eletronicos atingido.");
            }
        }
    }

    private Impresso cadastrarLivroImpresso() {
        System.out.print("Título: ");
        String titulo = scanner.nextLine();
        System.out.print("Autores: ");
        String autores = scanner.nextLine();
        System.out.print("Editora: ");
        String editora = scanner.nextLine();
        System.out.print("Preço: ");
        double preco = scanner.nextDouble();
        System.out.print("Frete: ");
        float frete = scanner.nextFloat();
        System.out.print("Estoque: ");
        int estoque = scanner.nextInt();
        scanner.nextLine();

        return new Impresso(titulo, autores, editora, preco, frete, estoque);
    }

    private Eletronico cadastrarLivroEletronico() {
        System.out.print("Título: ");
        String titulo = scanner.nextLine();
        System.out.print("Autores: ");
        String autores = scanner.nextLine();
        System.out.print("Editora: ");
        String editora = scanner.nextLine();
        System.out.print("Preço: ");
        double preco = scanner.nextDouble();
        System.out.print("Tamanho (em KB): ");
        int tamanho = scanner.nextInt();
        scanner.nextLine();

        return new Eletronico(titulo, autores, editora, preco, tamanho);
    }

    public void realizarVenda() {
        if (numVendas >= MAX_VENDAS) {
            System.out.println("Limite de vendas atingido.");
            return;
        }

        System.out.print("Nome do cliente: ");
        String cliente = scanner.nextLine();

        System.out.print("Quantidade de livros para comprar: ");
        int quantidade = scanner.nextInt();
        scanner.nextLine();

        Venda venda = new Venda(quantidade, cliente);

        for (int i = 0; i < quantidade; i++) {
            System.out.println("Tipo de livro (1-Impresso, 2-Eletronico): ");
            int tipo = scanner.nextInt();
            scanner.nextLine();

            if (tipo == 1 && numImpressos > 0) {
                listarLivrosImpressos();
                System.out.print("Escolha o índice do livro impresso: ");
                int index = scanner.nextInt();
                scanner.nextLine();

                if (index >= 0 && index < numImpressos) {
                    Impresso livro = impressos[index];
                    if (livro.getEstoque() > 0) {
                        venda.addLivro(livro, i);
                    } else {
                        System.out.println("Estoque insuficiente para o livro selecionado.");
                        i--;
                    }
                } else {
                    System.out.println("Índice inválido.");
                    i--;
                }
            } else if (tipo == 2 && numEletronicos > 0) {
                listarLivrosEletronicos();
                System.out.print("Escolha o índice do livro eletrônico: ");
                int index = scanner.nextInt();
                scanner.nextLine();

                if (index >= 0 && index < numEletronicos) {
                    Eletronico livro = eletronicos[index];
                    venda.addLivro(livro, i);
                } else {
                    System.out.println("Índice inválido.");
                    i--;
                }
            } else {
                System.out.println("Tipo de livro ou quantidade inválida.");
                i--;
            }
        }

        vendas[numVendas++] = venda;
        System.out.println("Venda realizada com sucesso!");

        System.out.println("Pressione Enter para voltar ao menu principal...");
        scanner.nextLine();
    }

    public void listarLivrosImpressos() {
        System.out.println("\n--- Livros Impressos ---");
        for (int i = 0; i < numImpressos; i++) {
            System.out.println(i + ": " + impressos[i]);
        }
    }

    public void listarLivrosEletronicos() {
        System.out.println("\n--- Livros Eletrônicos ---");
        for (int i = 0; i < numEletronicos; i++) {
            System.out.println(i + ": " + eletronicos[i]);
        }
    }

    public void listarLivros() {
        listarLivrosImpressos();
        listarLivrosEletronicos();
    }

    public void listarVendas() {
        System.out.println("\n--- Vendas Realizadas ---");
        for (int i = 0; i < numVendas; i++) {
            System.out.println(vendas[i]);
            vendas[i].listarLivros();
        }
    }

    public static void main(String[] args) {
        LivrariaVirtual livraria = new LivrariaVirtual();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Menu ---");
            System.out.println("1) Cadastrar livro");
            System.out.println("2) Realizar uma venda");
            System.out.println("3) Listar livros");
            System.out.println("4) Listar vendas");
            System.out.println("5) Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    livraria.cadastrarLivro();
                    break;
                case 2:
                    livraria.realizarVenda();
                    break;
                case 3:
                    livraria.listarLivros();
                    break;
                case 4:
                    livraria.listarVendas();
                    break;
                case 5:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}
