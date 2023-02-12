package com.kcterala.mongodemo.controller;

import com.kcterala.mongodemo.collection.Person;
import com.kcterala.mongodemo.service.PersonService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {

    private PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping
    public String save(@RequestBody Person person){
        return personService.save(person);
    }

    @GetMapping
    public List<Person> getPersonStartsWith(@RequestParam String name){
        return personService.getPersonStartsWith(name);
    }

    @DeleteMapping("/{id}")
    public void deletePerson(@PathVariable String id){
        personService.delete(id);
    }

    @GetMapping("/age")
    public List<Person> getByPersonAge(@RequestParam Integer minAge,
                                       @RequestParam Integer maxAge){
        return personService.getByPersonAge(minAge, maxAge);
    }

}
