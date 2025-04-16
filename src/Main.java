import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Olá! Bem-vindo à calculadora!");
        calculadora.explicacao();
        calculadora.readOperacao(scanner);
        System.out.println(calculadora.operacao);
        System.out.println("Perfeito! Agora selecione seu primeiro número:");
        calculadora.setPrimeiroNumero(calculadora.getNumero(scanner));
        System.out.println("Selecione seu segundo número:");
        calculadora.setSegundoNumero(calculadora.getNumero(scanner));
        System.out.println("Calculando...");

        calculadora.setAnterior(calculadora.getOperacoes(calculadora.getPrimeiroNumero(), calculadora.getSegundoNumero(), calculadora.getAnterior()));

        while (true) {
            System.out.println("Deseja realizar outra operação? (s/n)");
            Scanner myAns = new Scanner(System.in);
            String resposta = calculadora.getResposta(myAns);
            if (resposta.equalsIgnoreCase("n")) {
                System.exit(0);
            }

            System.out.println("Manter resultados anteriores? (s/n)");
            Scanner myAns2 = new Scanner(System.in);
            String resposta2 = calculadora.getResposta(myAns2);
            if (resposta2.equalsIgnoreCase("n")) {
                main(args); // Reinicia o programa
            }

            System.out.println("Perfeito! Vamos continuar com os resultados anteriores.");
            calculadora.explicacao();
            calculadora.readOperacao(scanner);
            System.out.println("Selecione seu próximo número:");
            calculadora.setPrimeiroNumero(calculadora.getAnterior());
            calculadora.setSegundoNumero(calculadora.getNumero(scanner));

            calculadora.setAnterior(calculadora.getOperacoes(calculadora.getPrimeiroNumero(), calculadora.getSegundoNumero(), calculadora.getAnterior()));
        }
    }

}
