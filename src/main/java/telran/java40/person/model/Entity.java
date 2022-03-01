package telran.java40.person.model;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Entity {
	int id;
	String name;
	LocalDate birthDate;
	Address address;
	String company;
	int salary;
	String kindergarten;
}
