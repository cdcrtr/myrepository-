package homework_nr_7;

import java.sql.SQLOutput;

public abstract class Person {

    private String name;
    private String surname;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String printMyName(){

        return name+" "+surname;

    }


}
