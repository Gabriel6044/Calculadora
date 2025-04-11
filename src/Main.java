import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        float PrimeiroNumero;
        float SegundoNumero;
        float resultado;
        int operacao;

        // 0 = soma, 1 = subtração, 2 = multiplicação, 3 = divisão
        System.out.println("Olá! Bem-vindo à calculadora!");
        System.out.println("Selecione a operação desejada:");
        System.out.println("0 - Soma");
        System.out.println("1 - Subtração");
        System.out.println("2 - Multiplicação");
        System.out.println("3 - Divisão");

        operacao = myObj.nextInt();
        if (operacao < 0 || operacao > 3) {
            System.out.println("Operação inválida.");
            main(args);
        }
        System.out.println("Perfeito! Agora selecione seu primeiro número:");
        PrimeiroNumero = myObj.nextFloat();
        System.out.println("Selecione seu segundo número:");
        SegundoNumero = myObj.nextFloat();
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
                    System.out.println("Divisão não permitida.");
                }
                break;
        }

        System.out.println("Deseja realizar outra operação? (s/n)");
        Scanner myAns = new Scanner(System.in);
        String resposta = myAns.next();
        if (resposta.equalsIgnoreCase("s")) {
            main(args);
        } else if (resposta.equalsIgnoreCase("n")) {
            System.out.println("Obrigado por usar a calculadora!");
        } else {
            System.out.println("Opção inválida.");
        }
    }
}




