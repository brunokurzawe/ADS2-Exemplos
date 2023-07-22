public class Boletim {

    Aluno aluno;

    public void verificaAlunoAprovado(Integer mediaGeral) {
        if (mediaGeral >= 7) {
            System.out.println("O aluno " + aluno.buscaNome() + " foi APROVADO");
        } else if (mediaGeral >= 5) {
            System.out.println("O aluno " + aluno.buscaNome() + " foi para RECUPERACAO");
        } else {
            System.out.println("O aluno " + aluno.buscaNome() + " foi REPROVADO");
        }
    }
}





