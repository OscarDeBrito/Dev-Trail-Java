package src.ListaHeranca.Tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import src.ListaHeranca.Operario;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TesteOperario {

    private Operario operario;

    @BeforeEach
    public void setUp() {
        operario = new Operario("José da Silva", "Rua dos Trabalhadores, 321", "6666-6666", 303, 2500.0, 10.0, 20000.0, 5.0);
    }

    @Test
    public void testGetters() {
        assertEquals("José da Silva", operario.getNome());
        assertEquals("Rua dos Trabalhadores, 321", operario.getEndereco());
        assertEquals("6666-6666", operario.getTelefone());
        assertEquals(303, operario.getCodigoSetor());
        assertEquals(2500.0, operario.getSalarioBase());
        assertEquals(10.0, operario.getImposto());
        assertEquals(20000.0, operario.getValorProducao());
        assertEquals(5.0, operario.getComissao());

        System.out.println("Nome: " + operario.getNome());
        System.out.println("Endereço: " + operario.getEndereco());
        System.out.println("Telefone: " + operario.getTelefone());
        System.out.println("Código do Setor: " + operario.getCodigoSetor());
        System.out.println("Salário Base: " + operario.getSalarioBase());
        System.out.println("Imposto: " + operario.getImposto() + "%");
        System.out.println("Valor Produção: " + operario.getValorProducao());
        System.out.println("Comissão: " + operario.getComissao() + "%");
    }

    @Test
    public void testCalcularSalario() {
        assertEquals(3250.0, operario.calcularSalario());
        System.out.println("Salário Líquido: " + operario.calcularSalario());
    }

    @Test
    public void testSettersAndUpdatedSalario() {
        operario.setValorProducao(30000.0);
        operario.setComissao(10.0);

        assertEquals(30000.0, operario.getValorProducao());
        assertEquals(10.0, operario.getComissao());
        assertEquals(5250.0, operario.calcularSalario());

        System.out.println("\nApós atualização:");
        System.out.println("Valor Produção: " + operario.getValorProducao());
        System.out.println("Comissão: " + operario.getComissao() + "%");
        System.out.println("Salário Líquido: " + operario.calcularSalario());
    }
}
