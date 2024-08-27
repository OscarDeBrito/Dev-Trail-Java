package src.Livraria.Tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import src.Livraria.Eletronico;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EletronicoTest {

    private Eletronico eletronico;

    @BeforeEach
    void setUp() {
        eletronico = new Eletronico("Java Programming", "John Doe", "TechBooks", 29.99, 1024);
    }

    @Test
    void testGetTamanho() {
        assertEquals(1024, eletronico.getTamanho());
    }

    @Test
    void testSetTamanho() {
        eletronico.setTamanho(2048);
        assertEquals(2048, eletronico.getTamanho());
    }

    @Test
    void testGetTitulo() {
        assertEquals("Java Programming", eletronico.getTitulo());
    }

    @Test
    void testSetTitulo() {
        eletronico.setTitulo("Advanced Java Programming");
        assertEquals("Advanced Java Programming", eletronico.getTitulo());
    }

    @Test
    void testGetAutores() {
        assertEquals("John Doe", eletronico.getAutores());
    }

    @Test
    void testSetAutores() {
        eletronico.setAutores("Jane Smith");
        assertEquals("Jane Smith", eletronico.getAutores());
    }

    @Test
    void testGetEditora() {
        assertEquals("TechBooks", eletronico.getEditora());
    }

    @Test
    void testSetEditora() {
        eletronico.setEditora("ProBooks");
        assertEquals("ProBooks", eletronico.getEditora());
    }

    @Test
    void testGetPreco() {
        assertEquals(29.99, eletronico.getPreco(), 0.01);
    }

    @Test
    void testSetPreco() {
        eletronico.setPreco(39.99);
        assertEquals(39.99, eletronico.getPreco(), 0.01);
    }

    @Test
    void testToString() {
        String expected = "Livro{titulo='Java Programming', autores='John Doe', editora='TechBooks', preco=29.99}, Tamanho: 1024KB";
        assertEquals(expected, eletronico.toString());
    }
}
