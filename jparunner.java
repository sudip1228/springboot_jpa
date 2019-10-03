package jpa;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ComponentScan;

//@SpringBootApplication
@ComponentScan("jpa")
public class jparunner implements CommandLineRunner {
	private Logger log= LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	person_jpa_repository repo;
	
	public static void main(String[] args) {
		SpringApplication.run(jparunner.class, args);

	}

	public void run(String... args) throws Exception {
		
	log.info("single users->{}",repo.findbyid(1001));
		
		log.info("inserting ->{}",repo.insert(new person("tara","berlin",new Date())));
		log.info("inserting ->{}",repo.insert(new person("sachin","india",new Date())));

		log.info("updating 1003->{}",repo.update(new person(1003,"rabin","nyc",new Date())));
		repo.deletebyid(1);
		//log.info("all users->{}",dao.findall());

	//	log.info("delete users->{}",dao.deletebyid(1002));
	//	System.out.println("deleted "+ dao.deletebyid(1002));
		
	
	
		
	
	}

}
