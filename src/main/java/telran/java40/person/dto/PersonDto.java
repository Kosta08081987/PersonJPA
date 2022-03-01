package telran.java40.person.dto;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class PersonDto {
	
	int id;
	String name;
	@JsonFormat(pattern = "yyyy-MM-dd")
	LocalDate birthDate;
	AddressDto address;
	
	public PersonDto(int id, String name, LocalDate birthDate, AddressDto address) {
		this.id = id;
		this.name = name;
		this.birthDate = birthDate;
		this.address = address;
	}

}
