package java8stream;

import static org.fest.assertions.Assertions.assertThat;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.junit.Test;

public class PersonsTest {

	@Test
	public void get3YoungestPersons() {
		// given 
		List<Person> persons = Arrays.asList(new Person("Andrzej", 23),
				new Person("Antoni", 1), new Person("Krystian", 27),
				new Person("Iwona", 26), new Person("Krzysztof", 22),
				new Person("Kamil", 26), new Person("Piotr", 24));
		
		// when
		List<Person> threeYoungestPersons = PersonHelper.get3YoungestPersons(persons);
		
		// then 
		assertThat(threeYoungestPersons).hasSize(3);
		assertThat(threeYoungestPersons).contains(new Person("Antoni", 1),
				new Person("Krzysztof", 22), new Person("Andrzej", 23));
		
	}
	
	@Test
	public void getTheOldestPerson() throws Exception {
		
		// given 
		List<Person> persons = Arrays.asList(new Person("Andrzej", 23),
				new Person("Antoni", 1), new Person("Krystian", 27),
				new Person("Iwona", 26), new Person("Krzysztof", 22),
				new Person("Kamil", 26), new Person("Piotr", 24));
		
		// when
		Optional<Person> oldesPerson = PersonHelper.getOldesPersons(persons);
		
		// then 
		assertThat(oldesPerson).isNotNull();
		assertThat(oldesPerson.isPresent()).isTrue();
		assertThat(oldesPerson.get().getName()).isEqualTo("Krystian");
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
		assertThat(ageSum).isEqualTo(96);
		
	}

}
