package src.ListaHeranca.Tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import src.ListaHeranca.Administrador;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TesteAdministrador {

    private Administrador administrador;

    @BeforeEach
    public void setUp() {
        administrador = new Administrador("Carlos Pereira", "Rua dos Gerânios, 789", "7777-7777", 202, 8000.0, 20.0, 1500.0);
    }

    @Test
    public void testGetters() {
        assertEquals("Carlos Pereira", administrador.getNome());
        assertEquals("Rua dos Gerânios, 789", administrador.getEndereco());
        assertEquals("7777-7777", administrador.getTelefone());
        assertEquals(202, administrador.getCodigoSetor());
        assertEquals(8000.0, administrador.getSalarioBase());
        assertEquals(20.0, administrador.getImposto());
        assertEquals(1500.0, administrador.getAjudaDeCusto());

        System.out.println("Nome: " + administrador.getNome());
        System.out.println("Endereço: " + administrador.getEndereco());
        System.out.println("Telefone: " + administrador.getTelefone());
        System.out.println("Código do Setor: " + administrador.getCodigoSetor());
        System.out.println("Salário Base: " + administrador.getSalarioBase());
        System.out.println("Imposto: " + administrador.getImposto() + "%");
        System.out.println("Ajuda de Custo: " + administrador.getAjudaDeCusto());
    }

    @Test
    public void testCalcularSalario() {
        assertEquals(7900.0, administrador.calcularSalario());
        System.out.println("Salário Líquido: " + administrador.calcularSalario());
    }

    @Test
    public void testSettersAndUpdatedSalario() {
        administrador.setAjudaDeCusto(2000.0);
        administrador.setSalarioBase(9000.0);

        assertEquals(9000.0, administrador.getSalarioBase());
        assertEquals(2000.0, administrador.getAjudaDeCusto());
        assertEquals(9200.0, administrador.calcularSalario());

        System.out.println("\nApós atualização:");
        System.out.println("Salário Base: " + administrador.getSalarioBase());
        System.out.println("Ajuda de Custo: " + administrador.getAjudaDeCusto());
        System.out.println("Salário Líquido: " + administrador.calcularSalario());
    }
}
