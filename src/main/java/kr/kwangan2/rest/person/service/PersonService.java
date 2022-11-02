package kr.kwangan2.rest.person.service;

import java.util.List;

import kr.kwangan2.rest.person.domain.Person;

public interface PersonService {

public List<Person> personList();
	
	public int getPerson(int pid);
	
	public int insertPerson(Integer pid);
	
	public  int updatePerson(Person person);
	
	public int deletePerson(Person person);
}
