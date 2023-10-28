
public class CortaString {

	public static void main(String[] args) {
		String s = "arroz feijão carne";

		String[] vect = s.split(" ");
		String word0 = vect[0];
		String word1 = vect[1];
		String word2 = vect[2];

		System.out.println(s);
		System.out.println("---");
		System.out.println(word0);
		System.out.println(word1);
		System.out.println(word2);

	}

}
