package src.Livraria.Tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import src.Livraria.Eletronico;
import src.Livraria.Impresso;
import src.Livraria.Venda;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class VendaTest {

    private Venda venda;
    private Impresso livroImpresso;
    private Eletronico livroEletronico;

    @BeforeEach
    void setUp() {
        venda = new Venda(2, "oscar");
        livroImpresso = new Impresso("Clean Code", "Robert C. Martin", "Prentice Hall", 49.99, 10.50f, 100);
        livroEletronico = new Eletronico("Effective Java", "Joshua Bloch", "Addison-Wesley", 29.99, 2048);
    }

    @Test
    void testAddLivro_Impresso() {
        venda.addLivro(livroImpresso, 0);
        assertEquals(49.99f, venda.getValor(), 0.01f);
        assertEquals(99, livroImpresso.getEstoque());
    }

    @Test
    void testAddLivro_Eletronico() {
        venda.addLivro(livroEletronico, 1);
        assertEquals(29.99f, venda.getValor(), 0.01f);
    }

    @Test
    void testAddLivro_InvalidIndex() {
        venda.addLivro(livroImpresso, -1);
        assertEquals(0.0f, venda.getValor(), 0.01f);
    }

    @Test
    void testListarLivros() {
        venda.addLivro(livroImpresso, 0);
        venda.addLivro(livroEletronico, 1);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        venda.listarLivros();

        System.setOut(originalOut);

        String output = outContent.toString();
        assertTrue(output.contains("Clean Code"));
        assertTrue(output.contains("Effective Java"));
    }

    @Test
    void testGetCliente() {
        assertEquals("oscar", venda.getCliente());
    }

    @Test
    void testSetCliente() {
        venda.setCliente("Neto");
        assertEquals("Neto", venda.getCliente());
    }

    @Test
    void testGetNumero() {
        assertEquals(1, venda.getNumero());
    }

    @Test
    void testGetValorInicial() {
        assertEquals(0.0f, venda.getValor(), 0.01f);
    }
}
