package jpa;




import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;


//repository
@Repository
//transaction
@Transactional
public class person_jpa_repository {

	//connect to the database
	@PersistenceContext 
	EntityManager e;
	
	public person findbyid(int id){
		return e.find(person.class, id);
	
}
	public person update(person p){
		return e.merge(p);
	
}
	public person insert(person p){
		return e.merge(p);
	
}
	public void deletebyid(int id){
		person p=findbyid(id);
		e.remove(p);
	}
	
	public List<person> findall(){//shows all columns
		TypedQuery<person> namedquery=e.createNamedQuery("find_all_query",person.class);//it is called a hybernate query which is different from sql querry
		return namedquery.getResultList();
		
	}
}
