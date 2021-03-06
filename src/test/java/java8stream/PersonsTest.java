package java8stream;

import static org.fest.assertions.Assertions.assertThat;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.junit.Test;

public class PersonsTest {

	@Test
	public void getTheOldestPerson() throws Exception {
		
		// given 
		List<Person> persons = Arrays.asList(new Person("Andrzej", 23),
				new Person("Antoni", 1), new Person("Krystian", 27),
				new Person("Iwona", 26), new Person("Krzysztof", 22),
				new Person("Kamil", 26), new Person("Piotr", 24));
		
		// when
		Optional<Person> oldestPerson = PersonHelper.getOldestPerson(persons);
		
		// then 
		assertThat(oldestPerson).isNotNull();
		assertThat(oldestPerson.isPresent()).isTrue();
		assertThat(oldestPerson.get().getName()).isEqualTo("Krystian");
	}

	@Test
	public void get3YoungestPersons() {
		// given 
		List<Person> persons = Arrays.asList(new Person("Andrzej", 23),
				new Person("Antoni", 1), new Person("Krystian", 27),
				new Person("Iwona", 26), new Person("Krzysztof", 22),
				new Person("Kamil", 26), new Person("Piotr", 24));
		
		// when
		List<Person> threeYoungestPersons = PersonHelper.getThreeYoungestPersons(persons);
		
		// then 
		assertThat(threeYoungestPersons).hasSize(3);
		assertThat(threeYoungestPersons).contains(new Person("Antoni", 1),
				new Person("Krzysztof", 22), new Person("Andrzej", 23));
		
	}
	
	
	@Test
	public void joinNamesCommaSeparated() throws Exception {
		// given 
		List<Person> persons = Arrays.asList(new Person("Andrzej", 23),
				new Person("Antoni", 1), new Person("Krystian", 27));
		
		// when
		String concatenateNames = PersonHelper.concatenateNamesCommaSeparated(persons);
		
		// then 
		assertThat(concatenateNames).isEqualTo("Andrzej, Antoni, Krystian");
		
	}
	
	@Test
	public void getAgeSumOfGivenPersons() throws Exception {
		// given 
		List<Person> persons = Arrays.asList(new Person("Andrzej", 23),
				new Person("Antoni", 1), new Person("Krystian", 27),
				new Person("Iwona", 26), new Person("Krzysztof", 22),
				new Person("Kamil", 26), new Person("Piotr", 24));
		
		
		// when
		int ageSum = PersonHelper.getAgeSum(persons);
		
		// then 
		assertThat(ageSum).isEqualTo(149);
		
	}
	
	@Test
	public void getAgeSumOfGivenGroupedPersons() throws Exception {
		// given 
		List<List<Person>> personsGroup = Arrays.asList(
				Arrays.asList(new Person("Andrzej", 23), new Person("Antoni", 1), new Person("Krystian", 27)),
				Arrays.asList(new Person("Iwona", 26), new Person("Krzysztof", 22)),
				Arrays.asList(new Person("Kamil", 26), new Person("Piotr", 24))
			);
		
		
		// when
		int ageSum = PersonHelper.getAgeSumOfGroupedPersons(personsGroup);
		
		// then 
		assertThat(ageSum).isEqualTo(149);
		
	}

}
