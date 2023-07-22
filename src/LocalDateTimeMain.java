import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class LocalDateTimeMain {
    public static void main(String[] args) {
        // Criando uma data e hora usando o método now() para a data e hora atual
        LocalDateTime dataHoraAtual = LocalDateTime.now();
        System.out.println("Data e hora atual: " + dataHoraAtual);

        // Criando uma data e hora específica usando o método of()
        LocalDateTime dataHoraEspecifica = LocalDateTime.of(2023, Month.DECEMBER, 25, 12, 0, 0);
        System.out.println("Data e hora específica: " + dataHoraEspecifica);

        // Formatando uma data e hora como string
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String dataHoraFormatada = dataHoraAtual.format(formatter);
        System.out.println("Data e hora formatada: " + dataHoraFormatada);

        // Obtendo os componentes da data e hora
        int dia = dataHoraAtual.getDayOfMonth();
        int mes = dataHoraAtual.getMonthValue();
        int ano = dataHoraAtual.getYear();
        int hora = dataHoraAtual.getHour();
        int minutos = dataHoraAtual.getMinute();
        int segundos = dataHoraAtual.getSecond();
        System.out.println("Dia: " + dia + ", Mês: " + mes + ", Ano: " + ano + ", Hora: " + hora + ", Minutos: " + minutos + ", Segundos: " + segundos);

        // Verificando se uma data e hora é anterior, posterior ou igual a outra
        LocalDateTime dataHoraFutura = LocalDateTime.of(2023, Month.JULY, 31, 15, 30, 0);
        System.out.println("A data e hora futura é posterior à data e hora atual? " + dataHoraFutura.isAfter(dataHoraAtual));
        System.out.println("A data e hora futura é anterior à data e hora atual? " + dataHoraFutura.isBefore(dataHoraAtual));
        System.out.println("As datas e horas são iguais? " + dataHoraFutura.isEqual(dataHoraAtual));

        // Adicionando e subtraindo dias, meses, anos, horas, minutos e segundos
        LocalDateTime dataHoraAlterada = dataHoraAtual.plusDays(5).minusMonths(2).plusYears(1).plusHours(2).plusMinutes(30).plusSeconds(15);
        System.out.println("Data e hora alterada: " + dataHoraAlterada);

        // Calculando a diferença entre duas datas e horas em horas
        long diferencaEmHoras = ChronoUnit.HOURS.between(dataHoraAtual, dataHoraFutura);
        System.out.println("Diferença entre as datas e horas em horas: " + diferencaEmHoras);
    }
}
