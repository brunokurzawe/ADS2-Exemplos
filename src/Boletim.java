public class Boletim {

    Aluno aluno;

    public void verificaAlunoAprovado(Integer mediaGeral) {
        if (mediaGeral >= 7) {
            System.out.println("O aluno " + aluno.nome + " foi APROVADO");
        } else if (mediaGeral >= 5) {
            System.out.println("O aluno " + aluno.nome + " foi para RECUPERACAO");
        } else {
            System.out.println("O aluno " + aluno.nome + " foi REPROVADO");
        }
    }
}





