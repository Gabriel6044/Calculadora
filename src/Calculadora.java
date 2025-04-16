import java.util.Scanner;

public class Calculadora {

    static opEnum opSoma = opEnum.SOMA;
    static opEnum opSubtracao = opEnum.SUBTRACAO;
    static opEnum opMultiplicacao = opEnum.MULTIPLICACAO;
    static opEnum opDivisao = opEnum.DIVISAO;


    static float PrimeiroNumero;
    static float SegundoNumero;
    static float anterior;
    static int operacao;

    public static float getPrimeiroNumero() {
        return PrimeiroNumero;
    }

    public static void setPrimeiroNumero(float primeiroNumero) {
        PrimeiroNumero = primeiroNumero;
    }

    public static float getSegundoNumero() {
        return SegundoNumero;
    }

    public static void setSegundoNumero(float segundoNumero) {
        SegundoNumero = segundoNumero;
    }

    public static float getAnterior() {
        return anterior;
    }

    public static void setAnterior(float anterior) {
        Calculadora.anterior = anterior;
    }

    public static void setOperacao(int operacao) {
        Calculadora.operacao = operacao;
    }

    static float getOperacoes(float PrimeiroNumero, float SegundoNumero, float anterior) {
        float resultado;
        if (operacao == opSoma.getValor()) {
            resultado = PrimeiroNumero + SegundoNumero;
            anterior = resultado;
            System.out.println(PrimeiroNumero + " + " + SegundoNumero + " = " + resultado);

        } else if (operacao == opSubtracao.getValor()) {
            resultado = PrimeiroNumero - SegundoNumero;
            anterior = resultado;
            System.out.println(PrimeiroNumero + " - " + SegundoNumero + " = " + resultado);

        } else if (operacao == opMultiplicacao.getValor()) {
            resultado = PrimeiroNumero * SegundoNumero;
            anterior = resultado;
            System.out.println(PrimeiroNumero + " * " + SegundoNumero + " = " + resultado);

        } else if (operacao == opDivisao.getValor()) {
            if (SegundoNumero >= 1 || SegundoNumero <= -1) {
                resultado = PrimeiroNumero / SegundoNumero;
                anterior = resultado;
                System.out.println(PrimeiroNumero + " ÷ " + SegundoNumero + " = " + resultado);
                System.out.println("Resto: " + PrimeiroNumero % SegundoNumero);

            } else {
                System.out.println("Divisão impossível.");
            }
        }
        return anterior;
    }

    static void explicacao() {
        System.out.println("Selecione a operação desejada:");
        System.out.println("0 - Soma");
        System.out.println("1 - Subtração");
        System.out.println("2 - Multiplicação");
        System.out.println("3 - Divisão");
    }

    static String getResposta(Scanner myAns) {
        String resposta = myAns.next();
        if (resposta.equalsIgnoreCase("s") || resposta.equalsIgnoreCase("n")) {
            return resposta;
        } else {
            System.out.println("Resposta inválida. Tente novamente.");
            return getResposta(myAns);
        }
    }

    static float getNumero(Scanner myObj) {
        try {
            return myObj.nextFloat();
        } catch (Exception e) {
            System.out.println("Número inválido. Tente novamente.");
            myObj.next(); // Limpa o buffer
            return getNumero(myObj);
        }
    }

    static int getOperacao(Scanner objeto) {
        try {
            int escrita;
            escrita = objeto.nextInt();
            if (escrita < 0 || escrita > 3) {
                throw new Exception("Operação inválida");
            }
            // Atribui o valor da operação correspondente
            if (escrita == 0) {
                return operacao = opSoma.getValor();
            } else if (escrita == 1) {
                return operacao = opSubtracao.getValor();
            } else if (escrita == 2) {
                return operacao = opMultiplicacao.getValor();
            } else {
                return operacao = opDivisao.getValor();
            }

        } catch (Exception e) {
            System.out.println("Operação inválida. Tente novamente.");
            objeto.next(); // Limpa o buffer
            return getOperacao(objeto);
        }
    }

}






