package telran.java40.person.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import telran.java40.person.dto.CityPopulationDto;
import telran.java40.person.dto.EntityDto;
import telran.java40.person.dto.PersonDto;
import telran.java40.person.model.Address;
import telran.java40.person.service.PersonService;

@RestController
@RequestMapping("/person")
public class PersonController {
	
	PersonService personService;

	@Autowired
	public PersonController(PersonService personService) {
		this.personService = personService;
	}
	
	@PostMapping
	public boolean addPerson(@RequestBody /* @Valid */ EntityDto entityDto) {
		System.out.println(entityDto);
		return personService.addPerson(entityDto);
	}
	
	@GetMapping("/{id}")
	PersonDto findPerson(@PathVariable Integer id){
		return personService.findPerson(id);
	}
	
	@GetMapping("/city/{city}")
	Iterable<PersonDto> findByCity(@PathVariable String city){
		return personService.findByCity(city);
	}
	
	@GetMapping("/ages/{from}/{to}")
	Iterable<PersonDto> findByAges(@PathVariable Integer from, @PathVariable Integer to){
		return personService.findByAges(from, to);
	}
	
	@PutMapping("/{id}/name/{newName}")
	PersonDto updateName(@PathVariable Integer id,@PathVariable String newName) {
		return personService.updateName(id, newName);
	}
	
	@GetMapping("/name/{name}")
	Iterable<PersonDto> findByName(@PathVariable String name){
		return personService.findByName(name);
	}
	
	@GetMapping("/population/{city}")
	Integer getCityPopulation(@PathVariable String city) {
		return personService.getCityPopulation(city);
	}
	
	@PutMapping("/{id}/address")
	PersonDto updateAddress(@PathVariable Integer id, @RequestBody Address address) {
		return personService.updateAddress(id, address);
	}
	
	@DeleteMapping("/{id}")
	PersonDto deletePerson(@PathVariable Integer id) {
		return personService.deletePerson(id);
	}
	
	@GetMapping("/population/city")
	public Iterable<CityPopulationDto> getCityPopulation() {
		return personService.getCityPopulation();
	}
	
	@GetMapping("/employee/salary/{min}/{max}")
	public Iterable<PersonDto> findEmployeeBySalary(@PathVariable int min,@PathVariable int max) {
		return personService.findEmployeeBySalary(min, max);
	}
	
	@GetMapping("/children")
	public Iterable<PersonDto> getChildren() {
		return personService.getChildren();
	}

}
