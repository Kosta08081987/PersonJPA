package telran.java40.person.service;

import telran.java40.person.dto.PersonDto;
import telran.java40.person.model.Address;

public interface PersonService {
	boolean addPerson(PersonDto personDto);
	
	PersonDto findPerson(Integer id);
	
	Iterable<PersonDto> findByCity(String city);
	
	Iterable<PersonDto> findByAges(Integer from, Integer to);
	
	PersonDto updateName(Integer id, String newName);
	
	Iterable<PersonDto> findByName(String name);
	
	Integer getCityPopulation(String city);
	
	PersonDto updateAddress(Integer id, Address address);
	
	PersonDto deletePerson(Integer id);
}
