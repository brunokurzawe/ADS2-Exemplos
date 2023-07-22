import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Aluno {

    private Integer codigo;
    private String nome;
    private LocalDate dataNascimento;
    private List<Disciplina> disciplinas = new ArrayList<>();
    private Integer mediaGeral = 0;

    public Aluno(Integer codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public void addDisciplina(Disciplina disciplina) {
        disciplinas.add(disciplina);
    }

    public Integer buscaMediaGeral(){
        return mediaGeral;
    }

    public String buscaNome(){
        return nome;
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
