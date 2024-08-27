package src.ListaHeranca.Tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import src.ListaHeranca.Pessoa;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestePessoa {

    private Pessoa pessoa;

    @BeforeEach
    public void setUp() {
        pessoa = new Pessoa();
    }

    @Test
    public void testConstrutorPadrao() {
        assertEquals("", pessoa.getNome());
        assertEquals("", pessoa.getEndereco());
        assertEquals("", pessoa.getTelefone());

        System.out.println("Construtor padrão:");
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Endereço: " + pessoa.getEndereco());
        System.out.println("Telefone: " + pessoa.getTelefone());
    }

    @Test
    public void testConstrutorCompleto() {
        pessoa = new Pessoa("João Silva", "Rua das Flores, 123", "9999-9999");
        assertEquals("João Silva", pessoa.getNome());
        assertEquals("Rua das Flores, 123", pessoa.getEndereco());
        assertEquals("9999-9999", pessoa.getTelefone());

        System.out.println("Construtor completo:");
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Endereço: " + pessoa.getEndereco());
        System.out.println("Telefone: " + pessoa.getTelefone());
    }

    @Test
    public void testConstrutorNomeTelefone() {
        pessoa = new Pessoa("Maria Souza", "8888-8888");
        assertEquals("Maria Souza", pessoa.getNome());
        assertEquals("", pessoa.getEndereco());
        assertEquals("8888-8888", pessoa.getTelefone());

        System.out.println("Construtor nome e telefone:");
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Endereço: " + pessoa.getEndereco());
        System.out.println("Telefone: " + pessoa.getTelefone());
    }

    @Test
    public void testSetters() {
        pessoa.setNome("Carlos Pereira");
        pessoa.setEndereco("Avenida Central, 456");
        pessoa.setTelefone("7777-7777");

        assertEquals("Carlos Pereira", pessoa.getNome());
        assertEquals("Avenida Central, 456", pessoa.getEndereco());
        assertEquals("7777-7777", pessoa.getTelefone());

        System.out.println("Setters:");
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Endereço: " + pessoa.getEndereco());
        System.out.println("Telefone: " + pessoa.getTelefone());
    }
}
