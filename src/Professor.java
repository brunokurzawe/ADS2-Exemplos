import java.time.LocalDate;

public class Professor {

    String nome;
    String matricula;
    LocalDate dataContratacao;

    public Professor() {
    }

    public Professor(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "nome='" + nome + '\'' +
                ", matricula='" + matricula + '\'' +
                ", dataContratacao=" + dataContratacao +
                '}';
    }
}






