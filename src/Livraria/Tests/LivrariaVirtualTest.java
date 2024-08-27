package src.Livraria.Tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import src.Livraria.LivrariaVirtual;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

class LivrariaVirtualTest {

    private LivrariaVirtual livraria;

    @BeforeEach
    void setUp() {
        livraria = new LivrariaVirtual();
    }

    @Test
    void testCadastrarLivroImpresso() {
        String input = "1\nJava Programming\nJohn Doe\nTechBooks\n29.99\n5.50\n10\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        livraria.cadastrarLivro();

        String output = outContent.toString();
        assertTrue(output.contains("Cadastro de Livro Impresso:"));
    }

    @Test
    void testCadastrarLivroEletronico() {
        String input = "2\nJavaScript Essentials\nJane Smith\nWebBooks\n39.99\n1024\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        livraria.cadastrarLivro();

        String output = outContent.toString();
        assertTrue(output.contains("Cadastro de Livro Eletronico:"));
    }

    @Test
    void testRealizarVenda() {
        String input = "1\nJava Programming\nJohn Doe\nTechBooks\n29.99\n5.50\n10\n" +
                "2\nJavaScript Essentials\nJane Smith\nWebBooks\n39.99\n1024\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        livraria.cadastrarLivro();
        livraria.cadastrarLivro();

        String vendaInput = "John Doe\n2\n1\n0\n2\n1\n";
        in = new ByteArrayInputStream(vendaInput.getBytes());
        System.setIn(in);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        livraria.realizarVenda();

        String output = outContent.toString();
        assertTrue(output.contains("Venda realizada com sucesso!"));
    }

    @Test
    void testListarLivros() {
        String input = "1\nJava Programming\nJohn Doe\nTechBooks\n29.99\n5.50\n10\n" +
                "2\nJavaScript Essentials\nJane Smith\nWebBooks\n39.99\n1024\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        livraria.cadastrarLivro();
        livraria.cadastrarLivro();

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        livraria.listarLivros();

        String output = outContent.toString();
        assertTrue(output.contains("Java Programming"));
        assertTrue(output.contains("JavaScript Essentials"));
    }

    @Test
    void testListarVendas() {
        String input = "1\nJava Programming\nJohn Doe\nTechBooks\n29.99\n5.50\n10\n" +
                "2\nJavaScript Essentials\nJane Smith\nWebBooks\n39.99\n1024\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        livraria.cadastrarLivro();
        livraria.cadastrarLivro();

        String vendaInput = "John Doe\n2\n1\n0\n2\n1\n";
        in = new ByteArrayInputStream(vendaInput.getBytes());
        System.setIn(in);

        livraria.realizarVenda();

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        livraria.listarVendas();

        String output = outContent.toString();
        assertTrue(output.contains("John Doe"));
        assertTrue(output.contains("Java Programming"));
        assertTrue(output.contains("JavaScript Essentials"));
    }
}
