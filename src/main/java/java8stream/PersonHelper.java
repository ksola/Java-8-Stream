package java8stream;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class PersonHelper {

	static Comparator<? super Person> ageComparator = (p1, p2) -> (p1.getAge() > p2.getAge()) ? 1 : ((p1
			.getAge() < p2.getAge()) ? -1 : 0);
	
	public static Optional<Person> getOldestPerson(List<Person> persons) {
		return persons.stream().max(ageComparator);
	}

	public static List<Person> getThreeYoungestPersons(List<Person> persons) {
		return persons
				.stream()
				.sorted(ageComparator).limit(3)
				.collect(Collectors.toList());
	}
	
	
	public static String concatenateNamesCommaSeparated(List<Person> persons) {
		return persons.stream().map(Person::getName).collect(Collectors.joining(", "));
	}

	public static int getAgeSum(List<Person> persons) {
		return persons.stream().map(Person::getAge).reduce(0, (age, sum) -> sum + age);
	}
	
	public static int getAgeSumOfGroupedPersons(List<List<Person>> groupedPersons) {
		return groupedPersons.stream().map(list -> list.stream().map(Person::getAge).reduce(0, Integer::sum)).reduce(0, Integer::sum);
	}
}
