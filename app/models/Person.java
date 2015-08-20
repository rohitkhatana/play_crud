package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import play.db.jpa.*;
/**
 * Created by redpanda on 8/20/15.
 */
@Entity
public class Person {
    @Id
    @GeneratedValue
    private long personId;
//    private Set events = new HashSet();

    @Column private String name;
    @Column private int age;

    public Person(final String name, final int age){
        this.name = name;
        this.age = age;
    }

    public Person(){
    }

    public Long getPersonId(){
        return personId;
    }

    public String getName(){
        return name;
    }

    public int age(){
        return age;
    }

    public void save(){
        JPA.em().persist(this);
    }

    public Person getById(Long id){
        return JPA.em().find(Person.class, id);
    }
}
