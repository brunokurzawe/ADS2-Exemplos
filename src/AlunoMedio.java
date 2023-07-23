public class AlunoMedio extends Aluno {

    private Double notaProva01;
    private Double notaProva02;
    private Double notaParticipacao;

    public AlunoMedio(Double notaProva01, Double notaProva02, Double notaParticipacao) {
        this.notaProva01 = notaProva01;
        this.notaProva02 = notaProva02;
        this.notaParticipacao = notaParticipacao;
    }

    @Override
    public Double calculaMediaGeral() {
        return (notaProva01 * 0.40) + (notaProva02 * 0.40) + (notaParticipacao * 0.20);
    }
}
