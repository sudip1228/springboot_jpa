package jpa;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;


@Entity//used for jpa to map object to database
//@Table(name="person")   //specify the tablename of the database.here the table name in java and sql are same.so, it is not required.
@NamedQuery(name="find_all",query="select p from person p")//it is named query used to findall person.
public class person {
	
	@Id//indicates the primary key.
	@GeneratedValue//hybernate will generate primarykey(id) by itself without needing our help.
private int id;

//@Column(name="name")//specifying the column name.but here not required as java field name and sql column are same.
private String name;
private String location;
private Date birthdate;

public person() {//always built no argument constructor while using a hybernate.
	
}
public person(int id, String name, String location, Date birthdate) {
	super();
	this.id = id;
	this.name = name;
	this.location = location;
	this.birthdate = birthdate;
}

public person( String name, String location, Date birthdate) {//with hybernate there is no need of primary key as a argument.
	super();
	
	this.name = name;
	this.location = location;
	this.birthdate = birthdate;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public Date getDate() {
	return birthdate;
}
public void setDate(Date date) {
	this.birthdate = date;
}
@Override
public String toString() {
	return String.format( "\nperson [id=%s, name=%s, location=%s,birthdate=%s]",id,name,location,birthdate);
}



	
}
