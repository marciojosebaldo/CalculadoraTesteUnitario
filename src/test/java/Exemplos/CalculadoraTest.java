package Exemplos;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    Calculadora calculadora = new Calculadora();

    //Sem JUnit para testar, seria conforme abaixo:
    //Método ineficiente porque o teste é maior que o próprio código
    @Test
    void somar() {
        double valorEsperado = 20;
        double resultado = calculadora.somar(10, 10);

        if (valorEsperado == resultado) {
            System.out.println("Teste APROvado");
        } else {
            System.out.println("Teste REprovado");
        }
    }

    //Teste realizado com JUnit
    @Test
    void somarJunit() {
        double valorEsperadoJunit = 20;
        double resultadoJunit = calculadora.somar(10, 10);

        Assertions.assertEquals(valorEsperadoJunit, resultadoJunit);
    }

    // Exemplo de TDD
    // Criado o método primeiro no teste e clica na lâmpada vermelha para criar um método de mesmo nome
    // na classe Calculadora
    @Test
    void testeFuncaoSubtracaoCalculadora(){
        double valorEsperado = 15;
        double resultado = calculadora.subtracao(20, 5);

        Assertions.assertEquals(valorEsperado, resultado);
    }

    @Test
    void testeFuncaoMultiplicacaoCalculadora() {
        double valorEsperado = 4;
        double resultado = calculadora.multiplicacao(2, 2);

        Assertions.assertEquals(valorEsperado, resultado);
    }

    @Test
    void testeFuncaoDivisaoCalculadora() {
        double valorEsperado = 1;
        double resultado = calculadora.divisao(2, 2);

        Assertions.assertEquals(valorEsperado, resultado);
    }

    @Test
    void testeDivisaoPorZero() {
        ArithmeticException erro = Assertions.assertThrows(ArithmeticException.class, () ->
                calculadora.divisao(10, 0));

        Assertions.assertEquals("/ by zero", erro.getMessage());
    }
}