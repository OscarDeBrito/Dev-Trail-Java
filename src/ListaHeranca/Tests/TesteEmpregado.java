package src.ListaHeranca.Tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import src.ListaHeranca.Empregado;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TesteEmpregado {

    private Empregado empregado;

    @BeforeEach
    public void setUp() {
        empregado = new Empregado("Maria Souza", "Avenida Central, 456", "8888-8888", 101, 5000.0, 15.0);
    }

    @Test
    public void testGetters() {
        assertEquals("Maria Souza", empregado.getNome());
        assertEquals("Avenida Central, 456", empregado.getEndereco());
        assertEquals("8888-8888", empregado.getTelefone());
        assertEquals(101, empregado.getCodigoSetor());
        assertEquals(5000.0, empregado.getSalarioBase());
        assertEquals(15.0, empregado.getImposto());

        System.out.println("Nome: " + empregado.getNome());
        System.out.println("Endereço: " + empregado.getEndereco());
        System.out.println("Telefone: " + empregado.getTelefone());
        System.out.println("Código do Setor: " + empregado.getCodigoSetor());
        System.out.println("Salário Base: " + empregado.getSalarioBase());
        System.out.println("Imposto: " + empregado.getImposto() + "%");
    }

    @Test
    public void testCalcularSalario() {
        assertEquals(4250.0, empregado.calcularSalario());
        System.out.println("Salário Líquido: " + empregado.calcularSalario());
    }

    @Test
    public void testSettersAndUpdatedSalario() {
        empregado.setSalarioBase(6000.0);
        empregado.setImposto(20.0);

        assertEquals(6000.0, empregado.getSalarioBase());
        assertEquals(20.0, empregado.getImposto());
        assertEquals(4800.0, empregado.calcularSalario());

        System.out.println("\nApós atualização:");
        System.out.println("Salário Base: " + empregado.getSalarioBase());
        System.out.println("Imposto: " + empregado.getImposto() + "%");
        System.out.println("Salário Líquido: " + empregado.calcularSalario());
    }
}
