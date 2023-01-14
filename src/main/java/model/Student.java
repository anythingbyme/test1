package model;

import lombok.Data;


public class Student {
    private String name;
    private String id;

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
    }


}
