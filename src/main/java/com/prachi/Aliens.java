package com.prachi;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
//import jakarta.xml.bind.annotation.XmlRootElement;

//@XmlRootElement
@Entity
public class Aliens {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
 private int Id;
 private String name;
 private String password;
 private String emailid;

public Aliens(int id, String name, String password, String emailid) {
	super();
	Id = id;
	this.name = name;
	this.password = password;
	this.emailid = emailid;
}

public Aliens() {
}

public String getName() {
	return name;
}
public int getId() {
	return Id;
}
public void setId(int id) {
	Id = id;
}
public void setName(String name) {
	this.name = name;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getEmailid() {
	return emailid;
}
public void setEmailid(String emailid) {
	this.emailid = emailid;
}

@Override
public String toString() {
	return "Aliens [Id=" + Id + ", name=" + name + ", password=" + password + ", emailid=" + emailid + "]";
}



 
}
