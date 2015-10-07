package com.springapp.mvc.controller;

import com.springapp.mvc.entity.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/")
public class HelloController {

	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
        Person person = createPerson();
        model.addAttribute("person", person);
		return "home/hello";
	}

    @RequestMapping(value = "savePerson", method = RequestMethod.POST)
    public String savePerson(ModelMap model, Person person) {
        model.addAttribute("person", person);
        System.out.println(person);
        return "home/hello";
    }

    @RequestMapping(value = "allPersons", method = RequestMethod.GET)
    public String printAAAWelcome(ModelMap model) {
        Date curDate = new Date();
        model.addAttribute("message", "Hello world! " +curDate);
        List<Person> persons = createPersonList();
        model.addAttribute("person", createPerson());
        model.addAttribute("personList", persons);
        return "home/hello";
    }

    private Person createPerson() {
        return new Person("John", "Doe");
    }

    private List<Person> createPersonList() {
        List<Person> persons = new ArrayList<Person>();
        Person person1 = createPerson();
        Person person2 = new Person("Will", "Smith");
        persons.add(person1);
        persons.add(person2);
        return persons;
    }
}