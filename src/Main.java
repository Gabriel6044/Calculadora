import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        float PrimeiroNumero;
        float SegundoNumero;
        float resultado;
        int operacao;
        boolean keepRunning = true;

        while(keepRunning) {

            // 0 = soma, 1 = subtração, 2 = multiplicação, 3 = divisão
            System.out.println("Olá! Bem-vindo à calculadora!");
            System.out.println("Selecione a operação desejada:");
            System.out.println("0 - Soma");
            System.out.println("1 - Subtração");
            System.out.println("2 - Multiplicação");
            System.out.println("3 - Divisão");

            operacao = getOperacao(myObj);
            System.out.println("Perfeito! Agora selecione seu primeiro número:");
            PrimeiroNumero = getNumero(myObj);
            System.out.println("Selecione seu segundo número:");
            SegundoNumero = getNumero(myObj);
            System.out.println("Calculando...");

            switch (operacao) {
                case 0: //soma
                    resultado = (PrimeiroNumero) + (SegundoNumero);
                    System.out.println((PrimeiroNumero) + " + " + (SegundoNumero) + " = " + resultado);
                    break;

                case 1: //subtração
                    resultado = (PrimeiroNumero) - (SegundoNumero);
                    System.out.println((PrimeiroNumero) + " - " + (SegundoNumero) + " = " + resultado);
                    break;

                case 2: //multiplicação
                    resultado = (PrimeiroNumero) * (SegundoNumero);
                    System.out.println((PrimeiroNumero) + " * " + (SegundoNumero) + " = " + resultado);
                    break;

                case 3: //divisão
                    if ((SegundoNumero) >= 1 || (SegundoNumero) <= -1) {
                        resultado = (PrimeiroNumero) / (SegundoNumero);
                        System.out.println((PrimeiroNumero) + " ÷ " + (SegundoNumero) + " = " + resultado);
                        System.out.println("Resto: " + (PrimeiroNumero) % (SegundoNumero));
                    } else {
                        System.out.println("Divisão impossível.");
                    }
                    break;
            }

            System.out.println("Deseja realizar outra operação? (s/n)");
            Scanner myAns = new Scanner(System.in);
            String resposta = getResposta(myAns);
            if (resposta.equalsIgnoreCase("n")){
                System.out.println("Obrigado por usar a calculadora");
                keepRunning = false;
            }
        }
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
            float numero;
            numero = myObj.nextFloat();
            return numero;
        }catch (Exception e){
            System.out.println("Número inválido. Tente novamente.");
            myObj.next(); // Limpa o buffer
            return getNumero(myObj);
        }
    }

    private static int getOperacao(Scanner myObj) {
        try {
            int operacao;
            operacao = myObj.nextInt();
            if (operacao < 0 || operacao > 3) {
                throw new Exception("Operação inválida");
            }
            return operacao;
        }catch (Exception e) {
            System.out.println("Operação inválido. Tente novamente.");
            myObj.next(); // Limpa o buffer
            return getOperacao(myObj);
        }
    }


}




