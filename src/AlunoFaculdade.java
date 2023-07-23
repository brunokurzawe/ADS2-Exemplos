public class AlunoFaculdade extends Aluno {

    private Double notaProva01;
    private Double notaProva02;
    private Double notaProva03;

    public AlunoFaculdade(Double notaProva01, Double notaProva02, Double notaProva03) {
        this.notaProva01 = notaProva01;
        this.notaProva02 = notaProva02;
        this.notaProva03 = notaProva03;
    }

    @Override
    public Double calculaMediaGeral() {
        return (notaProva01 * 0.25) + (notaProva02 * 0.35) + (notaProva03 * 0.40);
    }

}
