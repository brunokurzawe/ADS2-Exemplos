import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class LocalDateMain {
    public static void main(String[] args) {
        // Criando uma data usando o método now() para a data atual
        LocalDate dataAtual = LocalDate.now();
        System.out.println("Data atual: " + dataAtual);

        // Criando uma data específica usando o método of()
        LocalDate dataEspecifica = LocalDate.of(2023, Month.DECEMBER, 25);
        System.out.println("Data específica: " + dataEspecifica);

        // Obtendo o dia, mês e ano de uma data
        int dia = dataAtual.getDayOfMonth();
        int mes = dataAtual.getMonthValue();
        int ano = dataAtual.getYear();
        System.out.println("Dia: " + dia + ", Mês: " + mes + ", Ano: " + ano);

        // Verificando se uma data é anterior, posterior ou igual a outra
        LocalDate dataFutura = LocalDate.of(2023, Month.JULY, 31);
        System.out.println("A data futura é posterior à data atual? " + dataFutura.isAfter(dataAtual));
        System.out.println("A data futura é anterior à data atual? " + dataFutura.isBefore(dataAtual));
        System.out.println("As datas são iguais? " + dataFutura.isEqual(dataAtual));

        // Adicionando e subtraindo dias, meses e anos
        LocalDate dataAlterada = dataAtual.plusDays(5).minusMonths(2).plusYears(1);
        System.out.println("Data alterada: " + dataAlterada);

        // Calculando a diferença entre duas datas em dias
        long diferencaEmDias = ChronoUnit.DAYS.between(dataAtual, dataFutura);
        System.out.println("Diferença entre as datas em dias: " + diferencaEmDias);
    }
}
