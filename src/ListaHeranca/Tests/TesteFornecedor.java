package src.ListaHeranca.Tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import src.ListaHeranca.Fornecedor;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TesteFornecedor {

    private Fornecedor fornecedor;

    @BeforeEach
    public void setUp() {
        fornecedor = new Fornecedor("João Silva", "Rua das Flores, 123", "9999-9999", 50000.0, 10000.0);
    }

    @Test
    public void testGetters() {
        assertEquals("João Silva", fornecedor.getNome());
        assertEquals("Rua das Flores, 123", fornecedor.getEndereco());
        assertEquals("9999-9999", fornecedor.getTelefone());
        assertEquals(50000.0, fornecedor.getValorCredito());
        assertEquals(10000.0, fornecedor.getValorDivida());

        System.out.println("Nome: " + fornecedor.getNome());
        System.out.println("Endereço: " + fornecedor.getEndereco());
        System.out.println("Telefone: " + fornecedor.getTelefone());
        System.out.println("Valor Crédito: " + fornecedor.getValorCredito());
        System.out.println("Valor Dívida: " + fornecedor.getValorDivida());
    }

    @Test
    public void testObterSaldo() {
        assertEquals(40000.0, fornecedor.obterSaldo());
        System.out.println("Saldo Inicial: " + fornecedor.obterSaldo());
    }

    @Test
    public void testSettersAndUpdatedSaldo() {
        fornecedor.setValorCredito(60000.0);
        fornecedor.setValorDivida(20000.0);

        assertEquals(60000.0, fornecedor.getValorCredito());
        assertEquals(20000.0, fornecedor.getValorDivida());
        assertEquals(40000.0, fornecedor.obterSaldo());

        System.out.println("\nApós atualização:");
        System.out.println("Valor Crédito: " + fornecedor.getValorCredito());
        System.out.println("Valor Dívida: " + fornecedor.getValorDivida());
        System.out.println("Saldo: " + fornecedor.obterSaldo());
    }
}
