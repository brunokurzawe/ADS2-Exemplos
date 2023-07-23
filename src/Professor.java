import java.time.LocalDate;

public class Professor {

    private Integer codigo;
    private String nome;
    private LocalDate dataNascimento;
    private String matricula;
    private LocalDate dataContratacao;

    public Professor() {
    }

    public Professor(Integer codigo, String nome, LocalDate dataNascimento, String matricula, LocalDate dataContratacao) {
        this.codigo = codigo;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.matricula = matricula;
        this.dataContratacao = dataContratacao;
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

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public LocalDate getDataContratacao() {
        return dataContratacao;
    }

    public void setDataContratacao(LocalDate dataContratacao) {
        this.dataContratacao = dataContratacao;
    }
}






