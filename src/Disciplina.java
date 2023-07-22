import java.util.ArrayList;
import java.util.List;

public class Disciplina {

    String nome;
    String professor;
    List<Integer> notas = new ArrayList<>();

    public void adicionaNota(Integer nota) {
        notas.add(nota);
    }

    public Integer calcularMediaDisciplina() {
        Integer somaNotas = 0;
        for (Integer nota : notas) {
            somaNotas = somaNotas + nota;
        }
        return somaNotas / notas.size();
    }


}



