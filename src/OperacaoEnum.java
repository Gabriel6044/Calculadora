public enum OperacaoEnum {
    SOMA(0),
    SUBTRACAO(1),
    DIVISAO(2),
    MULTIPLICACAO(3);

    final int operadores;
    OperacaoEnum(int operadores){
    this.operadores = operadores;
    }
    public int getOperadores(){
        return this.operadores;
    }
}
