package streamapi;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {

		List<Person> people = getPeople();
		// filtering
		List<Person> females = people.stream().filter(person -> person.getGender().equals(Gender.FEMALE))
				.collect(Collectors.toList());
		System.out.println("List of Females : ");
		females.forEach(System.out::println);

		System.out.println();
		List<Person> males = people.stream().filter(person -> person.getGender().equals(Gender.MALE))
				.collect(Collectors.toList());

		System.out.println("List of Males : ");
		males.forEach(System.out::println);

		// unsorted
		System.out.println();
		System.out.println("Unsorted : ");
		people.forEach(System.out::println);

		// sorted
		System.out.println();
		System.out.println("Sorted : ");
		List<Person> sorted = people.stream().sorted(Comparator.comparing(Person::getAge)).collect(Collectors.toList());
		sorted.forEach(System.out::println);

		// sorted reverse
		System.out.println();
		System.out.println("Sorted reverse : ");
		List<Person> reverseSorted = people.stream().sorted(Comparator.comparing(Person::getAge).reversed())
				.collect(Collectors.toList());
		reverseSorted.forEach(System.out::println);

	}

	private static List<Person> getPeople() {
		return List.of(new Person("Bikash", 28, Gender.MALE), new Person("Shimla", 25, Gender.FEMALE),
				new Person("Rokeya", 40, Gender.FEMALE), new Person("Subinoy", 29, Gender.MALE),
				new Person("Taposh", 27, Gender.MALE), new Person("Shipu", 28, Gender.FEMALE)

		);
	}

}
