public class Main {

    public static void main(String[] args) {

        Aluno aluno = new Aluno();
        aluno.setNome("Bruno");

        BoletimPolimorfico boletim = new BoletimPolimorfico(aluno);
        boletim.imprimir();


    }

}












