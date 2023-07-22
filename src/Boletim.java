

public class Boletim {

    String aluno;

    public void verificaAlunoAprovado(String aluno, Integer mediaGeral) {
        if (mediaGeral >= 7) {
            System.out.println("O aluno "+aluno+" foi APROVADO");
        } else if (mediaGeral >= 5) {
            System.out.println("O aluno "+aluno+" foi para RECUPERACAO");
        } else {
            System.out.println("O aluno "+aluno+" foi REPROVADO");
        }
    }
}





