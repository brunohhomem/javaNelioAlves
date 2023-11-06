import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DataHora {

	public static void main(String[] args) {
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // Formatando a data para dd/MM/yyyy
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"); // Formatando a data para dd/MM/yyyy

		LocalDate d01 = LocalDate.now(); // Instanciando a data agora
		LocalDateTime d02 = LocalDateTime.now(); // instanciando data e hora, agora
		Instant d03 = Instant.now(); // Data e hora global, horario de londres Z

		LocalDate d04 = LocalDate.parse("2023-11-06"); // inserindo uma data manualmente
		LocalDateTime d05 = LocalDateTime.parse("2023-11-06T02:30:24");// inserindo data e hora manualmente
		Instant d06 = Instant.parse("2023-11-06T00:30:24z");// Gerando data e hora no padrao utc
		Instant d07 = Instant.parse("2023-11-06T00:30:24-03:00");// Gerando data e hora no padrao utc especificando fuso
																	// horario

		LocalDate d08 = LocalDate.parse("14/06/1994", fmt1);
		LocalDateTime d09 = LocalDateTime.parse("14/06/1994 10:25", fmt2);
		LocalDate d10 = LocalDate.of(2001, 1, 23);
		LocalDateTime d11 = LocalDateTime.of(2025, 7, 5, 3, 30, 10);

		System.out.println("d01: " + d01);
		System.out.println("d02: " + d02);
		System.out.println("d03: " + d03);
		System.out.println("d04: " + d04);
		System.out.println("d05: " + d05);
		System.out.println("d06: " + d06);
		System.out.println("d07: " + d07);
		System.out.println("d08: " + d08);
		System.out.println("d09: " + d09.toString());
		System.out.println("d10: " + d10.toString());
		System.out.println("d10: " + d11.toString());
	}

}
