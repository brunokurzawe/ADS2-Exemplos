import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Aluno aluno01 = new Aluno();
        Map<String, List<Integer>> disciplinas = new HashMap<>();
        List<Integer> notasMatematica = new ArrayList<>();
        List<Integer> notasPortugues = new ArrayList<>();

        aluno01.codigo = 123;
        aluno01.nome = "Bruno Kurzawe";
        aluno01.dataNascimento = LocalDate.of(2001, 12, 15);
        aluno01.endereco = "Rua Pedro Benetton, 275";
        aluno01.telefone = "(48) 9 9908-9410";

        notasMatematica.add(6);
        notasMatematica.add(5);
        disciplinas.put("Matematica", notasMatematica);

        notasPortugues.add(6);
        notasPortugues.add(3);
        disciplinas.put("Portugues", notasPortugues);

        aluno01.disciplinas = disciplinas;

//        aluno01.imprimirDadosAluno();
//
//        aluno01.calcularMediaPorMateria();
//
//        aluno01.calcularMediaGeral();
//
//        aluno01.calcularIdade();
//
//        aluno01.imprimirDisciplinasMatriculadas();



        System.out.println(" Aluno " + aluno01.nome + " possui a média " + aluno01.calcularMediaGeral());

        aluno01.verificaAlunoAprovado();

    }
}