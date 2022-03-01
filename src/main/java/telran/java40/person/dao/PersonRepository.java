package telran.java40.person.dao;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import telran.java40.person.dto.CityPopulationDto;
import telran.java40.person.model.Child;
import telran.java40.person.model.Employee;
import telran.java40.person.model.Entity;
import telran.java40.person.model.Person;

public interface PersonRepository extends JpaRepository<Person, Integer> {
	
	Stream<Person> findByAddressCity(String city);
	
	Stream<Person> findByBirthDateBetween(LocalDate from, LocalDate to);
	
	Stream<Person> findByName(String name);

	Integer countByAddressCity(String city);
	
	@Query("select new telran.java40.person.dto.CityPopulationDto(p.address.city, count(p)) from Person p group by p.address.city")
	List<CityPopulationDto> getCityPopulation();
	
	Stream<Employee> findBySalaryBetween(int min, int max);

	Stream<Child> findBy();
}
