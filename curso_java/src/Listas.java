import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Listas {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();

		list.add("Bruno");
		list.add("Vitoria");
		list.add("Butters");
		list.add("Mione");

		System.out.println("Tamanho da lista: " + list.size());

		for (String x : list) {
			System.out.println(x);
		}

		System.out.println();
		System.out.println("-----------MANIPULANDO A LISTA------------");

		list.add(1, "Teste 01"); // Adiciona novo item na posição indicada
		list.add(2, "Teste 02"); // Adiciona novo item na posição indicada
		list.add(3, "Vit modo soneca"); // Adiciona novo item na posição indicada
		list.remove(2); // Remove item da posição indicada
		list.removeIf(x -> x.charAt(0) == 'B'); // Remover por predicado (todo mundo q começa com a letra B por exemplo)

		System.out.println("Reimprimindo a lista");
		System.out.println("Tamanho da lista: " + list.size());
		System.out.println();
		for (String x : list) {
			System.out.println(x);
		}

		System.out.println();
		System.out.println("Index of Vitoria: " + list.indexOf("Vitoria"));
		System.out.println("Index of Bruno: " + list.indexOf("Bruno")); // Retorna -1 porque eu removi o Bruno da lista
		System.out.println();

		// Cria uma nova lista, filtrando o predicado 'V'
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'V').collect(Collectors.toList());

		System.out.println();
		System.out.println("Nova lista filtrada: ");
		System.out.println();

		for (String y : result) {
			System.out.println(y);
		}
		System.out.println("-----------------");
		System.out.println();
		System.out.println("Encontrando o primeiro elemento que começa com a letra 'V' se nao encontrar retorna null");
		String name = list.stream().filter(x -> x.charAt(0) == 'V').findFirst().orElse(null);
		System.out.println(name);

	}

}
