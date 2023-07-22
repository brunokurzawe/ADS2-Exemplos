import java.util.ArrayList;
import java.util.List;


    public class Main {
        public static void main(String[] args) {

            Aluno alunoInteligente = new Aluno(1010,"Bruno Kurzawe");
            Aluno alunoTrapaceiro = new Aluno(1020,"Maria Luiza Kurzawe");

            Disciplina portuguesInteligente = new Disciplina("Portugues", List.of(8,9));
            Disciplina portuguesTrapaseiro = new Disciplina("Portugues", List.of(5,4));
            Disciplina matematicaInteligente = new Disciplina("Matematica", List.of(8,9));
            Disciplina matematicaTrapaseiro = new Disciplina("Matematica", List.of(5,4));

            alunoInteligente.disciplinas = List.of(portuguesInteligente, matematicaInteligente);
            alunoTrapaceiro.disciplinas = List.of(portuguesTrapaseiro, matematicaTrapaseiro);

            alunoInteligente.calcularMediaGeral();
            System.out.println("Nota do aluno: "+alunoInteligente.nome+" é " +alunoInteligente.mediaGeral);

            alunoTrapaceiro.calcularMediaGeral();
            alunoTrapaceiro.mediaGeral = 9;
            System.out.println("Nota do aluno: "+alunoTrapaceiro.nome+" é " +alunoTrapaceiro.mediaGeral);

        }
    }











