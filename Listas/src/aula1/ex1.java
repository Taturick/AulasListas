package aula1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ex1 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		list.add("Maria");
		list.add("Alex");
		list.add("João");
		list.add("Lucas");
		list.add("Leo");
		list.add(2, "tatu");

		System.out.println(list.size());

		for (String x : list) {
			System.out.println(x);

		}
		System.out.println("-------------");
		list.remove(1);
		list.removeIf(x -> x.charAt(0) == 'L');

		for (String x : list) {
			System.out.println(x);

		}
		System.out.println("-------------");

		System.out.println("Index of tatu: " + list.indexOf("tatu"));
		System.out.println("Index of Rick: " + list.indexOf("Rick"));

		System.out.println("-------------");
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'M').collect(Collectors.toList());

		for (String x : result) {
			System.out.println(x);

		}
		System.out.println("-------------");
		String name = list.stream().filter(x -> x.charAt(0) == 'M').findFirst().orElse(null);
		System.out.println(name);

	}

}
