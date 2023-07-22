import java.util.HashMap;
import java.util.Map;

public class MapMain {
    public static void main(String[] args) {
        // Criando um mapa de países e suas capitais
        Map<String, String> capitais = new HashMap<>();

        // Adicionando elementos ao mapa
        capitais.put("Brasil", "Brasília");
        capitais.put("Estados Unidos", "Washington, D.C.");
        capitais.put("França", "Paris");
        capitais.put("Alemanha", "Berlim");
        capitais.put("Japão", "Tóquio");

        // Acessando e exibindo os elementos do mapa
        System.out.println("Capitais:");
        for (Map.Entry<String, String> entry : capitais.entrySet()) {
            System.out.println("País: " + entry.getKey() + ", Capital: " + entry.getValue());
        }

        // Verificando se uma chave está presente no mapa
        boolean contemChave = capitais.containsKey("Brasil");
        System.out.println("Contém o país Brasil? " + contemChave);

        // Verificando se um valor está presente no mapa
        boolean contemValor = capitais.containsValue("Berlim");
        System.out.println("Contém a capital Berlim? " + contemValor);

        // Removendo um elemento do mapa
        capitais.remove("França");

        // Verificando o tamanho do mapa
        int tamanho = capitais.size();
        System.out.println("Tamanho do mapa: " + tamanho);

        // Limpando o mapa
        capitais.clear();

        // Verificando se o mapa está vazio
        boolean estaVazio = capitais.isEmpty();
        System.out.println("O mapa está vazio? " + estaVazio);
    }
}
