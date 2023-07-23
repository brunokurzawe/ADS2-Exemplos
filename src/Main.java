public class Main {

    public static void main(String[] args) {

        Aluno aluno = new AlunoFaculdade(10.0, 8.0, 7.0);
        aluno.setNome("Bruno");

        Aluno aluno02 = new AlunoMedio(10.0, 8.0, 7.0);
        aluno02.setNome("Maria");

        Aluno aluno03 = new AlunoFundamental(10.0, 8.0, 7.0, 5.0);
        aluno03.setNome("Pedro");

        BoletimPolimorfico boletim = new BoletimPolimorfico(aluno);
        boletim.imprimir();

        BoletimPolimorfico boletim2 = new BoletimPolimorfico(aluno02);
        boletim2.imprimir();

        BoletimPolimorfico boletim3 = new BoletimPolimorfico(aluno03);
        boletim3.imprimir();

    }

}












