import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Aluno {

    Integer codigo;
    String nome;
    LocalDate dataNascimento;
    List<Disciplina> disciplinas = new ArrayList<>();
    Integer mediaGeral = 0;

    public Aluno(Integer codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public Integer calcularMediaGeral() {
        Integer somaMedias = 0;
        for (Disciplina disciplina : disciplinas) {
            somaMedias += disciplina.calcularMediaDisciplina();
        }
        mediaGeral = somaMedias / disciplinas.size();
        return mediaGeral;
    }

}
