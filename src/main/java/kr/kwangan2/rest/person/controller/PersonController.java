package kr.kwangan2.rest.person.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.log4j.Log4j;

@RestController //controller가 REST 방식을 처리하기 위한 것임을 암시
@RequestMapping("/test")
@Log4j
public class PersonController {
	
	
	
	//1) /person : list(GET)
	@GetMapping("/person")
	public List<Person> getPersons(){
		return
	}
	
	
	
	//2)/person/1 : select(GET)
	@GetMapping("/person/1")
	
	
	//3)/person/insert : insert (POST)
	@PostMapping("/person/insert")
	
	//4)/person/5 : update (PUT)
	@PutMapping("/person/5")
	
	//5)/person/5 : delete(DELETE)
	@DeleteMapping("/person/5")
	
}
