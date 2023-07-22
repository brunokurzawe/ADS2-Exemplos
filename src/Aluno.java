import java.time.LocalDate;
import java.time.Period;
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

    public Integer calcularMediaGeral() {
        Integer mediaGeral = 0;
        for (Map.Entry<String, List<Integer>> entry : disciplinas.entrySet()) {
            List<Integer> notas = entry.getValue();

            Integer somaNotas = 0;
            for (Integer nota : notas) {
                somaNotas = somaNotas + nota;
            }
            mediaGeral += somaNotas / notas.size();
        }

        return (mediaGeral / disciplinas.size());
    }


    public void nomeDoMetodo() {
        // Corpo do método
        // Aqui estão as instruções que o método executa
    }

    public void calcularIdade() {
        LocalDate hoje = LocalDate.now();
        Period periodo = Period.between(dataNascimento, hoje);
        System.out.println(periodo.getYears());
    }

    public void imprimirDisciplinasMatriculadas() {
        for (Map.Entry<String, List<Integer>> entry : disciplinas.entrySet()) {
            String nomeDisciplina = entry.getKey();
            System.out.println("Disciplina: " + nomeDisciplina);
        }
    }

    public void verificaAlunoAprovado() {
        Integer mediaGeral = calcularMediaGeral();

        if (mediaGeral >= 7) {
            System.out.println("APROVADO");
        } else if (mediaGeral >= 5) {
            System.out.println("RECUPERACAO");
        } else {
            System.out.println("REPROVADO");
        }
    }

}
