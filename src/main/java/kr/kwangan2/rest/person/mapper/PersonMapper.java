package kr.kwangan2.rest.person.mapper;

import java.util.List;

import kr.kwangan2.rest.person.domain.Person;

public interface PersonMapper {
	
	public List<Person> personList();
	
	public int getPerson(int pids);
	
	public int insertPerson(int pid);
	
	public  int updatePerson(Person person);
	
	public int deletePerson(Person person);

}
