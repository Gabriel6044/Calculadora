import com.sun.org.apache.bcel.internal.generic.SWITCH;

public class Main {
    public static void main(String[] args) {

        float numero1;
        float numero2;
        float resultado;
        int operacao;

        operacao = 3; // 0 = soma, 1 = subtração, 2 = multiplicação, 3 = divisão
        numero1 = 11;
        numero2 = 5;

        switch (operacao) {
            case 0: //soma
                resultado = (numero1) + (numero2);
                System.out.println("SOMA!");
                System.out.println((numero1) + " + " + (numero2) + " = ");
                System.out.println("Resultado: " + resultado);
                break;

            case 1: //subtração
                resultado = (numero1) - (numero2);
                System.out.println("SUBTRAÇÃO!");
                System.out.println((numero1) + " - " + (numero2) + " = ");
                System.out.println("Resultado: " + resultado);
                break;

            case 2: //multiplicação
                resultado = (numero1) * (numero2);
                System.out.println("MULTIPLICAÇÃO!");
                System.out.println((numero1) + " * " + (numero2) + " = ");
                System.out.println("Resultado: " + resultado);
                break;

            case 3: //divisão
                resultado = (numero1) / (numero2);
                System.out.println("DIVISÃO!");
                System.out.println((numero1) + " ÷ " + (numero2) + " = ");
                System.out.println("Resultado: " + resultado);
                System.out.println("Resto: " + (numero1) % (numero2));
                break;

        }

    }
}