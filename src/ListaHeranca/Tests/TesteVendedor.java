package src.ListaHeranca.Tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import src.ListaHeranca.Vendedor;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TesteVendedor {

    private Vendedor vendedor;

    @BeforeEach
    public void setUp() {
        vendedor = new Vendedor("Ana Martins", "Avenida Comercial, 789", "5555-5555", 404, 3000.0, 10.0, 50000.0, 5.0);
    }

    @Test
    public void testGetters() {
        assertEquals("Ana Martins", vendedor.getNome());
        assertEquals("Avenida Comercial, 789", vendedor.getEndereco());
        assertEquals("5555-5555", vendedor.getTelefone());
        assertEquals(404, vendedor.getCodigoSetor());
        assertEquals(3000.0, vendedor.getSalarioBase());
        assertEquals(10.0, vendedor.getImposto());
        assertEquals(50000.0, vendedor.getValorVendas());
        assertEquals(5.0, vendedor.getComissao());

        System.out.println("Nome: " + vendedor.getNome());
        System.out.println("Endereço: " + vendedor.getEndereco());
        System.out.println("Telefone: " + vendedor.getTelefone());
        System.out.println("Código do Setor: " + vendedor.getCodigoSetor());
        System.out.println("Salário Base: " + vendedor.getSalarioBase());
        System.out.println("Imposto: " + vendedor.getImposto() + "%");
        System.out.println("Valor das Vendas: " + vendedor.getValorVendas());
        System.out.println("Comissão: " + vendedor.getComissao() + "%");
    }

    @Test
    public void testCalcularSalario() {
        assertEquals(5200.0, vendedor.calcularSalario());
        System.out.println("Salário Líquido: " + vendedor.calcularSalario());
    }

    @Test
    public void testSettersAndUpdatedSalario() {
        vendedor.setValorVendas(80000.0);
        vendedor.setComissao(7.0);

        assertEquals(80000.0, vendedor.getValorVendas());
        assertEquals(7.0, vendedor.getComissao());
        assertEquals(8300.0, vendedor.calcularSalario());

        System.out.println("\nApós atualização:");
        System.out.println("Valor das Vendas: " + vendedor.getValorVendas());
        System.out.println("Comissão: " + vendedor.getComissao() + "%");
        System.out.println("Salário Líquido: " + vendedor.calcularSalario());
    }
}
