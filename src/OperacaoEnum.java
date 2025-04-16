public enum OperacaoEnum {
    SOMA(0, "Soma"),
    SUBTRACAO(1, "Subtração"),
    MULTIPLICACAO(2, "Multiplicação"),
    DIVISAO(3, "Divisão");

    private final int valor;
    private final String descricao;

    OperacaoEnum(int valor, String descricao) {
        this.valor = valor;
        this.descricao = descricao;
    }

    public int getValor() {
        return this.valor;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public static OperacaoEnum fromValor(int valor) {
        for (OperacaoEnum operacao : OperacaoEnum.values()) {
            if (operacao.getValor() == valor) {
                return operacao;
            }
        }
        throw new IllegalArgumentException("Operação inválida: " + valor);
    }


}
