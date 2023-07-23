public class BoletimPolimorfico {

    private Aluno aluno;

    public BoletimPolimorfico(Aluno aluno) {
        this.aluno = aluno;
    }

    public void imprimir() {
        System.out.println("O aluno " + aluno.getNome() + "tem a média: " + aluno.calculaMediaGeral());
    }
}


