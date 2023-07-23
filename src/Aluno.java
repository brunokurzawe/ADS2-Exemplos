import java.time.LocalDate;

public class Aluno extends Pessoa {

    private Integer mediaGeral = 0;

    public Aluno() {
    }

    public void setDadosAlunos(Integer codigo, String nome) {
        this.setDadosAlunos(codigo, nome, null);
    }

    public void setDadosAlunos(Integer codigo, String nome, LocalDate dataNascimento) {
        this.setDadosAlunos(codigo, nome, dataNascimento, null);
    }

    public void setDadosAlunos(Integer codigo, String nome, LocalDate dataNascimento, Integer mediaGeral) {
        this.setCodigo(codigo);
        this.setNome(nome);
        this.setDataNascimento(dataNascimento);
        this.setMediaGeral(mediaGeral);
    }

    public void aplicarMediaGeral(Double mediaGeral) {
        this.mediaGeral = mediaGeral.intValue();
    }

    public void aplicarMediaGeral(String mediaGeral) {
        this.mediaGeral = Integer.parseInt(mediaGeral);
    }

    public void aplicarMediaGeral(Integer mediaGeral) {
        this.mediaGeral = mediaGeral;
    }


    public Integer getMediaGeral() {
        return mediaGeral;
    }

    public void setMediaGeral(Integer mediaGeral) {
        this.mediaGeral = mediaGeral;
    }
}



