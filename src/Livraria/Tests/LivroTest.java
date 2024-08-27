package src.Livraria.Tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import src.Livraria.Livro;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LivroTest {

    private Livro livro;

    // Classe concreta temporária para testar a classe abstrata Livro
    private static class LivroConcreto extends Livro {
        public LivroConcreto(String titulo, String autores, String editora, double preco) {
            super(titulo, autores, editora, preco);
        }
    }

    @BeforeEach
    void setUp() {
        livro = new LivroConcreto("The Art of Computer Programming", "Donald Knuth", "Addison-Wesley", 199.99);
    }

    @Test
    void testGetTitulo() {
        assertEquals("The Art of Computer Programming", livro.getTitulo());
    }

    @Test
    void testSetTitulo() {
        livro.setTitulo("Introduction to Algorithms");
        assertEquals("Introduction to Algorithms", livro.getTitulo());
    }

    @Test
    void testGetAutores() {
        assertEquals("Donald Knuth", livro.getAutores());
    }

    @Test
    void testSetAutores() {
        livro.setAutores("Thomas H. Cormen, Charles E. Leiserson, Ronald L. Rivest, Clifford Stein");
        assertEquals("Thomas H. Cormen, Charles E. Leiserson, Ronald L. Rivest, Clifford Stein", livro.getAutores());
    }

    @Test
    void testGetEditora() {
        assertEquals("Addison-Wesley", livro.getEditora());
    }

    @Test
    void testSetEditora() {
        livro.setEditora("MIT Press");
        assertEquals("MIT Press", livro.getEditora());
    }

    @Test
    void testGetPreco() {
        assertEquals(199.99, livro.getPreco(), 0.01);
    }

    @Test
    void testSetPreco() {
        livro.setPreco(149.99);
        assertEquals(149.99, livro.getPreco(), 0.01);
    }

    @Test
    void testToString() {
        String expected = "Livro{titulo='The Art of Computer Programming', autores='Donald Knuth', editora='Addison-Wesley', preco=199.99}";
        assertEquals(expected, livro.toString());
    }
}
