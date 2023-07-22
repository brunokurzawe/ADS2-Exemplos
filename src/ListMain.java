import java.util.ArrayList;
import java.util.List;

public class ListMain {
    public static void main(String[] args) {
        // Criando uma lista de números inteiros
        List<Integer> numeros = new ArrayList<>();

        // Adicionando elementos à lista
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(40);
        numeros.add(50);

        // Acessando e exibindo os elementos da lista
        System.out.println("Elementos da lista:");
        for (int i = 0; i < numeros.size(); i++) {
            System.out.println("Elemento " + i + ": " + numeros.get(i));
        }

        // Removendo um elemento da lista
        numeros.remove(2); // Remove o elemento de índice 2 (valor 30)

        // Verificando se um elemento está presente na lista
        boolean contemElemento = numeros.contains(40);
        System.out.println("Contém o elemento 40? " + contemElemento);

        // Limpando a lista
        numeros.clear();

        // Verificando se a lista está vazia
        boolean estaVazia = numeros.isEmpty();
        System.out.println("A lista está vazia? " + estaVazia);
    }
}
