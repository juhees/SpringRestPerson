package kr.kwangan2.rest.person.daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import kr.kwangan2.rest.person.domain.Person;
import kr.kwangan2.rest.person.mapper.PersonMapper;
import kr.kwangan2.rest.person.service.PersonService;
import lombok.Setter;

public class PersonDAOImpl implements PersonService{

	@Setter(onMethod_=@Autowired)
	private PersonMapper mapper;
	
	@Override
	public List<Person> personList(){
		return mapper.personList();
	}
	
	@Override
	public int getPerson(int pid) {
		return mapper.getPerson(pid);	
	}
	
	@Override
	public int insertPerson(Integer pid) {
		return mapper.insertPerson(pid);	
	}
	
	@Override
	public int updatePerson(Person person) {
		return mapper.updatePerson(person);	
	}
	
	@Override
	public int deletePerson(Person person) {
		return mapper.deletePerson(person);	
	}
	
		
}
