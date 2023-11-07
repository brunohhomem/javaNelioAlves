import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class ConverteDataHora {

	public static void main(String[] args) {
		LocalDate d04 = LocalDate.parse("2023-11-06"); // inserindo uma data manualmente
		LocalDateTime d05 = LocalDateTime.parse("2023-11-06T02:30:24");// inserindo data e hora manualmente
		Instant d06 = Instant.parse("2023-11-06T00:30:24z");// Gerando data e hora no padrao utc

		// Converter data-hora global para local
		// Retorna coleção dos fuso-horario customizados
		ZoneId.getAvailableZoneIds();

		LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
		System.out.println("R1 local = " + r1);

		LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
		System.out.println("R2 portugal = " + r2);

		LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));
		System.out.println("R3 portugal = " + r3);

		// Obter dados de uma data-hora local
		System.out.println("d04 dia = " + d04.getDayOfMonth());
		System.out.println("d04 mes = " + d04.getMonthValue());
		System.out.println("d04 ano = " + d04.getYear());
		System.out.println("d05 hora = " + d05.getHour());
		System.out.println("d05 minutos = " + d05.getMinute());

		// Cálculos com data-hora

		LocalDate pastWeekLocalDate = d04.minusDays(7);
		LocalDate nextWeekLocalDate = d04.plusDays(7);

		LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);
		LocalDateTime nextWeekLocalDateTime = d05.plusDays(7);

		Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
		Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);

		System.out.println();
		System.out.println("Cálculos com data hora ------");
		System.out.println("d04 original: " + d04);
		System.out.println("Semana passada do d04: " + pastWeekLocalDate);
		System.out.println("Semana adiantada do d04: " + nextWeekLocalDate);

		System.out.println();
		System.out.println("d05 original: " + d05);
		System.out.println("Semana passada do d05: " + pastWeekLocalDateTime);
		System.out.println("Semana adiantada do d05: " + nextWeekLocalDateTime);

		System.out.println();
		System.out.println("d06 original: " + d06);
		System.out.println("Semana passada do d06: " + pastWeekInstant);
		System.out.println("Semana adiantada do d06: " + nextWeekInstant);
		
		//calculo entre as datas
		Duration t1 = Duration.between(pastWeekLocalDateTime, d05);
		Duration t2 = Duration.between(pastWeekLocalDate.atStartOfDay(), d04.atStartOfDay());
		Duration t3 = Duration.between(pastWeekInstant, d06);
		Duration t4 = Duration.between(d06, pastWeekInstant); //data posterior primeiro
		
		
		System.out.println();
		System.out.println("Duração em dias: " + t1.toDays());
		System.out.println("Duração em horas: " + t1.toHours());
		
		System.out.println();
		System.out.println("t2 em dias: " + t2.toDays());
		
		System.out.println();
		System.out.println("t3 em dias: " + t3.toDays());
		
		System.out.println();
		System.out.println("t4 em dias: " + t4.toDays());
	}

}
