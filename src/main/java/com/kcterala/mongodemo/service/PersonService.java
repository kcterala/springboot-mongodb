package com.kcterala.mongodemo.service;

import com.kcterala.mongodemo.collection.Person;
import com.kcterala.mongodemo.repository.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    private PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public String save(Person person) {
        return personRepository.save(person).getPersonId();
    }

    public List<Person> getPersonStartsWith(String name) {
        return personRepository.findByFirstNameStartsWith(name);
    }

    public void delete(String id) {
        personRepository.deleteById(id);
    }

    public List<Person> getByPersonAge(Integer minAge, Integer maxAge) {
        return personRepository.findPersonsByAgeBetween(minAge, maxAge);
    }
}
