package java8stream;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class PersonHelper {


	public static Optional<Person> getOldestPerson(List<Person> persons) {
		return persons.stream().sorted((person1, person2) -> person2.getAge() - person1.getAge()).findFirst();
	}

	public static List<Person> getThreeYoungestPersons(List<Person> persons) {
		return persons.stream().sorted((person1, person2) -> person1.getAge() - person2.getAge()).limit(3).collect(Collectors.toList());
	}
	
	
	public static String concatenateNamesCommaSeparated(List<Person> persons) {
		return persons.stream().map(Person::getName).collect(Collectors.joining(", "));
	}

	public static int getAgeSum(List<Person> persons) {
		return persons.stream().map(Person::getAge).reduce(Integer.valueOf(0), (sum, age) -> sum + age);
	}
	
	public static int getAgeSumOfGroupedPersons(List<List<Person>> groupedPersons) {
		return 0;
	}
}
