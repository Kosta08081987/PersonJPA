package telran.java40.person.dto;

import java.time.LocalDate;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class EmployeeDto extends PersonDto {
	
	String company;
	int salary;
	
	public EmployeeDto(int id, String name, LocalDate birthDate, AddressDto address, String company, int salary) {
		super(id, name, birthDate, address);
		this.company = company;
		this.salary = salary;
	}
	
	
	
}
