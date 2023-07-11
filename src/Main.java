public class Main {
    public static void main(String[] args) {
        String texto = "Olá, mundo!";

        // Obtendo o tamanho da String
        int tamanho = texto.length();
        System.out.println("Tamanho da String: " + tamanho);

        // Verificando se a String está vazia
        boolean vazia = texto.isEmpty();
        System.out.println("String está vazia? " + vazia);

        // Concatenando Strings
        String outraString = " Bem-vindo!";
        String resultado = texto + outraString;
        System.out.println("Concatenação: " + resultado);

        // Comparando Strings
        String outraTexto = "Olá, mundo!";
        boolean igual = texto.equals(outraTexto);
        System.out.println("Strings são iguais? " + igual);

        // Obtendo um caractere da String
        char caractere = texto.charAt(4);
        System.out.println("Caractere na posição 4: " + caractere);

        // Dividindo a String em substrings
        String[] palavras = texto.split(" ");
        System.out.println("Palavras separadas: ");
        for (String palavra : palavras) {
            System.out.println(palavra);
        }

        // Convertendo a String para maiúsculas
        String maiusculas = texto.toUpperCase();
        System.out.println("String em maiúsculas: " + maiusculas);

        // Convertendo a String para minúsculas
        String minusculas = texto.toLowerCase();
        System.out.println("String em minúsculas: " + minusculas);

        // Verificando se a String começa com determinado prefixo
        boolean comecaCom = texto.startsWith("Olá");
        System.out.println("String começa com 'Olá'? " + comecaCom);

        // Verificando se a String termina com determinado sufixo
        boolean terminaCom = texto.endsWith("!");
        System.out.println("String termina com '!'? " + terminaCom);
    }
}