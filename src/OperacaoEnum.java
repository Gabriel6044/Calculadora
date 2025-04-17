import java.util.Objects;

public enum OperacaoEnum {
    SOMA("+", "Soma"),
    SUBTRACAO("-", "Subtração"),
    MULTIPLICACAO("*", "Multiplicação"),
    DIVISAO("/", "Divisão");

    private final String simbolo;
    private final String descricao;

    OperacaoEnum(String simbolo, String descricao) {
        this.simbolo = simbolo;
        this.descricao = descricao;
    }

    public String getSimbolo() {
        return this.simbolo;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public static OperacaoEnum fromValor(String simbolo) {
        for (OperacaoEnum operacao : OperacaoEnum.values()) {
            if (Objects.equals(operacao.getSimbolo(), simbolo)) {
                return operacao;
            }
        }
        throw new IllegalArgumentException("Operação inválida: " + simbolo);
    }


}
