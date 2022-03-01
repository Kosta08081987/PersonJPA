package telran.java40.person.dto;

import java.time.LocalDate;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class ChildDto extends PersonDto{

	String kindergarten;

		
	public ChildDto(int id, String name, LocalDate birthDate, AddressDto address, String kindergarten) {
		super(id, name, birthDate, address);
		this.address = address;
		this.kindergarten = kindergarten;
	
}
}
