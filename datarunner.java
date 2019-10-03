package springdatajpa;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jpa.person;

@SpringBootApplication
public class datarunner implements CommandLineRunner {
	private Logger log= LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	PersonSpringDataRepository repo;
	
	public static void main(String[] args) {
		SpringApplication.run(datarunner.class, args);

	}

	public void run(String... args) throws Exception {
		
//	log.info("single users->{}",repo.findbyid(2));
		
		log.info("inserting ->{}",repo.save(new person("tara","berlin",new Date())));//here save is like a merge in jpa.
		log.info("inserting ->{}",repo.save(new person("sachin","india",new Date())));
		log.info("updating 1003->{}",repo.save(new person(1003,"rabin","nyc",new Date())));
		//repo.deletebyid(1);
		//log.info("all users->{}",dao.findall());

	//	log.info("delete users->{}",dao.deletebyid(1002));
	//	System.out.println("deleted "+ dao.deletebyid(1002));
		
	
	
		
	
	}

}
