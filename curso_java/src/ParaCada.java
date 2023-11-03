
public class ParaCada {

	public static void main(String[] args) {
		String[] vect = new String[] { "Maria", "Bob", "Ronaldo" };

		//for com index
		for (int i = 0; i < vect.length; i++) {
			System.out.println(vect[i]);
		}
		
		System.out.println("---------------------");
		
		//for each (para cada objeto 'obj' contido em vect, faça:)
		for (String obj : vect) {
			System.out.println(obj);
		}
	}
}
