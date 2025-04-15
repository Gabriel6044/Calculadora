import java.util.Scanner;

public class Calculadora {

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

    public static int getOperacao() {
        return operacao;
    }

    public static void setOperacao(int operacao) {
        Calculadora.operacao = operacao;
    }

    static float getOperacoes(int operacao, float PrimeiroNumero, float SegundoNumero, float anterior) {
        float resultado;
        switch (operacao) {
            case 0: //soma
                resultado = PrimeiroNumero + SegundoNumero;
                anterior = resultado;
                System.out.println(PrimeiroNumero + " + " + SegundoNumero + " = " + resultado);
                break;

            case 1: //subtração
                resultado = PrimeiroNumero - SegundoNumero;
                anterior = resultado;
                System.out.println(PrimeiroNumero + " - " + SegundoNumero + " = " + resultado);
                break;

            case 2: //multiplicação
                resultado = PrimeiroNumero * SegundoNumero;
                anterior = resultado;
                System.out.println(PrimeiroNumero + " * " + SegundoNumero + " = " + resultado);
                break;

            case 3: //divisão
                if (SegundoNumero >= 1 || SegundoNumero <= -1) {
                    resultado = PrimeiroNumero / SegundoNumero;
                    anterior = resultado;
                    System.out.println(PrimeiroNumero + " ÷ " + SegundoNumero + " = " + resultado);
                    System.out.println("Resto: " + PrimeiroNumero % SegundoNumero);
                } else {
                    System.out.println("Divisão impossível.");
                }
                break;
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
            int operacao;
            operacao = objeto.nextInt();
            if (operacao < 0 || operacao > 3) {
                throw new Exception("Operação inválida");
            }
            return operacao;
        } catch (Exception e) {
            System.out.println("Operação inválida. Tente novamente.");
            objeto.next(); // Limpa o buffer
            return getOperacao(objeto);
        }
    }

}


