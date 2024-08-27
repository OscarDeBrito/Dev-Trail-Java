package src.Livraria.Tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import src.Livraria.Impresso;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ImpressoTest {

    private Impresso impresso;

    @BeforeEach
    void setUp() {
        impresso = new Impresso("Clean Code", "Robert C. Martin", "Prentice Hall", 49.99, 10.50f, 100);
    }

    @Test
    void testGetFrete() {
        assertEquals(10.50f, impresso.getFrete(), 0.01);
    }

    @Test
    void testSetFrete() {
        impresso.setFrete(15.75f);
        assertEquals(15.75f, impresso.getFrete(), 0.01);
    }

    @Test
    void testGetEstoque() {
        assertEquals(100, impresso.getEstoque());
    }

    @Test
    void testSetEstoque() {
        impresso.setEstoque(50);
        assertEquals(50, impresso.getEstoque());
    }

    @Test
    void testAtualizarEstoque_Success() {
        impresso.atualizarEstoque();
        assertEquals(99, impresso.getEstoque());
    }

    @Test
    void testAtualizarEstoque_Insufficient() {
        impresso.setEstoque(0);
        impresso.atualizarEstoque();
        assertEquals(0, impresso.getEstoque());
    }

    @Test
    void testGetTitulo() {
        assertEquals("Clean Code", impresso.getTitulo());
    }

    @Test
    void testSetTitulo() {
        impresso.setTitulo("The Pragmatic Programmer");
        assertEquals("The Pragmatic Programmer", impresso.getTitulo());
    }

    @Test
    void testGetAutores() {
        assertEquals("Robert C. Martin", impresso.getAutores());
    }

    @Test
    void testSetAutores() {
        impresso.setAutores("Andrew Hunt, David Thomas");
        assertEquals("Andrew Hunt, David Thomas", impresso.getAutores());
    }

    @Test
    void testGetEditora() {
        assertEquals("Prentice Hall", impresso.getEditora());
    }

    @Test
    void testSetEditora() {
        impresso.setEditora("Addison-Wesley");
        assertEquals("Addison-Wesley", impresso.getEditora());
    }

    @Test
    void testGetPreco() {
        assertEquals(49.99, impresso.getPreco(), 0.01);
    }

    @Test
    void testSetPreco() {
        impresso.setPreco(59.99);
        assertEquals(59.99, impresso.getPreco(), 0.01);
    }

    @Test
    void testToString() {
        String expected = "Livro{titulo='Clean Code', autores='Robert C. Martin', editora='Prentice Hall', preco=49.99}, Frete: 10.5, Estoque: 100";
        assertEquals(expected, impresso.toString());
    }
}
