import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class ManipulaDataHora {

	public static void main(String[] args) {
		LocalDate d04 = LocalDate.parse("2023-11-06"); // inserindo uma data manualmente
		LocalDateTime d05 = LocalDateTime.parse("2023-11-06T02:30:24");// inserindo data e hora manualmente
		Instant d06 = Instant.parse("2023-11-06T00:30:24z");// Gerando data e hora no padrao utc

		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

		// Pega fuso horario do computador do usuário. Quando for data com instant precisa definir o fuso horario
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		
		//Utilizando formatadores pre-definidos
		DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;

		System.out.println("d04 = " + d04.format(fmt1));
		System.out.println("d04 = " + fmt1.format(d04));

		// instanciando dentro do print
		System.out.println("d04 = " + d04.format(DateTimeFormatter.ofPattern("MM/dd/yyyy")));

		System.out.println();

		System.out.println("d05 = " + d05.format(fmt1));
		System.out.println("d05 = " + d05.format(fmt2));
		
		System.out.println("d05 com formatacao pre-def = " + d05.format(fmt4));

		System.out.println();
		// instant n tem metodo format, precisa chamar o fmt3 pra formatar a data
		// Quando for data com instant precisa definir o fuso horario
		System.out.println("d06 = " + fmt3.format(d06));
	}

}
