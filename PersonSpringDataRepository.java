package springdatajpa;

import org.springframework.data.jpa.repository.JpaRepository;

import jpa.person;

public interface PersonSpringDataRepository extends JpaRepository<person, Integer> {//integer represents primary key

	
	
}
