import java.util.Scanner;

public class Calculadora {
    private float primeiroNumero;
    private float segundoNumero;
    private float anterior;
    OperacaoEnum operacao;

    public float getPrimeiroNumero() {
        return primeiroNumero;
    }

    public void setPrimeiroNumero(float primeiroNumero) {
        this.primeiroNumero = primeiroNumero;
    }

    public float getSegundoNumero() {
        return segundoNumero;
    }

    public void setSegundoNumero(float segundoNumero) {
        this.segundoNumero = segundoNumero;
    }

    public float getAnterior() {
        return anterior;
    }

    public void setAnterior(float anterior) {
        this.anterior = anterior;
    }

    public void setOperacao(OperacaoEnum operacao) {
        this.operacao = operacao;
    }

    public void readOperacao(Scanner scanner){
        try{
            int escrita = scanner.nextInt();
            if (escrita < 0 || escrita > 3) {
                throw new Exception("Operação inválida");
            }
            // Atribui o valor da operação correspondente
            this.operacao = OperacaoEnum.fromValor(escrita);
        } catch (Exception e) {
            System.out.println("Operação inválida. Tente novamente.");
            scanner.next(); // Limpa o buffer
            readOperacao(scanner);
        }
    }

    float getOperacoes(float PrimeiroNumero, float SegundoNumero, float anterior) {
        float resultado;
        switch (operacao) {
            case SOMA:
                resultado = PrimeiroNumero + SegundoNumero;
                anterior = resultado;
                System.out.println(PrimeiroNumero + " + " + SegundoNumero + " = " + resultado);
                break;

            case SUBTRACAO:
                resultado = PrimeiroNumero - SegundoNumero;
                anterior = resultado;
                System.out.println(PrimeiroNumero + " - " + SegundoNumero + " = " + resultado);
                break;

            case MULTIPLICACAO:
                resultado = PrimeiroNumero * SegundoNumero;
                anterior = resultado;
                System.out.println(PrimeiroNumero + " * " + SegundoNumero + " = " + resultado);
                break;

            case DIVISAO:
                if (SegundoNumero >= 1 || SegundoNumero <= -1) {
                    resultado = PrimeiroNumero / SegundoNumero;
                    anterior = resultado;
                    System.out.println(PrimeiroNumero + " ÷ " + SegundoNumero + " = " + resultado);
                    System.out.println("Resto: " + PrimeiroNumero % SegundoNumero);

                } else {
                    System.out.println("Divisão impossível.");
                    return 0; // Retorna 0 se a divisão for impossível
                }
        }
        return anterior;
    }

    void explicacao() {
        System.out.println("Selecione a operação desejada:");
        for (OperacaoEnum operacao : OperacaoEnum.values()) {
            System.out.println(operacao.getValor() + " - " + operacao.getDescricao());
        }
    }

    String getResposta(Scanner myAns) {
        String resposta = myAns.next();
        if (resposta.equalsIgnoreCase("s") || resposta.equalsIgnoreCase("n")) {
            return resposta;
        } else {
            System.out.println("Resposta inválida. Tente novamente.");
            return getResposta(myAns);
        }
    }

    float getNumero(Scanner myObj) {
        try {
            return myObj.nextFloat();
        } catch (Exception e) {
            System.out.println("Número inválido. Tente novamente.");
            myObj.next(); // Limpa o buffer
            return getNumero(myObj);
        }
    }

    public OperacaoEnum getOperacao() {
        return operacao;
    }

}






