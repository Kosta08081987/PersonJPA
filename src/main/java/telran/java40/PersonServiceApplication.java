package telran.java40;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import telran.java40.person.dao.PersonRepository;
import telran.java40.person.model.Address;
import telran.java40.person.model.Child;
import telran.java40.person.model.Employee;

@SpringBootApplication
public class PersonServiceApplication implements CommandLineRunner{

	@Autowired
	PersonRepository personRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(PersonServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Employee p1 = new Employee(1000, "John", LocalDate.of(1990, 5, 12), new Address("Rehovot", "Herzel", 18), "Motorola", 20000);
		Employee p2 = new Employee(2000, "Mary", LocalDate.of(1990, 5, 12), new Address("Lod", "Laskov", 108), "IBM", 21000);
		Child p3 = new Child(3000, "Peter", LocalDate.of(2011, 3, 26), new Address("Jerusalem", "Ben Gurion", 108), "Shalom");
		
		personRepository.save(p1);
		personRepository.save(p2);
		personRepository.save(p3);
		
	}

}
