import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Aluno {

    private Integer codigo;
    private String nome;
    private LocalDate dataNascimento;
    private Integer mediaGeral = 0;

    public Aluno() {
    }

    public Aluno(Integer codigo, String nome, LocalDate dataNascimento, Integer mediaGeral) {
        this.codigo = codigo;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.mediaGeral = mediaGeral;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Integer getMediaGeral() {
        return mediaGeral;
    }

    public void setMediaGeral(Integer mediaGeral) {
        this.mediaGeral = mediaGeral;
    }
}
