package com.dan.winter.bootstrap;

import com.dan.winter.entities.Person;
import com.dan.winter.repositories.PersonRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

  private final PersonRepository persons;

  public BootStrapData(PersonRepository persons) {
    this.persons = persons;
  }

  @Override
  public void run(String... args) throws Exception {
    Person eric = new Person("Eric", "Smite");
    persons.save(eric);
    System.out.println("Booted: " + persons.count());
  }
}
