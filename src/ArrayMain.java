public class ArrayMain {
    public static void main(String[] args) {
        // Declarando e inicializando um array de inteiros com 5 elementos
        int[] numeros = new int[5];

        // Atribuindo valores aos elementos do array
        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;
        numeros[3] = 40;
        numeros[4] = 50;

        // Acessando e exibindo os elementos do array
        System.out.println("Elementos do array:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Elemento " + i + ": " + numeros[i]);
        }
    }
}
