package telran.java40.person.service;

import telran.java40.person.dto.CityPopulationDto;
import telran.java40.person.dto.EntityDto;
import telran.java40.person.dto.PersonDto;
import telran.java40.person.model.Address;

public interface PersonService {
	boolean addPerson(EntityDto entityDto);
	
	PersonDto findPerson(Integer id);
	
	Iterable<PersonDto> findByCity(String city);
	
	Iterable<PersonDto> findByAges(Integer from, Integer to);
	
	PersonDto updateName(Integer id, String newName);
	
	Iterable<PersonDto> findByName(String name);
	
	Integer getCityPopulation(String city);
	
	PersonDto updateAddress(Integer id, Address address);
	
	PersonDto deletePerson(Integer id);
	
	Iterable<CityPopulationDto> getCityPopulation();
	
	Iterable<PersonDto> findEmployeeBySalary(int min, int max);
	
	Iterable<PersonDto> getChildren();
}
