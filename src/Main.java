public class Main {

    public static void main(String[] args) {

        AlunoFaculdade aluno = new AlunoFaculdade(10.0, 8.0, 7.0);
        aluno.setNome("Bruno");

        Boletim boletim = new Boletim(aluno);
        boletim.imprimir();
    }

}












