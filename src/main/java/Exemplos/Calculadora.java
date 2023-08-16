package Exemplos;

public class Calculadora {

    public double somar(double x, double y) {
        return x + y;
    }

    public double subtracao(double x, double y) {
        return x - y;
    }

    public double multiplicacao(double x, double y) {
        return x * y;
    }

    public double divisao(double x, double y) {
        if (y == 0) {
            throw new ArithmeticException("/ by zero");
        }
        return x / y;
    }
}