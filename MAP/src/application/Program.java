package application;

import java.util.Map;
import java.util.TreeMap;

public class Program {

	public static void main(String[] args) {

		Map<String, String> cookies = new TreeMap<>();

		cookies.put("username", "Maria123");
		cookies.put("email", "Maria123@gmail.com");
		cookies.put("phone", "998877665");

		System.out.println("Phone number: " + cookies.get("phone"));
		System.out.println();

		cookies.remove("email");
		cookies.put("phone", "14564654");

		System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));

		System.out.println();
		System.out.println("All Cookies: ");
		System.out.println();

		for (String key : cookies.keySet()) {
			System.out.println(key + ": " + cookies.get(key));
		}

	}

}
