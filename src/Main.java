import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        float primeiro_numero;
        float segundo_numero;
        float resultado;
        int operacao;
        // 0 = soma, 1 = subtração, 2 = multiplicação, 3 = divisão

        System.out.println("Selecione a operação desejada:");
        System.out.println("0 - Soma");
        System.out.println("1 - Subtração");
        System.out.println("2 - Multiplicação");
        System.out.println("3 - Divisão");
        operacao = myObj.nextInt();
        System.out.println("Perfeito! Agora selecione seu primeiro número:");
        primeiro_numero = myObj.nextFloat();
        System.out.println("Selecione seu segundo número:");
        segundo_numero = myObj.nextFloat();
        System.out.println("Calculando...");

        switch (operacao) {
            case 0: //soma
                resultado = (primeiro_numero) + (segundo_numero);
                System.out.println((primeiro_numero) + " + " + (segundo_numero) + " = " + resultado);
                break;

            case 1: //subtração
                resultado = (primeiro_numero) - (segundo_numero);
                System.out.println((primeiro_numero) + " - " + (segundo_numero) + " = " + resultado);
                break;

            case 2: //multiplicação
                resultado = (primeiro_numero) * (segundo_numero);
                System.out.println((primeiro_numero) + " * " + (segundo_numero) + " = " + resultado);
                break;

            case 3: //divisão
                if ((segundo_numero) >= 1 || (segundo_numero) <= -1) {
                    resultado = (primeiro_numero) / (segundo_numero);
                    System.out.println((primeiro_numero) + " ÷ " + (segundo_numero) + " = " + resultado);
                    System.out.println("Resto: " + (primeiro_numero) % (segundo_numero));
                } else {
                    System.out.println("Divisão não permitida.");

                }
                break;

        }
    }
}