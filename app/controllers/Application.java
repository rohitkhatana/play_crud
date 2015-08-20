package controllers;

import models.Person;
import play.*;
import play.db.jpa.Transactional;
import play.libs.Json;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {

    @Transactional
    public Result index() {
        Person person = new Person("Rohit", 23);
        person.save();
//        Person person = new Person();
        System.out.println(person.getById(1L).getPersonId());
        return ok(index.render("Yo"));
    }

    public Result newIndex() {
        return ok(Json.toJson(new String[]{"rohit"}));
    }
}
