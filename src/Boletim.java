public class Boletim {

    private AlunoFundamental alunoFundamental;
    private AlunoMedio alunoMedio;
    private AlunoFaculdade alunoFaculdade;

    public Boletim(AlunoFundamental alunoFundamental, AlunoMedio alunoMedio, AlunoFaculdade alunoFaculdade) {
        this.alunoFundamental = alunoFundamental;
        this.alunoMedio = alunoMedio;
        this.alunoFaculdade = alunoFaculdade;
    }

    public Boletim(AlunoFundamental alunoFundamental) {
        this.alunoFundamental = alunoFundamental;
    }

    public Boletim(AlunoMedio alunoMedio) {
        this.alunoMedio = alunoMedio;
    }

    public Boletim(AlunoFaculdade alunoFaculdade) {
        this.alunoFaculdade = alunoFaculdade;
    }

    public void imprimir() {
        if (alunoFundamental != null) {
            System.out.println("O aluno " + alunoFundamental.getNome() + "tem a média: " + alunoFundamental.calculaMediaGeral());
        } else if (alunoMedio != null) {
            System.out.println("O aluno " + alunoMedio.getNome() + "tem a média: " + alunoMedio.calculaMediaGeral());
        } else {
            System.out.println("O aluno " + alunoFaculdade.getNome() + "tem a média: " + alunoFaculdade.calculaMediaGeral());
        }
    }
}
