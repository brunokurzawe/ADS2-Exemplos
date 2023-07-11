public class MainIf {
    public static void main(String[] args) {
        int ano = 2013;

        if (ano < 0) {
            System.out.println("Não é um ano!");
        } else if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            System.out.println("É bissexto!");
        } else {
            System.out.println("Não é bissexto!");
        }
    }
}