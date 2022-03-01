package telran.java40.person.model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@EqualsAndHashCode(of = {"id"})
@Entity//(name = "Persons") for JPQL query
@Table(name = "persons")// name of table in database
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Person implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5238038715998314432L;
	
	@Id
	int id;
	String name;
	LocalDate birthDate;
//	@Embedded
//	@EmbeddedId
	Address address;

}
