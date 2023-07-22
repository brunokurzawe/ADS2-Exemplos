import java.util.Vector;

public class VectorMain {
    public static void main(String[] args) {
        // Criando um objeto Vector para armazenar números inteiros
        Vector<Integer> numeros = new Vector<>();

        // Adicionando elementos ao Vector
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);

        // Obtendo o tamanho do Vector
        int tamanho = numeros.size();
        System.out.println("Tamanho do Vector: " + tamanho);

        // Acessando elementos do Vector
        int primeiroElemento = numeros.get(0);
        System.out.println("Primeiro Elemento: " + primeiroElemento);

        // Iterando sobre os elementos do Vector
        System.out.println("Elementos do Vector:");
        for (int i = 0; i < numeros.size(); i++) {
            System.out.println(numeros.get(i));
        }

        // Removendo um elemento do Vector
        numeros.remove(1); // Remove o elemento de índice 1 (valor 20)

        // Verificando se um elemento está presente no Vector
        boolean contemElemento = numeros.contains(30);
        System.out.println("Contém o elemento 30? " + contemElemento);

        // Limpando o Vector
        numeros.clear();

        // Verificando se o Vector está vazio
        boolean estaVazio = numeros.isEmpty();
        System.out.println("O Vector está vazio? " + estaVazio);
    }
}