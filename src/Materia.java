
public class Materia {

    private String nome;
    private String descricao;
    private String indicadorEssencial;
    private String indicadores;
    private String conteudo;
    private String planoDeAula;

    public Materia() {
    }

    public Materia(String nome, String descricao) {
        this(nome, descricao, null);
    }

    public Materia(String nome, String descricao, String indicadorEssencial) {
        this(nome, descricao, indicadorEssencial, null, null);
    }

    public Materia(String nome, String descricao, String indicadorEssencial, String indicadores, String conteudo) {
        this(nome, descricao, indicadorEssencial, indicadores, conteudo, null);
    }

    public Materia(String nome, String descricao, String indicadorEssencial, String indicadores, String conteudo, String planoDeAula) {
        if (nome.length() < 4) System.out.println("O nome deve possuir mais de 4 caracteres");
        this.nome = nome;
        this.descricao = descricao;
        this.indicadorEssencial = indicadorEssencial;
        this.indicadores = indicadores;
        this.conteudo = conteudo;
        this.planoDeAula = planoDeAula;
    }

}



