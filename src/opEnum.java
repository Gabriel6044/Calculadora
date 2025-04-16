public enum opEnum {
    SOMA(0),
    SUBTRACAO(1),
    DIVISAO(2),
    MULTIPLICACAO(3);

    private final int valor;

    opEnum(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return this.valor;
    }
}
