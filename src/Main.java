import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        float PrimeiroNumero;
        float SegundoNumero;
        float NumeroSeguinte;
        float resultado;
        int operacao;
        boolean keepRunning = true;

        while (keepRunning) {
            explicacao();

            operacao = getOperacao(myObj);
            System.out.println("Perfeito! Agora selecione seu primeiro número:");
            PrimeiroNumero = getNumero(myObj);
            System.out.println("Selecione seu segundo número:");
            SegundoNumero = getNumero(myObj);
            System.out.println("Calculando...");

            switch (operacao) {
                case 0: //soma
                    soma(PrimeiroNumero, SegundoNumero);
                    break;

                case 1: //subtração
                    subtracao(PrimeiroNumero, SegundoNumero);
                    break;

                case 2: //multiplicação
                    multiplicacao(PrimeiroNumero, SegundoNumero);
                    break;

                case 3: //divisão
                    divisao(SegundoNumero, PrimeiroNumero);
                    break;
            }

            System.out.println("Deseja realizar outra operação? (s/n)");
            Scanner myAns = new Scanner(System.in);
            String resposta = getResposta(myAns);
            if (resposta.equalsIgnoreCase("n")) {
                System.out.println("Obrigado por usar a calculadora");
                keepRunning = false;
            }

            System.out.println("Manter resultados anteriores? (s/n)");
            Scanner myAns2 = new Scanner(System.in);
            String resposta2 = getResposta(myAns2);
            if (resposta2.equalsIgnoreCase("n")) {
                main(args); // Reinicia o programa
            }
            System.out.println("Perfeito! Vamos continuar com os resultados anteriores.");
            PrimeiroNumero = resultado;
        }
    }

    private static void divisao(float SegundoNumero, float PrimeiroNumero) {
        float resultado;
        if (SegundoNumero >= 1 || SegundoNumero <= -1) {
            resultado = PrimeiroNumero / SegundoNumero;
            System.out.println(PrimeiroNumero + " ÷ " + SegundoNumero + " = " + resultado);
            System.out.println("Resto: " + PrimeiroNumero % SegundoNumero);
        } else {
            System.out.println("Divisão impossível.");
        }
    }

    private static void multiplicacao(float PrimeiroNumero, float SegundoNumero) {
        float resultado;
        resultado = PrimeiroNumero * SegundoNumero;
        System.out.println(PrimeiroNumero + " * " + SegundoNumero + " = " + resultado);
    }

    private static void subtracao(float PrimeiroNumero, float SegundoNumero) {
        float resultado;
        resultado = PrimeiroNumero - SegundoNumero;
        System.out.println(PrimeiroNumero + " - " + SegundoNumero + " = " + resultado);
    }

    private static void soma(float PrimeiroNumero, float SegundoNumero) {
        float resultado;
        resultado = PrimeiroNumero + SegundoNumero;
        System.out.println(PrimeiroNumero + " + " + SegundoNumero + " = " + resultado);
    }

    private static void explicacao() {
        System.out.println("Olá! Bem-vindo à calculadora!");
        System.out.println("Selecione a operação desejada:");
        System.out.println("0 - Soma");
        System.out.println("1 - Subtração");
        System.out.println("2 - Multiplicação");
        System.out.println("3 - Divisão");
    }

    private static String getResposta(Scanner myAns) {
        String resposta = myAns.next();
        if (resposta.equalsIgnoreCase("s") || resposta.equalsIgnoreCase("n")) {
            return resposta;
        } else {
            System.out.println("Resposta inválida. Tente novamente.");
            return getResposta(myAns);
        }
    }

    private static float getNumero(Scanner myObj) {
        try {
            return myObj.nextFloat();
        } catch (Exception e) {
            System.out.println("Número inválido. Tente novamente.");
            myObj.next(); // Limpa o buffer
            return getNumero(myObj);
        }
    }

    private static int getOperacao(Scanner objeto) {
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




