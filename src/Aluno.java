import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public class Aluno {

    Integer codigo;
    String nome;
    LocalDate dataNascimento;
    String telefone;
    String endereco;
    Map<String, List<Integer>> disciplinas;



    public void imprimirDadosAluno() {
        System.out.println("Código: " + codigo + " Nome: " + nome + " Data nascimento:" + dataNascimento);
    }




    public void calcularMediaPorMateria() {
        for (Map.Entry<String, List<Integer>> entry : disciplinas.entrySet()) {
            String nomeDisciplina = entry.getKey();
            List<Integer> notas = entry.getValue();

            System.out.println("Disciplina: " + nomeDisciplina);
            Integer somaNotas = 0;
            for (Integer nota : notas) {
                somaNotas = somaNotas + nota;
            }
            System.out.println("Média: " + (somaNotas / notas.size()));
        }
    }

    public void calcularMediaGeral() {
        Integer mediaGeral = 0;
        for (Map.Entry<String, List<Integer>> entry : disciplinas.entrySet()) {
            List<Integer> notas = entry.getValue();

            Integer somaNotas = 0;
            for (Integer nota : notas) {
                somaNotas = somaNotas + nota;
            }
            mediaGeral += somaNotas / notas.size();
        }
        System.out.println("Média Geral: " + (mediaGeral / disciplinas.size()));
    }
}
