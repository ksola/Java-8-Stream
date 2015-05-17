package java8stream;

import static org.fest.assertions.Assertions.assertThat;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class PersonsTest {

	@Test
	public void get3YoungestPersons() {
		// given 
		List<Person> persons = Arrays.asList(new Person("Andrzej", 23),
				new Person("Antoni", 1), new Person("Krystian", 27),
				new Person("Iwona", 26), new Person("Krzysztof", 22),
				new Person("Kamil", 26), new Person("Piotr", 24));
		
		// then 
		List<Person> threeYoungestPersons = PersonHelper.get3YoungestPersons(persons);
		
		// when
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
		
		// then 
		Person oldesPerson = PersonHelper.getOldesPersons(persons);
		
		// when
		assertThat(oldesPerson).isNotNull();
		assertThat(oldesPerson.getName()).isEqualTo("Krystian");
	}

}
