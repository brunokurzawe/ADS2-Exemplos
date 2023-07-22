public class Main {
    public static void main(String[] args) {
        try {
            Object valor = "123";
            int numero = (int) valor;
            System.out.println("Número: " + numero);

        } catch (ClassCastException e) {
            System.out.println("Erro: ClassCastException - Conversão inválida.");
        }

        try {
            int numerador = 10;
            int denominador = 0;
            int resultado = numerador / denominador;
            System.out.println("Resultado: " + resultado);

        } catch (ArithmeticException e) {
            System.out.println("Erro: ArithmeticException - Divisão por zero não é permitida.");
        }
    }
}