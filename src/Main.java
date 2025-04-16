import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Olá! Bem-vindo à calculadora!");
        Calculadora.explicacao();
        Calculadora.setOperacao(Calculadora.getOperacao(myObj));
        System.out.println("Perfeito! Agora selecione seu primeiro número:");
        Calculadora.setPrimeiroNumero(Calculadora.getNumero(myObj));
        System.out.println("Selecione seu segundo número:");
        Calculadora.setSegundoNumero(Calculadora.getNumero(myObj));
        System.out.println("Calculando...");

        Calculadora.setAnterior(Calculadora.getOperacoes(Calculadora.getPrimeiroNumero(), Calculadora.getSegundoNumero(), Calculadora.getAnterior()));

        while (true) {
            System.out.println("Deseja realizar outra operação? (s/n)");
            Scanner myAns = new Scanner(System.in);
            String resposta = Calculadora.getResposta(myAns);
            if (resposta.equalsIgnoreCase("n")) {
                System.exit(0);
            }

            System.out.println("Manter resultados anteriores? (s/n)");
            Scanner myAns2 = new Scanner(System.in);
            String resposta2 = Calculadora.getResposta(myAns2);
            if (resposta2.equalsIgnoreCase("n")) {
                main(args); // Reinicia o programa
            }


            System.out.println("Perfeito! Vamos continuar com os resultados anteriores.");
            Calculadora.explicacao();
            Calculadora.setOperacao(Calculadora.getOperacao(myObj));
            System.out.println("Selecione seu próximo número:");
            Calculadora.setPrimeiroNumero(Calculadora.getAnterior());
            Calculadora.setSegundoNumero(Calculadora.getNumero(myObj));

            Calculadora.setAnterior(Calculadora.getOperacoes(Calculadora.getPrimeiroNumero(), Calculadora.getSegundoNumero(), Calculadora.getAnterior()));
        }
    }

}
